# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    jumps = [ 0 for i in range ( n ) ]
    for i in range ( n - 2 , - 1 , - 1 ) :
        if ( arr [ i ] == 0 ) :
            jumps [ i ] = float ( 'inf' )
        elif ( arr [ i ] >= n - i - 1 ) :
            jumps [ i ] = 1
        else :
            min = float ( 'inf' )
            for j in range ( i + 1 , n ) :
                if ( j <= arr [ i ] + i ) :
                    if ( min > jumps [ j ] ) :
                        min = jumps [ j ]
            if ( min != float ( 'inf' ) ) :
                jumps [ i ] = min + 1
            else :
                jumps [ i ] = min
    return jumps [ 0 ]


#TOFILL

if __name__ == '__main__':
    param = [
    ([1, 6, 7, 14, 22, 32, 42, 42, 43, 48, 54, 57, 59, 69, 84, 92, 98],11,),
    ([98, -66, -70, -64, -88, -76, -90, 16, 58, 68, -10, -42, -28, 10, 72, 68, -30, 60, 92, -56, 80, -4, -82, 30, 58, 98, -56, 98, -14, -38, -20, -74, -46, -22, 78, 36, -54, -64, 80, -10, -26, 82, 96, -72, -36, -36, -32, -88, 0],26,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],41,),
    ([64, 25, 63, 54, 7, 43, 79, 27, 34, 13, 84, 80, 34, 48, 5, 56, 67, 2],10,),
    ([2, 28, 68],2,),
    ([1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0],11,),
    ([1, 1, 9, 16, 17, 18, 19, 20, 21, 22, 25, 28, 29, 29, 36, 37, 40, 40, 42, 48, 49, 49, 55, 63, 65, 66, 69, 70, 72, 73, 76, 77, 77, 79, 79, 81, 81, 93, 95, 99],24,),
    ([38, -42, -8, 98, -90, 38, 88, -8, 70, -28, -50, -22, 28, 24, 88, -26, 58, 48, 6, 0, 68, -6, 8, 54, -2, 46, -44, 96, -82, -14, -48, -18, -16, -48, -44, -16, -58, -64],34,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],14,),
    ([98, 46, 12, 55, 57, 11, 25, 64, 92, 35, 90, 72, 95, 30, 75, 67, 64, 12, 31, 84, 70, 96, 71, 80, 62, 34, 70, 10, 54],25,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))