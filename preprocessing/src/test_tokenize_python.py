# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#

from preprocessing.src.code_tokenizer import tokenize_python, detokenize_python


TESTS = []
TESTS.append((
    "a = [3.14,4]",
    ['a', '=', '[', '3.14', ',', '4', ']', 'NEW_LINE']
))

TESTS.append((
    ("""from src.tokenize import _tok
def func1(a):
    a+=1
    return a"""),
    ['from', 'src', '.', 'tokenize', 'import', '_tok', 'NEW_LINE',
     'def', 'func1', '(', 'a', ')', ':', 'NEW_LINE',
     'INDENT', 'a', '+=', '1', 'NEW_LINE',
     'return', 'a', 'NEW_LINE', 'DEDENT']
))

TESTS.append((
    ("""#comment blabla
''' lll coo
# kkk ''' """),
    []
))

TESTS.append((
    ("""#comment blabla
a = 10 """),
    ['a', '=', '10', 'NEW_LINE']
))


TESTS.append((
    ("""'''comment
blabla'''
a = 10 """),
    ['a', '=', '10', 'NEW_LINE']
))


TESTS.append((
    ("""'''comment
blabla'''
a = ('fff',
'fff') """),
    ['a', '=', '(', "' fff '", ",", "' fff '", ')', 'NEW_LINE']
))

TESTS.append((
    ("""
a = '''fff
fff''' """),
    ['a', '=', "''' fff STRNEWLINE fff '''", 'NEW_LINE']
))

TESTS.append((
    ("""
a = \"\"\"
'fff'
\"\"\"
"""),
    ['a', '=', '""" STRNEWLINE \' fff \' STRNEWLINE """', 'NEW_LINE']
))


TESTS.append((
    ("""with open('ff.txt', 'r') as f:
    x = f.read()
line = x.readline()"""),
    ['with', 'open', '(', "' ff . txt '", ',', "' r '", ')', 'as', 'f', ':', 'NEW_LINE',
     'INDENT', 'x', '=', 'f', '.', 'read', '(', ')', 'NEW_LINE',
     'DEDENT', 'line', '=', 'x', '.', 'readline', '(', ')', 'NEW_LINE']
))

TESTS.append((
    (r'''WELCOME_MSG = "Hello you!\n what's up?"'''),
    ['WELCOME_MSG', '=', '" Hello ▁ you ! \\n ▁ what \' s ▁ up ? "', "NEW_LINE"]
))

TESTS.append((
    (r"""'''this is a
docstring on 2 lines '''"""),
    []
))
TESTS.append((r"""tab = ['a',
    'b',
    'c']""",
              ['tab', '=', '[', "' a '", ",", "' b '", ",", "' c '", ']', 'NEW_LINE']
              ))

TESTS.append((
    r"""import xxx
a='Hello \n word'""",
    ['import', 'xxx', 'NEW_LINE', 'a', '=', "' Hello ▁ \\n ▁ word '", 'NEW_LINE']
))

TESTS2 = []
TESTS2.append(
    r"""''' module with one class and one function
'''
import torch
from ..src.nnnn import jjj
import .knpon.module

class myclass:
#comment blala
#comment blabl2
        def geometric_suite():
            i = 0
            j = 1
            for i in range(2):
            # this function will print "Hello Word\nI am boby ! what's up ?"
                i += 1
                j += 3
                l = module.function()
                print("Hello Word\nI am boby !")
        return i, j"""
)


TESTS3 = []

TESTS3.append((
    ("""'''comment
blabla'''
a = ('fff',
'fff') """),
    ["''' comment STRNEWLINE blabla '''", "NEW_LINE", 'a',
        '=', '(', "' fff '", ",", "' fff '", ')', 'NEW_LINE']
))

TESTS3.append((
    ("""'''comment
blabla'''
a = 10 """),
    ["''' comment STRNEWLINE blabla '''", "NEW_LINE", 'a', '=', '10', 'NEW_LINE']
))


TESTS3.append((
    ("""
a = '''fff
fff''' """),
    ['a', '=', "''' fff STRNEWLINE fff '''", 'NEW_LINE']
))


TESTS3.append((
    ("""#comment   blabla
# --- ** *
a = 10 """),
    ['# comment ▁ blabla ENDCOM', 'a', '=', '10', 'NEW_LINE']
))


TESTS3.append((
    ("""a = 10 #comment   blabla"""),
    ['a', '=', '10', '# comment ▁ blabla ENDCOM', "NEW_LINE"]
))


TESTS3.append((
    ("""def my_func():
    ''' ********'''
    return 0"""),
    ['def', 'my_func', '(', ')', ':', 'NEW_LINE', 'INDENT',
     'return', '0', 'NEW_LINE', 'DEDENT']
))


def test_python_tokenizer():
    for i, (x, y) in enumerate(TESTS):
        y_ = tokenize_python(x)
        if y_ != y:
            line_diff = [j for j, (line, line_) in enumerate(
                zip(y, y_)) if line != line_]
            line_diff = line_diff[-1] if len(line_diff) > 0 else -1
            raise Exception(
                f"Difference at {line_diff}\nExpected:\n==========\n{y}\nbut found:\n==========\n{y_}")


def test_python_tokenizer_with_coms():
    for i, (x, y) in enumerate(TESTS3):
        y_ = tokenize_python(x, keep_comments=True)
        if y_ != y:
            line_diff = [j for j, (line, line_) in enumerate(
                zip(y, y_)) if line != line_]
            line_diff = line_diff[-1] if len(line_diff) > 0 else -1
            raise Exception(
                f"Difference at {line_diff}\nExpected:\n==========\n{y}\nbut found:\n==========\n{y_}")


def test_python_detokenizer():
    for i, x in enumerate([x[0] for x in TESTS] + TESTS2):
        tokens = tokenize_python(x)
        x_ = detokenize_python(tokens)
        tokens_ = tokenize_python(x_)
        if tokens != tokens:
            line_diff = [j for j, (line, line_) in enumerate(
                zip(tokens, tokens_)) if line != line_]
            raise Exception(
                f"Difference at {line_diff}\n========== Original:\n{x}\n========== Tokenized {tokens} \n Detokenized:\n{x_} \n Retokenized {tokens_}")
