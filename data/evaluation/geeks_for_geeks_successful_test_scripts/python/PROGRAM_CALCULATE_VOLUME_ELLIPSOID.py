# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( r1 , r2 , r3 ) :
    return 1.33 * math.pi * r1 * r2 * r3


#TOFILL

if __name__ == '__main__':
    param = [
    (3287.4842316041018,4503.332888443404,8590.24729914204,),
    (-3707.427510963942,-6671.335781753231,-2780.4954870801926,),
    (8980.643174783816,3584.781688607942,2818.469507143102,),
    (-2698.0187368852694,-1004.7289573934537,-9602.530725071243,),
    (8627.156664162168,9572.27618966978,4783.930377855004,),
    (-7316.329924623669,-6591.043206581106,-9760.465488363216,),
    (7857.3846206400485,3671.761679299217,2534.5825334137794,),
    (-6502.657905007728,-1412.2240121470609,-6135.238350044512,),
    (4468.400513325576,2272.1999139470304,4753.075799180736,),
    (-7231.864791620428,-8036.087711033032,-6456.263512521035,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))