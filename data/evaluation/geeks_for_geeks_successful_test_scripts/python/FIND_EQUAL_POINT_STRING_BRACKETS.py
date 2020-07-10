# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    l = len ( str )
    open = [ None ] * ( l + 1 )
    close = [ None ] * ( l + 1 )
    index = - 1
    open [ 0 ] = 0
    close [ l ] = 0
    if ( str [ 0 ] == '(' ) :
        open [ 1 ] = 1
    if ( str [ l - 1 ] == ')' ) :
        close [ l - 1 ] = 1
    for i in range ( 1 , l ) :
        if ( str [ i ] == '(' ) :
            open [ i + 1 ] = open [ i ] + 1
        else :
            open [ i + 1 ] = open [ i ]
    for i in range ( l - 2 , - 1 , - 1 ) :
        if ( str [ i ] == ')' ) :
            close [ i ] = close [ i + 1 ] + 1
        else :
            close [ i ] = close [ i + 1 ]
    if ( open [ l ] == 0 ) :
        return len
    if ( close [ 0 ] == 0 ) :
        return 0
    for i in range ( l + 1 ) :
        if ( open [ i ] == close [ i ] ) :
            index = i
    return index


#TOFILL

if __name__ == '__main__':
    param = [
    ("(())))(",),
    ("))",),
    ("((",),
    ("))(()(()()(",),
    (")((()(()",),
    ("))(()",),
    ("()))",),
    ("()",),
    ('1100110',),
    ('dhfSnebD',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))