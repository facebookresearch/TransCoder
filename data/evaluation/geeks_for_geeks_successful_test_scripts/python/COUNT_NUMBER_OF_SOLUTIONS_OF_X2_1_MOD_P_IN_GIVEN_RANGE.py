# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , p ) :
    ans = 0 ;
    for x in range ( 1 , p ) :
        if ( ( x * x ) % p == 1 ) :
            last = x + p * ( n / p ) ;
            if ( last > n ) :
                last -= p ;
            ans += ( ( last - x ) / p + 1 ) ;
    return int ( ans ) ;


#TOFILL

if __name__ == '__main__':
    param = [
    (94,36,),
    (11,79,),
    (88,63,),
    (85,43,),
    (74,89,),
    (96,33,),
    (49,51,),
    (50,24,),
    (21,26,),
    (81,19,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))