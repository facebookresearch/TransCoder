# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    res = 0 ;
    count = 0 ;
    count += 1 ;
    if ( count == 1 ) :
        res = x ;
    else :
        i = random.randrange ( count ) ;
        if ( i == count - 1 ) :
            res = x ;
    return res ;


#TOFILL

if __name__ == '__main__':
    param = [
    (64,),
    (36,),
    (21,),
    (3,),
    (18,),
    (82,),
    (76,),
    (99,),
    (70,),
    (31,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))