# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    result = - 1
    for i in range ( n ) :
        for j in range ( n - 1 ) :
            for k in range ( j + 1 , n ) :
                if ( arr [ j ] * arr [ k ] == arr [ i ] ) :
                    result = max ( result , arr [ i ] )
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ([4, 78, 84],2,),
    ([-54, 64, 60, 14, 18, -68, -54, -58, 38, -72, -84, 46, 74, 76, 28, -2, 54, 24, 18, -74, -78, 14, -38, -70, 26, -54, -36, -96, -12, 8, 62, -42, -84, 10, -6, 36, -72, 10, 10, -20, 16, 92, -64, -34, 74, -98, 18],26,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],22,),
    ([39, 49, 94, 80, 48, 34, 63, 82, 47, 51, 60, 68, 79, 23, 97, 22, 54, 53, 40, 2, 25],10,),
    ([-90, -52, -10, 12, 72],3,),
    ([1, 0, 0],2,),
    ([2, 9, 11, 14, 16, 17, 17, 18, 19, 21, 24, 25, 28, 29, 30, 33, 33, 39, 41, 41, 43, 46, 50, 51, 60, 62, 67, 80, 84, 86, 91, 92, 97],27,),
    ([4],0,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],16,),
    ([52, 8, 31, 92, 20, 18, 34, 5, 15, 8, 73, 20, 40, 61, 80, 51, 95, 73, 38, 30, 21, 69, 52, 38, 68, 77],22,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))