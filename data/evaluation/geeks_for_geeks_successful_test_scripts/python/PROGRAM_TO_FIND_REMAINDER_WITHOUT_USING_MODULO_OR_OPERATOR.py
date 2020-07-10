# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num , divisor ) :
    return ( num - divisor * ( num // divisor ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (80,54,),
    (63,21,),
    (1,56,),
    (22,39,),
    (66,7,),
    (61,67,),
    (45,63,),
    (29,44,),
    (95,65,),
    (9,68,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))