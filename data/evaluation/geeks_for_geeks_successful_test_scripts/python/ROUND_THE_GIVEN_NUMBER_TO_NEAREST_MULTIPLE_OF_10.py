# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    a = ( n // 10 ) * 10
    b = a + 10
    return ( b if n - a > b - n else a )


#TOFILL

if __name__ == '__main__':
    param = [
    (31,),
    (78,),
    (19,),
    (36,),
    (77,),
    (94,),
    (86,),
    (16,),
    (95,),
    (2,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))