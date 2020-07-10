# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , r , p ) :
    C = [ 0 for i in range ( r + 1 ) ]
    C [ 0 ] = 1
    for i in range ( 1 , n + 1 ) :
        for j in range ( min ( i , r ) , 0 , - 1 ) :
            C [ j ] = ( C [ j ] + C [ j - 1 ] ) % p
    return C [ r ]


#TOFILL

if __name__ == '__main__':
    param = [
    (82,5,94,),
    (45,24,95,),
    (44,68,61,),
    (88,24,43,),
    (90,75,57,),
    (98,55,43,),
    (80,54,88,),
    (60,75,65,),
    (52,73,86,),
    (71,26,45,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))