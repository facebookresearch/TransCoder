# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    count = 0
    p = abs ( a * b )
    if ( p == 0 ) :
        return 1
    while ( p > 0 ) :
        count = count + 1
        p = p // 10
    return count


#TOFILL

if __name__ == '__main__':
    param = [
    (86,39,),
    (81,87,),
    (48,84,),
    (64,80,),
    (56,20,),
    (5,70,),
    (25,13,),
    (94,83,),
    (5,55,),
    (46,46,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))