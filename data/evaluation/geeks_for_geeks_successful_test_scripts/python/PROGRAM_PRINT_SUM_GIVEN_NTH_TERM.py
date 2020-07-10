# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    S = 0
    for i in range ( 1 , n + 1 ) :
        S += i * i - ( i - 1 ) * ( i - 1 )
    return S


#TOFILL

if __name__ == '__main__':
    param = [
    (39,),
    (20,),
    (10,),
    (39,),
    (70,),
    (21,),
    (21,),
    (80,),
    (89,),
    (99,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))