# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import shutil
from concurrent.futures import ProcessPoolExecutor
from submitit import AutoExecutor
from pathlib import Path

from preprocessing.src.dataset import Dataset
from preprocessing.src import code_tokenizer as code_tokenizers
from preprocessing.preprocess import preprocess

root = Path(__file__).resolve().parents[1].joinpath("data/test_dataset")
print(f"ROOT{root}")
lang1 = "java"
lang2 = "python"
lang3 = 'cpp'
keep_comments = True
suffix = ".with_comments"


def copy_and_clean_folder():
    # clean existing folder/files
    for l in [lang1, lang2, lang3]:
        for tokenized_file in root.joinpath(l).glob("*.tok"):
            tokenized_file.unlink()
    langs = sorted([lang1, lang2, lang3])
    shutil.rmtree(str(root.joinpath(
        f"{langs[0]}-{langs[1]}-{langs[2]}{suffix}")), ignore_errors=True)
    shutil.rmtree(str(root.joinpath(
        f"{langs[0]}-{langs[1]}-{langs[2]}{suffix}.XLM-syml")), ignore_errors=True)
    print(
        str(root.joinpath(f"{langs[0]}-{langs[1]}-{langs[2]}{suffix}.XLM-syml")))
    shutil.rmtree(
        str(root.joinpath(f"{langs[0]}-{langs[1]}-{langs[2]}")), ignore_errors=True)


def preprocess_(dataset, lang_executor=None, tok_executor=None, bpe_executor=None):
    dataset.process_languages(
        lang_executor=lang_executor, tok_executor=tok_executor)
    dataset.train_bpe(ncodes=100, size_gb=None)
    dataset.apply_bpe(
        f'train{dataset.suffix}.[01234567].tok', use_vocab=False, executor=bpe_executor)
    dataset.get_vocab()
    dataset.apply_bpe(f'test{dataset.suffix}.tok',
                      use_vocab=True, executor=None)
    dataset.apply_bpe(f'valid{dataset.suffix}.tok',
                      use_vocab=True, executor=None)
    dataset.extract_functions_and_apply_bpe(
        lang_executor=lang_executor, function_executor=tok_executor, bpe_executor=bpe_executor)

    dataset.binarize_for_XLM(
        f'train{dataset.suffix}.[01234567].functions_*.bpe', executor=None)
    dataset.binarize_for_XLM(
        f'test{dataset.suffix}.functions_*.bpe', executor=None)
    dataset.binarize_for_XLM(
        f'valid{dataset.suffix}.functions_*.bpe', executor=None)


def test_run_pipeline_locally_3_langs_with_comments():
    copy_and_clean_folder()
    preprocess(root, lang1, lang2, keep_comments, local=True,
               lang3=lang3, test_size=10, size_gb=0)


def test_run_pipeline_submitit_3_langs_with_comments():
    copy_and_clean_folder()
    dataset = Dataset(root, lang1, lang2, keep_comments,
                      test_size=10, lang3=lang3)
    mp_executor = ProcessPoolExecutor()
    cluster_ex1 = AutoExecutor(dataset.folder.joinpath('log'), cluster="local")
    cluster_ex1.update_parameters()
    cluster_ex2 = AutoExecutor(dataset.folder.joinpath('log'), cluster="local")
    cluster_ex2.update_parameters()
    preprocess_(dataset, lang_executor=mp_executor,
                tok_executor=cluster_ex1, bpe_executor=cluster_ex2)
