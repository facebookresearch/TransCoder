# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    count = 0
    while ( n ) :
        n &= ( n - 1 )
        count += 1
    return count


#TOFILL

if __name__ == '__main__':
    param = [
    (32,),
    (94,),
    (33,),
    (99,),
    (17,),
    (64,),
    (80,),
    (42,),
    (12,),
    (86,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))