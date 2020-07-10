# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num1 ) :
    l = len ( num1 ) ;
    num = list ( num1 ) ;
    i = l - 1 ;
    while ( i >= 0 ) :
        if ( num [ i ] == '0' ) :
            num [ i ] = '1' ;
            break ;
        else :
            num [ i ] = '0' ;
        i -= 1 ;
    num1 = ''.join ( num ) ;
    if ( i < 0 ) :
        num1 = '1' + num1 ;
    return num1 ;


#TOFILL

if __name__ == '__main__':
    param = [
    ('DXh',),
    ('48703586411816',),
    ('0001',),
    ('yWg WvjNKS',),
    ('8408568459',),
    ('01',),
    ('DFECZ CWtN',),
    ('37742236',),
    ('001101',),
    ('LDxERLmYn',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))