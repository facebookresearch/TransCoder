# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( a ) :
    area = ( math.pi * a * a ) / 4
    return area


#TOFILL

if __name__ == '__main__':
    param = [
    (77,),
    (18,),
    (83,),
    (39,),
    (68,),
    (28,),
    (71,),
    (14,),
    (21,),
    (73,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))