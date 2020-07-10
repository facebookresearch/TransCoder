# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#

from logging import getLogger
import math
import itertools
import numpy as np
import torch
import torch.nn as nn
import torch.nn.functional as F


N_MAX_POSITIONS = 1024  # maximum input sequence length

DECODER_ONLY_PARAMS = [
    'layer_norm15.%i.weight', 'layer_norm15.%i.bias',
    'encoder_attn.%i.q_lin.weight', 'encoder_attn.%i.q_lin.bias',
    'encoder_attn.%i.k_lin.weight', 'encoder_attn.%i.k_lin.bias',
    'encoder_attn.%i.v_lin.weight', 'encoder_attn.%i.v_lin.bias',
    'encoder_attn.%i.out_lin.weight', 'encoder_attn.%i.out_lin.bias'
]

TRANSFORMER_LAYER_PARAMS = [
    'attentions.%i.q_lin.weight', 'attentions.%i.q_lin.bias',
    'attentions.%i.k_lin.weight', 'attentions.%i.k_lin.bias',
    'attentions.%i.v_lin.weight', 'attentions.%i.v_lin.bias',
    'attentions.%i.out_lin.weight', 'attentions.%i.out_lin.bias',
    'layer_norm1.%i.weight', 'layer_norm1.%i.bias',
    'ffns.%i.lin1.weight', 'ffns.%i.lin1.bias',
    'ffns.%i.lin2.weight', 'ffns.%i.lin2.bias',
    'layer_norm2.%i.weight', 'layer_norm2.%i.bias'
]


logger = getLogger()


def Embedding(num_embeddings, embedding_dim, padding_idx=None):
    m = nn.Embedding(num_embeddings, embedding_dim, padding_idx=padding_idx)
    nn.init.normal_(m.weight, mean=0, std=embedding_dim ** -0.5)
    if padding_idx is not None:
        nn.init.constant_(m.weight[padding_idx], 0)
    return m


def Linear(in_features, out_features, bias=True):
    m = nn.Linear(in_features, out_features, bias)
    # nn.init.normal_(m.weight, mean=0, std=1)
    # nn.init.xavier_uniform_(m.weight)
    # nn.init.constant_(m.bias, 0.)
    return m


