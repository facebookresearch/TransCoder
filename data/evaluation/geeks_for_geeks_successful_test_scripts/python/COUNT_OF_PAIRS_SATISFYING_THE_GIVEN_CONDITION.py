# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    s = str ( b )
    i = 0
    while i < ( len ( s ) ) :
        if ( s [ i ] != '9' ) :
            break
        i += 1
    result = 0
    if ( i == len ( s ) ) :
        result = a * len ( s )
    else :
        result = a * ( len ( s ) - 1 )
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    (31,91,),
    (72,85,),
    (23,49,),
    (42,32,),
    (13,7,),
    (93,5,),
    (33,32,),
    (94,76,),
    (60,60,),
    (11,26,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))