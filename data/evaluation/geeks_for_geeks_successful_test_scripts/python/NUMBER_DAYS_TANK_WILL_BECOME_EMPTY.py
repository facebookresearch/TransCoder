# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( C , l ) :
    if ( l >= C ) : return C
    eq_root = ( math.sqrt ( 1 + 8 * ( C - l ) ) - 1 ) / 2
    return math.ceil ( eq_root ) + l


#TOFILL

if __name__ == '__main__':
    param = [
    (91,29,),
    (99,55,),
    (11,56,),
    (23,56,),
    (12,97,),
    (1,64,),
    (18,5,),
    (14,37,),
    (13,55,),
    (36,99,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))