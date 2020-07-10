# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    n = len ( str )
    LCSRe = [ [ 0 for x in range ( n + 1 ) ] for y in range ( n + 1 ) ]
    res = ""
    res_length = 0
    index = 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( i + 1 , n + 1 ) :
            if ( str [ i - 1 ] == str [ j - 1 ] and LCSRe [ i - 1 ] [ j - 1 ] < ( j - i ) ) :
                LCSRe [ i ] [ j ] = LCSRe [ i - 1 ] [ j - 1 ] + 1
                if ( LCSRe [ i ] [ j ] > res_length ) :
                    res_length = LCSRe [ i ] [ j ]
                    index = max ( i , index )
            else :
                LCSRe [ i ] [ j ] = 0
    if ( res_length > 0 ) :
        for i in range ( index - res_length + 1 , index + 1 ) :
            res = res + str [ i - 1 ]
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    ('fbfHTjE',),
    ('09285256323',),
    ('0011000101110',),
    ('ue JkVZTt',),
    ('48387612426300',),
    ('010',),
    ('ddRrUz',),
    ('1049162633793',),
    ('100011',),
    ('iJfadiVaQqv',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))