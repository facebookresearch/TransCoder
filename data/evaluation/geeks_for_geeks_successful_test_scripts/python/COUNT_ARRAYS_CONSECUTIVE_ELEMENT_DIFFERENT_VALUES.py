# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k , x ) :
    dp = list ( )
    dp.append ( 0 )
    dp.append ( 1 )
    i = 2
    while i < n :
        dp.append ( ( k - 2 ) * dp [ i - 1 ] + ( k - 1 ) * dp [ i - 2 ] )
        i = i + 1
    return ( ( k - 1 ) * dp [ n - 2 ] if x == 1 else dp [ n - 1 ] )


#TOFILL

if __name__ == '__main__':
    param = [
    (9,40,38,),
    (97,47,30,),
    (16,28,13,),
    (16,82,70,),
    (6,81,29,),
    (58,10,55,),
    (6,47,20,),
    (22,4,64,),
    (51,46,66,),
    (58,25,53,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))