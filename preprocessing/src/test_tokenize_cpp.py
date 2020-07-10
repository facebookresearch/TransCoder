# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#

from preprocessing.src.code_tokenizer import tokenize_cpp, detokenize_cpp
import pytest

TESTS = []
TESTS.append((
    r"""
// This is a   comment
// ------- ******* -------
int main() {
std::cout << "Hello World!";
return 0;
}""",
    ['int', 'main', '(', ')', '{',
        'std', '::', 'cout', '<<', '" Hello ▁ World ! "', ';',
     'return', '0', ';', '}']
))

TESTS.append((r"""
overload((byte)1);
overload(1L);
overload(1.0f);""",
              ['overload', '(', '(', 'byte', ')', '1', ')', ';',
               'overload', '(', '1L', ')', ';',
               'overload', '(', '1.0f', ')', ';']
              ))

TESTS.append((r"""auto glambda = [](auto a, auto&& b) { return a < b; };""",
              ["auto", "glambda", "=", "[", "]", "(", "auto", "a", ",", "auto", "&&", "b", ")",
               "{", "return", "a", "<", "b", ";", "}", ";"]))

# test reference, pointor
TESTS.append((r""" int a = 0;
int * b = new int(0);
int& ref = a;""",
              ["int", "a", "=", "0", ";",
               "int", "*", "b", "=",
               "new", "int", "(", "0", ")", ";",
               "int", "&", "ref", "=", "a", ";"]))

# test incrementation - equality/uniquality
TESTS.append((r"""a = 0;
b = 0;
a += 10;
a ++;
a --;
a -= 100;
if (a == b) {
    cout<<"yes"<<endl;
}
if (a != b) {
    cout << "no" << endl;
}""",
              ["a", "=", "0", ";",
               "b", "=", "0", ";",
               "a", "+=", "10", ";",
               "a", "++", ";",
               "a", "--", ";",
               "a", "-=", "100", ";",
               'if', '(', 'a', '==', 'b', ')', '{', 'cout', '<<', '" yes "', "<<", "endl", ";", "}",
               'if', '(', 'a', '!=', 'b', ')', '{', 'cout', '<<', '" no "', '<<', 'endl', ';', '}']))

TESTS.append(("std::unordered_map<MyCustomObject, std::string> hashmap;",
              ["std", "::", "unordered_map", "<", "MyCustomObject", ",", "std", "::", "string", ">", "hashmap", ";"]))

TESTS.append((r"""string s = "Hi I am\nMarie";""",
              ["string", "s", "=", '" Hi ▁ I ▁ am \\n Marie "', ';']))

TESTS_KEEP_COMMENTS = [(
    r"""
// This is a comment
// ----------*****
int main() {
std::cout << "Hello World!";
return 0;
}""",
    ['// ▁ This ▁ is ▁ a ▁ comment ENDCOM',
     'int', 'main', '(', ')', '{',
     'std', '::', 'cout', '<<', '" Hello ▁ World ! "', ';',
     'return', '0', ';', '}']
),
    (r"""
/* This is a
multiline    comment */
/*----------------this is the docstring */
/* ----*----*-*---- ====== *** */
int main() {
std::cout << "Hello World!";
return 0;
}""", ['/* ▁ This ▁ is ▁ a STRNEWLINE multiline ▁ comment ▁ */', '/* - - - - - this ▁ is ▁ the ▁ docstring ▁ */', 'int',
       'main', '(', ')', '{', 'std', '::', 'cout', '<<', '" Hello ▁ World ! "', ';', 'return', '0', ';', '}'])
]

TESTS_CHARS = [(
    r"""
char a = 'a';
""",
    ["char", "a", "=", "' a '", ";"]
)
]

TESTS_STRINGS = [(
    r"""
string s = "Hello !";""",
    ["string", "s", "=", f'" Hello ▁ ! "', ";"]
),
]

TESTS_MULTILINE_STRINGS = [(
    r"""
string s =
"First line"
"Second line";
""",
    ["string", "s", "=", f'" First ▁ line "', '" Second ▁ line "', ";"]
)
]

TESTS_DETOKENIZE_MULTILINE_STRINGS = [(
    r"""
string s =
"First line"
"Second line";
""",
    r"""string s = "First line" "Second line";
"""
)
]

DETOKENIZE_TESTS = []
DETOKENIZE_TESTS.append((
    r"""
// This is a comment
int main() {
std::cout << "Hello World!";
return 0;
}""",
    r"""int main ( ) {
  std :: cout << "Hello World!";
  return 0;
}
"""
))

