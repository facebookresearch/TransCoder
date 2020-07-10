# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( N ) :
    if ( N == 1 ) :
        return 4
    countB = 1
    countS = 1
    for i in range ( 2 , N + 1 ) :
        prev_countB = countB
        prev_countS = countS
        countS = prev_countB + prev_countS
        countB = prev_countS
    result = countS + countB
    return ( result * result )


#TOFILL

if __name__ == '__main__':
    param = [
    (17,),
    (66,),
    (53,),
    (97,),
    (34,),
    (54,),
    (9,),
    (99,),
    (59,),
    (87,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))