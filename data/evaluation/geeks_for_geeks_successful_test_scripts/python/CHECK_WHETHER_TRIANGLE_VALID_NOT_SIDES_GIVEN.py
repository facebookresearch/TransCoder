# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , c ) :
    if ( a + b <= c ) or ( a + c <= b ) or ( b + c <= a ) :
        return False
    else :
        return True


#TOFILL

if __name__ == '__main__':
    param = [
    (29,19,52,),
    (83,34,49,),
    (48,14,65,),
    (59,12,94,),
    (56,39,22,),
    (68,85,9,),
    (63,36,41,),
    (95,34,37,),
    (2,90,27,),
    (11,16,1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))