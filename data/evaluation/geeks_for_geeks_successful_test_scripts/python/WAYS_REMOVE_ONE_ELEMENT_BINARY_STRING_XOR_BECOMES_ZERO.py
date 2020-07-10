# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    one_count = 0
    zero_count = 0
    n = len ( str )
    for i in range ( 0 , n , 1 ) :
        if ( str [ i ] == '1' ) :
            one_count += 1
        else :
            zero_count += 1
    if ( one_count % 2 == 0 ) :
        return zero_count
    return one_count


#TOFILL

if __name__ == '__main__':
    param = [
    ('KfcTJNP',),
    ('05312505872',),
    ('100111',),
    ('tDEEhKxrQ',),
    ('50824233019',),
    ('10001110010',),
    ('T SEZaNm MYQ',),
    ('838415739',),
    ('01110100',),
    ('WYQiAey H',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))