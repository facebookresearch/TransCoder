# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    dp = [ 0 for _ in range ( n + 1 ) ]
    for i in range ( 1 , n + 1 ) :
        if i <= 3 :
            dp [ i ] = 1
        elif i == 4 :
            dp [ i ] = 2
        else :
            dp [ i ] = dp [ i - 1 ] + dp [ i - 4 ]
    return dp [ n ]


#TOFILL

if __name__ == '__main__':
    param = [
    (61,),
    (22,),
    (65,),
    (57,),
    (36,),
    (25,),
    (16,),
    (26,),
    (92,),
    (5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))