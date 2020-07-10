# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    res = 1 ;
    for i in range ( n , - 1 , - 2 ) :
        if ( i == 0 or i == 1 ) :
            return res ;
        else :
            res *= i ;


#TOFILL

if __name__ == '__main__':
    param = [
    (88,),
    (24,),
    (3,),
    (22,),
    (53,),
    (2,),
    (88,),
    (30,),
    (38,),
    (2,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))