# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    dp = [ 1 for i in range ( n ) ]
    for i in range ( n ) :
        for j in range ( i ) :
            if ( ( arr [ i ] == arr [ j ] + 1 ) or ( arr [ i ] == arr [ j ] - 1 ) ) :
                dp [ i ] = max ( dp [ i ] , dp [ j ] + 1 )
    result = 1
    for i in range ( n ) :
        if ( result < dp [ i ] ) :
            result = dp [ i ]
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 13, 15, 17, 18, 20, 22, 24, 28, 34, 37, 43, 46, 47, 49, 51, 52, 54, 58, 64, 65, 77, 78, 79, 87, 90, 92, 93, 94, 97],23,),
    ([-86, -56, 76, 86, 42, -40, 8, 34, -48, -54, -80, 6, 42, 48, 76, -26, 6],15,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],16,),
    ([5, 22, 15, 26, 29, 47, 22],5,),
    ([-90, -84, -76, -76, -74, -74, -66, -58, -58, -56, -56, -44, -38, -36, -34, -32, -16, -10, 2, 6, 24, 24, 24, 34, 36, 54, 60, 68, 70, 76, 88],17,),
    ([0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1],26,),
    ([1, 3, 12, 12, 12, 12, 14, 17, 18, 19, 23, 27, 28, 30, 35, 38, 42, 44, 45, 48, 52, 59, 61, 64, 65, 69, 73, 76, 77, 82, 83, 85, 87, 99],23,),
    ([-54, -20, 24, -78, -58, 64, 34, 70, -36, -24],8,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],27,),
    ([5, 35, 75, 21, 82, 32, 28, 53, 20, 27, 42, 92, 32, 70, 81, 75, 72, 66, 97, 60, 11, 83, 14, 30, 5, 68, 17, 27, 62, 86, 26, 20, 97, 91, 44, 69],20,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))