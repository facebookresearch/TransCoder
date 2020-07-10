# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    num = list ( num )
    n = len ( num )
    rightMin = [ 0 ] * n
    right = 0
    rightMin [ n - 1 ] = - 1 ;
    right = n - 1 ;
    for i in range ( n - 2 , 0 , - 1 ) :
        if num [ i ] > num [ right ] :
            rightMin [ i ] = right
        else :
            rightMin [ i ] = - 1
            right = i
    small = - 1
    for i in range ( 1 , n ) :
        if num [ i ] != '0' :
            if small == - 1 :
                if num [ i ] < num [ 0 ] :
                    small = i
            elif num [ i ] < num [ small ] :
                small = i
    if small != - 1 :
        num [ 0 ] , num [ small ] = num [ small ] , num [ 0 ]
    else :
        for i in range ( 1 , n ) :
            if rightMin [ i ] != - 1 :
                num [ i ] , num [ rightMin [ i ] ] = num [ rightMin [ i ] ] , num [ i ]
                break
    return ''.join ( num )


#TOFILL

if __name__ == '__main__':
    param = [
    ('ncYltuhSxEfG',),
    ('26615541616459',),
    ('0101',),
    ('hK',),
    ('422162103899',),
    ('0010',),
    ('zfcSh',),
    ('92',),
    ('0',),
    ('v',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))