# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( l , w ) :
    return ( 2 * ( l + w ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (58,39,),
    (37,49,),
    (56,52,),
    (22,43,),
    (77,12,),
    (34,31,),
    (74,54,),
    (37,52,),
    (21,37,),
    (75,30,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))