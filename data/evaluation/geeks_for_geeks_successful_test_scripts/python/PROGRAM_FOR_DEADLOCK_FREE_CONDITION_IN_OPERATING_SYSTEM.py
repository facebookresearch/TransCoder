# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( process , need ) :
    minResources = 0
    minResources = process * ( need - 1 ) + 1
    return minResources


#TOFILL

if __name__ == '__main__':
    param = [
    (38,37,),
    (82,3,),
    (2,26,),
    (38,72,),
    (31,85,),
    (80,73,),
    (11,9,),
    (2,31,),
    (26,59,),
    (37,67,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))