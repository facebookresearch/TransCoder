# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , low , high ) :
    if ( high < low ) :
        return 0
    if ( high == low ) :
        return low
    mid = low + ( high - low ) / 2 ;
    mid = int ( mid )
    if ( mid < high and arr [ mid + 1 ] < arr [ mid ] ) :
        return ( mid + 1 )
    if ( mid > low and arr [ mid ] < arr [ mid - 1 ] ) :
        return mid
    if ( arr [ high ] > arr [ mid ] ) :
        return f_gold ( arr , low , mid - 1 ) ;
    return f_gold ( arr , mid + 1 , high )


#TOFILL

if __name__ == '__main__':
    param = [
    ([4, 16, 38, 39, 48, 74, 79],6,6,),
    ([-46, 72, 72, -66, 96, 92, 40, 8, 94, -84, 6, -90, 38, -6, 48, -20, -86, -76, 88, -50, -44, -14, 54, -6, -2, 72, 8, -64, -46, 44, -88, 50, 86, 38, 42, -56],32,21,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],16,29,),
    ([48, 74, 59, 57, 95, 11, 25, 61, 46, 54, 34, 84, 7, 97, 62, 57, 99, 93, 76, 5, 76, 93, 35, 84, 37, 60, 65, 16, 30, 73, 42, 61, 74, 77, 48, 62, 84, 93, 64, 57, 68, 46, 28, 77],24,26,),
    ([-72, -68, -66, -66, -62, -62, -52, -48, -42, -42, -42, -38, -30, -22, -20, -20, -16, -16, -14, 0, 2, 2, 2, 4, 12, 20, 22, 26, 32, 34, 46, 46, 64, 64, 64, 66, 68, 68, 68, 74, 80, 84, 84, 88, 88, 90, 96, 98],29,43,),
    ([1],0,0,),
    ([7, 11, 20, 21, 22, 27, 30, 30, 34, 35, 36, 37, 38, 60, 61, 63, 63, 69, 70, 75, 80, 84, 88, 97],23,22,),
    ([-2, 70, -40],2,1,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],30,17,),
    ([71, 71, 27, 10, 97, 43, 55, 71, 6, 6, 77, 48, 77, 2, 83, 51, 61, 19, 2, 51, 26, 70, 20, 23, 54, 15, 6, 92, 35, 75, 8, 57, 50, 49, 88, 21, 36],24,22,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))