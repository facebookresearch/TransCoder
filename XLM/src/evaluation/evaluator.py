# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys
from logging import getLogger
import os
import subprocess
from collections import OrderedDict
import numpy as np
import requests
import torch
import json
from pathlib import Path

from ..utils import to_cuda, restore_segmentation, concat_batches, vizualize_translated_files, eval_function_output

BLEU_SCRIPT_URL = 'https://raw.githubusercontent.com/facebookresearch/XLM/master/src/evaluation/multi-bleu.perl'
BLEU_SCRIPT_PATH = os.path.join(os.path.abspath(os.path.dirname(__file__)), 'multi-bleu.perl')
if not os.path.isfile(BLEU_SCRIPT_PATH):
    try:
        r = requests.get(BLEU_SCRIPT_URL)
        with open(BLEU_SCRIPT_PATH, 'wb') as f:
            f.write(r.content)
    except KeyboardInterrupt:
        raise
    except:
        os.remove(BLEU_SCRIPT_PATH)
        sys.stderr.write(f"Could not download {BLEU_SCRIPT_URL} to {BLEU_SCRIPT_PATH}. You can do it manually.")
        exit(0)
assert os.path.isfile(BLEU_SCRIPT_PATH)
EVAL_SCRIPT_FOLDER = {"test": os.path.abspath("data/evaluation/geeks_for_geeks_successful_test_scripts"),
                      "valid": os.path.abspath("data/evaluation/geeks_for_geeks_successful_test_scripts")}
logger = getLogger()


