# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str ) :
    result = ""
    v = True
    for i in range ( len ( str ) ) :
        if ( str [ i ] == ' ' ) :
            v = True
        elif ( str [ i ] != ' ' and v == True ) :
            result += ( str [ i ] )
            v = False
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ('t a',),
    ('77 78 2 600 7',),
    ('011 10 10',),
    ('kV Co O iR',),
    ('2',),
    ('0 11',),
    ('Y sT wgheC',),
    ('58 824 6',),
    ('00 100 001 0111',),
    ('Q',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))