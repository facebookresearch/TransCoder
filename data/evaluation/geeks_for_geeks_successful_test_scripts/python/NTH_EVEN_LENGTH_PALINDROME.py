# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    res = n
    for j in range ( len ( n ) - 1 , - 1 , - 1 ) :
        res += n [ j ]
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    ('lSUhEvxcgfI',),
    ('77329283',),
    ('010111111',),
    ('Stazb',),
    ('0702',),
    ('01111111',),
    ('a',),
    ('359118754930',),
    ('11011010010',),
    ('rznb',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))