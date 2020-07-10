# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#

import argparse
from concurrent.futures import ProcessPoolExecutor

from preprocessing.src.dataset import Dataset
from preprocessing.src.utils import bool_flag, create_symlink
from submitit import AutoExecutor
import subprocess
from pathlib import Path


def check_files_and_symlink_for_XLM(dataset, langs):
    # create symlink for all code - used for MLM pretraining
    print("check that all files exist...")
    suffixs = {"": "", ".functions_standalone": "_sa"}
    for lang in langs:
        for cat in ["", ".functions_standalone"]:
            for i in range(8):
                assert dataset.folder.joinpath(
                    f"{lang}.train{dataset.suffix}.{i}{cat}.bpe.pth").is_file()
            assert dataset.folder.joinpath(
                f"{lang}.test{dataset.suffix}{cat}.bpe.pth").is_file()
            assert dataset.folder.joinpath(
                f"{lang}.valid{dataset.suffix}{cat}.bpe.pth").is_file()
    XLM_folder = Path(str(dataset.folder)+'.XLM-syml')
    XLM_folder.mkdir(exist_ok=True)
    print("create symlinks for XLM ...")
    for lang in langs:
        for cat in ["", ".functions_standalone"]:
            for i in range(8):
                create_symlink(dataset.folder.joinpath(f"{lang}.train{dataset.suffix}.{i}{cat}.bpe.pth"),
                               XLM_folder.joinpath(f"train.{lang}{suffixs[cat]}.{i}.pth"))
            create_symlink(dataset.folder.joinpath(f"{lang}.test{dataset.suffix}{cat}.bpe.pth"),
                           XLM_folder.joinpath(f"test.{lang}{suffixs[cat]}.pth"))
            create_symlink(dataset.folder.joinpath(f"{lang}.valid{dataset.suffix}{cat}.bpe.pth"),
                           XLM_folder.joinpath(f"valid.{lang}{suffixs[cat]}.pth"))


def preprocess(root, lang1, lang2, keep_comments, local, lang3=None, test_size=1000, ncodes=100000, size_gb=50):
    if size_gb < 1:
        size_gb = None
    dataset = Dataset(root, lang1, lang2, keep_comments,
                      test_size=test_size, lang3=lang3)

    mp_executor = ProcessPoolExecutor()
    if not local:
        dataset.folder.joinpath('log').mkdir()
        cluster_ex1 = AutoExecutor(dataset.folder.joinpath('log'))
        cluster_ex1.update_parameters(
            cpus_per_task=80, mem_gb=30, timeout_min=40)
        cluster_ex2 = AutoExecutor(dataset.folder.joinpath('log'))
        cluster_ex2.update_parameters(
            cpus_per_task=20, mem_gb=200, timeout_min=240)
    else:
        cluster_ex1 = None
        cluster_ex2 = None

    dataset.process_languages(
        lang_executor=mp_executor, tok_executor=cluster_ex1, split_executor=cluster_ex2)
    dataset.train_bpe(ncodes=ncodes, size_gb=size_gb)
    dataset.apply_bpe(
        f'train{dataset.suffix}.[01234567].tok', use_vocab=False, executor=cluster_ex2)
    dataset.apply_bpe(f'test{dataset.suffix}.tok',
                      use_vocab=False, executor=None)
    dataset.apply_bpe(f'valid{dataset.suffix}.tok',
                      use_vocab=False, executor=None)

    dataset.get_vocab(size_gb=size_gb)

    dataset.binarize_for_XLM(
        f'train{dataset.suffix}.[0123456789].bpe', executor=cluster_ex2)
    dataset.binarize_for_XLM(f'test{dataset.suffix}.bpe', executor=None)
    dataset.binarize_for_XLM(f'valid{dataset.suffix}.bpe', executor=None)

    dataset.extract_functions_and_apply_bpe(
        lang_executor=mp_executor, function_executor=cluster_ex2, bpe_executor=cluster_ex2)

    #dataset.binarize_for_XLM(f'train{dataset.suffix}.[0123456789].functions_class.bpe', executor=cluster_ex2)
    dataset.binarize_for_XLM(
        f'train{dataset.suffix}.[0123456789].functions_standalone.bpe', executor=cluster_ex2)

    dataset.binarize_for_XLM(
        f'test{dataset.suffix}.functions_*.bpe', executor=None)
    dataset.binarize_for_XLM(
        f'valid{dataset.suffix}.functions_*.bpe', executor=None)

    langs = [lang1, lang2] if lang3 is None else [lang1, lang2, lang3]
    check_files_and_symlink_for_XLM(dataset, langs)


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='')
    parser.add_argument('root', help='root folder')
    parser.add_argument('--lang1', help='language 1')
    parser.add_argument('--lang2', help='language 2')
    parser.add_argument('--lang3', default=None, help='language 3')
    parser.add_argument('--test_size', type=int,
                        default=1000, help='size of test set')
    parser.add_argument('--bpe_train_size', type=int, default=50,
                        help='size of subset used to train bpe codes')
    parser.add_argument('--keep_comments', type=bool_flag, default=False,
                        help='used bpe trained on data with comments or not')
    parser.add_argument('--local', type=bool_flag, default=True,
                        help='True if you want to run the processing pipeline locally, false if want to use submitit.')
    args = parser.parse_args()

    preprocess(args.root, args.lang1, args.lang2, args.keep_comments, args.local,
               lang3=args.lang3, size_gb=args.bpe_train_size, test_size=args.test_size)
