# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num1 , num2 ) :
    len1 = len ( num1 )
    len2 = len ( num2 )
    if len1 == 0 or len2 == 0 :
        return "0"
    result = [ 0 ] * ( len1 + len2 )
    i_n1 = 0
    i_n2 = 0
    for i in range ( len1 - 1 , - 1 , - 1 ) :
        carry = 0
        n1 = ord ( num1 [ i ] ) - 48
        i_n2 = 0
        for j in range ( len2 - 1 , - 1 , - 1 ) :
            n2 = ord ( num2 [ j ] ) - 48
            summ = n1 * n2 + result [ i_n1 + i_n2 ] + carry
            carry = summ // 10
            result [ i_n1 + i_n2 ] = summ % 10
            i_n2 += 1
        if ( carry > 0 ) :
            result [ i_n1 + i_n2 ] += carry
        i_n1 += 1
    i = len ( result ) - 1
    while ( i >= 0 and result [ i ] == 0 ) :
        i -= 1
    if ( i == - 1 ) :
        return "0"
    s = ""
    while ( i >= 0 ) :
        s += chr ( result [ i ] + 48 )
        i -= 1
    return s


#TOFILL

if __name__ == '__main__':
    param = [
    ('OaITtzE','RnYlJUqzk',),
    ('88111031','558471',),
    ('1100111','11111110111101',),
    ('eiWPbMrFx','tBAJaI',),
    ('43701248','4027',),
    ('100001111110','11',),
    ('jVgOapMp','Xm',),
    ('68337672','56939',),
    ('00110101','1',),
    ('JqSh','iAfjQRwuVyost',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))