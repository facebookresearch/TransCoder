# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    N = len ( str )
    cps = [ [ 0 for i in range ( N + 2 ) ] for j in range ( N + 2 ) ]
    for i in range ( N ) :
        cps [ i ] [ i ] = 1
    for L in range ( 2 , N + 1 ) :
        for i in range ( N ) :
            k = L + i - 1
            if ( k < N ) :
                if ( str [ i ] == str [ k ] ) :
                    cps [ i ] [ k ] = ( cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] + 1 )
                else :
                    cps [ i ] [ k ] = ( cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] - cps [ i + 1 ] [ k - 1 ] )
    return cps [ 0 ] [ N - 1 ]


#TOFILL

if __name__ == '__main__':
    param = [
    ('R',),
    ('2956350',),
    ('11100111110101',),
    ('TZTDLIIfAD',),
    ('98',),
    ('1100100001',),
    ('oKwGeatf',),
    ('19',),
    ('00010110100',),
    ('Cyq',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))