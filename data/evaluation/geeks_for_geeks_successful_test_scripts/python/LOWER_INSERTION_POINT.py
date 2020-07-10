# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , X ) :
    if ( X < arr [ 0 ] ) :
        return 0 ;
    elif ( X > arr [ n - 1 ] ) :
        return n
    lowerPnt = 0
    i = 1
    while ( i < n and arr [ i ] < X ) :
        lowerPnt = i
        i = i * 2
    while ( lowerPnt < n and arr [ lowerPnt ] < X ) :
        lowerPnt += 1
    return lowerPnt


#TOFILL

if __name__ == '__main__':
    param = [
    ([1, 2, 5, 5, 16, 16, 20, 26, 32, 35, 39, 39, 41, 44, 48, 48, 51, 59, 59, 62, 66, 66, 70, 74, 75, 78, 80, 86, 86, 96],17,29,),
    ([-76, 80, -6, -2, 50, 72, 84, -56, 70, 8, 48, 6, -24, -50, -72],14,9,),
    ([0, 0, 0, 0, 0, 1, 1, 1, 1],8,4,),
    ([74, 65, 84, 71],2,3,),
    ([-96, -92, -90, -86, -84, -76, -76, -62, -58, -54, -50, -50, -44, -42, -38, -34, -14, -8, 6, 12, 24, 38, 40, 50, 62, 84, 86, 92],19,19,),
    ([1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1],12,17,),
    ([6, 10, 14, 14, 16, 19, 23, 23, 25, 26, 29, 34, 42, 42, 43, 45, 47, 49, 50, 51, 51, 56, 59, 65, 69, 72, 75, 78, 79, 80, 82, 82, 82, 84, 85, 91, 98],31,24,),
    ([-90, -2, 22, -2, 58, -2, 96, 38, 36, -66, -98, 22, -80, -32, 22, 0, -34, -16, 82, 76, 12, 84, 66, 8, 32, 18, -98, -10],22,16,),
    ([0, 0, 0, 1, 1, 1, 1],3,5,),
    ([85, 59, 22, 52, 93, 14, 42, 71, 69, 15, 52, 78, 35, 61, 92, 90, 70, 48, 47, 72, 74, 46, 22, 74, 83, 32, 14, 24, 18, 27, 18, 68, 29, 31],19,33,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))