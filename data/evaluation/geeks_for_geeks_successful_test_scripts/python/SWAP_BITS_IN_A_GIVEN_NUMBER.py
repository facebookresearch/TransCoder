# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , p1 , p2 , n ) :
    set1 = ( x >> p1 ) & ( ( 1 << n ) - 1 )
    set2 = ( x >> p2 ) & ( ( 1 << n ) - 1 )
    xor = ( set1 ^ set2 )
    xor = ( xor << p1 ) | ( xor << p2 )
    result = x ^ xor
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    (95,88,97,92,),
    (16,26,59,42,),
    (55,56,40,41,),
    (75,35,79,30,),
    (90,12,59,34,),
    (58,65,25,19,),
    (69,64,17,94,),
    (5,1,59,38,),
    (36,33,97,44,),
    (62,69,66,9,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))