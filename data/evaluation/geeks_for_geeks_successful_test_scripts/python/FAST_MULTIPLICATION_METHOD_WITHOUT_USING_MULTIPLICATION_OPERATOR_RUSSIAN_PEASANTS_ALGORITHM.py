# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    res = 0
    while ( b > 0 ) :
        if ( b & 1 ) :
            res = res + a
        a = a << 1
        b = b >> 1
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    (4,33,),
    (36,67,),
    (65,52,),
    (55,37,),
    (35,76,),
    (69,98,),
    (84,62,),
    (5,80,),
    (15,36,),
    (67,84,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))