# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    ans = 0 ; temp = 0 ;
    for i in range ( 1 , n + 1 ) :
        if temp < n :
            temp = i - 1
            num = 1
            while temp < n :
                if temp + i <= n :
                    ans += i * num
                else :
                    ans += ( n - temp ) * num
                temp += i
                num += 1
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    (35,),
    (93,),
    (7,),
    (81,),
    (80,),
    (47,),
    (7,),
    (41,),
    (59,),
    (34,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))