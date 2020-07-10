# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( price , n , k ) :
    profit = [ [ 0 for i in range ( n + 1 ) ] for j in range ( k + 1 ) ]
    for i in range ( 1 , k + 1 ) :
        prevDiff = float ( '-inf' )
        for j in range ( 1 , n ) :
            prevDiff = max ( prevDiff , profit [ i - 1 ] [ j - 1 ] - price [ j - 1 ] )
            profit [ i ] [ j ] = max ( profit [ i ] [ j - 1 ] , price [ j ] + prevDiff )
    return profit [ k ] [ n - 1 ]


#TOFILL

if __name__ == '__main__':
    param = [
    ([3, 6, 16, 16, 19, 37, 47, 49, 74, 77, 86, 96],6,6,),
    ([-6, -70, -26, 78, 98, -72, 48, -94, -38, 52, -50, 58, 84, 16, -74, 32, -44, -50, 68, -48, 28, 94, -26, -96, -42, 96, -24, 42, -70, 10, -16, -32, 98, 38, -2, 26, -26, -78, 44, -72, -56, -22],31,32,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1],7,8,),
    ([22, 12, 58, 70],3,2,),
    ([-96, -96, -94, -92, -90, -88, -88, -84, -78, -76, -72, -72, -68, -62, -54, -52, -52, -36, -34, -32, -26, -20, -6, -4, -4, 4, 8, 10, 14, 16, 32, 32, 32, 34, 42, 46, 50, 60, 62, 64, 64, 72, 74, 76, 76, 78, 90, 92, 96],30,36,),
    ([1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0],14,13,),
    ([2, 4, 7, 11, 20, 24, 25, 27, 29, 33, 33, 36, 36, 41, 44, 45, 47, 54, 65, 66, 67, 75, 78, 82, 85, 90],15,22,),
    ([56, 2, -10, -44, 68, 10, -32, -2, -68, 12, -34, -36, 0, 40, -16, -36, 92, 8, -40, -10, 46, 98, 76, -2, 98, -20, 6, 68, 32, -26, -12, 70, 16, -34, -50, -76, -34, -18, 0, -44, -76, 58],24,35,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],10,8,),
    ([78, 39, 2, 76, 20, 21, 3, 21, 32, 80, 28, 89, 51, 2, 88, 19, 99, 71, 68, 38, 8, 76, 48, 81, 90, 71, 31],14,24,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))