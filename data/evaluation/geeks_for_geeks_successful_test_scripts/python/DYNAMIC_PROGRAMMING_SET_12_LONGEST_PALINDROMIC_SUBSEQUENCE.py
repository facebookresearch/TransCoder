# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    n = len ( str )
    L = [ [ 0 for x in range ( n ) ] for x in range ( n ) ]
    for i in range ( n ) :
        L [ i ] [ i ] = 1
    for cl in range ( 2 , n + 1 ) :
        for i in range ( n - cl + 1 ) :
            j = i + cl - 1
            if str [ i ] == str [ j ] and cl == 2 :
                L [ i ] [ j ] = 2
            elif str [ i ] == str [ j ] :
                L [ i ] [ j ] = L [ i + 1 ] [ j - 1 ] + 2
            else :
                L [ i ] [ j ] = max ( L [ i ] [ j - 1 ] , L [ i + 1 ] [ j ] ) ;
    return L [ 0 ] [ n - 1 ]


#TOFILL

if __name__ == '__main__':
    param = [
    ('IVQPwMhUYLDTcO',),
    ('2568689919714',),
    ('0110011',),
    ('CSUPHnJs',),
    ('67978022339633',),
    ('0110011101',),
    ('RgR',),
    ('62249378',),
    ('000110110',),
    ('IRcBQAUdiyKrz',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))