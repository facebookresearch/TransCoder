# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k ) :
    total = k
    mod = 1000000007
    same , diff = 0 , k
    for i in range ( 2 , n + 1 ) :
        same = diff
        diff = total * ( k - 1 )
        diff = diff % mod
        total = ( same + diff ) % mod
    return total


#TOFILL

if __name__ == '__main__':
    param = [
    (6,30,),
    (23,87,),
    (89,31,),
    (63,36,),
    (23,68,),
    (44,66,),
    (81,18,),
    (43,73,),
    (9,42,),
    (41,98,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))