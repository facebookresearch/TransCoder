# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    result = 0
    rem = 0
    if ( a < b ) :
        a , b = b , a
    while ( b > 0 ) :
        result += int ( a / b )
        rem = int ( a % b )
        a = b
        b = rem
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    (87,60,),
    (18,35,),
    (68,93,),
    (80,20,),
    (87,69,),
    (64,29,),
    (64,1,),
    (65,95,),
    (43,72,),
    (97,41,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))