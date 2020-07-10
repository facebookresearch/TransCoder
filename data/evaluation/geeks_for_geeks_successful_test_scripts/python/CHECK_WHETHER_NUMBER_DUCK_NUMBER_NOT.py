# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    l = len ( num )
    count_zero = 0
    i = 1
    while i < l :
        ch = num [ i ]
        if ( ch == "0" ) :
            count_zero = count_zero + 1
        i = i + 1
    return count_zero


#TOFILL

if __name__ == '__main__':
    param = [
    ('HLlQWSphZcIC',),
    ('080287724',),
    ('0000100000',),
    (' Q',),
    ('4247040983',),
    ('00001011101',),
    ('LbNsnYTHmLbCf',),
    ('24',),
    ('110',),
    ('ie',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))