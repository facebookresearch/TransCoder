# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    arr.sort ( )
    max_count = 1 ; res = arr [ 0 ] ; curr_count = 1
    for i in range ( 1 , n ) :
        if ( arr [ i ] == arr [ i - 1 ] ) :
            curr_count += 1
        else :
            if ( curr_count > max_count ) :
                max_count = curr_count
                res = arr [ i - 1 ]
            curr_count = 1
    if ( curr_count > max_count ) :
        max_count = curr_count
        res = arr [ n - 1 ]
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    ([1, 1, 3, 11, 11, 11, 18, 20, 26, 26, 27, 30, 33, 39, 39, 42, 42, 48, 51, 51, 51, 51, 60, 66, 66, 68, 68, 69, 71, 72, 73, 76, 76, 77, 77, 77, 78, 90, 96],25,),
    ([46, -8, 64, -46, -38, 92, -14, -22, -32, 48, 72, 96, 30, 66, 94, 36, 42, -18, 14, -74, 80, 96, -4],18,),
    ([0, 0, 0, 0, 0, 0, 1],6,),
    ([93, 32, 3, 31, 67, 96, 52, 80, 70, 49, 45, 23, 58, 87, 31, 56, 21, 71, 55, 97],15,),
    ([-98, -96, -84, -82, -72, -64, -62, -56, -52, -52, -48, -46, -42, -36, -32, -30, -30, -18, -16, -10, -2, 0, 6, 18, 22, 22, 40, 42, 50, 54, 64, 68, 68, 72, 80, 82, 84, 96],20,),
    ([1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0],29,),
    ([9, 12, 13, 28, 43, 46, 64, 66, 68, 89, 92],6,),
    ([22, -8, -56, 68, -12, -26, -40, -46, -42, -80, 4, -42, -72, -22, 36, 22, -94, 48, 96, 80, -52, 46, 90, 94, 36, 92, -12, -24, -60, -32, 92, 18, 76, 40, -32, 6, -22, 86, 86, -88, 38, 50, 32, 78, -82, 54, -40, 18],41,),
    ([0, 0, 0, 0, 0, 0, 1, 1, 1],4,),
    ([81, 74, 32, 41, 85, 65, 81, 74, 40, 64, 97, 4, 61, 43, 54, 96, 62, 2, 97, 86, 80, 25, 9, 31, 16, 29, 4, 63, 76, 41, 5, 95],16,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))