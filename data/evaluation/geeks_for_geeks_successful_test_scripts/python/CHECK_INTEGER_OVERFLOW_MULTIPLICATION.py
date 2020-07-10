# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    if ( a == 0 or b == 0 ) :
        return False
    result = a * b
    if ( result >= 9223372036854775807 or result <= - 9223372036854775808 ) :
        result = 0
    if ( a == ( result // b ) ) :
        print ( result // b )
        return False
    else :
        return True


#TOFILL

if __name__ == '__main__':
    param = [
    (37,80,),
    (10000000000,-10000000000,),
    (10000000000,10000000000,),
    (999999999,999999999,),
    (39,36,),
    (92,56,),
    (14,21,),
    (19,38,),
    (14,82,),
    (88,41,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))