class Evaluator(object):

    def __init__(self, trainer, data, params):
        """
        Initialize evaluator.
        """
        self.trainer = trainer
        self.data = data
        self.dico = data['dico']
        self.params = params

        # create directory to store hypotheses, and reference files for BLEU evaluation
        if self.params.is_master:
            params.hyp_path = os.path.join(params.dump_path, 'hypotheses')
            subprocess.Popen('mkdir -p %s' %
                             params.hyp_path, shell=True).wait()
            params.eval_scripts_root = os.path.join(
                params.dump_path, 'eval_scripts')
            subprocess.Popen('mkdir -p %s' %
                             params.eval_scripts_root, shell=True).wait()
            self.params.ref_paths = {}
            self.params.id_paths = {}
            self.params.eval_scripts_folders = {}
            self.create_reference_files()

    def get_iterator(self, data_set, lang1, lang2=None, stream=False):
        """
        Create a new iterator for a dataset.
        """
        assert data_set in ['valid', 'test']
        assert lang1 in self.params.langs
        assert lang2 is None or lang2 in self.params.langs
        assert stream is False or lang2 is None

        if len(self.params.langs) > 2:
            subsample = 10 if data_set == 'test' else 5
            n_sentences = 1500 if data_set == 'test' else -1
        else:
            # n_sentences = -1 if data_set == 'valid' else 100
            n_sentences = -1
            subsample = 1

        if lang2 is None:
            if stream:
                iterator = self.data['mono_stream'][lang1][data_set].get_iterator(
                    shuffle=False, subsample=subsample)
            else:
                iterator = self.data['mono'][lang1][data_set].get_iterator(
                    tokens_per_batch=self.params.tokens_per_batch,
                    shuffle=False,
                    group_by_size=True,
                    n_sentences=n_sentences,
                )
        else:
            assert stream is False
            _lang1, _lang2 = (
                lang1, lang2) if lang1 < lang2 else (lang2, lang1)
            iterator = self.data['para'][(_lang1, _lang2)][data_set].get_iterator(
                shuffle=False,
                group_by_size=True,
                n_sentences=n_sentences,
                tokens_per_batch=self.params.tokens_per_batch
            )

        for batch in iterator:
            yield batch if lang2 is None or lang1 < lang2 else batch[::-1]

    def create_reference_files(self):
        """
        Create reference files for BLEU evaluation.
        """
        params = self.params
        for (lang1, lang2), v in self.data['para'].items():

            assert lang1 < lang2

            for data_set in ['valid', 'test']:

                params.eval_scripts_folders[(lang1, lang2, data_set)] = os.path.join(
                    params.eval_scripts_root, '{0}-{1}.{2}'.format(lang1, lang2, data_set))
                subprocess.Popen(
                    'mkdir -p %s' % params.eval_scripts_folders[(lang1, lang2, data_set)], shell=True).wait()
                params.eval_scripts_folders[(lang2, lang1, data_set)] = os.path.join(
                    params.eval_scripts_root, '{0}-{1}.{2}'.format(lang2, lang1, data_set))
                subprocess.Popen(
                    'mkdir -p %s' % params.eval_scripts_folders[(lang2, lang1, data_set)], shell=True).wait()

                # define data paths
                lang1_path = os.path.join(
                    params.hyp_path, 'ref.{0}-{1}.{2}.txt'.format(lang2, lang1, data_set))
                lang2_path = os.path.join(
                    params.hyp_path, 'ref.{0}-{1}.{2}.txt'.format(lang1, lang2, data_set))
                id_path = os.path.join(
                    params.hyp_path, 'ids.{0}-{1}.{2}.txt'.format(lang1, lang2, data_set))
                # store data paths
                params.ref_paths[(lang2, lang1, data_set)] = lang1_path
                params.ref_paths[(lang1, lang2, data_set)] = lang2_path
                params.id_paths[(lang1, lang2, data_set)] = id_path
                params.id_paths[(lang2, lang1, data_set)] = id_path

                # text sentences
                lang1_txt = []
                lang2_txt = []

                id_txt = []
                # convert to text
                for i, ((sent1, len1, id1, lenid1), (sent2, len2, id2, lenid2)) in enumerate(self.get_iterator(data_set, lang1, lang2)):
                    lang1_txt.extend(convert_to_text(
                        sent1, len1, self.dico, params))
                    lang2_txt.extend(convert_to_text(
                        sent2, len2, self.dico, params))

                    if params.has_sentences_ids:
                        assert id1.equal(id2) and lenid1.equal(lenid2)
                        id_txt.extend(convert_to_text(
                            id1, lenid1, self.dico, params))

                # replace <unk> by <<unk>> as these tokens cannot be counted in BLEU
                lang1_txt = [x.replace('<unk>', '<<unk>>') for x in lang1_txt]
                lang2_txt = [x.replace('<unk>', '<<unk>>') for x in lang2_txt]

                # export hypothesis
                with open(lang1_path, 'w', encoding='utf-8') as f:
                    f.write('\n'.join(lang1_txt) + '\n')
                with open(lang2_path, 'w', encoding='utf-8') as f:
                    f.write('\n'.join(lang2_txt) + '\n')

                # restore original segmentation
                restore_segmentation(lang1_path)
                restore_segmentation(lang2_path)

                if params.has_sentences_ids:
                    with open(id_path, 'w', encoding='utf-8') as f:
                        f.write('\n'.join(id_txt) + '\n')
                    restore_segmentation(id_path)

    def mask_out(self, x, lengths, rng):
        """
        Decide of random words to mask out.
        We specify the random generator to ensure that the test is the same at each epoch.
        """
        params = self.params
        slen, bs = x.size()

        # words to predict - be sure there is at least one word per sentence
        to_predict = rng.rand(slen, bs) <= params.word_pred
        to_predict[0] = 0
        for i in range(bs):
            to_predict[lengths[i] - 1:, i] = 0
            if not np.any(to_predict[:lengths[i] - 1, i]):
                v = rng.randint(1, lengths[i] - 1)
                to_predict[v, i] = 1
        pred_mask = torch.from_numpy(to_predict.astype(np.uint8))
        pred_mask = pred_mask == 1

        # generate possible targets / update x input
        _x_real = x[pred_mask]
        _x_mask = _x_real.clone().fill_(params.mask_index)
        x = x.masked_scatter(pred_mask, _x_mask)

        assert 0 <= x.min() <= x.max() < params.n_words
        assert x.size() == (slen, bs)
        assert pred_mask.size() == (slen, bs)

        return x, _x_real, pred_mask

    def run_all_evals(self, trainer):
        """
        Run all evaluations.
        """
        params = self.params
        scores = OrderedDict({'epoch': trainer.epoch})

        with torch.no_grad():

            for data_set in ['valid', 'test']:

                # causal prediction task (evaluate perplexity and accuracy)
                for lang1, lang2 in params.clm_steps:
                    self.evaluate_clm(scores, data_set, lang1, lang2)

                # prediction task (evaluate perplexity and accuracy)
                for lang1, lang2 in params.mlm_steps:
                    self.evaluate_mlm(scores, data_set, lang1, lang2)

                # machine translation task (evaluate perplexity and accuracy)
                for lang1, lang2 in set(params.mt_steps + [(l2, l3) for _, l2, l3 in params.bt_steps]):
                    eval_bleu = params.eval_bleu and params.is_master and 'cl' not in lang1
                    eval_computation = params.eval_computation and params.is_master and 'cl' not in lang1
                    self.evaluate_mt(scores, data_set, lang1,
                                     lang2, eval_bleu, eval_computation)

                # report average metrics per language
                _clm_mono = [l1 for (l1, l2) in params.clm_steps if l2 is None]
                if len(_clm_mono) > 0:
                    scores['%s_clm_ppl' % data_set] = np.mean(
                        [scores['%s_%s_clm_ppl' % (data_set, lang)] for lang in _clm_mono])
                    scores['%s_clm_acc' % data_set] = np.mean(
                        [scores['%s_%s_clm_acc' % (data_set, lang)] for lang in _clm_mono])
                _mlm_mono = [l1 for (l1, l2) in params.mlm_steps if l2 is None]
                if len(_mlm_mono) > 0:
                    scores['%s_mlm_ppl' % data_set] = np.mean(
                        [scores['%s_%s_mlm_ppl' % (data_set, lang)] for lang in _mlm_mono])
                    scores['%s_mlm_acc' % data_set] = np.mean(
                        [scores['%s_%s_mlm_acc' % (data_set, lang)] for lang in _mlm_mono])

        return scores

    def eval_mode(self):
        [enc.eval() for enc in self.encoder]
        if self.decoder is not None:
            [dec.eval() for dec in self.decoder]

    def evaluate_clm(self, scores, data_set, lang1, lang2):
        """
        Evaluate perplexity and next word prediction accuracy.
        """
        params = self.params
        assert data_set in ['valid', 'test']
        assert lang1 in params.langs
        assert lang2 in params.langs or lang2 is None

        model = self.model if params.encoder_only else self.decoder
        model.eval()
        model = model.module if params.multi_gpu else model

        lang1_id = params.lang2id[lang1]
        lang2_id = params.lang2id[lang2] if lang2 is not None else None
        l1l2 = lang1 if lang2 is None else f"{lang1}-{lang2}"

        n_words = 0
        xe_loss = 0
        n_valid = 0

        for batch in self.get_iterator(data_set, lang1, lang2, stream=(lang2 is None)):

            # batch
            if lang2 is None:
                x, lengths = batch
                positions = None
                langs = x.clone().fill_(lang1_id) if params.n_langs > 1 else None
            else:
                (sent1, len1), (sent2, len2) = batch
                x, lengths, positions, langs = concat_batches(
                    sent1, len1, lang1_id, sent2, len2, lang2_id, params.pad_index, params.eos_index, reset_positions=True)

            # words to predict
            alen = torch.arange(
                lengths.max(), dtype=torch.long, device=lengths.device)
            pred_mask = alen[:, None] < lengths[None] - 1
            y = x[1:].masked_select(pred_mask[:-1])
            assert pred_mask.sum().item() == y.size(0)

            # cuda
            x, lengths, positions, langs, pred_mask, y = to_cuda(
                x, lengths, positions, langs, pred_mask, y)

            # forward / loss
            tensor = model('fwd', x=x, lengths=lengths,
                           positions=positions, langs=langs, causal=True)
            word_scores, loss = model(
                'predict', tensor=tensor, pred_mask=pred_mask, y=y, get_scores=True)

            # update stats
            n_words += y.size(0)
            xe_loss += loss.item() * len(y)
            n_valid += (word_scores.max(1)[1] == y).sum().item()

        # log
        logger.info("Found %i words in %s. %i were predicted correctly." %
                    (n_words, data_set, n_valid))

        # compute perplexity and prediction accuracy
        ppl_name = '%s_%s_clm_ppl' % (data_set, l1l2)
        acc_name = '%s_%s_clm_acc' % (data_set, l1l2)
        scores[ppl_name] = np.exp(xe_loss / n_words)
        scores[acc_name] = 100. * n_valid / n_words

    def evaluate_mlm(self, scores, data_set, lang1, lang2):
        """
        Evaluate perplexity and next word prediction accuracy.
        """
        params = self.params
        assert data_set in ['valid', 'test']
        assert lang1 in params.langs
        assert lang2 in params.langs or lang2 is None

        model = self.model[0] if params.encoder_only else self.encoder[0]
        model.eval()
        model = model.module if params.multi_gpu else model

        rng = np.random.RandomState(0)

        lang1_id = params.lang2id[lang1]
        lang2_id = params.lang2id[lang2] if lang2 is not None else None
        l1l2 = lang1 if lang2 is None else f"{lang1}_{lang2}"

        n_words = 0
        xe_loss = 0
        n_valid = 0

        for batch in self.get_iterator(data_set, lang1, lang2, stream=(lang2 is None)):

            # batch
            if lang2 is None:
                x, lengths = batch
                positions = None
                langs = x.clone().fill_(lang1_id) if params.n_langs > 1 else None
            else:
                (sent1, len1), (sent2, len2) = batch
                x, lengths, positions, langs = concat_batches(
                    sent1, len1, lang1_id, sent2, len2, lang2_id, params.pad_index, params.eos_index, reset_positions=True)

            # words to predict
            x, y, pred_mask = self.mask_out(x, lengths, rng)

            # cuda
            x, y, pred_mask, lengths, positions, langs = to_cuda(
                x, y, pred_mask, lengths, positions, langs)

            # forward / loss
            tensor = model('fwd', x=x, lengths=lengths,
                           positions=positions, langs=langs, causal=False)
            word_scores, loss = model(
                'predict', tensor=tensor, pred_mask=pred_mask, y=y, get_scores=True)

            # update stats
            n_words += len(y)
            xe_loss += loss.item() * len(y)
            n_valid += (word_scores.max(1)[1] == y).sum().item()

        # compute perplexity and prediction accuracy
        ppl_name = '%s_%s_mlm_ppl' % (data_set, l1l2)
        acc_name = '%s_%s_mlm_acc' % (data_set, l1l2)
        scores[ppl_name] = np.exp(xe_loss / n_words) if n_words > 0 else 1e9
        scores[acc_name] = 100. * n_valid / n_words if n_words > 0 else 0.


