# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( int ) ( 0.6172 * ( pow ( 10 , n ) - 1 ) - 0.55 * n )


#TOFILL

if __name__ == '__main__':
    param = [
    (18,),
    (81,),
    (77,),
    (84,),
    (87,),
    (14,),
    (15,),
    (3,),
    (21,),
    (60,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))