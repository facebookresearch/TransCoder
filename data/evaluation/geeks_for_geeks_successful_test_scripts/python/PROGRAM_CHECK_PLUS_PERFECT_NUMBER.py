# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( x ) :
    temp = x
    n = 0
    while ( x != 0 ) :
        x = x // 10
        n = n + 1
    x = temp
    sm = 0
    while ( x != 0 ) :
        sm = sm + ( int ) ( math.pow ( x % 10 , n ) )
        x = x // 10
    return ( sm == temp )


#TOFILL

if __name__ == '__main__':
    param = [
    (371,),
    (9474,),
    (85,),
    (35,),
    (54,),
    (17,),
    (97,),
    (63,),
    (12,),
    (43,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))
