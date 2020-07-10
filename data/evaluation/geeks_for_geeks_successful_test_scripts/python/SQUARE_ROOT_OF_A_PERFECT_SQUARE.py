# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    x = n
    y = 1
    e = 0.000001
    while ( x - y > e ) :
        x = ( x + y ) / 2
        y = n / x
    return x


#TOFILL

if __name__ == '__main__':
    param = [
    (1763.655093333857,),
    (-3544.737136289062,),
    (7893.209433000695,),
    (-3008.0331952533734,),
    (6155.190186637041,),
    (-5799.751467314729,),
    (8234.151546380555,),
    (-1829.5367705266551,),
    (5778.227173218819,),
    (-7785.473710863676,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))