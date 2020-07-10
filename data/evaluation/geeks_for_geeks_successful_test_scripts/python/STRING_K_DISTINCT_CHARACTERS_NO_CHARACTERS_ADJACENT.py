# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , k ) :
    res = ""
    for i in range ( k ) :
        res = res + chr ( ord ( 'a' ) + i )
    count = 0
    for i in range ( n - k ) :
        res = res + chr ( ord ( 'a' ) + count )
        count += 1
        if ( count == k ) :
            count = 0 ;
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    (60,71,),
    (56,17,),
    (16,16,),
    (42,60,),
    (55,56,),
    (64,59,),
    (68,24,),
    (88,2,),
    (64,94,),
    (42,79,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))