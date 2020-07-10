# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , n ) :
    arr.sort ( )
    minXor = int ( sys.float_info.max )
    val = 0
    for i in range ( 0 , n - 1 ) :
        val = arr [ i ] ^ arr [ i + 1 ] ;
        minXor = min ( minXor , val ) ;
    return minXor


#TOFILL

if __name__ == '__main__':
    param = [
    ([8, 11, 12, 27, 32, 32, 36, 56, 57, 66, 68, 70, 74, 78, 82, 83, 96],10,),
    ([40, 48, 66, 4, -60, 42, -8, 38],7,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,),
    ([98, 6, 82, 95, 87, 20, 11, 63, 78, 70, 37, 12, 57, 67, 10, 49, 38, 28, 86, 7, 61, 50, 32, 68, 91, 66, 57, 29, 2, 64, 65, 15, 16, 4, 7, 76, 44, 52, 81, 89, 3, 36, 57, 95, 48, 24],36,),
    ([-88, -84, -76, -58, -40, -38, -28, -24, -20, -14, -12, 16, 20, 28, 28, 30, 40, 44, 56, 58, 60, 92, 92],13,),
    ([0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0],20,),
    ([6, 6, 19, 31, 41, 45, 49, 56, 78, 96, 98],6,),
    ([62, -90, 22, -84, -4],3,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],21,),
    ([83, 13, 43, 99, 34, 74, 56, 20, 93, 65, 92, 58, 91, 72, 37, 10, 39, 7, 29, 69, 42, 28],14,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))