class SingleEvaluator(Evaluator):

    def __init__(self, trainer, data, params):
        """
        Build language model evaluator.
        """
        super().__init__(trainer, data, params)
        self.model = trainer.model


class EncDecEvaluator(Evaluator):

    def __init__(self, trainer, data, params):
        """
        Build encoder / decoder evaluator.
        """
        super().__init__(trainer, data, params)
        self.encoder = trainer.encoder
        self.decoder = trainer.decoder

    def evaluate_mt(self, scores, data_set, lang1, lang2, eval_bleu, eval_computation):
        """
        Evaluate perplexity and next word prediction accuracy.
        """
        params = self.params
        assert data_set in ['valid', 'test']
        assert lang1 in params.langs
        assert lang2 in params.langs

        params = params
        lang1_id = params.lang2id[lang1]
        lang2_id = params.lang2id[lang2]

        self.eval_mode()
        encoder = self.encoder[0].module if params.multi_gpu else self.encoder[0]
        decoder = self.decoder[lang2_id] if params.separate_decoders else self.decoder[0]
        decoder = decoder.module if params.multi_gpu else decoder

        n_words = 0
        xe_loss = 0
        n_valid = 0

        # store hypothesis to compute BLEU score
        if params.eval_bleu_test_only:
            datasets_for_bleu = ['test']
        else:
            datasets_for_bleu = ['test', 'valid']

        if (eval_bleu or eval_computation) and data_set in datasets_for_bleu:
            hypothesis = []
            f_ids = []

        for i, batch in enumerate(self.get_iterator(data_set, lang1, lang2)):
            (x1, len1, ids1, len_ids1), (x2, len2, ids2, len_ids2) = batch
            langs1 = x1.clone().fill_(lang1_id)
            langs2 = x2.clone().fill_(lang2_id)

            # target words to predict
            alen = torch.arange(
                len2.max(), dtype=torch.long, device=len2.device)
            # do not predict anything given the last target word
            pred_mask = alen[:, None] < len2[None] - 1
            y = x2[1:].masked_select(pred_mask[:-1])
            assert len(y) == (len2 - 1).sum().item()

            # cuda
            x1, len1, langs1,  x2, len2, langs2, y = to_cuda(
                x1, len1, langs1, x2, len2, langs2, y)
            # encode source sentence
            enc1 = encoder('fwd', x=x1, lengths=len1,
                           langs=langs1, causal=False)
            enc1 = enc1.transpose(0, 1)
            enc1 = enc1.half() if params.fp16 else enc1
            if max(len2) > 1024:
                print('remove one long sentence')
                continue
            # decode target sentence
            dec2 = decoder('fwd', x=x2, lengths=len2, langs=langs2,
                           causal=True, src_enc=enc1, src_len=len1)

            # loss
            word_scores, loss = decoder(
                'predict', tensor=dec2, pred_mask=pred_mask, y=y, get_scores=True)

            # update stats
            n_words += y.size(0)
            xe_loss += loss.item() * len(y)
            n_valid += (word_scores.max(1)[1] == y).sum().item()

            # generate translation - translate / convert to text
            if (eval_bleu or eval_computation) and data_set in datasets_for_bleu:
                len_v = (3 * len1 + 10).clamp(max=params.max_len)
                if params.beam_size == 1:
                    if params.number_samples > 1:
                        assert params.eval_temperature is not None
                        generated, lengths = decoder.generate(enc1.repeat_interleave(params.number_samples, dim=0),
                                                              len1.repeat_interleave(
                                                                  params.number_samples, dim=0),
                                                              lang2_id, max_len=len_v.repeat_interleave(
                                                                  params.number_samples, dim=0),
                                                              sample_temperature=params.eval_temperature)
                        generated = generated.T.reshape(
                            -1, params.number_samples, generated.shape[0]).T
                        lengths, _ = lengths.reshape(-1,
                                                     params.number_samples).max(dim=1)
                    else:
                        generated, lengths = decoder.generate(
                            enc1, len1, lang2_id, max_len=len_v)
                    # print(f'path 1: {generated.shape}')

                else:
                    assert params.number_samples == 1
                    generated, lengths = decoder.generate_beam(
                        enc1, len1, lang2_id, beam_size=params.beam_size,
                        length_penalty=params.length_penalty,
                        early_stopping=params.early_stopping,
                        max_len=len_v
                    )
                    # print(f'path 2: {generated.shape}')
                hypothesis.extend(convert_to_text(
                    generated, lengths, self.dico, params, generate_several_reps=True))

        # compute perplexity and prediction accuracy
        scores['%s_%s-%s_mt_ppl' %
               (data_set, lang1, lang2)] = np.exp(xe_loss / n_words)
        scores['%s_%s-%s_mt_acc' %
               (data_set, lang1, lang2)] = 100. * n_valid / n_words

        # write hypotheses
        if (eval_bleu or eval_computation) and data_set in datasets_for_bleu:

            # hypothesis / reference paths
            hyp_paths = []
            ref_path = params.ref_paths[(lang1, lang2, data_set)]

            # export sentences to hypothesis file / restore BPE segmentation
            for beam_number in range(len(hypothesis[0])):
                hyp_name = 'hyp{0}.{1}-{2}.{3}_beam{4}.txt'.format(
                    scores['epoch'], lang1, lang2, data_set, beam_number)
                hyp_path = os.path.join(params.hyp_path, hyp_name)
                hyp_paths.append(hyp_path)
                print(f'outputing hypotheses in {hyp_path}')
                with open(hyp_path, 'w', encoding='utf-8') as f:
                    f.write('\n'.join([hyp[beam_number]
                                       for hyp in hypothesis]) + '\n')
                restore_segmentation(hyp_path)

        # check how many functions compiles + return same output as GT
        if eval_computation and data_set in datasets_for_bleu:
            func_run_stats, func_run_out = eval_function_output(ref_path, hyp_paths,
                                                                params.id_paths[(
                                                                    lang1, lang2, data_set)],
                                                                lang2,
                                                                params.eval_scripts_folders[(
                                                                    lang1, lang2, data_set)],
                                                                EVAL_SCRIPT_FOLDER[data_set],
                                                                params.retry_mistmatching_types)
            out_paths = []
            success_for_beam_number = [0 for i in range(len(hypothesis[0]))]
            for beam_number in range(len(hypothesis[0])):
                out_name = 'hyp{0}.{1}-{2}.{3}_beam{4}.out.txt'.format(
                    scores['epoch'], lang1, lang2, data_set, beam_number)
                out_path = os.path.join(params.hyp_path, out_name)
                out_paths.append(out_path)
                with open(out_path, 'w', encoding='utf-8') as f:
                    for results_list in func_run_out:
                        result_for_beam = results_list[beam_number] if beam_number < len(
                            results_list) else ''
                        if result_for_beam.startswith("success"):
                            success_for_beam_number[beam_number] += 1
                        f.write((result_for_beam) + '\n')
                    f.write('\n')
            vizualize_translated_files(lang1, lang2, params.ref_paths[(
                lang2, lang1, data_set)], hyp_paths, params.id_paths[(lang1, lang2, data_set)], ref_path, out_paths)
            logger.info("Computation res %s %s %s : %s" %
                        (data_set, lang1, lang2, json.dumps(func_run_stats)))
            scores['%s_%s-%s_mt_comp_acc' % (data_set, lang1, lang2)] = func_run_stats['success'] / (
                func_run_stats['total_evaluated'] if func_run_stats['total_evaluated'] else 1)
            for beam_number, success_for_beam in enumerate(success_for_beam_number):
                scores['%s_%s-%smt_comp_acc_contrib_beam_%i' % (data_set, lang1, lang2, beam_number)] = success_for_beam / (
                    func_run_stats['total_evaluated'] if func_run_stats['total_evaluated'] else 1)
            for out_path in out_paths:
                Path(out_path).unlink()

        # compute BLEU score
        if eval_bleu and data_set in datasets_for_bleu:
            # evaluate BLEU score
            bleu = eval_moses_bleu(ref_path, hyp_paths[0])
            logger.info("BLEU %s %s : %f" % (hyp_paths[0], ref_path, bleu))
            scores['%s_%s-%s_mt_bleu' % (data_set, lang1, lang2)] = bleu
            if eval_computation:
                for hyp_path in hyp_paths:
                    Path(hyp_path).unlink()


