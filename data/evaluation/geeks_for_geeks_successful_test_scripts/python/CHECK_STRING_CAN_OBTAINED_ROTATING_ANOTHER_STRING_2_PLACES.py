# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str1 , str2 ) :
    if ( len ( str1 ) != len ( str2 ) ) :
        return False
    clock_rot = ""
    anticlock_rot = ""
    l = len ( str2 )
    anticlock_rot = ( anticlock_rot + str2 [ l - 2 : ] + str2 [ 0 : l - 2 ] )
    clock_rot = clock_rot + str2 [ 2 : ] + str2 [ 0 : 2 ]
    return ( str1 == clock_rot or str1 == anticlock_rot )


#TOFILL

if __name__ == '__main__':
    param = [
    ("amazon","azonam",),
    ("onamaz","amazon",),
    ("amazon","azoman",),
    ("ab","ab",),
    ('737009','239119',),
    ('000110','01111',),
    ('l','YVo hqvnGxow',),
    ('4420318628','52856',),
    ('11011111000000','10',),
    (' pvFHANc','xBIDFbiGb',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))