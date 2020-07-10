# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    maxvalue = 0
    i = 1
    for i in range ( s - 1 ) :
        j = 1
        for j in range ( s ) :
            k = s - i - j
            maxvalue = max ( maxvalue , i * j * k )
    return maxvalue


#TOFILL

if __name__ == '__main__':
    param = [
    (67,),
    (48,),
    (59,),
    (22,),
    (14,),
    (66,),
    (1,),
    (75,),
    (58,),
    (78,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))