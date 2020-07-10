# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    if ( len ( s ) == 0 ) :
        print ( 0 )
    ans = 0
    o = 0
    c = 0
    for i in range ( len ( s ) ) :
        if ( s [ i ] == '(' ) :
            o += 1
        if ( s [ i ] == ')' ) :
            c += 1
    if ( o != c ) :
        return - 1
    a = [ 0 for i in range ( len ( s ) ) ]
    if ( s [ 0 ] == '(' ) :
        a [ 0 ] = 1
    else :
        a [ 0 ] = - 1
    if ( a [ 0 ] < 0 ) :
        ans += abs ( a [ 0 ] )
    for i in range ( 1 , len ( s ) ) :
        if ( s [ i ] == '(' ) :
            a [ i ] = a [ i - 1 ] + 1
        else :
            a [ i ] = a [ i - 1 ] - 1
        if ( a [ i ] < 0 ) :
            ans += abs ( a [ i ] )
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ('()',),
    ('))((',),
    ('())',),
    ('(()',),
    ('(()()())',),
    ('))())(()(())',),
    ('))(())((',),
    ('49',),
    ('00001111',),
    ('KDahByG ',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))