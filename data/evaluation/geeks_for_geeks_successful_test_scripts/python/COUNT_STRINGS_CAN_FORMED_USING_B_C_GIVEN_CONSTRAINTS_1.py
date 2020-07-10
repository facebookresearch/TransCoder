# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( 1 + ( n * 2 ) + ( n * ( ( n * n ) - 1 ) // 2 ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (55,),
    (36,),
    (69,),
    (92,),
    (73,),
    (16,),
    (88,),
    (19,),
    (66,),
    (68,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))