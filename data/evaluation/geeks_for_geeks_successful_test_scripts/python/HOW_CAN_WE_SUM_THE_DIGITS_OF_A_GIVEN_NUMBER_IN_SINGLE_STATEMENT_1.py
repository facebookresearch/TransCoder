# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    sum = 0
    while ( n > 0 ) :
        sum += int ( n % 10 )
        n = int ( n / 10 )
    return sum


#TOFILL

if __name__ == '__main__':
    param = [
    (50,),
    (92,),
    (49,),
    (94,),
    (7,),
    (30,),
    (88,),
    (98,),
    (94,),
    (23,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))