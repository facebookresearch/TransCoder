# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#

import itertools
import subprocess
from pathlib import Path

from preprocessing.src.utils import shuf_file, apply_bpe_file, get_vocab_file, learn_bpe_file, regroup_and_select_data, LocalExecutor, binarize_for_XLM_file, truncate_files, \
    get_nlines, process_and_tokenize_json_file, extract_functions_file


class Language:

    def __init__(self, root, lang):
        self.folder = Path(str(root)).joinpath(lang)
        assert self.folder.is_dir(
        ), f"failed to initalize Language {self.l}, there is no directory {str(self.folder)}"
        self.l = lang

    def process_json_and_tok(self, keep_comments, executor=None):
        if executor is None:
            executor = LocalExecutor()
        suffix = '.with_comments' if keep_comments else ''
        assert len(list(self.folder.glob('*.json.gz'))
                   ) > 0, f"there is no json in {str(self.folder)}"
        jsons = [json for json in self.folder.glob(
            '*.json.gz') if not Path(str(json).replace('.json.gz', suffix + '.tok')).is_file()]
        print(f"{self.l}: tokenizing {len(jsons)} json files ...")
        if len(jsons) > 0:
            jobs = executor.map_array(process_and_tokenize_json_file, jsons, itertools.repeat(
                self.l), itertools.repeat(keep_comments))
            for job in jobs:
                job.result()
        else:
            return

    def split_train_test_valid(self, keep_comments, test_size=1000):
        suffix = '.with_comments' if keep_comments else ''

        # split train-test-valid
        # regroup
        all_tok = self.folder.joinpath(f'all{suffix}.tok')
        command = f"cd {self.folder}; cat *[0-4][0-9][0-9]{suffix}.tok > {all_tok}"
        proc = subprocess.run(command, shell=True, stdout=subprocess.PIPE,
                              stderr=subprocess.PIPE, executable='/bin/bash')

        size_gb = all_tok.stat().st_size
        n_lines = get_nlines(all_tok)

        # shuf
        shuf_file(all_tok)

        # select test/valid/train and split train in 8
        subprocess.run(f"cat {all_tok} | head -n {test_size} > {self.folder.joinpath(f'valid{suffix}.tok')}",
                       shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        subprocess.run(f"cat {all_tok} | head -n {2 * test_size} | tail -n {test_size}  > {self.folder.joinpath(f'test{suffix}.tok')}", shell=True, stdout=subprocess.PIPE,
                       stderr=subprocess.PIPE)
        split_len = int((n_lines - 2 * test_size) / 8)
        for n, i in zip(range(8), range(2 * test_size, n_lines, split_len)):
            subprocess.run(f"cat {all_tok} | head -n {i + split_len} | tail -n {split_len}  > {self.folder.joinpath(f'train{suffix}.{n}.tok')}", shell=True, stdout=subprocess.PIPE,
                           stderr=subprocess.PIPE)

        return n_lines, size_gb

    def process(self, keep_comments, tok_executor=None, test_size=1000, split_executor=None):
        suffix = '.with_comments' if keep_comments else ''
        print(f"{self.l}: process ...")
        self.process_json_and_tok(keep_comments, tok_executor)
        if (all(self.folder.joinpath(f'train{suffix}.{n}.tok').is_file() for n in range(8)) and
                self.folder.joinpath(f'test{suffix}.tok').is_file() and
                self.folder.joinpath(f'valid{suffix}.tok').is_file()):
            print(f"{self.l}: train, test and valid for already exist. ")
            nlines = 8 * \
                get_nlines(self.folder.joinpath(f'train{suffix}.{0}.tok'))
            size_gb = 8 * \
                self.folder.joinpath(f'train{suffix}.{0}.tok').stat().st_size
        else:
            print(f"{self.l}: split train, test and valid ... ")
            if split_executor is None:
                split_executor = LocalExecutor()
            job = split_executor.submit(
                self.split_train_test_valid, keep_comments, test_size)
            nlines, size_gb = job.result()
        print(f"{self.l}: train for is {nlines} lines and {size_gb / (1024 ** 3)} Go. ")
        # nlines, size = self.split_train_test_valid(keep_comments, test_size)
        return nlines, size_gb

    def extract_functions(self, keep_comments, test_size=1000, executor=None):
        if executor is None:
            executor = LocalExecutor()
        suffix = '.with_comments' if keep_comments else ''
        files = list(self.folder.glob(f'train{suffix}.[01234567].tok'))
        files.append(self.folder.joinpath(f'test{suffix}.tok'))
        files.append(self.folder.joinpath(f'valid{suffix}.tok'))
        toks = [tok for tok in files if not (tok.with_suffix('.functions_standalone.tok').is_file(
        ) and tok.with_suffix('.functions_class.tok').is_file())]
        if len(toks) > 0:
            jobs = executor.map_array(
                extract_functions_file, toks, itertools.repeat(self.l))
            for job in jobs:
                job.result()

    def extract_docstrings(self, keep_comments, test_size=1000, executor=None):
        if executor is None:
            executor = LocalExecutor()
        suffix = '.with_comments' if keep_comments else ''
        files = list(self.folder.glob(
            f'train{suffix}.[01234567].functions_class.tok'))
        files += list(self.folder.glob(
            f'train{suffix}.[01234567].functions_standalone.tok'))
        files.append(self.folder.joinpath(f'test{suffix}.functions_class.tok'))
        files.append(self.folder.joinpath(
            f'test{suffix}.functions_standalone.tok'))
        files.append(self.folder.joinpath(
            f'valid{suffix}.functions_class.tok'))
        files.append(self.folder.joinpath(
            f'valid{suffix}.functions_standalone.tok'))
        toks = [tok for tok in files if not (tok.with_suffix(
            '.DS-f.ds.tok').is_file() and tok.with_suffix('.DS-f.f.tok').is_file())]
        if len(toks) > 0:
            jobs = executor.map_array(
                extract_docstrings, toks, itertools.repeat(self.l))
            for job in jobs:
                job.result()


class Dataset:

    def __init__(self, root, lang1, lang2, keep_comments, test_size=1000, lang3=None):
        self.test_size = test_size
        self.root = Path(root)
        assert self.root.is_dir(
        ), f"failed to build the dataset, there is no directory {str(root)}"
        langs = [lang1, lang2]
        if lang3 is None:
            lang1, lang2 = sorted([lang1, lang2])
        else:
            lang1, lang2, lang3 = sorted([lang1, lang2, lang3])
        self.lang1 = Language(root, lang1)
        self.lang2 = Language(root, lang2)
        self.langs = [self.lang1, self.lang2]
        if lang3 is not None:
            self.lang3 = Language(root, lang3)
            self.langs.append(self.lang3)

        self.keep_comments = keep_comments
        self.suffix = ".with_comments" if keep_comments else ''
        self.folder = self.root.joinpath(
            f"{lang1}-{lang2}-{'' if lang3 is None else lang3}{self.suffix}")
        self.codes = self.folder.joinpath("codes")
        self.vocab = self.folder.joinpath("vocab")
        self.sizes = {l.l: [] for l in self.langs}
        if not self.folder.is_dir():
            self.folder.mkdir()

    def process_languages(self, lang_executor=None, tok_executor=None, split_executor=None):
        if lang_executor is None:
            lang_executor = LocalExecutor()
        jobs = [lang_executor.submit(lang.process, self.keep_comments, tok_executor, self.test_size, split_executor)
                for lang in self.langs]
        for i, lang in enumerate(self.langs):
            self.sizes[lang.l] = jobs[i].result()

    def train_bpe(self, ncodes, size_gb=None):

        if self.codes.is_file():
            print("bpe codes already exists.")
            return

        print("train bpe ...")
        if size_gb is None:
            nlines = None
        else:
            size_gb_ = size_gb / len(self.langs)
            nlines = [int(self.sizes[l.l][0] * size_gb_ * 1024 **
                          3 / self.sizes[l.l][1]) for l in self.langs]
            print(
                f"we need to regroup {nlines} lines for {self.langs[0].l} {self.langs[1].l} and {self.langs[2].l} to gather {size_gb} Go")
        # train bpe on only 50 GB (25 each lang) of the tokenized train set
        data_train_bpe = self.folder.joinpath(
            f'train{self.suffix}.tok.{size_gb}GB')
        print(
            f"regroup and select data for training bpe in {data_train_bpe} ...")
        regroup_and_select_data(
            files=[l.folder.glob(
                f'train{self.suffix}.[01234567].tok') for l in self.langs],
            nlines=nlines,
            output=data_train_bpe)

        print(f"training bpe on {data_train_bpe}...")
        learn_bpe_file(data_train_bpe, ncodes, self.codes)

    def get_vocab(self, size_gb=None):

        if self.vocab.is_file():
            print("vocab already exists.")
            return

        print("get vocab ...")
        if size_gb is None:
            nlines = None
        else:
            size_gb_ = size_gb / len(self.langs)
            nlines = [int(self.sizes[l.l][0] * size_gb_ * 1024 **
                          3 / self.sizes[l.l][1]) for l in self.langs]
        # get vocab only from a subset of 40GB (20 each lang) of the bpe-ed train set
        data_get_vocab = self.folder.joinpath(
            f'train{self.suffix}.bpe.{size_gb}GB')
        print(f"regroup and select data in {data_get_vocab} to get vocab ...")
        regroup_and_select_data(
            files=[self.folder.glob(
                f'{l.l}.train{self.suffix}.[01234567].bpe') for l in self.langs],
            nlines=nlines,
            output=data_get_vocab)
        print(f"computing vocab on {data_get_vocab}...")
        get_vocab_file(data_get_vocab, self.vocab)

    def apply_bpe(self, files_regex, use_vocab=False, executor=None):
        vocab = '' if use_vocab is False else self.vocab
        if executor is None:
            executor = LocalExecutor()
        jobs = []
        for l in self.langs:
            for f in l.folder.glob(files_regex):
                out = self.folder.joinpath(
                    f"{l.l}.{f.name}").with_suffix('.bpe')
                if not out.is_file():
                    print(f'apply bpe on {f} ...')
                    jobs.append(executor.submit(
                        apply_bpe_file, f, out, self.codes, vocab))
        for job in jobs:
            job.result()

    def binarize_for_XLM(self, files_regex, executor=None):
        print(f"binarize {files_regex} ...")
        if executor is None:
            executor = LocalExecutor()
        jobs = []
        for l in self.langs:
            for f in self.folder.glob(f'{l.l}.{files_regex}'):
                if not Path(str(f) + '.pth').is_file():
                    print(f"binarizing {f} ...")
                    jobs.append(executor.submit(
                        binarize_for_XLM_file, f, self.vocab))
        for job in jobs:
            job.result()

    def extract_functions_and_apply_bpe(self, lang_executor=None, function_executor=None, bpe_executor=None):
        print("extract functions ... ")
        if lang_executor is None:
            lang_executor = LocalExecutor()
        jobs = [lang_executor.submit(lang.extract_functions, self.keep_comments,
                                     self.test_size, function_executor) for lang in self.langs]
        for job in jobs:
            job.result()

        for split in ['test', 'valid']:
            for f_type in ['functions_standalone', 'functions_class']:
                truncate_files(l.folder.joinpath(
                    f'{split}{self.suffix}.{f_type}.tok') for l in self.langs)

        print("apply bpe on train ... ")
        self.apply_bpe(
            f'train{self.suffix}.[01234567].functions_*.tok', use_vocab=False, executor=bpe_executor)
        print("apply bpe on test and valid ...")
        self.apply_bpe(f'test{self.suffix}.functions_*.tok',
                       use_vocab=False, executor=bpe_executor)
        self.apply_bpe(f'valid{self.suffix}.functions_*.tok',
                       use_vocab=False, executor=bpe_executor)
