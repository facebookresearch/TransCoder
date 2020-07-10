# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    ans = 2 * ( pow ( 3 , n ) ) - 1 ;
    return ans ;


#TOFILL

if __name__ == '__main__':
    param = [
    (78,),
    (89,),
    (46,),
    (56,),
    (79,),
    (71,),
    (80,),
    (77,),
    (48,),
    (16,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))