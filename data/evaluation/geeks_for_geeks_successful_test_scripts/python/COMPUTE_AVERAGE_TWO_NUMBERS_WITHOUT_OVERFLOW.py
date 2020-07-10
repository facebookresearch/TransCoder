# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
from math import floor

def f_gold ( a , b ) :
    return floor ( ( a + b ) / 2 )


#TOFILL

if __name__ == '__main__':
    param = [
    (1,44,),
    (6,61,),
    (75,20,),
    (51,17,),
    (19,25,),
    (82,98,),
    (72,21,),
    (48,41,),
    (12,17,),
    (41,80,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))