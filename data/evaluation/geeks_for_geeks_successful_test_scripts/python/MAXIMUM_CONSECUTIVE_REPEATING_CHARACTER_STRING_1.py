# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    n = len ( str )
    count = 0
    res = str [ 0 ]
    cur_count = 1
    for i in range ( n ) :
        if ( i < n - 1 and str [ i ] == str [ i + 1 ] ) :
            cur_count += 1
        else :
            if cur_count > count :
                count = cur_count
                res = str [ i ]
            cur_count = 1
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    ('geeekk',),
    ('3786868',),
    ('110',),
    ('aaaabbcbbb',),
    ('11',),
    ('011101',),
    ('WoHNyJYLC',),
    ('3141711779',),
    ('10111101101',),
    ('aabbabababcc',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))