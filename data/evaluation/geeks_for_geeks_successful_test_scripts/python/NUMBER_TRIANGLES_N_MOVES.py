# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    answer = [ None ] * ( n + 1 ) ;
    answer [ 0 ] = 1 ;
    i = 1
    while i <= n :
        answer [ i ] = answer [ i - 1 ] * 3 + 2 ;
        i = i + 1
    return answer [ n ] ;


#TOFILL

if __name__ == '__main__':
    param = [
    (33,),
    (72,),
    (81,),
    (93,),
    (8,),
    (76,),
    (97,),
    (91,),
    (61,),
    (6,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))