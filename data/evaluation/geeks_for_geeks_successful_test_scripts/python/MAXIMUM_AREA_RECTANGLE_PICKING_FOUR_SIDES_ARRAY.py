# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    arr.sort ( reverse = True )
    dimension = [ 0 , 0 ]
    i = 0
    j = 0
    while ( i < n - 1 and j < 2 ) :
        if ( arr [ i ] == arr [ i + 1 ] ) :
            dimension [ j ] = arr [ i ]
            j += 1
            i += 1
        i += 1
    return ( dimension [ 0 ] * dimension [ 1 ] )


#TOFILL

if __name__ == '__main__':
    param = [
    ([1, 5, 6, 8, 9, 11, 12, 14, 16, 17, 24, 25, 36, 40, 44, 47, 49, 51, 51, 52, 67, 68, 72, 74, 81, 82, 83, 84, 92, 95, 95, 96, 99],27,),
    ([-54, -82, -92, -32],2,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1],15,),
    ([16, 62, 17, 15, 26, 45, 2, 17, 65, 94, 96, 30, 68, 44, 96, 60, 99],8,),
    ([-88, -82, -78, -52, -50, -42, -34, -28, 16, 46, 54, 56, 66, 66, 74, 82, 82, 94, 98],15,),
    ([0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0],18,),
    ([1, 6, 8, 8, 8, 10, 13, 14, 14, 23, 24, 25, 27, 28, 29, 30, 33, 38, 43, 44, 49, 52, 56, 58, 62, 63, 64, 65, 65, 68, 75, 85, 85, 87, 93, 96, 97],20,),
    ([-90, -56, 16, 32, 78, -20, 76, -90, -68, -70, 54, 50, 60, -64, 78, -6, -92, 6, 16, 70],19,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],30,),
    ([55, 51, 90, 10, 14, 5, 57, 22, 75, 29, 7, 18, 31, 43, 84, 35, 71, 94, 4, 51, 94, 30, 94, 53, 82],22,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))