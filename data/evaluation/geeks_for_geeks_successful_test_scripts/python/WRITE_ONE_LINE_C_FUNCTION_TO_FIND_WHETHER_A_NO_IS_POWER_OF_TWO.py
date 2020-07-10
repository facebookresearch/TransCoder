# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n == 0 ) :
        return False
    while ( n != 1 ) :
        if ( n % 2 != 0 ) :
            return False
        n = n // 2
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    (1,),
    (2,),
    (8,),
    (1024,),
    (24,),
    (7,),
    (46,),
    (61,),
    (73,),
    (66,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))