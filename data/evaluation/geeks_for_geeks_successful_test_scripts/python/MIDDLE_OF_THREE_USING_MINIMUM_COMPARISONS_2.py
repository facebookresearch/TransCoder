# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , c ) :
    x = a - b
    y = b - c
    z = a - c
    if x * y > 0 :
        return b
    elif ( x * z > 0 ) :
        return
    else :
        return a


#TOFILL

if __name__ == '__main__':
    param = [
    (48,46,38,),
    (21,7,16,),
    (71,4,31,),
    (93,34,11,),
    (3,61,32,),
    (58,78,6,),
    (88,41,66,),
    (8,84,38,),
    (17,66,27,),
    (13,3,23,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))