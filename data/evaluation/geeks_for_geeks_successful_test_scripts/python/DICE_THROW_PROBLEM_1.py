# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( f , d , s ) :
    mem = [ [ 0 for i in range ( s + 1 ) ] for j in range ( d + 1 ) ]
    mem [ 0 ] [ 0 ] = 1
    for i in range ( 1 , d + 1 ) :
        for j in range ( 1 , s + 1 ) :
            mem [ i ] [ j ] = mem [ i ] [ j - 1 ] + mem [ i - 1 ] [ j - 1 ]
            if j - f - 1 >= 0 :
                mem [ i ] [ j ] -= mem [ i - 1 ] [ j - f - 1 ]
    return mem [ d ] [ s ]


#TOFILL

if __name__ == '__main__':
    param = [
    (57,5,33,),
    (58,45,4,),
    (38,89,9,),
    (5,39,30,),
    (91,90,47,),
    (76,56,46,),
    (38,43,84,),
    (97,26,52,),
    (97,90,90,),
    (99,2,26,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))