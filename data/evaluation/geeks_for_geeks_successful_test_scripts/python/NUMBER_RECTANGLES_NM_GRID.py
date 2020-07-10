# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , m ) :
    return ( m * n * ( n + 1 ) * ( m + 1 ) ) // 4


#TOFILL

if __name__ == '__main__':
    param = [
    (86,70,),
    (33,65,),
    (3,5,),
    (91,12,),
    (33,27,),
    (13,75,),
    (75,36,),
    (58,64,),
    (50,51,),
    (4,44,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))