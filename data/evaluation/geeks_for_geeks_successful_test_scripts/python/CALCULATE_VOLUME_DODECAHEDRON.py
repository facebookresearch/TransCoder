# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( side ) :
    return ( ( ( 15 + ( 7 * ( math.sqrt ( 5 ) ) ) ) / 4 ) * ( math.pow ( side , 3 ) ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (56,),
    (73,),
    (22,),
    (10,),
    (84,),
    (20,),
    (51,),
    (91,),
    (10,),
    (83,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))