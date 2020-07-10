# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x1 , y1 , x2 , y2 , r1 , r2 ) :
    distSq = ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) ;
    radSumSq = ( r1 + r2 ) * ( r1 + r2 ) ;
    if ( distSq == radSumSq ) :
        return 1
    elif ( distSq > radSumSq ) :
        return - 1
    else :
        return 0


#TOFILL

if __name__ == '__main__':
    param = [
    (11,36,62,64,50,4,),
    (87,1,62,64,54,41,),
    (51,1,47,90,14,71,),
    (89,67,9,52,94,21,),
    (64,10,79,45,67,78,),
    (57,86,99,43,83,63,),
    (65,90,42,82,77,32,),
    (32,23,28,26,60,45,),
    (73,61,63,77,92,76,),
    (3,99,6,19,21,28,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))