# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    for i in range ( 0 , n - 1 ) :
        if ( arr [ i ] > arr [ i + 1 ] ) :
            if ( arr [ i ] - arr [ i + 1 ] == 1 ) :
                arr [ i ] , arr [ i + 1 ] = arr [ i + 1 ] , arr [ i ]
            else :
                return False
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    ([1, 4, 12, 16, 37, 44, 47, 51, 55, 57, 57, 62, 62, 62, 64, 69, 69, 70, 72, 81, 81, 88, 89, 97],15,),
    ([-86, 0, 14, -16, -12, -72, 62, -34, -72, 30, 84, -60, 84, -64, 50, 74, 18, -82, -64, -64, -74, -56, 86, 84, -32, -10, 20, 4, 8, 96, 82, 26, 42],18,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],31,),
    ([48, 66, 83, 12, 77, 98, 18, 33, 21, 16, 28, 24, 46, 43],13,),
    ([-92, -58, -36, -28, -6, 2, 4, 26, 48, 58, 60, 62, 62, 98],10,),
    ([1, 0, 0, 0, 0, 1],4,),
    ([22, 38, 41, 41, 42, 51, 54, 58, 68, 76, 80, 85],9,),
    ([84, -38, 52, -72, -24, 82, 54, 74, 0],8,),
    ([0, 1, 1],2,),
    ([63, 31, 14, 19, 77, 64, 62, 23, 22, 19, 39, 9, 79, 1, 87, 29, 58, 3, 3, 39, 1, 39, 35, 64, 64],13,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))