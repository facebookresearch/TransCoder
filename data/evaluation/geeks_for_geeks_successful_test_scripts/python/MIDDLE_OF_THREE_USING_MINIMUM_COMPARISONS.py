# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , c ) :
    if ( ( a < b and b < c ) or ( c < b and b < a ) ) :
        return b ;
    if ( ( b < a and a < c ) or ( c < a and a < b ) ) :
        return a ;
    else :
        return c


#TOFILL

if __name__ == '__main__':
    param = [
    (56,5,82,),
    (56,60,17,),
    (36,56,51,),
    (71,54,6,),
    (3,70,81,),
    (84,57,47,),
    (30,80,85,),
    (82,54,32,),
    (90,70,55,),
    (38,4,5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))