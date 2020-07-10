# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , i , n ) :
    if i > int ( ( n - 2 ) / 2 ) :
        return True
    if ( arr [ i ] >= arr [ 2 * i + 1 ] and arr [ i ] >= arr [ 2 * i + 2 ] and f_gold ( arr , 2 * i + 1 , n ) and f_gold ( arr , 2 * i + 2 , n ) ) :
        return True
    return False


#TOFILL

if __name__ == '__main__':
    param = [
    ([1, 2, 3, 5, 24, 24, 25, 25, 36, 37, 37, 39, 42, 44, 46, 50, 51, 54, 56, 60, 62, 70, 71, 73, 75, 80, 80, 85, 86, 89, 91, 95, 99],0,18,),
    ([-44, -58, 88, -42, 42, -14, -44, 42, 64, 94, -46, -70, 34, -10, -46, -52, -6, -78, 64, 56, 74, 98, -34, -4, -92, 6, -52, -20, 78, -72, -40],0,27,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],0,20,),
    ([10, 2, 1, 34, 21, 37, 49, 31, 70, 97, 87, 50, 76, 55],0,8,),
    ([-94, -84, -82, -66, -64, -62, -56, -38, -24, -24, -4, 2, 4, 4, 8, 14, 16, 20, 30, 34, 34, 48, 58, 58, 70, 76, 78, 86, 88, 96, 98],0,26,),
    ([1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0],12,11,),
    ([5,20,30,5,10,21,5],0,7),
    ([50,20,30,5,10,21,5],0,7),
    ([50,20,30,5,10,21,5],2,7),
    ([50,20,30,5,10,21,5],4,7),
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))
