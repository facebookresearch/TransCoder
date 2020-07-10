# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( string ) :
    l = 0
    h = len ( string ) - 1
    while h > l :
        l += 1
        h -= 1
        if string [ l - 1 ] != string [ h + 1 ] :
            return False
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    ('aadaa',),
    ('2674377254',),
    ('11',),
    ('0011000',),
    ('26382426486138',),
    ('111010111010',),
    ('abccba',),
    ('5191',),
    ('1110101101',),
    ('abcdecbe',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))