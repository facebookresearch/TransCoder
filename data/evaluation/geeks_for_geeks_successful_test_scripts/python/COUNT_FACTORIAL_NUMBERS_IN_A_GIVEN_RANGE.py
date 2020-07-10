# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( low , high ) :
    fact = 1
    x = 1
    while ( fact < low ) :
        fact = fact * x
        x += 1
    res = 0
    while ( fact <= high ) :
        res += 1
        fact = fact * x
        x += 1
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    (57,79,),
    (57,21,),
    (31,37,),
    (62,87,),
    (49,98,),
    (82,76,),
    (31,45,),
    (5,52,),
    (76,43,),
    (55,6,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))