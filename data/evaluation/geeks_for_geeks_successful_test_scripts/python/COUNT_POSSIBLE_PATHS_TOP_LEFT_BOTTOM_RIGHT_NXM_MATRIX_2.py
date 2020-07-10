# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( p , q ) :
    dp = [ 1 for i in range ( q ) ]
    for i in range ( p - 1 ) :
        for j in range ( 1 , q ) :
            dp [ j ] += dp [ j - 1 ]
    return dp [ q - 1 ]


#TOFILL

if __name__ == '__main__':
    param = [
    (73,75,),
    (70,5,),
    (53,62,),
    (80,70,),
    (9,59,),
    (38,48,),
    (41,49,),
    (80,72,),
    (42,52,),
    (54,1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))