# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s1 , s2 ) :
    n = len ( s1 )
    m = len ( s2 )
    dp = ( [ [ False for i in range ( m + 1 ) ] for i in range ( n + 1 ) ] )
    dp [ 0 ] [ 0 ] = True
    for i in range ( len ( s1 ) ) :
        for j in range ( len ( s2 ) + 1 ) :
            if ( dp [ i ] [ j ] ) :
                if ( ( j < len ( s2 ) and ( s1 [ i ].upper ( ) == s2 [ j ] ) ) ) :
                    dp [ i + 1 ] [ j + 1 ] = True
                if ( s1 [ i ].isupper ( ) == False ) :
                    dp [ i + 1 ] [ j ] = True
    return ( dp [ n ] [ m ] )


#TOFILL

if __name__ == '__main__':
    param = [
    ('daBcd','ABC',),
    ('417514','9',),
    ('010000','1111011010',),
    ('ZcKYguiMrdyn','iz',),
    ('argaju','RAJ',),
    ('1110101101','110101001',),
    ('ySOCoSaygi','aRhxkYqh',),
    ('204','6986871066',),
    ('10011100000010','0',),
    ('nMAioozPmY','WZFdDKw',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))