# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    table = [ 0 for i in range ( n + 1 ) ]
    table [ 0 ] = 1
    for i in range ( 3 , n + 1 ) :
        table [ i ] += table [ i - 3 ]
    for i in range ( 5 , n + 1 ) :
        table [ i ] += table [ i - 5 ]
    for i in range ( 10 , n + 1 ) :
        table [ i ] += table [ i - 10 ]
    return table [ n ]


#TOFILL

if __name__ == '__main__':
    param = [
    (83,),
    (29,),
    (17,),
    (12,),
    (93,),
    (55,),
    (97,),
    (75,),
    (22,),
    (52,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))