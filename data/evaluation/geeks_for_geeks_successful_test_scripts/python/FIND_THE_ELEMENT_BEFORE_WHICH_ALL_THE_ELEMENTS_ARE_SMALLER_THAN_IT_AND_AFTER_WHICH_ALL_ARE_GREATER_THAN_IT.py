# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    leftMax = [ None ] * n
    leftMax [ 0 ] = float ( '-inf' )
    for i in range ( 1 , n ) :
        leftMax [ i ] = max ( leftMax [ i - 1 ] , arr [ i - 1 ] )
    rightMin = float ( 'inf' )
    for i in range ( n - 1 , - 1 , - 1 ) :
        if leftMax [ i ] < arr [ i ] and rightMin > arr [ i ] :
            return i
        rightMin = min ( rightMin , arr [ i ] )
    return - 1


#TOFILL

if __name__ == '__main__':
    param = [
    ([4, 24, 30, 33, 56, 67, 87, 90],4,),
    ([72, -48, 12, 4, 46, 36, 2, 58, 82, -88, -14, 56, 90, 76, 18, -6, -28, 18, 88, 90, 40, -68, -10, -82, -28, 16, 32, -90, 12, -86, -16, 78, -98, -52, -26, 80, 6, 50, 40, -12, 52, 38, -92, 94, -32, 14, -80, -88, 48],28,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],30,),
    ([51, 87, 46, 76, 2, 89, 56, 34, 49, 61, 44, 73, 14, 60, 89],11,),
    ([-90, -90, -80, -72, -68, -64, -62, -62, -60, -46, -44, -44, -44, -42, -42, -32, -22, -22, -18, -2, 4, 6, 10, 12, 14, 30, 34, 34, 40, 56, 56, 56, 58, 68, 74, 78, 78, 82, 84, 86, 88, 90, 92],29,),
    ([0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0],26,),
    ([7, 8, 11, 12, 15, 17, 28, 34, 57, 61, 66, 76, 92],9,),
    ([-22, -96, -78, -60, 34, -18, 86, -42, -78, 76, 8, 28, -80, 80, 6, -72, 34, 66, 84, 50, -4, 18, 72, -66, -68, -24, 56, -12, -70, 24, -82],19,),
    ([0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1],9,),
    ([79, 81, 55, 6, 78, 93, 81, 33, 29, 1, 27, 49, 21, 58, 22, 65, 44, 95, 6, 51, 75, 42, 14, 55, 79, 82, 90, 8, 15, 15, 53, 98, 76, 43, 33],30,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))