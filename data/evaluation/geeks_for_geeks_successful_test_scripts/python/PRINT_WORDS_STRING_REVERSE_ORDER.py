# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    i = len ( str ) - 1
    start = end = i + 1
    result = ''
    while i >= 0 :
        if str [ i ] == ' ' :
            start = i + 1
            while start != end :
                result += str [ start ]
                start += 1
            result += ' '
            end = i
        i -= 1
    start = 0
    while start != end :
        result += str [ start ]
        start += 1
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ('m Dm YZ',),
    ('65 48 57 71',),
    ('01 010',),
    ('mT vhByi',),
    ('19 44 9 1',),
    ('0',),
    ('z vUi  ',),
    ('7 591 36643 9 055',),
    ('01',),
    ('ti YGaijPY',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))