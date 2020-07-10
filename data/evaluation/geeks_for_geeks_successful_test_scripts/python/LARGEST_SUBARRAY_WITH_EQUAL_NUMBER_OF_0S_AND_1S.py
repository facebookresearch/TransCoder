# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    sum = 0
    maxsize = - 1
    for i in range ( 0 , n - 1 ) :
        sum = - 1 if ( arr [ i ] == 0 ) else 1
        for j in range ( i + 1 , n ) :
            sum = sum + ( - 1 ) if ( arr [ j ] == 0 ) else sum + 1
            if ( sum == 0 and maxsize < j - i + 1 ) :
                maxsize = j - i + 1
                startindex = i
    if ( maxsize == - 1 ) :
        print ( "No such subarray" ) ;
    else :
        print ( startindex , "to" , startindex + maxsize - 1 ) ;
    return maxsize


#TOFILL

if __name__ == '__main__':
    param = [
    ([56, 8, 67, 35, 19, 82, 81, 66, 10, 24, 82, 2, 42, 48, 18, 63, 48, 74, 60, 64, 64, 95, 95, 20, 95, 55, 63, 96, 54],26,),
    ([78, 67, 1, 78, 48, 83, 17, 19, 21, 44, 99, 68, 16, 54, 9],8,),
    ([3, 69, 97, 21, 12, 67, 45, 53, 77, 70, 26, 43],9,),
    ([21, 80, 29, 22, 77, 64, 42, 4, 71, 75, 62, 27, 30, 36, 66, 37, 49, 97],10,),
    ([18, 66, 9, 90, 21, 95, 74, 48, 44, 9, 43, 17],10,),
    ([42, 41, 87, 3, 64, 25, 96, 55, 99, 57, 32, 64, 10, 75, 69, 95, 11, 36, 15, 2, 78, 70, 14, 54, 11, 28, 55, 47, 27, 85, 47, 62, 97, 68, 44, 70, 12, 27, 36, 85, 76, 91, 17, 75, 83, 34, 32, 89, 55],41,),
    ([44],0,),
    ([1, 43, 28, 17, 30, 46, 89, 51, 15, 70, 96, 79, 65, 55, 8],9,),
    ([25, 91, 68, 4, 35, 49, 33],4,),
    ([14, 86, 22, 42, 94, 54, 28, 41, 48, 8, 82, 84, 99, 92, 33, 75, 38, 31, 59, 86, 21, 6, 77, 89, 79, 83, 57, 26, 89, 45, 60, 55, 60, 76, 76, 6, 40, 57, 38, 44, 7, 98, 64, 65, 88, 73, 88, 99],26,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))