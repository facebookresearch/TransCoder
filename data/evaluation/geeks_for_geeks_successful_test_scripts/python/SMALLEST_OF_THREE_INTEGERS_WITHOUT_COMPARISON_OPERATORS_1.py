# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y , z ) :
    if ( not ( y / x ) ) :
        return y if ( not ( y / z ) ) else z
    return x if ( not ( x / z ) ) else z


#TOFILL

if __name__ == '__main__':
    param = [
    (48,63,56,),
    (11,55,84,),
    (50,89,96,),
    (21,71,74,),
    (94,39,42,),
    (22,44,86,),
    (3,41,68,),
    (67,62,94,),
    (59,2,83,),
    (50,11,1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))