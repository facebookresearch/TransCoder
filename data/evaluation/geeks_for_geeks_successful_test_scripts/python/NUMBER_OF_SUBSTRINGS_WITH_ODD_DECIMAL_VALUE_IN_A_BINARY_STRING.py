# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    n = len ( s )
    auxArr = [ 0 for i in range ( n ) ]
    if ( s [ 0 ] == '1' ) :
        auxArr [ 0 ] = 1
    for i in range ( 0 , n ) :
        if ( s [ i ] == '1' ) :
            auxArr [ i ] = auxArr [ i - 1 ] + 1
        else :
            auxArr [ i ] = auxArr [ i - 1 ]
    count = 0
    for i in range ( n - 1 , - 1 , - 1 ) :
        if ( s [ i ] == '1' ) :
            count += auxArr [ i ]
    return count


#TOFILL

if __name__ == '__main__':
    param = [
    ('OGiOkJF',),
    ('517376',),
    ('11',),
    ('Ze',),
    ('8763644247018',),
    ('00111010001',),
    ('HGwkBKUOVu',),
    ('652',),
    ('101000011110',),
    ('kvdpG ',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))