# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    k = n
    imin = 1
    ans = 0
    while ( imin <= n ) :
        imax = n / k
        ans += k * ( imax - imin + 1 )
        imin = imax + 1
        k = n / imin
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    (17,),
    (72,),
    (43,),
    (55,),
    (62,),
    (22,),
    (17,),
    (68,),
    (20,),
    (29,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))