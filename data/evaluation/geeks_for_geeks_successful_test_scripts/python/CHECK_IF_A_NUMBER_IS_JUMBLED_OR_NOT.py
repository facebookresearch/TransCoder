# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    if ( num // 10 == 0 ) :
        return True
    while ( num != 0 ) :
        if ( num // 10 == 0 ) :
            return True
        digit1 = num % 10
        digit2 = ( num // 10 ) % 10
        if ( abs ( digit2 - digit1 ) > 1 ) :
            return False
        num = num // 10
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    (67,),
    (77,),
    (35,),
    (79,),
    (45,),
    (22,),
    (68,),
    (17,),
    (5,),
    (85,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))