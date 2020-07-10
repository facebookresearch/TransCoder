# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( m , n ) :
    if m < n :
        return 0
    if n == 0 :
        return 1
    res = ( f_gold ( m - 1 , n ) + f_gold ( m // 2 , n - 1 ) )
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    (38,34,),
    (39,29,),
    (24,99,),
    (90,23,),
    (44,2,),
    (49,70,),
    (58,84,),
    (97,34,),
    (99,72,),
    (19,67,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))