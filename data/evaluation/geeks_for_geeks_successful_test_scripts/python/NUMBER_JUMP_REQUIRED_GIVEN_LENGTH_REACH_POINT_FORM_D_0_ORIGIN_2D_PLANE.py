# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , d ) :
    temp = a
    a = min ( a , b )
    b = max ( temp , b )
    if ( d >= b ) :
        return ( d + b - 1 ) / b
    if ( d == 0 ) :
        return 0
    if ( d == a ) :
        return 1
    return 2


#TOFILL

if __name__ == '__main__':
    param = [
    (35,8,77,),
    (85,55,33,),
    (22,23,64,),
    (8,43,29,),
    (12,64,11,),
    (58,25,26,),
    (65,4,28,),
    (10,95,55,),
    (23,13,54,),
    (5,50,71,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))