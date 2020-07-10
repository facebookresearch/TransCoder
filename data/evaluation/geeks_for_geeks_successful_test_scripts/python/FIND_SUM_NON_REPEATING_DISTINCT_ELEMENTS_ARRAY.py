# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    s = set ( )
    sum = 0
    for i in range ( n ) :
        if arr [ i ] not in s :
            s.add ( arr [ i ] )
    for i in s :
        sum = sum + i
    return sum


#TOFILL

if __name__ == '__main__':
    param = [
    ([5, 6, 8, 10, 21, 22, 27, 32, 35, 36, 43, 44, 46, 48, 49, 55, 60, 61, 69, 69, 71, 72, 73, 78, 88, 94],24,),
    ([80, 94, 16, -74, 32, -64, -84, -66, -10],6,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],27,),
    ([99, 4, 96, 39, 39, 24, 15, 47, 25, 74, 7, 98, 88, 91, 62, 12, 31, 14, 48, 26, 37, 25, 11, 32, 34, 64, 72, 5, 80, 86, 6],15,),
    ([-86, -84, -84, -78, -78, -76, -74, -68, -66, -64, -60, -60, -56, -50, -42, -42, -38, -34, -32, -22, -16, -14, -10, -6, -6, 4, 4, 26, 36, 36, 54, 62, 64, 68, 70, 76, 76, 76, 84, 92, 92, 94, 96],27,),
    ([1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1],25,),
    ([3, 3, 5, 8, 32, 33, 35, 35, 42, 48, 67, 71, 71, 74, 77, 80, 94, 96, 96, 97],19,),
    ([-50, -18, -66, 76, -54, 96, 98, 26, 42, 64, -60],9,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],15,),
    ([70, 21, 44, 82, 62, 41, 86],3,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))