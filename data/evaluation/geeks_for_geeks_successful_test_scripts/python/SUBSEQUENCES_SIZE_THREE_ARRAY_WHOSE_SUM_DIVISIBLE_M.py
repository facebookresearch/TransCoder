# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A , N , M ) :
    sum = 0
    ans = 0
    for i in range ( 0 , N ) :
        for j in range ( i + 1 , N ) :
            for k in range ( j + 1 , N ) :
                sum = A [ i ] + A [ j ] + A [ k ]
                if ( sum % M == 0 ) :
                    ans = ans + 1
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ([14, 35, 56, 70, 88],3,4,),
    ([-50, -92, 16, -68, -36],3,4,),
    ([0, 0, 0, 1, 1, 1],4,5,),
    ([76, 43, 22, 41, 49, 99, 25, 40, 3, 45, 60, 16, 83, 62, 26, 93, 64, 73, 72, 53, 6, 32, 35, 67, 17],14,21,),
    ([-90, -86, -86, -66, -50, -48, -44, -42, -42, -38, -24, -22, -20, -18, -8, 8, 24, 28, 34, 48, 60, 62, 66, 68, 74, 76, 80, 82, 88],24,20,),
    ([1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0],24,30,),
    ([4, 5, 8, 9, 10, 12, 13, 16, 17, 18, 21, 21, 25, 27, 28, 30, 36, 36, 54, 55, 56, 57, 60, 62, 67, 67, 68, 71, 72, 72, 73, 73, 77, 77, 83, 86, 86, 86, 87, 89, 92, 92, 96, 97, 97, 98],24,23,),
    ([-64, 52, -32, 38, 8, -62, -56, 20, 72, -12, 32, 44],6,6,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],12,15,),
    ([77, 68, 45, 6, 27, 19, 29, 95, 21, 2, 39, 48, 72, 67, 49, 45, 1, 16, 56, 78, 25, 22, 27, 40, 31, 34, 26, 35, 12],25,25,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))