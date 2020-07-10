# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    res = 1
    for i in range ( 0 , n ) :
        if arr [ i ] <= res :
            res = res + arr [ i ]
        else :
            break
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    ([16, 23, 24, 41, 48, 58, 72, 75],4,),
    ([-14, -82, 12, -14, -38, 12, 40, 12, -74, 42, -36, 64],8,),
    ([0, 0, 1, 1, 1, 1],5,),
    ([17, 89, 44],2,),
    ([-94, -92, -84, -82, -72, -58, -56, -40, -34, -34, -24, -22, -8, -8, 12, 14, 16, 16, 22, 22, 34, 46, 54, 58, 68, 72, 74, 78, 88, 96],25,),
    ([0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0],8,),
    ([2, 12, 13, 13, 13, 16, 28, 32, 34, 41, 41, 47, 49, 49, 50, 52, 58, 61, 63, 65, 67, 68, 68, 74, 80, 80, 84, 84, 89, 93, 94, 98, 99, 99],23,),
    ([-54],0,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],33,),
    ([42, 50, 76, 45, 6, 63, 46, 73, 65, 70, 87, 5, 41, 63, 96, 75, 38, 76, 27, 7, 71, 9, 65, 44, 76, 37, 94, 52, 55, 3, 38, 68, 45, 15, 35, 90, 36, 46, 13, 92, 32, 22, 49, 35, 83],35,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))