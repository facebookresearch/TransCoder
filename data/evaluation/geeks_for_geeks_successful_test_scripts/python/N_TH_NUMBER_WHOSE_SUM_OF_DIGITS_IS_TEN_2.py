# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    nthElement = 19 + ( n - 1 ) * 9
    outliersCount = int ( math.log10 ( nthElement ) ) - 1
    nthElement += 9 * outliersCount
    return nthElement


#TOFILL

if __name__ == '__main__':
    param = [
    (68,),
    (70,),
    (69,),
    (93,),
    (99,),
    (44,),
    (91,),
    (8,),
    (83,),
    (51,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))