# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#

import subprocess
import typing as tp
from pathlib import Path
import json
import fileinput
import os
from multiprocessing import Pool, cpu_count
import tqdm

from preprocessing.src import code_tokenizer as code_tokenizer
from preprocessing.src.timeout import timeout, TimeoutError

FAST = str(Path(__file__).parents[2].joinpath("XLM/tools/fastBPE/fast"))
XLM_PP = str(Path(__file__).parents[2].joinpath("XLM/preprocess.py"))

FALSY_STRINGS = {'off', 'false', '0'}
TRUTHY_STRINGS = {'on', 'true', '1'}


def bool_flag(s):
    """
    Parse boolean arguments from the command line.
    """
    if s.lower() in FALSY_STRINGS:
        return False
    elif s.lower() in TRUTHY_STRINGS:
        return True
    else:
        raise argparse.ArgumentTypeError("Invalid value for a boolean flag!")


def tokenize_json_helper(inpt):
    tokenizer, content, path, keep_comments = inpt
    content_tokenized = tokenizer(content, keep_comments)
    return content_tokenized, path


@timeout(3600)
def output_all_tokenized_results(docs, f_tok):
    pool = Pool(cpu_count())
    result_content_tokenized = tqdm.tqdm(pool.imap_unordered(
        tokenize_json_helper, docs), total=len(docs))
    for content_tokenized, path in result_content_tokenized:
        if len(content_tokenized) == 0:
            continue
        else:
            content_tokenized = ' '.join(content_tokenized)
            s = f"<DOCUMENT_ID=\"{path}\"> {content_tokenized} </DOCUMENT>"
            # for some reason sometimes, some caracters of s
            # cannot be encoded into utf-8 and it failed to print, so use try/catch
            try:
                f_tok.write(s)
                f_tok.write('\n')
            except:
                continue


def process_and_tokenize_json_file(input_path, language, keep_comments):
    suffix = '.with_comments' if keep_comments else ''
    output_path = str(input_path).replace('.json.gz', suffix + '.tok')
    tokenizer = getattr(code_tokenizer, f"tokenize_{language}")
    docs = []
    paths = []
    for line in fileinput.input(str(input_path), openhook=fileinput.hook_compressed):
        x = json.loads(line)
        content = x['content']
        path = f"{x['repo_name']}/tree/master/{x['path']}"
        docs.append((tokenizer, content, path, keep_comments))

    f_tok = open(output_path, 'w', encoding='utf-8')
    try:
        output_all_tokenized_results(docs, f_tok)
    except TimeoutError:
        # The tokenization process is sometimes killed and it makes the multiprocessing hang forever
        f_tok.close()
        print('Program closed automatically after one hour')
        os._exit(0)


def extract_functions_file(input_path, language, test_size=None):
    print(f"extacting functions for {str(input_path)}")
    output_path_sa = input_path.with_suffix('.functions_standalone.tok')
    output_path_class = input_path.with_suffix('.functions_class.tok')

    if output_path_sa.is_file() and output_path_class.is_file():
        return
    with input_path.open('r', encoding="utf-8") as f:
        lines = f.readlines()
    extract_auto_code = getattr(
        code_tokenizer, f"extract_functions_{language}")

    with output_path_sa.open('w', encoding='utf-8') as f_sa:
        with output_path_class.open('w', encoding='utf-8') as f_class:
            pool = Pool(cpu_count())
            # result_functions = pool.map(extract_auto_code, lines)
            result_functions = tqdm.tqdm(pool.imap_unordered(
                extract_auto_code, lines), total=len(lines))
            for func_standalone, func_class in result_functions:
                for func in func_standalone:
                    f_sa.write(func)
                    f_sa.write('\n')
                for func in func_class:
                    f_class.write(func)
                    f_class.write('\n')


