# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( N , K ) :
    ans = 0 ;
    y = N / K ;
    x = N % K ;
    ans = ( ( K * ( K - 1 ) / 2 ) * y + ( x * ( x + 1 ) ) / 2 ) ;
    return int ( ans ) ;


#TOFILL

if __name__ == '__main__':
    param = [
    (40,90,),
    (46,64,),
    (97,20,),
    (63,1,),
    (92,52,),
    (60,35,),
    (67,40,),
    (61,62,),
    (74,61,),
    (67,41,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))