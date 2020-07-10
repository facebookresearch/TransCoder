# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , low , high ) :
    max = arr [ low ]
    i = low
    for i in range ( high + 1 ) :
        if arr [ i ] > max :
            max = arr [ i ]
    return max


#TOFILL

if __name__ == '__main__':
    param = [
    ([11, 15, 16, 19, 24, 25, 26, 28, 34, 34, 43, 61, 63, 66, 67, 72, 77, 79, 81, 83, 87, 94, 99],15,21,),
    ([8, 92],1,1,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],23,15,),
    ([84, 39, 92, 89, 38, 75, 18, 39, 83, 67, 41, 46, 49, 27],8,13,),
    ([-98, -94, -88, -84, -74, -72, -58, -52, -48, -48, -46, -42, -42, -32, -30, -30, -18, -10, -8, -8, -6, -4, 4, 6, 28, 30, 34, 38, 44, 48, 56, 58, 60, 64, 86],31,34,),
    ([0, 1, 0],2,2,),
    ([5, 9, 10, 16, 18, 19, 23, 24, 26, 33, 37, 44, 46, 54, 55, 57, 58, 59, 63, 64, 70, 75, 77, 81, 83, 84, 85, 85, 88, 89, 96, 97, 99],20,31,),
    ([86, 20, -50, 74, -78, 86],3,5,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,18,),
    ([16, 57, 65, 61, 17, 63, 7, 35, 69, 91, 30, 44, 99, 80, 6, 80, 56, 8, 84, 95, 20, 73, 30, 62, 77, 26, 66, 61, 61, 45],28,22,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))