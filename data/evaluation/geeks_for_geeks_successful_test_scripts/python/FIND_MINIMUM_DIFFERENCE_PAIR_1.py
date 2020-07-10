# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    arr = sorted ( arr )
    diff = 10 ** 20
    for i in range ( n - 1 ) :
        if arr [ i + 1 ] - arr [ i ] < diff :
            diff = arr [ i + 1 ] - arr [ i ]
    return diff


#TOFILL

if __name__ == '__main__':
    param = [
    ([3, 25, 44, 46, 54, 60, 81],3,),
    ([82, 68, -98, -66, -36, -42, 98, -38, 58, -6, -28, 70, -24, 18, 16, 10, 92, 44, 28, -96, -72, 24, 28, -80, -4, 38, 88, 76],22,),
    ([1, 1, 1],2,),
    ([87, 25, 80, 45, 44, 20, 48, 47, 51, 54, 68, 47, 89, 95, 15, 29, 5, 45, 2, 64, 53, 96, 94, 22, 23, 43, 61, 75, 74, 50],15,),
    ([-74, -48, -42, -26, -16, -12, 0, 4, 8, 18, 46, 46, 62, 70, 74, 88, 92, 96, 98],18,),
    ([0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0],36,),
    ([27, 42, 59, 80],2,),
    ([-96, -94, 10, -36, 18, -40],4,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],12,),
    ([96],0,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))