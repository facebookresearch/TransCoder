# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , n ) :
    longest_start = - 1 ;
    longest_end = 0 ;
    for start in range ( n ) :
        min = sys.maxsize ;
        max = - sys.maxsize ;
        for end in range ( start , n ) :
            val = arr [ end ] ;
            if ( val < min ) :
                min = val ;
            if ( val > max ) :
                max = val ;
            if ( 2 * min <= max ) :
                break ;
            if ( end - start > longest_end - longest_start or longest_start == - 1 ) :
                longest_start = start ;
                longest_end = end ;
    if ( longest_start == - 1 ) :
        return n ;
    return ( n - ( longest_end - longest_start + 1 ) ) ;


#TOFILL

if __name__ == '__main__':
    param = [
    ([32, 50, 66, 73, 76, 87],5,),
    ([68, 74, 16, 40, 6, -44, -36, 94, 6, -24, -4, -58, -16, 24],11,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],11,),
    ([91, 22],1,),
    ([-84, -80, -78, -76, -58, -54, -52, -48, -42, -42, -40, -38, -34, -32, -28, -24, -6, 2, 2, 4, 10, 14, 16, 18, 26, 26, 36, 40, 50, 52, 62, 64, 72, 74, 84, 90, 94, 96, 98],35,),
    ([1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1],13,),
    ([10, 19, 25, 29, 32, 37, 40, 43, 43, 44, 46, 51, 51, 54, 56, 58, 63, 79, 83, 86, 87, 97, 97],11,),
    ([-48, -28, 10, 30, 78, -72, 78, 52, -52, -68, 56, 42, 8, -42, 16, -56, 2, -90, -26, -28, -56, -2, 80, -50, 98, -64, -96, 10, -10, 44, 98, -48, -88, 42, 30, 24, 38, -26, -52, -12, 0, 34, -82, -80, 0, -84, -20],25,),
    ([0, 0, 1, 1, 1, 1, 1, 1],6,),
    ([25, 82],1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))