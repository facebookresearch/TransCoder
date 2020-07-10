# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    count = 0
    if ( n % 2 == 0 ) :
        count = count + 1
        while ( n % 2 == 0 ) :
            n = int ( n / 2 )
    i = 3
    while ( i <= int ( math.sqrt ( n ) ) ) :
        if ( n % i == 0 ) :
            count = count + 1
            while ( n % i == 0 ) :
                n = int ( n / i )
        i = i + 2
    if ( n > 2 ) :
        count = count + 1
    return count


#TOFILL

if __name__ == '__main__':
    param = [
    (99,),
    (33,),
    (50,),
    (17,),
    (18,),
    (69,),
    (23,),
    (18,),
    (94,),
    (16,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))