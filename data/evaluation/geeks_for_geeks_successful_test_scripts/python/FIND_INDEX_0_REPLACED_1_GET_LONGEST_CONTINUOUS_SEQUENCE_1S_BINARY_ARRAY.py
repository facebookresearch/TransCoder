# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    max_count = 0
    max_index = 0
    prev_zero = - 1
    prev_prev_zero = - 1
    for curr in range ( n ) :
        if ( arr [ curr ] == 0 ) :
            if ( curr - prev_prev_zero > max_count ) :
                max_count = curr - prev_prev_zero
                max_index = prev_zero
            prev_prev_zero = prev_zero
            prev_zero = curr
    if ( n - prev_prev_zero > max_count ) :
        max_index = prev_zero
    return max_index


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 8, 9, 13, 13, 19, 19, 21, 21, 24, 28, 28, 29, 29, 29, 32, 34, 38, 39, 43, 45, 46, 57, 59, 62, 63, 67, 67, 68, 69, 70, 70, 71, 72, 74, 74, 76, 78, 79, 81, 90, 90, 95, 96, 98],36,),
    ([28, 92, -16, 0, 6, 12, -88, 42, -48, 72, 2, -38, 80, 82, 96, 32, -42, -38, 62, -76, 20, -10, 2, -48, 4, 88, -24, -72, 32, -42, -48, -62, 38],20,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],39,),
    ([70, 83, 9, 51, 11, 81, 27, 26, 37, 46],7,),
    ([50, 88],1,),
    ([0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1],6,),
    ([96],0,),
    ([18, 78, 14, 60, -12, -86, 32, 74, 74, 96, 58, 28, -42, 28, -18, -58, -82, -58, 22, 6, 2, -6, -4, -98],21,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,),
    ([58, 22, 15, 85, 8, 74, 93, 76, 44, 51, 43, 93, 20, 51, 52, 35, 17, 13, 96, 82, 23, 51, 44, 18, 45, 79, 66, 48, 16, 31, 62, 99, 46, 66, 53, 89, 87, 2, 87, 20, 30],24,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))