def convert_to_text(batch, lengths, dico, params, generate_several_reps=False):
    """
    Convert a batch of sentences to a list of text sentences.
    """
    batch = batch.cpu().numpy()
    lengths = lengths.cpu().numpy()

    assert len(batch.shape) == 2 or len(
        batch.shape) == 3, f'generated batch shape was {batch.shape} while it should be in dimension 2 or 3'
    nb_repetitions = 1
    if len(batch.shape) == 2:
        slen, bs = batch.shape
        assert (batch[0] == params.eos_index).sum() == bs
        assert (batch == params.eos_index).sum() == 2 * bs
    else:
        slen, nb_repetitions, bs = batch.shape
        assert (batch == params.eos_index).sum() == 2 * bs * nb_repetitions
        assert (batch[0] == params.eos_index).sum() == bs * nb_repetitions, print(
            f"The values were {(batch[0] == params.eos_index).sum()} and  {bs * nb_repetitions}")
    assert lengths.max() == slen and lengths.shape[0] == bs, print(
        lengths.max(), slen, lengths.shape[0], bs)
    sentences = []

    for j in range(bs):
        sentences.append([])
        for rep in range(nb_repetitions):
            words = []
            for k in range(1, lengths[j]):
                next_element = batch[k, j] if len(
                    batch.shape) == 2 else batch[k, rep, j]
                if next_element == params.eos_index:
                    break
                words.append(dico[next_element])
            sentences[j].append(" ".join(words))
    if generate_several_reps:
        return sentences
    else:
        return [s[0] for s in sentences]


def eval_moses_bleu(ref, hyp):
    """
    Given a file of hypothesis and reference files,
    evaluate the BLEU score using Moses scripts.
    """
    assert os.path.isfile(hyp)
    assert os.path.isfile(ref) or os.path.isfile(ref + '0')
    assert os.path.isfile(BLEU_SCRIPT_PATH)
    command = BLEU_SCRIPT_PATH + ' %s < %s'
    p = subprocess.Popen(command % (ref, hyp),
                         stdout=subprocess.PIPE, shell=True)
    result = p.communicate()[0].decode("utf-8")
    if result.startswith('BLEU'):
        return float(result[7:result.index(',')])
    else:
        logger.warning('Impossible to parse BLEU score! "%s"' % result)
        return -1
