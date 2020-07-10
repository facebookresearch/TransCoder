# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    if ( b == 0 ) :
        return 1
    answer = a
    increment = a
    for i in range ( 1 , b ) :
        for j in range ( 1 , a ) :
            answer += increment
        increment = answer
    return answer


#TOFILL

if __name__ == '__main__':
    param = [
    (66,4,),
    (82,66,),
    (12,38,),
    (55,33,),
    (34,26,),
    (22,23,),
    (13,98,),
    (57,84,),
    (76,94,),
    (76,95,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))