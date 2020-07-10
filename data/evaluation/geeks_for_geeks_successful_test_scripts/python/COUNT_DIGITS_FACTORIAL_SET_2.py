# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    if ( n < 0 ) :
        return 0 ;
    if ( n <= 1 ) :
        return 1 ;
    x = ( ( n * math.log10 ( n / math.e ) + math.log10 ( 2 * math.pi * n ) / 2.0 ) ) ;
    return math.floor ( x ) + 1 ;


#TOFILL

if __name__ == '__main__':
    param = [
    (56,),
    (92,),
    (52,),
    (96,),
    (96,),
    (63,),
    (51,),
    (79,),
    (70,),
    (9,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))