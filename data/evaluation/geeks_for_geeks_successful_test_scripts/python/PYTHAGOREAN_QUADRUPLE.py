# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , c , d ) :
    sum = a * a + b * b + c * c ;
    if ( d * d == sum ) :
        return True
    else :
        return False


#TOFILL

if __name__ == '__main__':
    param = [
    (1,1,1,3,),
    (3,2,5,38,),
    (0,0,0,0,),
    (-1,-1,-1,1,),
    (82,79,6,59,),
    (14,57,35,29,),
    (6,96,45,75,),
    (13,7,3,63,),
    (96,65,72,93,),
    (70,33,6,2,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))
