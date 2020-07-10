# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    if ( n % 2 != 0 ) :
        return 0
    res = 1
    for i in range ( 2 , ( int ) ( math.sqrt ( n ) ) + 1 ) :
        count = 0
        curr_sum = 1
        curr_term = 1
        while ( n % i == 0 ) :
            count = count + 1
            n = n // i
            if ( i == 2 and count == 1 ) :
                curr_sum = 0
            curr_term = curr_term * i
            curr_sum = curr_sum + curr_term
        res = res * curr_sum
    if ( n >= 2 ) :
        res = res * ( 1 + n )
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    (71,),
    (78,),
    (39,),
    (36,),
    (49,),
    (17,),
    (53,),
    (66,),
    (92,),
    (71,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))