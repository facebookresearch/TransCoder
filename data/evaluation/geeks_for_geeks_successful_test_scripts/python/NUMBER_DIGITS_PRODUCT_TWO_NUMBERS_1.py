# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( a , b ) :
    if ( a == 0 or b == 0 ) :
        return 1
    return math.floor ( math.log10 ( abs ( a ) ) + math.log10 ( abs ( b ) ) ) + 1


#TOFILL

if __name__ == '__main__':
    param = [
    (97,91,),
    (52,49,),
    (95,34,),
    (35,40,),
    (40,85,),
    (18,97,),
    (92,15,),
    (73,98,),
    (10,62,),
    (82,22,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))