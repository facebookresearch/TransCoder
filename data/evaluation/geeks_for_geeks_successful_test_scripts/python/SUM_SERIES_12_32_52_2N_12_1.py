# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return int ( ( n * ( 2 * n - 1 ) * ( 2 * n + 1 ) ) / 3 )


#TOFILL

if __name__ == '__main__':
    param = [
    (84,),
    (74,),
    (91,),
    (34,),
    (36,),
    (28,),
    (70,),
    (7,),
    (24,),
    (47,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))