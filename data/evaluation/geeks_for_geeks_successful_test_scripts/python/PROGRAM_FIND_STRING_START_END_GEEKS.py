# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str , corner ) :
    n = len ( str )
    cl = len ( corner )
    if ( n < cl ) :
        return False
    return ( ( str [ : cl ] == corner ) and ( str [ n - cl : ] == corner ) )


#TOFILL

if __name__ == '__main__':
    param = [
    ('geeksmanishgeeks','geeks',),
    ('shreyadhatwalia','abc',),
    ('10000100','100',),
    ('abaa','a',),
    ('30645530','30',),
    ('0000011011001','001',),
    ('dkqEd','d',),
    ('48694119324654','654',),
    ('1101010010','11',),
    ('Ks','KsFLmngGGOmHKs',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))