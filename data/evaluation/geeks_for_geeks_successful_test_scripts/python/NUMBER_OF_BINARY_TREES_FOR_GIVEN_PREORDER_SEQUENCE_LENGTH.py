# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    BT = [ 0 ] * ( n + 1 )
    BT [ 0 ] = BT [ 1 ] = 1
    for i in range ( 2 , n + 1 ) :
        for j in range ( i ) :
            BT [ i ] += BT [ j ] * BT [ i - j - 1 ]
    return BT [ n ]


#TOFILL

if __name__ == '__main__':
    param = [
    (87,),
    (69,),
    (15,),
    (11,),
    (11,),
    (15,),
    (47,),
    (65,),
    (50,),
    (58,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))