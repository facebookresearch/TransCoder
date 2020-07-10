# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    return ( a // 2 ) + ( b // 2 ) + ( ( a % 2 + b % 2 ) // 2 )


#TOFILL

if __name__ == '__main__':
    param = [
    (9,81,),
    (68,79,),
    (51,2,),
    (31,49,),
    (14,10,),
    (73,9,),
    (51,13,),
    (75,67,),
    (98,51,),
    (83,74,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))