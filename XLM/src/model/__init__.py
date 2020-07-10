# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#

from logging import getLogger
import os
import torch

from .pretrain import load_embeddings
# , TRANSFORMER_LAYER_PARAMS
from .transformer import DECODER_ONLY_PARAMS, TransformerModel


logger = getLogger()


def check_model_params(params):
    """
    Check models parameters.
    """
    # masked language modeling task parameters
    assert params.bptt >= 1
    assert 0 <= params.word_pred < 1
    assert 0 <= params.sample_alpha < 1
    s = params.word_mask_keep_rand.split(',')
    assert len(s) == 3
    s = [float(x) for x in s]
    assert all([0 <= x <= 1 for x in s]) and sum(s) == 1
    params.word_mask = s[0]
    params.word_keep = s[1]
    params.word_rand = s[2]

    # input sentence noise for DAE
    if len(params.ae_steps) == 0:
        assert params.word_shuffle == 0
        assert params.word_dropout == 0
        assert params.word_blank == 0
    else:
        assert params.word_shuffle == 0 or params.word_shuffle > 1
        assert 0 <= params.word_dropout < 1
        assert 0 <= params.word_blank < 1

    # model dimensions
    if params.emb_dim_encoder == 0 and params.emb_dim_decoder == 0:
        assert params.emb_dim > 0
        params.emb_dim_encoder = params.emb_dim
        params.emb_dim_decoder = params.emb_dim
    else:
        assert params.emb_dim == 0
        assert params.emb_dim_encoder > 0 and params.emb_dim_decoder > 0
        if params.emb_dim_encoder == params.emb_dim_decoder:
            params.emb_dim = params.emb_dim_decoder
        else:
            assert params.reload_emb == "", 'Pre-trained embeddings are not supported when the embedding size of the ' \
                                            'encoder and the decoder do not match '
    assert params.emb_dim_encoder % params.n_heads == 0
    assert params.emb_dim_decoder % params.n_heads == 0

    if params.n_layers_encoder == 0 and params.n_layers_decoder == 0:
        assert params.n_layers > 0
        params.n_layers_encoder = params.n_layers
        params.n_layers_decoder = params.n_layers
    else:
        assert params.n_layers == 0

    assert params.n_layers_encoder > 0 and params.n_layers_decoder > 0

    # reload pretrained word embeddings
    if params.reload_emb != '':
        assert os.path.isfile(params.reload_emb)

    # reload a pretrained model
    if params.reload_model != '':
        if params.encoder_only:
            assert os.path.isfile(params.reload_model)
        else:
            s = params.reload_model.split(',')
            assert len(s) == 2
            assert all([x == '' or os.path.isfile(x) for x in s])

    assert not (params.beam_size > 1 and params.number_samples >
                1), 'Cannot sample when already doing beam search'
    assert (params.eval_temperature is None) == (params.number_samples <=
                                                 1), 'Eval temperature should be set if and only if taking several samples at eval time'


def set_pretrain_emb(model, dico, word2id, embeddings):
    """
    Pretrain word embeddings.
    """
    n_found = 0
    with torch.no_grad():
        for i in range(len(dico)):
            idx = word2id.get(dico[i], None)
            if idx is None:
                continue
            n_found += 1
            model.embeddings.weight[i] = embeddings[idx].cuda()
            model.pred_layer.proj.weight[i] = embeddings[idx].cuda()
    logger.info("Pretrained %i/%i words (%.3f%%)."
                % (n_found, len(dico), 100. * n_found / len(dico)))


