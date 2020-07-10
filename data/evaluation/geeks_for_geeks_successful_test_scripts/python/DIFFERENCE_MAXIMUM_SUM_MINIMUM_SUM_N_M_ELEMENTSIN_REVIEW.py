# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , m ) :
    max = 0 ; min = 0
    arr.sort ( ) ;
    j = n - 1
    for i in range ( m ) :
        min += arr [ i ]
        max += arr [ j ]
        j = j - 1
    return ( max - min )


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 3, 6, 16, 21, 22, 23, 27, 27, 28, 29, 29, 31, 31, 37, 37, 38, 40, 41, 43, 51, 52, 53, 55, 55, 56, 57, 63, 67, 67, 67, 72, 75, 79, 82, 84, 91, 92, 93, 96, 96, 97],21,25,),
    ([58, -62, 24, -10, -30, -92, -50, -32, 54, -18, 94, -14, -40, -16, 48],8,12,),
    ([0, 0],1,1,),
    ([7, 51, 6, 71, 10, 29, 49, 63, 77, 13, 13, 56, 65, 34, 76, 16, 84, 2, 89, 83, 65, 1, 5, 99, 11, 59, 71, 54, 17, 9, 11, 48, 2, 65, 62, 77, 29, 80, 97, 83, 44, 91, 4, 44, 21, 12, 24],31,34,),
    ([-90, -58, 6, 16, 20, 34, 36, 38, 48, 66, 82, 84, 86, 90, 90],14,8,),
    ([0, 0, 1, 1, 0],3,2,),
    ([7, 12, 15, 15, 21, 37, 40, 45, 50, 52, 53, 68, 68, 72, 75, 78, 86, 86, 88],16,18,),
    ([22, -20, 94, -88, 72, 44],4,3,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],25,17,),
    ([32, 63, 87, 26, 77, 4, 87, 60, 21, 25, 30, 65, 38, 96, 11, 75],12,15,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))