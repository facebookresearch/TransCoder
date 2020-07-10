# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
from math import sqrt

def f_gold ( a ) :
    area = ( sqrt ( 5 * ( 5 + 2 * ( sqrt ( 5 ) ) ) ) * a * a ) / 4
    return area


#TOFILL

if __name__ == '__main__':
    param = [
    (2009.019461888707,),
    (-1480.5131394215787,),
    (357.7870347569567,),
    (-8040.293697508038,),
    (3821.882657293133,),
    (-6840.635072240347,),
    (1623.036598830132,),
    (-9714.00706195298,),
    (3916.454769669618,),
    (-669.068424712943,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))