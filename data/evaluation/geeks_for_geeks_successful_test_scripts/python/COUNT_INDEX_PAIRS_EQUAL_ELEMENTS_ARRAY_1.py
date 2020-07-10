# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    mp = dict ( )
    for i in range ( n ) :
        if arr [ i ] in mp.keys ( ) :
            mp [ arr [ i ] ] += 1
        else :
            mp [ arr [ i ] ] = 1
    ans = 0
    for it in mp :
        count = mp [ it ]
        ans += ( count * ( count - 1 ) ) // 2
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ([5, 11, 18, 22, 40, 46, 50, 51, 53, 55, 64, 67, 73, 78, 86],14,),
    ([14, -98, 98, 58, -82, 90, -80, -56, -30, -36, -56, -30, -58, 68, 72, -76, 38, -90, -72, 4, -32, 32, -28, 2, 12, -72, 54, 2, 0, -74, 8, 12, 46, 72, -84, -66, 70, 18, 26, 72, -26, 44, -8, 20, -32, -56, 28],24,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],13,),
    ([93, 23, 62, 64, 31, 78, 99],4,),
    ([-94, -94, -92, -86, -84, -76, -76, -68, -66, -56, -56, -54, -50, -46, -38, -34, -34, -30, -26, -18, -16, 2, 8, 42, 52, 54, 56, 64, 68, 82, 82, 82, 94, 96, 98],19,),
    ([0],0,),
    ([3, 18, 18, 20, 21, 23, 24, 27, 35, 36, 38, 40, 46, 50, 50, 51, 52, 53, 59, 61, 63, 63, 65, 66, 68, 68, 70, 71, 74, 75, 96, 98],19,),
    ([-68, 40, 16, 50, 36, 42, -20, -46, -92, 4, -18, -12, 48, 0, -46, 64, -74, -50, 42, 44, -56, 28, -10, 78, 62, 70, -60, 12, -44, -78],23,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],30,),
    ([31, 5],1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))