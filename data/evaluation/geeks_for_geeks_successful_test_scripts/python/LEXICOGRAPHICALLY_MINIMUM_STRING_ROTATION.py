# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str_ ) :
    n = len ( str_ )
    arr = [ 0 ] * n
    concat = str_ + str_
    for i in range ( n ) :
        arr [ i ] = concat [ i : n + i ]
    arr.sort ( )
    return arr [ 0 ]


#TOFILL

if __name__ == '__main__':
    param = [
    ('onWEchl',),
    ('2',),
    ('100',),
    ('GHbCZA',),
    ('50568798206105',),
    ('001011110001',),
    ('lljpYhznnyu',),
    ('54499921759984',),
    ('11101',),
    ('qvypgCYEjsyjwZ',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))