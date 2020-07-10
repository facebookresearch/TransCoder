# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , low , high ) :
    if high < low :
        return arr [ 0 ]
    if high == low :
        return arr [ low ]
    mid = int ( ( low + high ) / 2 )
    if mid < high and arr [ mid + 1 ] < arr [ mid ] :
        return arr [ mid + 1 ]
    if mid > low and arr [ mid ] < arr [ mid - 1 ] :
        return arr [ mid ]
    if arr [ high ] > arr [ mid ] :
        return f_gold ( arr , low , mid - 1 )
    return f_gold ( arr , mid + 1 , high )


#TOFILL

if __name__ == '__main__':
    param = [
    ([16, 22, 50, 64, 68, 79, 84, 88, 89],4,6,),
    ([88, -38, 46, 24, -52, -12, -90, 28, 18, 14, -72, 58, -98, 28, -84, 44, -42, -32, -22, -22, -82, -30, 90, 18, 62, 62, 92, 6, 60, 28, -90, 92, 82, 62, 98, -68, 48, -74, -8, 50, 62, 24, 30, -86, 98, -96, -98],42,31,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],28,21,),
    ([26, 66, 94, 28, 38, 31, 92, 66, 81, 8, 36, 64, 80, 32, 48, 71, 72, 54, 61, 60, 89],19,17,),
    ([-46, -26, -22, -14, 46, 62],4,4,),
    ([0, 1, 1, 1],2,2,),
    ([14, 81, 87],1,1,),
    ([4],0,0,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],15,17,),
    ([3, 41, 40, 53, 82, 9, 90, 43, 90, 59, 37, 21, 92, 98, 36, 99, 35, 67, 24, 29, 40, 31, 46, 12, 29, 8, 93, 67, 44, 83, 71, 29, 22, 32, 33, 11, 44, 97, 84, 44, 8, 10, 31, 50, 22, 8],42,31,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))