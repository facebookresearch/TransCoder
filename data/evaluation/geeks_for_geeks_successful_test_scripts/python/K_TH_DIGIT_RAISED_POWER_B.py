# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b , k ) :
    p = a ** b
    count = 0
    while ( p > 0 and count < k ) :
        rem = p % 10
        count = count + 1
        if ( count == k ) :
            return rem
        p = p / 10 ;


#TOFILL

if __name__ == '__main__':
    param = [
    (11,2,1),
    (41,3,3),
    (5,4,3),
    (1,2,4),
    (24,1,5),
    (5,2,3),
    (66,5,8),
    (7,10,3),
    (77,30,10),
    (60,50,1)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))
