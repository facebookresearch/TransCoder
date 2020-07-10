# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k ) :
    dp = [ [ [ 0 , 0 ] for __ in range ( k + 1 ) ] for _ in range ( n + 1 ) ]
    dp [ 1 ] [ 0 ] [ 0 ] = 1
    dp [ 1 ] [ 0 ] [ 1 ] = 1
    for i in range ( 2 , n + 1 ) :
        for j in range ( k + 1 ) :
            dp [ i ] [ j ] [ 0 ] = ( dp [ i - 1 ] [ j ] [ 0 ] + dp [ i - 1 ] [ j ] [ 1 ] )
            dp [ i ] [ j ] [ 1 ] = dp [ i - 1 ] [ j ] [ 0 ]
            if j >= 1 :
                dp [ i ] [ j ] [ 1 ] += dp [ i - 1 ] [ j - 1 ] [ 1 ]
    return dp [ n ] [ k ] [ 0 ] + dp [ n ] [ k ] [ 1 ]


#TOFILL

if __name__ == '__main__':
    param = [
    (29,85,),
    (47,29,),
    (77,96,),
    (9,91,),
    (29,80,),
    (94,85,),
    (51,87,),
    (46,62,),
    (18,96,),
    (86,86,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))