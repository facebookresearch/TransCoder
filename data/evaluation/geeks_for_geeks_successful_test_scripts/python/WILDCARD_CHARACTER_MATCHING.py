# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( first , second ) :
    if len ( first ) == 0 and len ( second ) == 0 :
        return True
    if len ( first ) > 1 and first [ 0 ] == '*' and len ( second ) == 0 :
        return False
    if ( len ( first ) > 1 and first [ 0 ] == '?' ) or ( len ( first ) != 0 and len ( second ) != 0 and first [ 0 ] == second [ 0 ] ) :
        return f_gold ( first [ 1 : ] , second [ 1 : ] ) ;
    if len ( first ) != 0 and first [ 0 ] == '*' :
        return f_gold ( first [ 1 : ] , second ) or f_gold ( first , second [ 1 : ] )
    return False


#TOFILL

if __name__ == '__main__':
    param = [
    ('g*ks','geeks',),
    ('ge?ks*','geeksforgeeks',),
    ('g*k','gee',),
    ('*pqrs','pqrst',),
    ('abc*bcd','abcdhghgbcd',),
    ('abc*c?d','abcd',),
    ('*c*d','abcd',),
    ('*?c*d','abcd',),
    ('?*1','010111111001',),
    ('a*','CBzHMjUGCUJD',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))