# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num , divisor ) :
    while ( num >= divisor ) :
        num -= divisor ;
    return num ;


#TOFILL

if __name__ == '__main__':
    param = [
    (70,13,),
    (77,3,),
    (77,73,),
    (88,54,),
    (96,39,),
    (6,10,),
    (79,95,),
    (44,32,),
    (26,86,),
    (82,91,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))