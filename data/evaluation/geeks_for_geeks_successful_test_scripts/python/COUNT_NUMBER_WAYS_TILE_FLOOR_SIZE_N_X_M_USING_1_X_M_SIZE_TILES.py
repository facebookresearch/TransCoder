# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , m ) :
    count = [ ]
    for i in range ( n + 2 ) :
        count.append ( 0 )
    count [ 0 ] = 0
    for i in range ( 1 , n + 1 ) :
        if ( i > m ) :
            count [ i ] = count [ i - 1 ] + count [ i - m ]
        elif ( i < m ) :
            count [ i ] = 1
        else :
            count [ i ] = 2
    return count [ n ]


#TOFILL

if __name__ == '__main__':
    param = [
    (93,54,),
    (17,4,),
    (38,39,),
    (33,64,),
    (78,35,),
    (40,61,),
    (95,6,),
    (12,8,),
    (69,60,),
    (78,21,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))