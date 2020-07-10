# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    dp = [ 0 for i in range ( n + 1 ) ]
    for i in range ( n + 1 ) :
        if ( i <= 2 ) :
            dp [ i ] = i
        else :
            dp [ i ] = dp [ i - 1 ] + ( i - 1 ) * dp [ i - 2 ]
    return dp [ n ]


#TOFILL

if __name__ == '__main__':
    param = [
    (99,),
    (62,),
    (87,),
    (87,),
    (61,),
    (88,),
    (73,),
    (62,),
    (98,),
    (57,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))