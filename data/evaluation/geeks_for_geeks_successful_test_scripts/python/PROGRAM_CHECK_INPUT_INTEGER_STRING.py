# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    for i in range ( len ( s ) ) :
        if s [ i ].isdigit ( ) != True :
            return False
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    ('MgTOyHo NT',),
    ('033675175',),
    ('011001',),
    ('XLlccG',),
    ('8223900094410',),
    ('000',),
    ('aupp',),
    ('90202721499',),
    ('110000100011',),
    ('MhYHsMQeLhG',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))