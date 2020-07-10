# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#

import argparse
import os
from multiprocessing import Pool
from multiprocessing import cpu_count
from pathlib import Path

import preprocessing.src.code_tokenizer as code_tokenizer


def detokenize(input_path, language):
    output_path = input_path.with_suffix('.detok')
    if output_path.is_file():
        return
    with input_path.open('r', encoding="utf-8") as f:
        lines = f.readlines()
    detokenize = getattr(code_tokenizer, f"detokenize_{language}")

    with output_path.open('w', encoding='utf-8') as f:
        pool = Pool(cpu_count())
        result_detok = pool.map(detokenize, lines)
        for detok in result_detok:
            f.write(detok)
            f.write('\n')
            f.write('\n')


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='')
    parser.add_argument('file', help='input files')
    parser.add_argument('--l', help='language')
    args = parser.parse_args()

    assert os.path.isfile(args.file), f"file {args.file} doesn't exist"
    detokenize(Path(args.file), args.l)
