# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    C = [ [ 0 ] * ( n + 2 ) for i in range ( 0 , n + 2 ) ]
    for i in range ( 0 , n + 1 ) :
        for j in range ( 0 , min ( i , n ) + 1 ) :
            if ( j == 0 or j == i ) :
                C [ i ] [ j ] = 1
            else :
                C [ i ] [ j ] = C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ]
    sum = 0
    for i in range ( 0 , n + 1 ) :
        sum += C [ n ] [ i ]
    return sum


#TOFILL

if __name__ == '__main__':
    param = [
    (8,),
    (39,),
    (25,),
    (44,),
    (72,),
    (6,),
    (72,),
    (62,),
    (48,),
    (39,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))