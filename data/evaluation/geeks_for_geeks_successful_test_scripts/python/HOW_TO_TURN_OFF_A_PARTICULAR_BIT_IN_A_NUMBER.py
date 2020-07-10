# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k ) :
    if ( k <= 0 ) :
        return n
    return ( n & ~ ( 1 << ( k - 1 ) ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (49,15,),
    (59,69,),
    (76,20,),
    (27,76,),
    (61,60,),
    (67,27,),
    (63,71,),
    (85,25,),
    (90,64,),
    (24,55,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))