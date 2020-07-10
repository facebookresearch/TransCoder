# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    bell = [ [ 0 for i in range ( n + 1 ) ] for j in range ( n + 1 ) ]
    bell [ 0 ] [ 0 ] = 1
    for i in range ( 1 , n + 1 ) :
        bell [ i ] [ 0 ] = bell [ i - 1 ] [ i - 1 ]
        for j in range ( 1 , i + 1 ) :
            bell [ i ] [ j ] = bell [ i - 1 ] [ j - 1 ] + bell [ i ] [ j - 1 ]
    return bell [ n ] [ 0 ]


#TOFILL

if __name__ == '__main__':
    param = [
    (84,),
    (78,),
    (9,),
    (73,),
    (4,),
    (53,),
    (85,),
    (38,),
    (39,),
    (6,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))