def get_nlines(file_path):
    assert file_path.is_file()
    process = subprocess.run(
        f"wc -l {file_path}", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    if process.returncode == 0:
        return int(process.stdout.decode().split(' ')[0])
    else:
        return None


def head(file_path, n):
    n = int(n)
    with file_path.open('r', encoding='utf-8') as f:
        h = [next(f) for i in range(n)]
    return h


def truncate_files(file_paths):
    all_lines = []
    for f in file_paths:
        with f.open('r', encoding='utf-8') as f:
            lines = f.readlines()
            all_lines.append(lines)
    mini = min([len(lines) for lines in all_lines])
    for f, i in enumerate(file_paths):
        if len(all_lines[i]) > mini:
            with f.open('w', encoding='utf-8') as f:
                for j in range(mini):
                    f.write(all_lines[i][j])


def write_head(file_path, n):
    n = int(n)
    with file_path.open('r', encoding='utf-8') as f:
        h = [next(f) for i in range(n)]
    with file_path.open('w', encoding='utf-8') as f:
        f.write(''.join(h))
    return h


def shuf_file(file_path):
    process = subprocess.run(f"shuf {file_path} -o {file_path}",
                             shell=True,
                             stdout=subprocess.PIPE,
                             stderr=subprocess.PIPE)
    assert process.returncode == 0, f"failed to shuffle {file_path}"


def apply_bpe_file(file_path, output, codes, vocab=None):
    if vocab is None:
        vocab = ''
    process = subprocess.run(f"{FAST} applybpe {output} {file_path} {codes} {vocab}",
                             shell=True,
                             stdout=subprocess.PIPE,
                             stderr=subprocess.PIPE)
    assert Path(
        output).is_file and process.returncode == 0, f"failed to apply bpe on {file_path}, command: \n {FAST} applybpe {output} {file_path} {codes} {vocab}"


def learn_bpe_file(file_path, ncodes, codes):
    process = subprocess.run(f"{FAST} learnbpe {ncodes} {file_path} > {str(codes)} ",
                             shell=True,
                             stdout=subprocess.PIPE,
                             stderr=subprocess.PIPE)
    assert process.returncode == 0, f"failed to learn bpe on {str(file_path)}"
    assert Path(
        f"{str(codes)}").is_file, f"failed to output codes, cannot find codes {str(codes)}"
    if ncodes > 50000:
        codes.write_text(''.join(head(codes, 50000)), encoding='utf-8')


def get_vocab_file(file_path, vocab):
    process = subprocess.run(f"{FAST} getvocab {file_path} > {str(vocab)}.all",
                             shell=True,
                             stdout=subprocess.PIPE,
                             stderr=subprocess.PIPE)
    process2 = subprocess.run(f"head -n 64000 {str(vocab)}.all > {str(vocab)}",
                              shell=True,
                              stdout=subprocess.PIPE,
                              stderr=subprocess.PIPE)
    assert vocab.is_file and process.returncode == 0 and process2.returncode == 0, f"failed to get vocab for {file_path}"


def binarize_for_XLM_file(file_path, vocab):
    process = subprocess.run(f"python {XLM_PP} {vocab} {file_path}",
                             shell=True,
                             stdout=subprocess.PIPE,
                             stderr=subprocess.PIPE)
    assert Path(f'{file_path}.pth').is_file and process.returncode == 0, f"failed to binarize for XLM the file {file_path} \n command: python {XLM_PP} {vocab} {file_path} "


def regroup_and_select_data(files, output, nlines=None):
    """
        files : [files] or [[files1],[files2]]
        nlines : [n1]
        if files = [files] it will regroup files, shuffle them and select nlines[0] of itselfself. write the res in output.
        if files = [[files1],[files2]] it will regroup, shuffle and select nlines[0] lines files1 (resp. files2),
        and concat these res in ouput.
    """
    if output.is_file():
        return

    assert nlines is None or len(files) == len(nlines)
    if nlines is None:
        nlines = [float('Inf') for i in range(len(files))]

    for files_, nlines_ in zip(files, nlines):
        missing_lines = nlines_
        for f in files_:
            n = get_nlines(f)
            if n < missing_lines:
                print(f"adding {n} lines of {f}")
                proc = subprocess.run(
                    f"cat {f} >> {output}", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, executable='/bin/bash')
                missing_lines = missing_lines - n
            else:
                print(f"adding {missing_lines} lines of {f}")
                proc = subprocess.run(f"cat {f} | head -n {missing_lines} >> {output}", shell=True,
                                      stdout=subprocess.PIPE, stderr=subprocess.PIPE, executable='/bin/bash')
                break


def create_symlink(file_path, symlink):
    assert file_path.is_file()
    assert not symlink.is_file()
    process = subprocess.run(f"ln -s {file_path} {symlink}",
                             shell=True,
                             stdout=subprocess.PIPE,
                             stderr=subprocess.PIPE)
    assert symlink.is_file(
    ) and process.returncode == 0, f"failed to create symlink {symlink} for file {file_path} "


class DelayedJob:
    """Future-like object which delays computation
    """

    def __init__(self, func: tp.Callable[..., tp.Any], *args: tp.Any, **kwargs: tp.Any) -> None:
        self.func = func
        self.args = args
        self.kwargs = kwargs
        self._result: tp.Optional[tp.Any] = None
        self._computed = False

    def done(self) -> bool:
        return True

    def result(self) -> tp.Any:
        if not self._computed:
            self._result = self.func(*self.args, **self.kwargs)
            self._computed = True
        return self._result


class LocalExecutor:
    """Executor which run sequentially and locally
    (just calls the function and returns a FinishedJob)
    """

    def submit(self, fn: tp.Callable[..., tp.Any], *args: tp.Any, **kwargs: tp.Any) -> DelayedJob:
        return DelayedJob(fn, *args, **kwargs)

    def map_array(self, fn, *arg_iterators):
        grouped_args = zip(*arg_iterators)
        return [self.submit(fn, *g) for g in grouped_args]
