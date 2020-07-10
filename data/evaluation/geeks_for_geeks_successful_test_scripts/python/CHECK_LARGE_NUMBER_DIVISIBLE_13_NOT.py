# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    length = len ( num )
    if ( length == 1 and num [ 0 ] == '0' ) :
        return True
    if ( length % 3 == 1 ) :
        num = str ( num ) + "00"
        length += 2
    elif ( length % 3 == 2 ) :
        num = str ( num ) + "0"
        length += 1
    sum = 0
    p = 1
    for i in range ( length - 1 , - 1 , - 1 ) :
        group = 0
        group += ord ( num [ i ] ) - ord ( '0' )
        i -= 1
        group += ( ord ( num [ i ] ) - ord ( '0' ) ) * 10
        i -= 1
        group += ( ord ( num [ i ] ) - ord ( '0' ) ) * 100
        sum = sum + group * p
        p *= ( - 1 )
    sum = abs ( sum )
    return ( sum % 13 == 0 )


#TOFILL

if __name__ == '__main__':
    param = [
    ('vzTUaItpCpLnjY',),
    ('33855',),
    ('0011110101011',),
    ('MMQ',),
    ('439340517954',),
    ('000000000',),
    ('UugAuRRJbjEgl',),
    ('6406553695441',),
    ('011001',),
    ('yjFqEEvgiNjEX',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))