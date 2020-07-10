# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( side ) :
    volume = ( side ** 3 / ( 6 * math.sqrt ( 2 ) ) )
    return round ( volume , 2 )


#TOFILL

if __name__ == '__main__':
    param = [
    (58,),
    (56,),
    (35,),
    (99,),
    (13,),
    (45,),
    (40,),
    (92,),
    (7,),
    (13,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))