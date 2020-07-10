# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( k , n ) :
    f1 = 0
    f2 = 1
    i = 2 ;
    while i != 0 :
        f3 = f1 + f2 ;
        f1 = f2 ;
        f2 = f3 ;
        if f2 % k == 0 :
            return n * i
        i += 1
    return


#TOFILL

if __name__ == '__main__':
    param = [
    (50,60,),
    (52,45,),
    (42,17,),
    (2,68,),
    (37,43,),
    (48,46,),
    (31,4,),
    (9,64,),
    (78,14,),
    (64,80,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))