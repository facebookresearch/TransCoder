# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , l , r , x ) :
    if r >= l :
        mid = l + ( r - l ) // 2
        if arr [ mid ] == x :
            return mid
        elif arr [ mid ] > x :
            return f_gold ( arr , l , mid - 1 , x )
        else :
            return f_gold ( arr , mid + 1 , r , x )
    else :
        return - 1


#TOFILL

if __name__ == '__main__':
    param = [
    ([3, 4, 4, 8, 9, 13, 13, 15, 18, 27, 30, 32, 42, 48, 50, 52, 56, 66, 69, 69, 77, 84, 84, 93],19,12,22,),
    ([52, -58, -22, -80, 44, -52, -34, 94, -34, -74, 42, 60, -62, 70, 98, 32, 10, 94, 26, 56, -48, -50, 42, 2, 46, 28, -68, -16, -96, -12, 66, -46, 74, -60, -52, 28, -92, -78, 32, 28, 16, 34, 30, -60, -14],40,35,44,),
    ([0, 1],1,1,1,),
    ([28, 84, 40, 81],2,2,2,),
    ([-66, -62, -60, -56, -56, -2, 40, 44, 50, 74, 82, 94],8,6,8,),
    ([1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1],7,7,10,),
    ([15, 26, 31, 36, 36, 61, 68, 72, 75, 79, 82, 98],6,7,8,),
    ([0, -82, -94, 48, 48, -96, 14, 66, 76, -30, 86, 28, -28, -66, -64, 92, -94, -66, 86, 26, 8, 94, -82, -80, 4, -26, 76, -46, 72, 88, -6, 8, -30, 40, -88, 2, -40, -98, -22, -20, 4, -12, 54, -20, -36, 12],38,33,39,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1],12,10,6,),
    ([81, 47],1,1,1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))