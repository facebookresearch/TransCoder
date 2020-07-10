# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A ) :
    n = 2 * A
    dpArray = [ 0 ] * ( n + 1 )
    dpArray [ 0 ] = 1
    dpArray [ 2 ] = 1
    for i in range ( 4 , n + 1 , 2 ) :
        for j in range ( 0 , i - 1 , 2 ) :
            dpArray [ i ] += ( dpArray [ j ] * dpArray [ i - 2 - j ] )
    return int ( dpArray [ n ] )


#TOFILL

if __name__ == '__main__':
    param = [
    (32,),
    (52,),
    (52,),
    (32,),
    (73,),
    (31,),
    (29,),
    (75,),
    (39,),
    (49,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))