# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    if ( n == 1 ) :
        return arr [ 0 ]
    dec = [ 0 for i in range ( n + 1 ) ]
    inc = [ 0 for i in range ( n + 1 ) ]
    dec [ 0 ] = inc [ 0 ] = arr [ 0 ]
    flag = 0
    for i in range ( 1 , n ) :
        for j in range ( i ) :
            if ( arr [ j ] > arr [ i ] ) :
                dec [ i ] = max ( dec [ i ] , inc [ j ] + arr [ i ] )
                flag = 1
            elif ( arr [ j ] < arr [ i ] and flag == 1 ) :
                inc [ i ] = max ( inc [ i ] , dec [ j ] + arr [ i ] )
    result = - 2147483648
    for i in range ( n ) :
        if ( result < inc [ i ] ) :
            result = inc [ i ]
        if ( result < dec [ i ] ) :
            result = dec [ i ]
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 5, 9, 15, 15, 20, 21, 26, 28, 32, 34, 38, 42, 42, 42, 46, 47, 48, 50, 54, 55, 60, 60, 61, 63, 63, 66, 74, 79, 80, 85, 91, 93],23,),
    ([-98],0,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1],6,),
    ([70, 5, 20, 22, 44, 94, 69, 89, 45, 92, 56, 58, 36, 91, 82, 95, 9, 60, 4, 34, 37, 95, 38, 47, 81, 68, 73, 15, 88, 8, 95, 28, 97, 12, 24, 5, 26, 82, 47, 88, 28, 33, 17, 28, 11, 71, 74],24,),
    ([-98, -96, -94, -94, -92, -86, -86, -84, -82, -68, -66, -66, -50, -48, -46, -36, -26, -8, -6, 8, 14, 16, 18, 22, 32, 48, 48, 50, 62, 70, 70, 74, 78, 78, 84, 86, 92, 94, 98],32,),
    ([0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1],5,),
    ([1, 2, 8, 8, 12, 14, 19, 24, 25, 32, 36, 45, 47, 53, 54, 56, 56, 58, 59, 60, 65, 68, 86, 86, 91, 98],13,),
    ([-94, 88, 94, 78, -34, 84, -32, 68, -72, 80],7,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],30,),
    ([76, 62, 62, 61, 63, 15, 61, 74, 50, 86, 60, 35, 91, 32, 93, 14, 52, 18, 14, 39],18,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))