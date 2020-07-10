# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    dp = [ ] ;
    dp.append ( 1 ) ;
    dp.append ( 1 ) ;
    for i in range ( 2 , n + 1 ) :
        dp.append ( dp [ i - 1 ] + dp [ i - 2 ] + 1 ) ;
    return dp [ n ] ;


#TOFILL

if __name__ == '__main__':
    param = [
    (75,),
    (76,),
    (55,),
    (14,),
    (43,),
    (10,),
    (16,),
    (30,),
    (44,),
    (65,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))