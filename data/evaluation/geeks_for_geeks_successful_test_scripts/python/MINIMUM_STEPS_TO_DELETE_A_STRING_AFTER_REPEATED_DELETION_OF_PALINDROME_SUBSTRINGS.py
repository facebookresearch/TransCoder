# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    N = len ( str )
    dp = [ [ 0 for x in range ( N + 1 ) ] for y in range ( N + 1 ) ]
    for l in range ( 1 , N + 1 ) :
        i = 0
        j = l - 1
        while j < N :
            if ( l == 1 ) :
                dp [ i ] [ j ] = 1
            else :
                dp [ i ] [ j ] = 1 + dp [ i + 1 ] [ j ]
                if ( str [ i ] == str [ i + 1 ] ) :
                    dp [ i ] [ j ] = min ( 1 + dp [ i + 2 ] [ j ] , dp [ i ] [ j ] )
                for K in range ( i + 2 , j + 1 ) :
                    if ( str [ i ] == str [ K ] ) :
                        dp [ i ] [ j ] = min ( dp [ i + 1 ] [ K - 1 ] + dp [ K + 1 ] [ j ] , dp [ i ] [ j ] )
            i += 1
            j += 1
    return dp [ 0 ] [ N - 1 ]


#TOFILL

if __name__ == '__main__':
    param = [
    ('YCtLQtHLwr',),
    ('47713514383248',),
    ('0100101001111',),
    ('XfdIYVn',),
    ('45499225407',),
    ('000100111001',),
    ('ZoUQhQwoap',),
    ('18579027952',),
    ('00000001111',),
    ('JD',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))