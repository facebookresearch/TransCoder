# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( seq ) :
    n = len ( seq )
    if ( n >= 9 ) :
        return "-1"
    result = [ None ] * ( n + 1 )
    count = 1
    for i in range ( n + 1 ) :
        if ( i == n or seq [ i ] == 'I' ) :
            for j in range ( i - 1 , - 2 , - 1 ) :
                result [ j + 1 ] = int ( '0' + str ( count ) )
                count += 1
                if ( j >= 0 and seq [ j ] == 'I' ) :
                    break
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ('D',),
    ('I',),
    ('DD',),
    ('II',),
    ('DIDI',),
    ('IIDDD',),
    ('DDIDDIID',),
    ('176297',),
    ('1',),
    ('XHkhZq',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))