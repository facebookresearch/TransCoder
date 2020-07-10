# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , n ) :
    if n < 3 :
        return - 1
    max_product = - ( sys.maxsize - 1 )
    for i in range ( 0 , n - 2 ) :
        for j in range ( i + 1 , n - 1 ) :
            for k in range ( j + 1 , n ) :
                max_product = max ( max_product , arr [ i ] * arr [ j ] * arr [ k ] )
    return max_product


#TOFILL

if __name__ == '__main__':
    param = [
    ([41, 66, 77],2,),
    ([92, -34, -36, -50, 20, -94, 2, -86, 22, -50, 74, 84, 52, -84, 98, -50, 88, 26, -36, -36, 6, -50, -48, -84, 38, -96, -62, 34, 52, 92, 40, -84, 18, -90, 54, -38, -74, -98, -8, -92, -60, 86, -36, 94, 56],40,),
    ([0, 0, 1],1,),
    ([2, 77, 99, 95, 78, 15, 69, 39, 34, 43, 66, 45, 97, 27, 67, 62, 64, 2, 28, 94, 41, 87, 97, 52, 14, 61, 78, 50],26,),
    ([-62, -28, 40, 76],3,),
    ([0, 1, 1, 0, 1, 1, 1, 1, 1],5,),
    ([2, 6, 10, 11, 12, 12, 17, 18, 18, 19, 20, 22, 24, 25, 30, 35, 36, 37, 40, 41, 42, 47, 60, 60, 64, 69, 69, 70, 73, 79, 80, 83, 97, 97, 97],25,),
    ([-72, 98, 68, 18, 92, -84, 50, 32, -90, -40, 50, 60, -50, -50, 50, 24, 30, 94, -98, -6, 46, -46, -24, -62, -20, 62, -76],14,),
    ([0, 0, 0, 0, 0, 1, 1, 1],7,),
    ([85, 36, 7, 69, 9, 45, 18, 47, 1, 78, 72, 53, 37, 20, 95, 71, 58, 41],14,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))