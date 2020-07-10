# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , p ) :
    ans = 0
    temp = p
    while ( temp <= n ) :
        ans += n / temp
        temp = temp * p
    return int ( ans )


#TOFILL

if __name__ == '__main__':
    param = [
    (76,43,),
    (77,91,),
    (9,42,),
    (59,67,),
    (8,52,),
    (97,8,),
    (78,24,),
    (41,88,),
    (72,61,),
    (71,28,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))