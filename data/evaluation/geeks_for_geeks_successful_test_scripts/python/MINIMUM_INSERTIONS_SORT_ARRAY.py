# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , N ) :
    lis = [ 0 ] * N
    for i in range ( N ) :
        lis [ i ] = 1
    for i in range ( 1 , N ) :
        for j in range ( i ) :
            if ( arr [ i ] >= arr [ j ] and lis [ i ] < lis [ j ] + 1 ) :
                lis [ i ] = lis [ j ] + 1
    max = 0
    for i in range ( N ) :
        if ( max < lis [ i ] ) :
            max = lis [ i ]
    return ( N - max )


#TOFILL

if __name__ == '__main__':
    param = [
    ([4, 7, 20, 22, 23, 31, 33, 36, 47, 61, 63, 63, 71, 74, 82, 91, 95, 99],15,),
    ([-84, 12, -42, -78, 22, 72, 56, 70, 28, -72],7,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],16,),
    ([29, 41, 4, 62, 77, 74, 30, 2, 14, 90, 93, 10, 78, 36, 66, 22, 48, 89, 36, 73, 70, 23, 90],13,),
    ([-80, -72, -68, -66, -58, -50, -48, -32, -28, -24, -22, -18, 0, 2, 6, 10, 12, 14, 14, 18, 24, 24, 24, 28, 28, 28, 34, 38, 42, 42, 46, 46, 46, 58, 80, 82, 82, 84, 84, 86, 88, 90, 92, 96],36,),
    ([1, 1, 0, 1, 0, 1, 0, 0, 1, 0],8,),
    ([26, 36, 58, 64, 69, 72, 79, 82, 82, 87, 89, 90, 95],8,),
    ([-52, -40, 98, 40, 42, -50, 60, -64, -92, 36, -88, 72, -72, 38, -80, -52, 68, 70, 16, 22, -30, -74, 56, -80, 62, -54, -32, -22, -86, -70, 88, -76, -46, 28, 40, -2, -84, 68, -98, -16, 90, 36, -38, -86, 20, -40, 82, 98, 54],41,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],10,),
    ([36, 62, 58, 24, 99, 12, 46, 3, 4, 40, 54, 97, 48, 94, 98, 7, 17, 5, 3, 36, 3],16,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))