def create_sinusoidal_embeddings(n_pos, dim, out):
    position_enc = np.array([
        [pos / np.power(10000, 2 * (j // 2) / dim) for j in range(dim)]
        for pos in range(n_pos)
    ])
    out[:, 0::2] = torch.FloatTensor(np.sin(position_enc[:, 0::2]))
    out[:, 1::2] = torch.FloatTensor(np.cos(position_enc[:, 1::2]))
    out.detach_()
    out.requires_grad = False


def gelu(x):
    """
    GELU activation
    https://arxiv.org/abs/1606.08415
    https://github.com/huggingface/pytorch-openai-transformer-lm/blob/master/model_pytorch.py#L14
    https://github.com/huggingface/pytorch-pretrained-BERT/blob/master/modeling.py
    """
    # return 0.5 * x * (1 + torch.tanh(math.sqrt(2 / math.pi) * (x + 0.044715 * torch.pow(x, 3))))
    return 0.5 * x * (1.0 + torch.erf(x / math.sqrt(2.0)))


def get_masks(slen, lengths, causal):
    """
    Generate hidden states mask, and optionally an attention mask.
    """
    assert lengths.max().item() <= slen
    bs = lengths.size(0)
    alen = torch.arange(slen, dtype=torch.long, device=lengths.device)
    mask = alen < lengths[:, None]

    # attention mask is the same as mask, or triangular inferior attention (causal)
    if causal:
        attn_mask = alen[None, None, :].repeat(
            bs, slen, 1) <= alen[None, :, None]
    else:
        attn_mask = mask

    # sanity check
    assert mask.size() == (bs, slen)
    assert causal is False or attn_mask.size() == (bs, slen, slen)

    return mask, attn_mask


class PredLayer(nn.Module):
    """
    Prediction layer (cross_entropy loss).
    """

    def __init__(self, params):
        super().__init__()
        self.n_words = params.n_words
        self.pad_index = params.pad_index
        dim = params.emb_dim_decoder
        self.proj = Linear(dim, params.n_words, bias=True)

    def forward(self, x, y, get_scores=False):
        """
        Compute the loss, and optionally the scores.
        """
        assert (y == self.pad_index).sum().item() == 0
        scores = self.proj(x).view(-1, self.n_words)
        loss = F.cross_entropy(
            scores.float(), y, reduction='mean').type_as(scores)
        return scores, loss

    def get_scores(self, x):
        """
        Compute scores.
        """
        assert x.dim() == 2
        return self.proj(x)


class MultiHeadAttention(nn.Module):

    NEW_ID = itertools.count()

    def __init__(self, n_heads, dim, dim_encoder=None, dropout=0):
        super().__init__()
        self.layer_id = next(MultiHeadAttention.NEW_ID)
        self.dim = dim
        self.dim_encoder = dim if dim_encoder is None else dim_encoder
        self.n_heads = n_heads
        self.dropout = dropout
        assert self.dim % self.n_heads == 0

        self.q_lin = Linear(dim, dim)
        self.k_lin = Linear(self.dim_encoder, dim)
        self.v_lin = Linear(self.dim_encoder, dim)
        self.out_lin = Linear(dim, dim)

        self.cache = None

    def forward(self, input, mask, kv=None, use_cache=False):
        """
        Self-attention (if kv is None) or attention over source sentence (provided by kv).
        """
        # Input is (bs, qlen, dim)
        # Mask is (bs, klen) (non-causal) or (bs, klen, klen)

        assert not(use_cache and self.cache is None)
        bs, qlen, dim = input.size()
        if kv is None:
            klen = qlen if not use_cache else self.cache['slen'] + qlen
        else:
            klen = kv.size(1)
        assert dim == self.dim, 'Dimensions do not match: %s input vs %s configured' % (
            dim, self.dim)
        n_heads = self.n_heads
        dim_per_head = dim // n_heads
        mask_reshape = (bs, 1, qlen, klen) if mask.dim(
        ) == 3 else (bs, 1, 1, klen)

        def shape(x):
            """  projection """
            return x.view(bs, -1, self.n_heads, dim_per_head).transpose(1, 2)

        def unshape(x):
            """  compute context """
            return x.transpose(1, 2).contiguous().view(bs, -1, self.n_heads * dim_per_head)

        # (bs, n_heads, qlen, dim_per_head)
        q = shape(self.q_lin(input))
        if kv is None:
            # (bs, n_heads, qlen, dim_per_head)
            k = shape(self.k_lin(input))
            # (bs, n_heads, qlen, dim_per_head)
            v = shape(self.v_lin(input))
        elif not use_cache or self.layer_id not in self.cache:
            k = v = kv
            # (bs, n_heads, qlen, dim_per_head)
            k = shape(self.k_lin(k))
            # (bs, n_heads, qlen, dim_per_head)
            v = shape(self.v_lin(v))

        if use_cache:
            if self.layer_id in self.cache:
                if kv is None:
                    k_, v_ = self.cache[self.layer_id]
                    # (bs, n_heads, klen, dim_per_head)
                    k = torch.cat([k_, k], dim=2)
                    # (bs, n_heads, klen, dim_per_head)
                    v = torch.cat([v_, v], dim=2)
                else:
                    k, v = self.cache[self.layer_id]
            self.cache[self.layer_id] = (k, v)

        # (bs, n_heads, qlen, dim_per_head)
        q = q / math.sqrt(dim_per_head)
        # (bs, n_heads, qlen, klen)
        scores = torch.matmul(q, k.transpose(2, 3))
        mask = (mask == 0).view(mask_reshape).expand_as(
            scores)               # (bs, n_heads, qlen, klen)
        # (bs, n_heads, qlen, klen)
        scores.masked_fill_(mask, -float('inf'))

        # (bs, n_heads, qlen, klen)
        weights = F.softmax(scores.float(), dim=-1).type_as(scores)
        # (bs, n_heads, qlen, klen)
        weights = F.dropout(weights, p=self.dropout, training=self.training)
        # (bs, n_heads, qlen, dim_per_head)
        context = torch.matmul(weights, v)
        # (bs, qlen, dim)
        context = unshape(context)

        return self.out_lin(context)


class TransformerFFN(nn.Module):

    def __init__(self, in_dim, dim_hidden, out_dim, dropout, gelu_activation):
        super().__init__()
        self.dropout = dropout
        self.lin1 = Linear(in_dim, dim_hidden)
        self.lin2 = Linear(dim_hidden, out_dim)
        self.act = gelu if gelu_activation else F.relu

    def forward(self, input):
        x = self.lin1(input)
        x = self.act(x)
        x = self.lin2(x)
        x = F.dropout(x, p=self.dropout, training=self.training)
        return x


class TransformerModel(nn.Module):

    ATTRIBUTES = ['encoder', 'with_output', 'eos_index', 'pad_index', 'n_langs', 'n_words',
                  'dim', 'n_layers', 'n_heads', 'hidden_dim', 'dropout', 'attention_dropout']

    def __init__(self, params, dico, is_encoder, with_output):
        """
        Transformer model (encoder or decoder).
        """
        super().__init__()

        # encoder / decoder, output layer
        self.is_encoder = is_encoder
        self.is_decoder = not is_encoder
        self.with_output = with_output

        # dictionary / languages
        self.n_langs = params.n_langs
        self.n_words = params.n_words
        self.eos_index = params.eos_index
        self.pad_index = params.pad_index
        self.dico = dico
        self.id2lang = params.id2lang
        self.lang2id = params.lang2id
        self.use_lang_emb = getattr(params, 'use_lang_emb', True)
        assert len(self.dico) == self.n_words
        assert len(self.id2lang) == len(self.lang2id) == self.n_langs

        # model parameters
        self.dim = params.emb_dim_encoder if is_encoder else params.emb_dim_decoder  # 512 by default
        self.hidden_dim = self.dim * 4  # 2048 by default
        self.n_heads = params.n_heads   # 8 by default
        self.n_layers = params.n_layers_encoder if is_encoder else params.n_layers_decoder
        self.dropout = params.dropout
        self.attention_dropout = params.attention_dropout
        assert self.dim % self.n_heads == 0, 'transformer dim must be a multiple of n_heads'

        # embeddings
        self.position_embeddings = Embedding(N_MAX_POSITIONS, self.dim)
        if params.sinusoidal_embeddings:
            create_sinusoidal_embeddings(
                N_MAX_POSITIONS, self.dim, out=self.position_embeddings.weight)
        if params.n_langs > 1 and self.use_lang_emb:
            self.lang_embeddings = Embedding(self.n_langs, self.dim)
        self.embeddings = Embedding(
            self.n_words, self.dim, padding_idx=self.pad_index)
        self.layer_norm_emb = nn.LayerNorm(self.dim, eps=1e-12)

        # transformer layers
        self.attentions = nn.ModuleList()
        self.layer_norm1 = nn.ModuleList()
        self.ffns = nn.ModuleList()
        self.layer_norm2 = nn.ModuleList()
        if self.is_decoder:
            self.layer_norm15 = nn.ModuleList()
            self.encoder_attn = nn.ModuleList()

        self.cache = None

        for layer_id in range(self.n_layers):
            self.attentions.append(MultiHeadAttention(
                self.n_heads, self.dim, dropout=self.attention_dropout))
            self.layer_norm1.append(nn.LayerNorm(self.dim, eps=1e-12))
            if self.is_decoder:
                self.layer_norm15.append(nn.LayerNorm(self.dim, eps=1e-12))
                self.encoder_attn.append(MultiHeadAttention(
                    self.n_heads, self.dim, dim_encoder=params.emb_dim_encoder, dropout=self.attention_dropout))
            self.ffns.append(TransformerFFN(self.dim, self.hidden_dim, self.dim,
                                            dropout=self.dropout, gelu_activation=params.gelu_activation))
            self.layer_norm2.append(nn.LayerNorm(self.dim, eps=1e-12))

        # output layer
        if self.with_output:
            self.pred_layer = PredLayer(params)
            if params.share_inout_emb:
                self.pred_layer.proj.weight = self.embeddings.weight

    def forward(self, mode, **kwargs):
        """
        Forward function with different forward modes.
        ### Small hack to handle PyTorch distributed.
        """
        if mode == 'fwd':
            return self.fwd(**kwargs)
        elif mode == 'predict':
            return self.predict(**kwargs)
        else:
            raise Exception("Unknown mode: %s" % mode)

    def fwd(self, x, lengths, causal, src_enc=None, src_len=None, positions=None, langs=None, use_cache=False):
        """
        Inputs:
            `x` LongTensor(slen, bs), containing word indices
            `lengths` LongTensor(bs), containing the length of each sentence
            `causal` Boolean, if True, the attention is only done over previous hidden states
            `positions` LongTensor(slen, bs), containing word positions
            `langs` LongTensor(slen, bs), containing language IDs
        """
        # lengths = (x != self.pad_index).float().sum(dim=1)
        # mask = x != self.pad_index

        assert not(use_cache and self.cache is None)
        # check inputs
        slen, bs = x.size()
        assert lengths.size(0) == bs
        assert lengths.max().item() <= slen
        x = x.transpose(0, 1)  # batch size as dimension 0
        assert (src_enc is None) == (src_len is None)
        if src_enc is not None:
            assert self.is_decoder
            assert src_enc.size(0) == bs

        # generate masks
        mask, attn_mask = get_masks(slen, lengths, causal)
        if self.is_decoder and src_enc is not None:
            src_mask = torch.arange(
                src_enc.shape[1], dtype=torch.long, device=lengths.device) < src_len[:, None]

        # positions
        if positions is None:
            positions = x.new(slen).long()
            positions = torch.arange(slen, out=positions).unsqueeze(0)
        else:
            assert positions.size() == (slen, bs)
            positions = positions.transpose(0, 1)

        # langs
        if langs is not None:
            assert langs.size() == (slen, bs)
            langs = langs.transpose(0, 1)

        # do not recompute cached elements
        if use_cache:
            _slen = slen - self.cache['slen']
            x = x[:, -_slen:]
            positions = positions[:, -_slen:]
            if langs is not None:
                langs = langs[:, -_slen:]
            mask = mask[:, -_slen:]
            attn_mask = attn_mask[:, -_slen:]

        # embeddings
        tensor = self.embeddings(x)
        tensor = tensor + self.position_embeddings(positions).expand_as(tensor)
        if langs is not None and self.use_lang_emb:
            tensor = tensor + self.lang_embeddings(langs)
        tensor = self.layer_norm_emb(tensor)
        tensor = F.dropout(tensor, p=self.dropout, training=self.training)
        tensor *= mask.unsqueeze(-1).to(tensor.dtype)

        # transformer layers
        for i in range(self.n_layers):

            # self attention
            self.attentions[i].cache = self.cache
            attn = self.attentions[i](tensor, attn_mask, use_cache=use_cache)
            attn = F.dropout(attn, p=self.dropout, training=self.training)
            tensor = tensor + attn
            tensor = self.layer_norm1[i](tensor)

            # encoder attention (for decoder only)
            if self.is_decoder and src_enc is not None:
                assert src_enc.shape[1] == src_mask.shape[-1]
                self.encoder_attn[i].cache = self.cache
                attn = self.encoder_attn[i](
                    tensor, src_mask, kv=src_enc, use_cache=use_cache)
                attn = F.dropout(attn, p=self.dropout, training=self.training)
                tensor = tensor + attn
                tensor = self.layer_norm15[i](tensor)

            # FFN
            tensor = tensor + self.ffns[i](tensor)
            tensor = self.layer_norm2[i](tensor)

            tensor *= mask.unsqueeze(-1).to(tensor.dtype)

        # update cache length
        if use_cache:
            self.cache['slen'] += tensor.size(1)

        # move back sequence length to dimension 0
        tensor = tensor.transpose(0, 1)

        return tensor

    def predict(self, tensor, pred_mask, y, get_scores):
        """
        Given the last hidden state, compute word scores and/or the loss.
            `pred_mask` is a ByteTensor of shape (slen, bs), filled with 1 when
                we need to predict a word
            `y` is a LongTensor of shape (pred_mask.sum(),)
            `get_scores` is a boolean specifying whether we need to return scores
        """

        masked_tensor = tensor[pred_mask.unsqueeze(
            -1).expand_as(tensor)].view(-1, self.dim)
        scores, loss = self.pred_layer(masked_tensor, y, get_scores)
        return scores, loss

    def generate(self, src_enc, src_len, tgt_lang_id, max_len=200, sample_temperature=None):
        """
        Decode a sentence given initial start.
        `x`:
            - LongTensor(bs, slen)
                <EOS> W1 W2 W3 <EOS> <PAD>
                <EOS> W1 W2 W3   W4  <EOS>
        `lengths`:
            - LongTensor(bs) [5, 6]
        `positions`:
            - False, for regular "arange" positions (LM)
            - True, to reset positions from the new generation (MT)
        `langs`:
            - must be None if the model only supports one language
            - lang_id if only one language is involved (LM)
            - (lang_id1, lang_id2) if two languages are involved (MT)
        """

        if isinstance(max_len, int):
            max_lengths = src_len.clone().fill_(max_len)
            global_max_len = max_len
        else:
            max_lengths = max_len
            global_max_len = int(max_lengths.max())

        # input batch
        bs = len(src_len)
        assert src_enc.size(0) == bs

        # generated sentences
        generated = src_len.new(global_max_len, bs)  # upcoming output
        generated.fill_(self.pad_index)       # fill upcoming ouput with <PAD>
        # we use <EOS> for <BOS> everywhere
        generated[0].fill_(self.eos_index)

        # positions
        positions = src_len.new(global_max_len).long()
        positions = torch.arange(global_max_len, out=positions).unsqueeze(
            1).expand(global_max_len, bs)

        # language IDs
        langs = src_len.new(global_max_len).long().fill_(tgt_lang_id)
        langs = langs.unsqueeze(1).expand(global_max_len, bs)

        # current position / max lengths / length of generated sentences / unfinished sentences
        cur_len = 1
        gen_len = src_len.clone().fill_(1)
        unfinished_sents = src_len.clone().fill_(1)

        # cache compute states
        self.cache = {'slen': 0}
        previous_unfinished_mask = unfinished_sents.ne(0)
        while cur_len < global_max_len:
            # compute word scores
            unfinished_mask = unfinished_sents.ne(0)

            should_modify = unfinished_mask.ne(previous_unfinished_mask).any()
            restricted_mask = unfinished_mask[previous_unfinished_mask]

            if should_modify and self.cache is not None:
                for k, v in self.cache.items():
                    if isinstance(k, int):
                        assert len(v) == 2
                        self.cache[k] = (cached_tensor[restricted_mask]
                                         for cached_tensor in v)

            tensor = self.forward(
                'fwd',
                x=generated[:cur_len, unfinished_mask],
                lengths=gen_len[unfinished_mask],
                positions=positions[:cur_len, unfinished_mask],
                langs=langs[:cur_len][:, unfinished_mask],
                causal=True,
                src_enc=src_enc[unfinished_mask],
                src_len=src_len[unfinished_mask],
                use_cache=True
            )
            assert tensor.size() == (1, unfinished_mask.sum().item(), self.dim), (cur_len,
                                                                                  global_max_len, src_enc.size(), tensor.size(), (1, bs, self.dim))
            tensor = tensor.data[-1, :, :].type_as(src_enc)  # (bs, dim)
            scores = self.pred_layer.get_scores(tensor)  # (bs, n_words)

            # select next words: sample or greedy
            if sample_temperature is None:
                next_words = torch.topk(scores, 1)[1].squeeze(1)
            else:
                next_words = torch.multinomial(
                    F.softmax(scores.float() / sample_temperature, dim=1), 1).squeeze(1)
            assert next_words.size() == (unfinished_mask.sum().item(),)

            # update generations / lengths / finished sentences / current length.
            # No need to updates the finished sequences since the value is self.pad_index by default
            generated[cur_len, unfinished_mask] = next_words

            gen_len.add_(unfinished_sents)
            generated[cur_len].masked_fill_(max_lengths.eq(
                cur_len + 1) & unfinished_sents.eq(1), self.eos_index)
            unfinished_sents[unfinished_mask] = unfinished_sents[unfinished_mask].mul(next_words.ne(
                self.eos_index).long()).mul(max_lengths[unfinished_mask].ne(cur_len+1).long())

            cur_len = cur_len + 1

            previous_unfinished_mask = unfinished_mask
            # stop when there is a </s> in each sentence, or if we exceed the maximal length
            if unfinished_sents.max() == 0:
                break

        # sanity check
        assert (generated == self.eos_index).sum() == 2 * bs

        return generated[:cur_len], gen_len

    def generate_beam(self, src_enc, src_len, tgt_lang_id, beam_size, length_penalty, early_stopping, max_len=200):
        """
        Decode a sentence given initial start.
        `x`:
            - LongTensor(bs, slen)
                <EOS> W1 W2 W3 <EOS> <PAD>
                <EOS> W1 W2 W3   W4  <EOS>
        `lengths`:
            - LongTensor(bs) [5, 6]
        `positions`:
            - False, for regular "arange" positions (LM)
            - True, to reset positions from the new generation (MT)
        `langs`:
            - must be None if the model only supports one language
            - lang_id if only one language is involved (LM)
            - (lang_id1, lang_id2) if two languages are involved (MT)
        """
        if isinstance(max_len, int):
            max_lengths = src_len.clone().fill_(max_len)
            global_max_len = max_len
        else:
            max_lengths = max_len
            global_max_len = int(max_lengths.max())

        # check inputs
        assert src_enc.size(0) == src_len.size(0)
        assert beam_size >= 1

        # batch size / number of words
        bs = len(src_len)
        n_words = self.n_words

        # expand to beam size the source latent representations / source lengths
        src_enc = src_enc.unsqueeze(1).expand(
            (bs, beam_size) + src_enc.shape[1:]).contiguous().view((bs * beam_size,) + src_enc.shape[1:])
        src_len = src_len.unsqueeze(1).expand(
            bs, beam_size).contiguous().view(-1)

        # generated sentences (batch with beam current hypotheses)
        generated = src_len.new(global_max_len, bs *
                                beam_size)  # upcoming output
        # fill upcoming ouput with <PAD>
        generated.fill_(self.pad_index)
        # we use <EOS> for <BOS> everywhere
        generated[0].fill_(self.eos_index)

        # generated hypotheses
        generated_hyps = [BeamHypotheses(
            beam_size, global_max_len, length_penalty, early_stopping) for _ in range(bs)]

        # positions
        positions = src_len.new(global_max_len).long()
        positions = torch.arange(global_max_len, out=positions).unsqueeze(
            1).expand_as(generated)

        # language IDs
        langs = positions.clone().fill_(tgt_lang_id)

        # scores for each sentence in the beam
        beam_scores = src_enc.new(bs, beam_size).float().fill_(0)
        beam_scores[:, 1:] = -1e9
        beam_scores = beam_scores.view(-1)

        # current position
        cur_len = 1

        # cache compute states
        self.cache = {'slen': 0}

        # done sentences
        done = [False for _ in range(bs)]

        while cur_len < global_max_len:

            # compute word scores
            tensor = self.forward(
                'fwd',
                x=generated[:cur_len],
                lengths=src_len.new(bs * beam_size).fill_(cur_len),
                positions=positions[:cur_len],
                langs=langs[:cur_len],
                causal=True,
                src_enc=src_enc,
                src_len=src_len,
                use_cache=True
            )
            assert tensor.size() == (1, bs * beam_size, self.dim)
            # (bs * beam_size, dim)
            tensor = tensor.data[-1, :, :].type_as(src_enc)
            scores = self.pred_layer.get_scores(
                tensor)     # (bs * beam_size, n_words)
            # (bs * beam_size, n_words)
            scores = F.log_softmax(scores.float(), dim=-1)
            assert scores.size() == (bs * beam_size, n_words)

            # select next words with scores
            # (bs * beam_size, n_words)
            _scores = scores + beam_scores[:, None].expand_as(scores)
            # (bs, beam_size * n_words)
            _scores = _scores.view(bs, beam_size * n_words)

            next_scores, next_words = torch.topk(
                _scores, 2 * beam_size, dim=1, largest=True, sorted=True)
            assert next_scores.size() == next_words.size() == (bs, 2 * beam_size)

            # next batch beam content
            # list of (bs * beam_size) tuple(next hypothesis score, next word, current position in the batch)
            next_batch_beam = []

            # for each sentence
            for sent_id in range(bs):

                # if we are done with this sentence
                done[sent_id] = done[sent_id] or generated_hyps[sent_id].is_done(
                    next_scores[sent_id].max().item())
                if done[sent_id]:
                    next_batch_beam.extend(
                        [(0, self.pad_index, 0)] * beam_size)  # pad the batch
                    continue

                # next sentence beam content
                next_sent_beam = []

                # next words for this sentence
                for idx, value in zip(next_words[sent_id], next_scores[sent_id]):

                    # get beam and word IDs
                    beam_id = idx // n_words
                    word_id = idx % n_words

                    # end of sentence, or next word
                    if word_id == self.eos_index or cur_len + 1 == global_max_len:
                        generated_hyps[sent_id].add(
                            generated[:cur_len, sent_id * beam_size + beam_id].clone(), value.item())
                    else:
                        next_sent_beam.append(
                            (value, word_id, sent_id * beam_size + beam_id))

                    # the beam for next step is full
                    if len(next_sent_beam) == beam_size:
                        break

                # update next beam content
                assert len(next_sent_beam) == 0 if cur_len + \
                    1 == global_max_len else beam_size
                if len(next_sent_beam) == 0:
                    next_sent_beam = [(0, self.pad_index, 0)] * \
                        beam_size  # pad the batch
                next_batch_beam.extend(next_sent_beam)
                assert len(next_batch_beam) == beam_size * (sent_id + 1)

            # sanity check / prepare next batch
            assert len(next_batch_beam) == bs * beam_size
            beam_scores = beam_scores.new([x[0] for x in next_batch_beam])
            beam_words = generated.new([x[1] for x in next_batch_beam])
            beam_idx = src_len.new([x[2] for x in next_batch_beam])

            # re-order batch and internal states
            generated = generated[:, beam_idx]
            generated[cur_len] = beam_words
            for k in self.cache.keys():
                if k != 'slen':
                    self.cache[k] = (self.cache[k][0][beam_idx],
                                     self.cache[k][1][beam_idx])

            # update current length
            cur_len = cur_len + 1

            # stop when we are done with each sentence
            if all(done):
                break

        # visualize hypotheses
        # print([len(x) for x in generated_hyps], cur_len)
        # globals().update( locals() );
        # !import code; code.interact(local=vars())
        # for ii in range(bs):
        #     for ss, ww in sorted(generated_hyps[ii].hyp, key=lambda x: x[0], reverse=True):
        #         print("%.3f " % ss + " ".join(self.dico[x] for x in ww.tolist()))
        #     print("")

        # select the best hypotheses
        tgt_len = src_len.new(bs)
        best = []

        for i, hypotheses in enumerate(generated_hyps):
            sorted_hyps = [h[1] for h in sorted(
                hypotheses.hyp, key=lambda x: x[0], reverse=True)]
            tgt_len[i] = max([len(hyp) for hyp in sorted_hyps]
                             ) + 1  # +1 for the <EOS> symbol
            best.append(sorted_hyps)

        # generate target batch
        decoded = src_len.new(tgt_len.max().item(),
                              beam_size, bs).fill_(self.pad_index)
        for i, hypo_list in enumerate(best):
            for hyp_index, hypo in enumerate(hypo_list):
                decoded[:len(hypo), hyp_index, i] = hypo
                decoded[len(hypo), hyp_index, i] = self.eos_index

        # sanity check
        assert (decoded == self.eos_index).sum() == 2 * beam_size * bs

        return decoded, tgt_len


class BeamHypotheses(object):

    def __init__(self, n_hyp, max_len, length_penalty, early_stopping):
        """
        Initialize n-best list of hypotheses.
        """
        self.max_len = max_len - 1  # ignoring <BOS>
        self.length_penalty = length_penalty
        self.early_stopping = early_stopping
        self.n_hyp = n_hyp
        self.hyp = []
        self.worst_score = 1e9

    def __len__(self):
        """
        Number of hypotheses in the list.
        """
        return len(self.hyp)

    def add(self, hyp, sum_logprobs):
        """
        Add a new hypothesis to the list.
        """
        score = sum_logprobs / len(hyp) ** self.length_penalty
        if len(self) < self.n_hyp or score > self.worst_score:
            self.hyp.append((score, hyp))
            if len(self) > self.n_hyp:
                sorted_scores = sorted([(s, idx)
                                        for idx, (s, _) in enumerate(self.hyp)])
                del self.hyp[sorted_scores[0][1]]
                self.worst_score = sorted_scores[1][0]
            else:
                self.worst_score = min(score, self.worst_score)

    def is_done(self, best_sum_logprobs):
        """
        If there are enough hypotheses and that none of the hypotheses being generated
        can become better than the worst one in the heap, then we are done with this sentence.
        """
        if len(self) < self.n_hyp:
            return False
        elif self.early_stopping:
            return True
        else:
            return self.worst_score >= best_sum_logprobs / self.max_len ** self.length_penalty
