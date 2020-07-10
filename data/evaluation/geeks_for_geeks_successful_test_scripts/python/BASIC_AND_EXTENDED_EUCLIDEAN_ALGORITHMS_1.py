# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , x , y ) :
    if a == 0 :
        x = 0
        y = 1
        return b
    x1 = 1
    y1 = 1
    gcd = f_gold ( b % a , a , x1 , y1 )
    x = y1 - ( b / a ) * x1
    y = x1
    return gcd


#TOFILL

if __name__ == '__main__':
    param = [
    (44,17,10,65,),
    (33,81,67,20,),
    (39,77,21,34,),
    (52,96,23,97,),
    (64,48,17,33,),
    (45,32,89,3,),
    (53,88,24,74,),
    (86,19,29,21,),
    (57,67,30,32,),
    (11,86,96,81,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))