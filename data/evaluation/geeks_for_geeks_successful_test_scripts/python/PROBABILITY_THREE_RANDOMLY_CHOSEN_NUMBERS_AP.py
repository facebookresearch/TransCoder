# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( 3.0 * n ) / ( 4.0 * ( n * n ) - 1 )


#TOFILL

if __name__ == '__main__':
    param = [
    (46,),
    (5,),
    (44,),
    (15,),
    (72,),
    (2,),
    (86,),
    (17,),
    (30,),
    (42,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))