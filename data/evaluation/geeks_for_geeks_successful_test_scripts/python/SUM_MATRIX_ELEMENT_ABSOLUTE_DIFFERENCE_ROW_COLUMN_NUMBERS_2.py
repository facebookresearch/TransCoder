# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    n -= 1
    sum = 0
    sum += ( n * ( n + 1 ) ) / 2
    sum += ( n * ( n + 1 ) * ( 2 * n + 1 ) ) / 6
    return int ( sum )


#TOFILL

if __name__ == '__main__':
    param = [
    (12,),
    (89,),
    (76,),
    (2,),
    (81,),
    (11,),
    (26,),
    (35,),
    (16,),
    (66,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))