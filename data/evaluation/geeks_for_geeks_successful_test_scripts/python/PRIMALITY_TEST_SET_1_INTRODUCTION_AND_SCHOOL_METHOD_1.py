# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if ( n <= 1 ) :
        return False
    if ( n <= 3 ) :
        return True
    if ( n % 2 == 0 or n % 3 == 0 ) :
        return False
    i = 5
    while ( i * i <= n ) :
        if ( n % i == 0 or n % ( i + 2 ) == 0 ) :
            return False
        i = i + 6
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    (15,),
    (90,),
    (38,),
    (65,),
    (91,),
    (16,),
    (48,),
    (74,),
    (14,),
    (47,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))