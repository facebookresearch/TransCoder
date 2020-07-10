# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    maxA = - 100000000
    maxB = - 100000000
    maxC = - 100000000
    for i in range ( 0 , n ) :
        if ( arr [ i ] > maxA ) :
            maxC = maxB
            maxB = maxA
            maxA = arr [ i ]
        elif ( arr [ i ] > maxB ) :
            maxC = maxB
            maxB = arr [ i ]
        elif ( arr [ i ] > maxC ) :
            maxC = arr [ i ]
    return ( maxA + maxB + maxC )


#TOFILL

if __name__ == '__main__':
    param = [
    ([4, 7, 12, 21, 22, 25, 27, 28, 28, 31, 32, 32, 41, 45, 47, 51, 53, 60, 61, 61, 63, 71, 74, 82, 83, 85, 88, 92, 96, 96],28,),
    ([-52, 26, 74, -62, -76],2,),
    ([0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],11,),
    ([63, 71, 15, 28, 31, 84, 8, 17, 24, 42, 66, 95, 30],6,),
    ([-94, -92, -92, -90, -88, -88, -86, -82, -80, -78, -66, -54, -52, -52, -46, -46, -42, -36, -32, -24, -24, -14, -14, -14, -12, -10, 0, 6, 8, 20, 24, 24, 28, 38, 38, 52, 54, 56, 64, 74, 74, 76, 82, 94, 94],31,),
    ([0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0],30,),
    ([15, 19, 80],2,),
    ([4, 80, 18, 74, 36, -30, -72, -28, -32, -16, -8, 38, 78, -48, 98, -64, 86, -60, -44, 84, -98, 40, 14, 30, 44, 90, -30, -42, 24, -28, 24, 40, -96, 98, 90, -68, -54, -52, 62, 34, -98, 68, -56, -94, -78, -12, 28],41,),
    ([0, 1, 1, 1, 1, 1],3,),
    ([2, 18, 96, 7, 99, 83, 3, 88, 23, 77, 6, 28, 55, 49, 69, 55, 48, 76, 43, 11, 43, 44, 17, 74, 27, 64, 76, 77, 53, 26, 73, 12, 19, 62, 18, 34, 13, 31, 97, 96, 85, 27, 30, 97, 89, 25],41,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))