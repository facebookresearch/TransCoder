# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s , t ) :
    count = 0
    for i in range ( 0 , len ( t ) ) :
        if ( count == len ( s ) ) :
            break
        if ( t [ i ] == s [ count ] ) :
            count = count + 1
    return count


#TOFILL

if __name__ == '__main__':
    param = [
    ('nObYIOjEQZ','uARTDTQbmGI',),
    ('84574','8538229',),
    ('1010001010010','11',),
    ('DjZtAfUudk','OewGm',),
    ('550','132744553919',),
    ('1110','0101',),
    ('GywyxwH','LPQqEqrDZiwY',),
    ('67318370914755','9928',),
    ('11011000000101','00000',),
    ('G','V',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))