# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( n ) :
    if ( n < 10 ) :
        return ( n * ( n + 1 ) / 2 )
    d = ( int ) ( math.log10 ( n ) )
    a = [ 0 ] * ( d + 1 )
    a [ 0 ] = 0
    a [ 1 ] = 45
    for i in range ( 2 , d + 1 ) :
        a [ i ] = a [ i - 1 ] * 10 + 45 * ( int ) ( math.ceil ( math.pow ( 10 , i - 1 ) ) )
    p = ( int ) ( math.ceil ( math.pow ( 10 , d ) ) )
    msd = n // p
    return ( int ) ( msd * a [ d ] + ( msd * ( msd - 1 ) // 2 ) * p + msd * ( 1 + n % p ) + f_gold ( n % p ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (29,),
    (97,),
    (71,),
    (82,),
    (69,),
    (30,),
    (82,),
    (32,),
    (77,),
    (39,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))