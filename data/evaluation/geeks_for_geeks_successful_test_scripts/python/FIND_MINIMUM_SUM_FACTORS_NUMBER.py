# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( num ) :
    sum = 0
    i = 2
    while ( i * i <= num ) :
        while ( num % i == 0 ) :
            sum += i
            num /= i
        i += 1
    sum += num
    return sum


#TOFILL

if __name__ == '__main__':
    param = [
    (83,),
    (88,),
    (60,),
    (6,),
    (26,),
    (98,),
    (38,),
    (90,),
    (76,),
    (66,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))