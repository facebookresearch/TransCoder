# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    dp = [ [ 0 for x in range ( 10 ) ] for y in range ( n + 1 ) ] ;
    if ( n == 1 ) :
        return 10 ;
    for j in range ( 10 ) :
        dp [ 1 ] [ j ] = 1 ;
    for i in range ( 2 , n + 1 ) :
        for j in range ( 10 ) :
            if ( j == 0 ) :
                dp [ i ] [ j ] = dp [ i - 1 ] [ j + 1 ] ;
            elif ( j == 9 ) :
                dp [ i ] [ j ] = dp [ i - 1 ] [ j - 1 ] ;
            else :
                dp [ i ] [ j ] = ( dp [ i - 1 ] [ j - 1 ] + dp [ i - 1 ] [ j + 1 ] ) ;
    sum = 0 ;
    for j in range ( 1 , 10 ) :
        sum = sum + dp [ n ] [ j ] ;
    return sum ;


#TOFILL

if __name__ == '__main__':
    param = [
    (18,),
    (66,),
    (73,),
    (70,),
    (26,),
    (41,),
    (20,),
    (25,),
    (52,),
    (13,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))