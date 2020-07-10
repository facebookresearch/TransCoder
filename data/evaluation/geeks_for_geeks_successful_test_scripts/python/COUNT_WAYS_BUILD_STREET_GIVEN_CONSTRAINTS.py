# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    dp = [ [ 0 ] * ( n + 1 ) for i in range ( 2 ) ]
    dp [ 0 ] [ 1 ] = 1
    dp [ 1 ] [ 1 ] = 2
    for i in range ( 2 , n + 1 ) :
        dp [ 0 ] [ i ] = dp [ 0 ] [ i - 1 ] + dp [ 1 ] [ i - 1 ]
        dp [ 1 ] [ i ] = ( dp [ 0 ] [ i - 1 ] * 2 + dp [ 1 ] [ i - 1 ] )
    return dp [ 0 ] [ n ] + dp [ 1 ] [ n ]


#TOFILL

if __name__ == '__main__':
    param = [
    (68,),
    (91,),
    (99,),
    (79,),
    (61,),
    (48,),
    (89,),
    (20,),
    (83,),
    (1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))