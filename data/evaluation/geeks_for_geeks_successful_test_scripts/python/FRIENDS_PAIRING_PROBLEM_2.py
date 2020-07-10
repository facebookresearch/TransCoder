# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    a , b , c = 1 , 2 , 0 ;
    if ( n <= 2 ) :
        return n ;
    for i in range ( 3 , n + 1 ) :
        c = b + ( i - 1 ) * a ;
        a = b ;
        b = c ;
    return c ;


#TOFILL

if __name__ == '__main__':
    param = [
    (24,),
    (1,),
    (91,),
    (90,),
    (89,),
    (29,),
    (3,),
    (60,),
    (75,),
    (14,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))