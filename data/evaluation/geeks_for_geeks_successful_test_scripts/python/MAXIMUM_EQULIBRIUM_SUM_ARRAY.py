# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , n ) :
    res = - sys.maxsize - 1
    for i in range ( n ) :
        prefix_sum = arr [ i ]
        for j in range ( i ) :
            prefix_sum += arr [ j ]
        suffix_sum = arr [ i ]
        j = n - 1
        while ( j > i ) :
            suffix_sum += arr [ j ]
            j -= 1
        if ( prefix_sum == suffix_sum ) :
            res = max ( res , prefix_sum )
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    ([3, 3, 9, 19, 22, 27, 32, 41, 45, 63, 66, 67, 81, 91],13,),
    ([-64, -2, 68, -48, 22, -14, -98],4,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,),
    ([86, 79, 23, 55, 4, 22, 37, 1, 72, 22, 82, 62, 96, 47],8,),
    ([-96, -96, -96, -96, -92, -82, -72, -72, -62, -58, -52, -48, -44, -44, -40, -34, -28, -26, -26, 0, 0, 2, 4, 4, 12, 12, 18, 34, 36, 40, 48, 48, 54, 60, 66, 66, 72, 76, 78, 82, 82, 96, 98],33,),
    ([0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0],38,),
    ([2, 3, 7, 13, 20, 24, 39, 49, 53, 58, 72, 80, 90, 99],11,),
    ([-48, 44, 60, -30, 8, 20, 70, -50, 80, -2, -28, -14],11,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],16,),
    ([64, 13, 18, 3, 22, 29, 51, 45, 21, 13, 47, 15, 17, 34, 60, 99, 30, 54, 16, 47, 13, 49, 60, 66, 28, 57, 85, 66, 65, 7, 62, 29, 9],21,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))