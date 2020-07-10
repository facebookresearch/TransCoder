# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( base ) :
    base = ( base - 2 )
    base = base / 2
    return base * ( base + 1 ) / 2


#TOFILL

if __name__ == '__main__':
    param = [
    (95,),
    (49,),
    (10,),
    (73,),
    (74,),
    (40,),
    (10,),
    (94,),
    (64,),
    (16,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))