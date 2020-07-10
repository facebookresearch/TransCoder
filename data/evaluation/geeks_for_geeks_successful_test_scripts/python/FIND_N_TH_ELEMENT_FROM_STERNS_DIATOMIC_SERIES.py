# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    DP = [ 0 ] * ( n + 1 )
    DP [ 0 ] = 0
    DP [ 1 ] = 1
    for i in range ( 2 , n + 1 ) :
        if ( int ( i % 2 ) == 0 ) :
            DP [ i ] = DP [ int ( i / 2 ) ]
        else :
            DP [ i ] = ( DP [ int ( ( i - 1 ) / 2 ) ] + DP [ int ( ( i + 1 ) / 2 ) ] )
    return DP [ n ]


#TOFILL

if __name__ == '__main__':
    param = [
    (37,),
    (24,),
    (13,),
    (56,),
    (26,),
    (67,),
    (82,),
    (60,),
    (64,),
    (65,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))