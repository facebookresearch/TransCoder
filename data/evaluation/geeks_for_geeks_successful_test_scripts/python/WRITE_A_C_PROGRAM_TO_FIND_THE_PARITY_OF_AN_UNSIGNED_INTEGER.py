# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    parity = 0
    while n :
        parity = ~ parity
        n = n & ( n - 1 )
    return parity


#TOFILL

if __name__ == '__main__':
    param = [
    (63,),
    (64,),
    (85,),
    (36,),
    (20,),
    (63,),
    (42,),
    (19,),
    (62,),
    (97,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))