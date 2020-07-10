# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( bin ) :
    n = len ( bin )
    if ( bin [ n - 1 ] == '1' ) :
        return False
    sum = 0
    i = n - 2
    while i >= 0 :
        if ( bin [ i ] == '1' ) :
            posFromRight = n - i - 1
            if ( posFromRight % 4 == 1 ) :
                sum = sum + 2
            elif ( posFromRight % 4 == 2 ) :
                sum = sum + 4
            elif ( posFromRight % 4 == 3 ) :
                sum = sum + 8
            elif ( posFromRight % 4 == 0 ) :
                sum = sum + 6
        i = i - 1
    if ( sum % 10 == 0 ) :
        return True
    return False


#TOFILL

if __name__ == '__main__':
    param = [
    ('101000',),
    ('39613456759141',),
    ('11',),
    ('PoiHjo',),
    ('2',),
    ('0000101',),
    ('T  s dZKeDX gK',),
    ('3944713969',),
    ('1000',),
    ('ifYUgdpmt',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))