# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    if ( n == 1 ) :
        return True
    i = 1
    for i in range ( 1 , n ) :
        if arr [ i - 1 ] < arr [ i ] :
            if ( i == n ) :
                return True
    j = i
    while ( arr [ j ] < arr [ j - 1 ] ) :
        if ( i > 1 and arr [ j ] < arr [ i - 2 ] ) :
            return False
        j += 1
    if ( j == n ) :
        return True
    k = j
    if ( arr [ k ] < arr [ i - 1 ] ) :
        return False
    while ( k > 1 and k < n ) :
        if ( arr [ k ] < arr [ k - 1 ] ) :
            return False
        k += 1
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    ([1,2,5,4,3],5,),
    ([1,2,4,5,3],5,),
    ([1,1,0,0],4,),
    ([5, 99, 40, 33, 61, 4, 64, 92, 28, 27, 21, 35, 40, 79, 10, 20, 76, 87, 80, 15, 57, 39, 96, 98, 99, 72, 72, 50, 61, 39, 35, 70, 27],32,),
    ([-98, -92, -86, -58, -22, -12, 0, 26],6,),
    ([0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0],24,),
    ([6, 10, 27, 30, 40, 47, 49, 55, 59, 60, 68, 82, 91],8,),
    ([36, 56, -56, 94, 52, -82, 88, -62, 70, -94, 38, 10, -78, 66, -94, -72, 18, 96, -72, 88, -6, 48, 6, -88, 64, -96, -40, 8, 36, 36, -90, -68, -20, -76, 22, -92],30,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],31,),
    ([2, 5, 42, 28, 47, 26, 88, 16, 30, 30, 36, 49, 21, 95, 99, 21, 41, 52, 57, 39, 69, 2, 42, 22, 55, 92, 64, 27, 95, 71, 19, 38, 40, 65, 7, 21, 29, 38, 13, 11, 41, 54, 38, 40, 35, 51, 88],46,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))