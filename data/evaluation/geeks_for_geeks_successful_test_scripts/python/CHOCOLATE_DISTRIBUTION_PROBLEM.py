# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import sys

def f_gold ( arr , n , m ) :
    if ( m == 0 or n == 0 ) :
        return 0
    arr.sort ( )
    if ( n < m ) :
        return - 1
    min_diff = sys.maxsize
    first = 0
    last = 0
    i = 0
    while ( i + m - 1 < n ) :
        diff = arr [ i + m - 1 ] - arr [ i ]
        if ( diff < min_diff ) :
            min_diff = diff
            first = i
            last = i + m - 1
        i += 1
    return ( arr [ last ] - arr [ first ] )


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 5, 11, 23, 33, 35, 39, 51, 52, 56, 74, 76, 76, 79, 85, 88, 93, 98],16,13,),
    ([-42, 76, -34, -74, 16, 4, 88, -70, -88, -94, -24, 4, -14, -56, 56, -18, 84, 0, -48, -94, 72, 42, 36, 52, 74, -84, -50, 16, 30],15,28,),
    ([0, 0, 1, 1, 1, 1],5,5,),
    ([29, 49, 88, 44, 92, 43, 12, 5, 38, 75, 57, 3, 85, 16, 86, 62, 16, 40, 76, 37, 5, 69, 16, 63, 84, 78, 74, 18, 4, 89, 73, 67, 60],25,18,),
    ([-98, -80, -50, -44, -42, -36, -36, -28, -10, -8, -4, -2, 2, 10, 18, 18, 26, 32, 36, 56, 80, 86, 88, 90],16,12,),
    ([0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1],13,14,),
    ([13, 15, 62, 65, 87],3,4,),
    ([-50, 58, 78, 28, 4, 18, -8, 18, -88, -48, -26, -32, 64, 48, 60, 94, -92, 48, -36, 30, -80, -60, 82, -62, 32, -36, -76, -88, -60, 22, -14, 72, 30],31,17,),
    ([0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],9,6,),
    ([25, 17, 58, 40, 53, 73, 23, 77, 38],8,6,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))