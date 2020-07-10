# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    DP = [ 0 for i in range ( 0 , n + 1 ) ]
    DP [ 0 ] = DP [ 1 ] = DP [ 2 ] = 1
    DP [ 3 ] = 2
    for i in range ( 4 , n + 1 ) :
        DP [ i ] = DP [ i - 1 ] + DP [ i - 3 ] + DP [ i - 4 ]
    return DP [ n ]


#TOFILL

if __name__ == '__main__':
    param = [
    (44,),
    (9,),
    (19,),
    (10,),
    (78,),
    (94,),
    (70,),
    (81,),
    (81,),
    (49,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))