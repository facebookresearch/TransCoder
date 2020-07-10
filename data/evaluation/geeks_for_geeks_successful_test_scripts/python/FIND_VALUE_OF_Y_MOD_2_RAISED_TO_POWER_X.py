# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( y , x ) :
    return ( y % pow ( 2 , x ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (57,76,),
    (80,46,),
    (84,96,),
    (35,16,),
    (3,84,),
    (42,79,),
    (7,2,),
    (99,83,),
    (13,61,),
    (44,8,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))