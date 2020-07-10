# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    if ( n == 0 or n == 1 ) :
        return True
    for i in range ( 1 , n , 1 ) :
        if ( arr [ i - 1 ] > arr [ i ] ) :
            return False
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 3, 4, 10, 11, 13, 17, 19, 23, 26, 28, 29, 30, 34, 35, 37, 38, 38, 43, 49, 49, 50, 52, 53, 55, 55, 57, 58, 58, 59, 64, 66, 67, 70, 72, 72, 75, 77, 77, 87, 89, 89, 90, 91, 98, 99, 99, 99],46,),
    ([56, -94, -26, -52, 58, -66, -52, -66, -94, 44, 38, -66, 70, -70, -80, -78, -72, -60, -76, 68, -50, 32, -16, 84, 74, -42, 98, -8, 72, 26, 24, 6, 24, 86, 86, 78, -92, 80, 32, -74, 26, 50, 92, 4, 2, -34, -2, -18, -10],30,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],13,),
    ([38, 79, 76, 92, 92],2,),
    ([-42, -28, 2, 32, 50, 56, 86, 96, 98],7,),
    ([1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],11,),
    ([1, 9, 12, 21, 21, 24, 34, 55, 60, 63, 67, 68, 88, 89, 91, 94, 98, 99],9,),
    ([-96, 96, -98, -42, -74, 40, 42, 50, -46, -52, 8, -46, 48, 88, -78, -72, -10, -20, 98, -40, -18, 36, 4, 46, 52, 28, -88, -28, -28, -86],29,),
    ([0, 0, 0, 0, 1, 1],3,),
    ([66, 12, 48, 82, 33, 77, 99, 98, 14, 92],7,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))