# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str1 , str2 ) :
    if ( len ( str1 ) > len ( str2 ) ) :
        t = str1 ;
        str1 = str2 ;
        str2 = t ;
    str = "" ;
    n1 = len ( str1 ) ;
    n2 = len ( str2 ) ;
    str1 = str1 [ : : - 1 ] ;
    str2 = str2 [ : : - 1 ] ;
    carry = 0 ;
    for i in range ( n1 ) :
        sum = ( ( ord ( str1 [ i ] ) - 48 ) + ( ( ord ( str2 [ i ] ) - 48 ) + carry ) ) ;
        str += chr ( sum % 10 + 48 ) ;
        carry = int ( sum / 10 ) ;
    for i in range ( n1 , n2 ) :
        sum = ( ( ord ( str2 [ i ] ) - 48 ) + carry ) ;
        str += chr ( sum % 10 + 48 ) ;
        carry = ( int ) ( sum / 10 ) ;
    if ( carry ) :
        str += chr ( carry + 48 ) ;
    str = str [ : : - 1 ] ;
    return str ;


#TOFILL

if __name__ == '__main__':
    param = [
    ('VkfzrPG','rKZ',),
    ('0526110506447','903',),
    ('011010010','110100000',),
    ('sPAwZACc ','liYMsojPiinOV',),
    ('3','611',),
    ('0101','01110101011',),
    ('VTtNu','Wsmc',),
    ('2317170','898421173423',),
    ('111111000010','01100001110111',),
    ('Ktt','CTbbVX wGBkE',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))