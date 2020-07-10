# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s , c ) :
    res = 0
    for i in range ( len ( s ) ) :
        if ( s [ i ] == c ) :
            res = res + 1
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    ('mhjnKfd','l',),
    ('716662107','6',),
    ('01','1',),
    ('wPHSxIbnHakGRO','n',),
    ('721106','8',),
    ('111','0',),
    ('TIBFU','Q',),
    ('0','3',),
    ('10','0',),
    ('lqq','d',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))