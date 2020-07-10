# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str1 ) :
    result = 0 ;
    n = len ( str1 )
    for i in range ( 0 , n ) :
        for j in range ( i + 1 , n ) :
            if ( abs ( ord ( str1 [ i ] ) - ord ( str1 [ j ] ) ) == abs ( i - j ) ) :
                result += 1 ;
    return result ;


#TOFILL

if __name__ == '__main__':
    param = [
    ('smnKL',),
    ('270083',),
    ('0',),
    ('kcZdsz',),
    ('483544224',),
    ('000011',),
    ('WysGCirMwKBzP',),
    ('3366',),
    ('110',),
    ('NlaMkpCjUgg',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))