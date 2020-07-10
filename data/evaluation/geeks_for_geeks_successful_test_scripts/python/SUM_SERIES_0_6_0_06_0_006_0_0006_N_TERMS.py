# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( ( 0.666 ) * ( 1 - 1 / pow ( 10 , n ) ) ) ;


#TOFILL

if __name__ == '__main__':
    param = [
    (1,),
    (2,),
    (3,),
    (4,),
    (5,),
    (74,),
    (77,),
    (67,),
    (9,),
    (12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))