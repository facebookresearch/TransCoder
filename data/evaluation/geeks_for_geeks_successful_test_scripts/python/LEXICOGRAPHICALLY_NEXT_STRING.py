# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    if ( s == " " ) :
        return "a"
    i = len ( s ) - 1
    while ( s [ i ] == 'z' and i >= 0 ) :
        i -= 1
    if ( i == - 1 ) :
        s = s + 'a'
    else :
        s = s.replace ( s [ i ] , chr ( ord ( s [ i ] ) + 1 ) , 1 )
    return s


#TOFILL

if __name__ == '__main__':
    param = [
    ('amKIRzPiqLTIy',),
    ('68',),
    ('100',),
    ('f',),
    ('802205375',),
    ('0111',),
    ('GRjRYIvYwgua',),
    ('8139910006809',),
    ('100101',),
    ('rw',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))