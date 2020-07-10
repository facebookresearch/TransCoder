# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( side ) :
    return ( 2 * ( 1 + ( math.sqrt ( 2 ) ) ) * side * side )


#TOFILL

if __name__ == '__main__':
    param = [
    (5859.798616323926,),
    (-6381.210375893524,),
    (2442.246292006922,),
    (-9624.81536339737,),
    (8679.436805247444,),
    (-2682.3245401089525,),
    (7216.9161613024435,),
    (-5881.789859815442,),
    (2497.776395789202,),
    (-9598.912195459263,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))