DETOKENIZE_TESTS.append((
    r"""int a = 0;
int * b = new int(0);
int& ref = a;""",
    r"""int a = 0;
int * b = new int ( 0 );
int & ref = a;
"""
))

DETOKENIZE_TESTS.append((
    r"""a = 0;
b = 0
a += 10;
a ++;
a --;
a -= 100;
if (a == b) {
    cout<<"yes"<<endl;
}
if (a != b) {
    cout << "no" << endl;
}
""",
    r"""a = 0;
b = 0 a += 10;
a ++;
a --;
a -= 100;
if ( a == b ) {
  cout << "yes" << endl;
}
if ( a != b ) {
  cout << "no" << endl;
}
"""
))


@pytest.mark.skip('Helper function')
def test_tokenizer(test_examples, keep_comments):
    for i, (x, y) in enumerate(test_examples):
        y_ = tokenize_cpp(x, keep_comments=keep_comments)
        if y_ != y:
            line_diff = [j for j, (line, line_) in enumerate(
                zip(y, y_)) if line != line_]
            line_diff = line_diff[-1] if len(line_diff) > 0 else -1
            raise Exception(
                f"Difference at {line_diff}\nExpected:\n==========\n{y}\nbut found:\n==========\n{y_}")


@pytest.mark.skip('Helper function')
def test_detokenize_invertible(test_examples):
    for i, (x, _) in enumerate(test_examples):
        x_ = detokenize_cpp(tokenize_cpp(x, keep_comments=False))
        if x_.strip() != x.strip():
            raise Exception(
                f"Expected:\n==========\n{x.strip()}\nbut found:\n==========\n{x_.strip()}")


@pytest.mark.skip('Helper function')
def test_detokenize_non_invertible(test_examples):
    for i, (x, y) in enumerate(test_examples):
        y_ = detokenize_cpp(tokenize_cpp(x, keep_comments=False))
        if y_ != y:
            lenght = min(len(y_), len(y))
            char_message = ""
            for j in range(lenght):
                if y_[j] != y[j]:
                    char_message = f"expected character '{y[j]}' at index {j} but found '{y_[j]}'"
            if char_message == "":
                char_message = f"expected length {len(y)}, found {len(y_)}"
            raise Exception(
                f"Expected:\n==========\n{y}\nbut found:\n==========\n{y_} \n==========\n{char_message}")


@pytest.mark.skip('Helper function')
def test_tokenize_twice(test_examples, keep_comments=False):
    for i, (x, _) in enumerate(test_examples):
        tokenized_once = tokenize_cpp(x, keep_comments=keep_comments)
        tokenized_twice = tokenize_cpp(detokenize_cpp(
            tokenized_once), keep_comments=keep_comments)
        if tokenized_once != tokenized_twice:
            lenght = min(len(tokenized_twice), len(tokenized_once))
            char_message = ""
            for j in range(lenght):
                if tokenized_twice[j] != tokenized_once[j]:
                    char_message = f"expected token '{tokenized_once[j]}' at index {j} but found '{tokenized_twice[j]}'"
            if char_message == "":
                char_message = f"expected length {len(tokenized_once)}, found {len(tokenized_twice)}"
            raise Exception(
                f"Expected:\n==========\n{tokenized_once}\nbut found:\n==========\n{tokenized_twice} \n==========\n{char_message}")


def test_cpp_tokenizer_discarding_comments():
    test_tokenizer(TESTS, keep_comments=False)


def test_cpp_tokenizer_keep_comments():
    test_tokenizer(TESTS_KEEP_COMMENTS, keep_comments=True)


def test_cpp_chars():
    test_tokenizer(TESTS_CHARS, keep_comments=False)


def test_cpp_strings():
    test_tokenizer(TESTS_STRINGS + TESTS_MULTILINE_STRINGS,
                   keep_comments=False)


def test_cpp_detokenize():
    test_detokenize_non_invertible(DETOKENIZE_TESTS)


def test_detokenize_cpp_chars():
    test_detokenize_invertible(TESTS_CHARS)


def test_detokenize_string():
    test_detokenize_invertible(TESTS_STRINGS)


def test_detokenize_multiline_string():
    test_detokenize_non_invertible(TESTS_DETOKENIZE_MULTILINE_STRINGS)


def test_tokenize_twice_equal_tokenize_remove_comments():
    test_tokenize_twice(TESTS + TESTS_STRINGS + TESTS_CHARS)


def test_tokenize_twice_equal_tokenize_keep_comments():
    test_tokenize_twice(TESTS + TESTS_STRINGS + TESTS_CHARS +
                        TESTS_KEEP_COMMENTS, keep_comments=True)
