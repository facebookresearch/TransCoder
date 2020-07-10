# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#

from .code_tokenizer import tokenize_java, detokenize_java


TESTS = []

TESTS.append((
    r"""
public class HelloWorld
{
	public void main(String[] args) {
		System.out.println("Hello \n World!");
	}
}""",
    ['public', 'class', 'HelloWorld', '{',
        'public', 'void', 'main', '(', 'String', '[', ']', 'args', ')', '{',
        'System', '.', 'out', '.', 'println', '(', '" Hello ▁ \\n ▁ World ! "', ')', ';', '}', '}']
))

TESTS.append((r"""
overload((byte)1);
overload(1L);
overload(1.0f);""",
              ['overload', '(', '(', 'byte', ')', '1', ')', ';',
               'overload', '(', '1L', ')', ';',
               'overload', '(', '1.0f', ')', ';']
              ))

TESTS.append((r"""Runnable r = ()-> System.out.print("Run method");""",
              ['Runnable', 'r', '=', '(', ')', '->',
               'System', '.', 'out', '.', 'print', '(', '" Run ▁ method "', ')', ';']))


TESTS2 = []

TESTS2.append(r"""
import java.util.concurrent.TimeUnit;

public class Mensuration{ //mensuration of a child

    private int height;
    private int weight;
    private String child_name;

    public Mensuration(int height, int weight, String name):{
        this.height = height;
        this.weight = weight;
        this.child_name = name;
    }

    public int get_height(){
        return height;
    }

    public int get_weight(){
        return weight;
    }

    public String get_name(){
        String s = "Name:\n" + child_name;
        return s;
    }

}"""
              )

TESTS2.append(r"""
private enum Answer {
  YES {
    @Override public String toString() {
      return "yes";
    }
  },
  NO,
  MAYBE
}"""
              )

TESTS2.append(r"""
return new MyClass() {
  @Override public void method() {
    if (condition()) {
      try {
        something();
      } catch (ProblemException e) {
        recover();
      }
    } else if (otherCondition()) {
      somethingElse();
    } else {
      lastThing();
    }
  }
};"""
              )

TESTS2.append(r"""
public boolean equals(Object o_) {

      if ( o_ == null ) {
        return false;
      }
      if ( o_.getClass() != this.getClass() ) {
        return false;
      }
      Pair<?, ?> o = (Pair<?, ?>) o_;
      return x.equals(o.x) && y.equals(o.y);
    }
  }
"""
              )

TESTS3 = []

TESTS3.append((
    r"""/*
This    is    the    docstring !!
*/
/* ---------- */
public class HelloWorld
{
	public void main(String[] args) {
		System.out.println("Hello \n World!");
	}
}""",
    ['/* STRNEWLINE This ▁ is ▁ the ▁ docstring ▁ ! ! STRNEWLINE */', 'public', 'class', 'HelloWorld', '{',
        'public', 'void', 'main', '(', 'String', '[', ']', 'args', ')', '{',
        'System', '.', 'out', '.', 'println', '(', '" Hello ▁ \\n ▁ World ! "', ')', ';', '}', '}']
))

TESTS3.append((r"""
overload((byte)1);
// this is my  comfff
// ----- ***
overload(1L); // this is my comfff
overload(1.0f);""",
               ['overload', '(', '(', 'byte', ')', '1', ')', ';',
                '// ▁ this ▁ is ▁ my ▁ comfff ENDCOM',
                'overload', '(', '1L', ')', ';', '// ▁ this ▁ is ▁ my ▁ comfff ENDCOM',
                'overload', '(', '1.0f', ')', ';']
               ))


def test_java_tokenizer_discarding_comments():
    for i, (x, y) in enumerate(TESTS):
        y_ = tokenize_java(x)
        if y_ != y:
            line_diff = [j for j, (line, line_) in enumerate(
                zip(y, y_)) if line != line_]
            line_diff = line_diff[-1] if len(line_diff) > 0 else -1
            raise Exception(
                f"Difference at {line_diff}\nExpected:\n==========\n{y}\nbut found:\n==========\n{y_}")


def test_java_detokenizer_discarding_comments():
    for i, x in enumerate([x[0] for x in TESTS] + [x[0] for x in TESTS3] + TESTS2):
        tokens = tokenize_java(x)
        x_ = detokenize_java(tokens)
        tokens_ = tokenize_java(x_)
        if tokens != tokens:
            line_diff = [j for j, (line, line_) in enumerate(
                zip(tokens, tokens_)) if line != line_]
            raise Exception(
                f"Difference at {line_diff}\n========== Original:\n{x}\n========== Tokenized {tokens} \n Detokenized:\n{x_} \n Retokenized {tokens_}")


def test_java_tokenizer_keeping_comments():
    for i, (x, y) in enumerate(TESTS3):
        y_ = tokenize_java(x, keep_comments=True)
        if y_ != y:
            line_diff = [j for j, (line, line_) in enumerate(
                zip(y, y_)) if line != line_]
            line_diff = line_diff[-1] if len(line_diff) > 0 else -1
            raise Exception(
                f"Difference at {line_diff}\nExpected:\n==========\n{y}\nbut found:\n==========\n{y_}")


def test_java_detokenizer_keeping_comments():
    for i, x in enumerate([x[0] for x in TESTS] + [x[0] for x in TESTS3] + TESTS2):
        tokens = tokenize_java(x, keep_comments=True)
        x_ = detokenize_java(tokens)
        tokens_ = tokenize_java(x_, keep_comments=True)
        if tokens != tokens_:
            line_diff = [j for j, (line, line_) in enumerate(
                zip(tokens, tokens_)) if line != line_]
            raise Exception(
                f"Difference at {line_diff}\n========== Original:\n{x}\n========== Tokenized {tokens} \n Detokenized:\n{x_} \n Retokenized {tokens_}")
