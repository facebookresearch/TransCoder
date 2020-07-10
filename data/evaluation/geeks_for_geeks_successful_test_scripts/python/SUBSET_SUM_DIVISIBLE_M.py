# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , m ) :
    if ( n > m ) :
        return True
    DP = [ False for i in range ( m ) ]
    for i in range ( n ) :
        if ( DP [ 0 ] ) :
            return True
        temp = [ False for i in range ( m ) ]
        for j in range ( m ) :
            if ( DP [ j ] == True ) :
                if ( DP [ ( j + arr [ i ] ) % m ] == False ) :
                    temp [ ( j + arr [ i ] ) % m ] = True
        for j in range ( m ) :
            if ( temp [ j ] ) :
                DP [ j ] = True
        DP [ arr [ i ] % m ] = True
    return DP [ 0 ]


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 5, 7, 12, 13, 13, 15, 18, 20, 21, 22, 26, 27, 41, 41, 50, 53, 57, 58, 58, 61, 62, 62, 64, 70, 75, 78, 79, 81, 81, 81, 83, 86, 91, 93, 95, 97, 99, 99],36,35,),
    ([8, 16, 62, -24, 14, -4, 2, 50, -64, -76, 78, 66, -64, 18],12,11,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],32,27,),
    ([50, 20, 79, 42, 85, 24, 20, 76, 36, 88, 40, 5, 24, 85, 7, 19, 43, 51, 94, 13, 53, 93, 92, 43, 97, 38, 80, 48, 52, 47, 77, 56, 41, 80, 32, 34, 77, 14, 70, 3],29,27,),
    ([-96, -94, -72, -58, -48, -36, -28, -26, -10, -10, -8, -8, -6, 2, 14, 30, 30, 54, 58, 60, 64, 68, 78, 84, 96, 98],16,18,),
    ([1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0],7,8,),
    ([2, 7, 8, 15, 18, 23, 24, 25, 27, 35, 40, 42, 43, 46, 48, 50, 53, 64, 66, 69, 70, 71, 72, 77, 78, 80, 81, 81, 81, 82, 82, 82, 84, 87, 97, 98],23,32,),
    ([46, 54, 24, -10],3,3,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],21,34,),
    ([39, 21, 38, 6, 38, 44, 96, 1, 16, 1, 28, 4, 55, 8],12,11,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))