def build_model(params, dico):
    """
    Build model.
    """
    if params.encoder_only:
        # build
        model = TransformerModel(
            params, dico, is_encoder=True, with_output=True)

        # reload pretrained word embeddings
        if params.reload_emb != '':
            word2id, embeddings = load_embeddings(params.reload_emb, params)
            set_pretrain_emb(model, dico, word2id, embeddings)

        # reload a pretrained model
        if params.reload_model != '':
            logger.info("Reloading model from %s ..." % params.reload_model)
            reloaded = torch.load(params.reload_model, map_location=lambda storage, loc: storage.cuda(
                params.local_rank))['model']
            if all([k.startswith('module.') for k in reloaded.keys()]):
                reloaded = {k[len('module.'):]: v for k, v in reloaded.items()}

            # # HACK to reload models with less layers
            # for i in range(12, 24):
            #     for k in TRANSFORMER_LAYER_PARAMS:
            #         k = k % i
            #         if k in model.state_dict() and k not in reloaded:
            #             logger.warning("Parameter %s not found. Ignoring ..." % k)
            #             reloaded[k] = model.state_dict()[k]

            model.load_state_dict(reloaded)

        logger.info("Model: {}".format(model))
        logger.info("Number of parameters (model): %i" % sum(
            [p.numel() for p in model.parameters() if p.requires_grad]))

        return [model.cuda()]

    else:
        # build
        # TODO: only output when necessary - len(params.clm_steps + params.mlm_steps) > 0
        encoder = TransformerModel(
            params, dico, is_encoder=True, with_output=True)

        if params.separate_decoders:
            decoders = [TransformerModel(
                params, dico, is_encoder=False, with_output=True) for _ in params.lang2id.values()]
        else:
            decoders = [TransformerModel(
                params, dico, is_encoder=False, with_output=True)]

        for layer in range(params.n_layers_decoder):
            if layer <= params.n_share_dec - 1:
                assert params.amp == -1, "sharing layers is not supported with AMP"
                logger.info(
                    "Sharing decoder attention parameters for layer %i" % layer)
                for i in range(1, len(decoders)):
                    decoders[i].attentions[layer] = decoders[0].attentions[layer]

        # reload pretrained word embeddings
        if params.reload_emb != '':
            word2id, embeddings = load_embeddings(params.reload_emb, params)
            set_pretrain_emb(encoder, dico, word2id, embeddings)
            set_pretrain_emb(decoders, dico, word2id, embeddings)

        # reload a pretrained model
        if params.reload_model != '':
            enc_path, dec_path = params.reload_model.split(',')
            assert not (enc_path == '' and dec_path == '')

            # reload encoder
            if enc_path != '':
                logger.info("Reloading encoder from %s ..." % enc_path)
                enc_reload = torch.load(
                    enc_path, map_location=lambda storage, loc: storage.cuda(params.local_rank))
                enc_reload = enc_reload['model' if 'model' in enc_reload else 'encoder']
                if all([k.startswith('module.') for k in enc_reload.keys()]):
                    enc_reload = {k[len('module.'):]: v for k,
                                  v in enc_reload.items()}

                # # HACK to reload models trained with less languages
                n_langs = len(params.langs)
                n_langs_reload = enc_reload['lang_embeddings.weight'].size()[0]
                assert n_langs == n_langs_reload or n_langs == 2 * \
                    n_langs_reload or n_langs == 2 * n_langs_reload + 1
                if n_langs == 2 * n_langs_reload:
                    enc_reload['lang_embeddings.weight'] = enc_reload['lang_embeddings.weight'].transpose(
                        0, 1).repeat_interleave(2, 1).transpose(0, 1)
                elif n_langs == 2 * n_langs_reload + 1:
                    enc_reload['lang_embeddings.weight'] = enc_reload['lang_embeddings.weight'].transpose(
                        0, 1).repeat_interleave(2, 1).transpose(0, 1)
                    enc_reload['lang_embeddings.weight'] = torch.cat(
                        [enc_reload['lang_embeddings.weight'][0, :].unsqueeze(dim=0), enc_reload['lang_embeddings.weight']])

                if encoder.position_embeddings.weight.size()[0] == 2 * enc_reload['position_embeddings.weight'].size()[0]:
                    enc_reload['position_embeddings.weight'] = enc_reload['position_embeddings.weight'].repeat(
                        2, 1)

                encoder.load_state_dict(enc_reload)

            # reload decoders
            if dec_path != '':
                for dec in decoders:
                    logger.info("Reloading decoders from %s ..." % dec_path)
                    dec_reload = torch.load(
                        dec_path, map_location=lambda storage, loc: storage.cuda(params.local_rank))
                    dec_reload = dec_reload['model' if 'model' in dec_reload else 'decoder']
                    if all([k.startswith('module.') for k in dec_reload.keys()]):
                        dec_reload = {
                            k[len('module.'):]: v for k, v in dec_reload.items()}

                    # # HACK to reload models trained with less languages
                    n_langs = len(params.langs)
                    n_langs_reload = dec_reload['lang_embeddings.weight'].size()[
                        0]
                    assert n_langs == n_langs_reload or n_langs == 2 * \
                        n_langs_reload or n_langs == 2 * n_langs_reload + 1
                    if n_langs == 2 * n_langs_reload:
                        dec_reload['lang_embeddings.weight'] = dec_reload['lang_embeddings.weight'].transpose(
                            0, 1).repeat_interleave(2, 1).transpose(0, 1)
                    elif n_langs == 2 * n_langs_reload + 1:
                        dec_reload['lang_embeddings.weight'] = dec_reload['lang_embeddings.weight'].transpose(
                            0, 1).repeat_interleave(2, 1).transpose(0, 1)
                        dec_reload['lang_embeddings.weight'] = torch.cat(
                            [dec_reload['lang_embeddings.weight'][0, :].unsqueeze(dim=0), dec_reload['lang_embeddings.weight']])
                    if dec.position_embeddings.weight.size()[0] == 2 * dec_reload['position_embeddings.weight'].size()[0]:
                        dec_reload['position_embeddings.weight'] = dec_reload['position_embeddings.weight'].repeat(
                            2, 1)

                    for i in range(params.n_layers_decoder):
                        for name in DECODER_ONLY_PARAMS:
                            if name % i not in dec_reload:
                                logger.warning(
                                    "Parameter %s not found." % (name % i))
                                dec_reload[name % i] = dec.state_dict()[
                                    name % i]
                    dec.load_state_dict(dec_reload)

        logger.debug("Encoder: {}".format(encoder))
        logger.debug("Decoder: {}".format(decoders))
        logger.info("Number of parameters (encoder): %i" % sum(
            [p.numel() for p in encoder.parameters() if p.requires_grad]))
        logger.info("Number of parameters (decoders): %i" % sum(
            [p.numel() for p in decoders[0].parameters() if p.requires_grad]))
        logger.info(f"Number of decoders: {len(decoders)}")

        return [encoder.cuda()], [dec.cuda() for dec in decoders]
