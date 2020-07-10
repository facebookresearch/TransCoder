# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A , N , M ) :
    ans = 0
    h = [ 0 ] * M
    for i in range ( 0 , N ) :
        A [ i ] = A [ i ] % M
        h [ A [ i ] ] = h [ A [ i ] ] + 1
    for i in range ( 0 , M ) :
        for j in range ( i , M ) :
            rem = ( M - ( i + j ) % M ) % M
            if ( rem < j ) :
                continue
            if ( i == j and rem == j ) :
                ans = ans + h [ i ] * ( h [ i ] - 1 ) * ( h [ i ] - 2 ) / 6
            elif ( i == j ) :
                ans = ans + ( h [ i ] * ( h [ i ] - 1 ) * h [ rem ] / 2 )
            elif ( i == rem ) :
                ans = ans + h [ i ] * ( h [ i ] - 1 ) * h [ j ] / 2
            elif ( rem == j ) :
                ans = ans + h [ j ] * ( h [ j ] - 1 ) * h [ i ] / 2
            else :
                ans = ans + h [ i ] * h [ j ] * h [ rem ]
        return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ([6, 7, 13, 16, 19, 20, 21, 25, 28, 31, 36, 38, 42, 44, 50, 54, 55, 56, 63, 63, 63, 65, 65, 65, 67, 71, 73, 73, 76, 78, 87, 90, 91, 99],27,21,),
    ([28, -8, -86, -6, -28, 74, 82, 88, -62, -24, -14, 68, 36, -54, -16, -52, -78, -24, 68, -2, 30, -56, 30, -86, -54, 54, 62, -30, -82, 66, 94, 12, 10, 4, 40, -72, 20, -2, -90, -90],29,21,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],29,43,),
    ([45, 14, 91, 37, 91],3,4,),
    ([-88, -78, -74, -50, -44, -34, -26, -22, 14, 46, 48, 80, 82, 86, 88],13,12,),
    ([1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1],11,15,),
    ([9, 14, 16, 18, 23, 36, 37, 58, 78],7,4,),
    ([-56, 86, 58, -58, 46, -62, 8, -22, 80, 96, -74, -94, -94, -2, -4],13,14,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],37,34,),
    ([62, 36, 66, 84, 20, 43, 93, 47, 85, 70, 50, 96, 3, 8, 38, 96, 15, 31, 97, 90, 1, 69, 77, 20, 68, 11, 2, 92, 50, 8, 23, 83, 76, 6, 32, 43, 92],18,35,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))