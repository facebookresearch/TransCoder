# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , k ) :
    c1 = ( b - a ) - 1
    c2 = ( k - b ) + ( a - 1 )
    if ( c1 == c2 ) :
        return 0
    return min ( c1 , c2 )


#TOFILL

if __name__ == '__main__':
    param = [
    (83,98,86,),
    (3,39,87,),
    (11,96,30,),
    (50,67,48,),
    (40,16,32,),
    (62,86,76,),
    (40,78,71,),
    (66,11,74,),
    (6,9,19,),
    (25,5,5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))