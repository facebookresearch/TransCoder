# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    if ( n == 1 ) :
        return 0
    arr.sort ( )
    ans = arr [ n - 1 ] - arr [ 0 ]
    small = arr [ 0 ] + k
    big = arr [ n - 1 ] - k
    if ( small > big ) :
        small , big = big , small
    for i in range ( 1 , n - 1 ) :
        subtract = arr [ i ] - k
        add = arr [ i ] + k
        if ( subtract >= small or add <= big ) :
            continue
        if ( big - subtract <= add - small ) :
            small = subtract
        else :
            big = add
    return min ( ans , big - small )


#TOFILL

if __name__ == '__main__':
    param = [
    ([31, 33, 40, 43, 44, 51, 52, 56, 60, 64, 66, 79, 91, 93, 99],10,13,),
    ([-16, 34, 54, -86, -62],3,4,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],29,22,),
    ([27, 84, 57, 45, 70, 41, 67, 3, 5, 67, 16, 74, 99, 90, 48, 90, 7, 86, 59, 88, 45, 11, 21, 91, 17, 67, 59, 60, 36, 9, 5, 55, 68, 58, 91, 51, 44, 92, 77, 38],28,28,),
    ([-88, -84, -78, -72, -66, -66, -58, -56, -56, -56, -54, -50, -50, -38, -24, -18, -12, -10, -8, -4, 0, 6, 8, 10, 14, 40, 44, 50, 58, 64, 64, 68],22,28,),
    ([1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0],10,8,),
    ([6, 11, 13, 14, 22, 25, 26, 28, 30, 31, 37, 37, 55, 57, 61, 62, 64, 67, 69, 70, 71, 73, 73, 75, 80, 81, 82, 88, 90, 98],29,26,),
    ([-86, 4, -90, 66, -10, -36, -18, 82, 20, 6, -78, 98, -64, 52, -22, 20, 44, -70, -32, 88, -80, 24, -38, -62, 92],23,18,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],20,19,),
    ([2],0,0,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))