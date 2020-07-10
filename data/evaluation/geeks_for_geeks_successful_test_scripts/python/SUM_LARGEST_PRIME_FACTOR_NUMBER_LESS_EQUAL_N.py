# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    prime = [ 0 ] * ( n + 1 )
    sum = 0
    max = int ( n / 2 )
    for p in range ( 2 , max + 1 ) :
        if prime [ p ] == 0 :
            for i in range ( p * 2 , n + 1 , p ) :
                prime [ i ] = p
    for p in range ( 2 , n + 1 ) :
        if prime [ p ] :
            sum += prime [ p ]
        else :
            sum += p
    return sum


#TOFILL

if __name__ == '__main__':
    param = [
    (6,),
    (35,),
    (87,),
    (91,),
    (63,),
    (11,),
    (66,),
    (17,),
    (92,),
    (81,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))