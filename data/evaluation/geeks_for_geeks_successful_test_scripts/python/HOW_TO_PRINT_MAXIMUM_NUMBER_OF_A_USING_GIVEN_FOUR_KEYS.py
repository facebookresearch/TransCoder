# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( N ) :
    if ( N <= 6 ) :
        return N
    screen = [ 0 ] * N
    for n in range ( 1 , 7 ) :
        screen [ n - 1 ] = n
    for n in range ( 7 , N + 1 ) :
        screen [ n - 1 ] = max ( 2 * screen [ n - 4 ] , max ( 3 * screen [ n - 5 ] , 4 * screen [ n - 6 ] ) ) ;
    return screen [ N - 1 ]


#TOFILL

if __name__ == '__main__':
    param = [
    (41,),
    (94,),
    (80,),
    (40,),
    (76,),
    (5,),
    (43,),
    (67,),
    (24,),
    (90,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))