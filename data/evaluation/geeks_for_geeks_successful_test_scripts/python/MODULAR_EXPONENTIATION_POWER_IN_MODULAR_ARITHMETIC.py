# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y , p ) :
    res = 1
    x = x % p
    while ( y > 0 ) :
        if ( ( y & 1 ) == 1 ) :
            res = ( res * x ) % p
        y = y >> 1
        x = ( x * x ) % p
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    (45,5,68,),
    (67,25,49,),
    (26,91,44,),
    (33,61,9,),
    (35,8,13,),
    (68,41,5,),
    (14,76,20,),
    (5,89,13,),
    (23,42,45,),
    (37,63,56,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))