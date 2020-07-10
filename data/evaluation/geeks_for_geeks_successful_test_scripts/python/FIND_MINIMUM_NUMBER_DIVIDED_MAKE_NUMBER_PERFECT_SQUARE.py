# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    count = 0
    ans = 1
    while n % 2 == 0 :
        count += 1
        n //= 2
    if count % 2 is not 0 :
        ans *= 2
    for i in range ( 3 , ( int ) ( math.sqrt ( n ) ) + 1 , 2 ) :
        count = 0
        while n % i == 0 :
            count += 1
            n //= i
        if count % 2 is not 0 :
            ans *= i
    if n > 2 :
        ans *= n
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    (95,),
    (48,),
    (3,),
    (10,),
    (82,),
    (1,),
    (77,),
    (99,),
    (23,),
    (61,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))