# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x1 , y1 , x2 , y2 ) :
    return ( x1 * ( y2 - y1 ) == y1 * ( x2 - x1 ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (1,28,2,56,),
    (10,0,20,0,),
    (0,1,0,17,),
    (1,1,10,10,),
    (82,86,19,4,),
    (78,86,11,6,),
    (13,46,33,33,),
    (18,29,95,12,),
    (42,35,25,36,),
    (29,17,45,35,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))