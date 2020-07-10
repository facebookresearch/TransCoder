# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    return math.log2 ( n & - n ) + 1


#TOFILL

if __name__ == '__main__':
    param = [
    (45,),
    (26,),
    (74,),
    (80,),
    (46,),
    (67,),
    (16,),
    (87,),
    (27,),
    (17,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))