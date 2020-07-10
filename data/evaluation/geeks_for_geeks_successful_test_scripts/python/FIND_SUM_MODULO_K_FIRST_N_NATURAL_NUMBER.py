# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( N , K ) :
    ans = 0 ;
    for i in range ( 1 , N + 1 ) :
        ans += ( i % K ) ;
    return ans ;


#TOFILL

if __name__ == '__main__':
    param = [
    (11,5,),
    (36,69,),
    (71,28,),
    (74,1,),
    (66,84,),
    (38,14,),
    (2,11,),
    (73,87,),
    (79,11,),
    (30,55,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))