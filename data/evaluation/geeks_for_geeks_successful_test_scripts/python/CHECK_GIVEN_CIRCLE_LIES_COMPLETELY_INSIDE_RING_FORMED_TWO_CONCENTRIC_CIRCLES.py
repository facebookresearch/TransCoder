# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( r , R , r1 , x1 , y1 ) :
    dis = int ( math.sqrt ( x1 * x1 + y1 * y1 ) )
    return ( dis - r1 >= R and dis + r1 <= r )


#TOFILL

if __name__ == '__main__':
    param = [
    (8,4,2,6,0,),
    (400,1,10,74,38,),
    (1,400,10,74,38,),
    (61,40,2,50,0,),
    (60,49,68,77,71,),
    (88,10,69,71,26,),
    (60,79,92,29,38,),
    (26,88,75,84,10,),
    (33,65,57,21,61,),
    (70,57,77,52,87,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))