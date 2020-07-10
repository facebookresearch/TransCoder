# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    l = math.sqrt ( n )
    sq = l * l
    if ( sq == n ) :
        return l * 4
    else :
        row = n / l
        perimeter = 2 * ( l + row )
        if ( n % l != 0 ) :
            perimeter += 2
        return perimeter


#TOFILL

if __name__ == '__main__':
    param = [
    (45,),
    (80,),
    (54,),
    (48,),
    (83,),
    (68,),
    (32,),
    (20,),
    (68,),
    (66,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))