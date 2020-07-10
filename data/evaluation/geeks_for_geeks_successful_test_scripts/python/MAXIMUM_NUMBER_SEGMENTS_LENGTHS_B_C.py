# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , a , b , c ) :
    dp = [ - 1 ] * ( n + 10 )
    dp [ 0 ] = 0
    for i in range ( 0 , n ) :
        if ( dp [ i ] != - 1 ) :
            if ( i + a <= n ) :
                dp [ i + a ] = max ( dp [ i ] + 1 , dp [ i + a ] )
            if ( i + b <= n ) :
                dp [ i + b ] = max ( dp [ i ] + 1 , dp [ i + b ] )
            if ( i + c <= n ) :
                dp [ i + c ] = max ( dp [ i ] + 1 , dp [ i + c ] )
    return dp [ n ]


#TOFILL

if __name__ == '__main__':
    param = [
    (23,16,23,18,),
    (62,76,81,97,),
    (32,46,1,78,),
    (82,48,72,58,),
    (94,99,62,38,),
    (44,21,46,60,),
    (4,57,2,77,),
    (53,23,80,5,),
    (9,55,26,85,),
    (23,15,73,42,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))