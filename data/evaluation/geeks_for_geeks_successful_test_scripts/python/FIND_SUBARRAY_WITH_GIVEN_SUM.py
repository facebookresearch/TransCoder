# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , sum ) :
    for i in range ( n ) :
        curr_sum = arr [ i ]
        j = i + 1
        while j <= n :
            if curr_sum == sum :
                print ( "Sum found between" )
                print ( "indexes %d and %d" % ( i , j - 1 ) )
                return 1
            if curr_sum > sum or j == n :
                break
            curr_sum = curr_sum + arr [ j ]
            j += 1
    print ( "No subarray found" )
    return 0


#TOFILL

if __name__ == '__main__':
    param = [
    ([4, 8, 8, 10, 15, 18, 19, 22, 25, 26, 30, 32, 35, 36, 40, 41, 43, 48, 53, 57, 59, 63, 64, 68, 71, 76, 76, 77, 78, 89, 96, 97],26,23,),
    ([-78, 16, -16, -10, -2, -38, 58, -72, -78, 50, -68, -16, -96, 82, 70, 2, -20],9,12,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1],9,11,),
    ([16, 10, 55, 43, 46, 74, 57, 65, 86, 60, 28, 6, 92],10,6,),
    ([-98, -98, -90, -84, -84, -80, -76, -76, -70, -54, -48, -46, -44, -42, -38, -14, -12, -4, 6, 8, 24, 28, 32, 40, 40, 42, 64, 84, 98],23,19,),
    ([0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1],12,8,),
    ([2, 10, 40, 45, 56, 66, 66, 70, 75, 83, 93, 98],10,10,),
    ([-20, 30, 56, -68, 54, -6, 78, -86, 88, -66, 76, -66, 62, 78, 22, 46, -94, -10, 18, 16, -36, 34, -98, -84, -40, 98, 82, 10, 12, 54, -88],30,17,),
    ([0, 0, 1, 1],2,2,),
    ([38, 24, 12],1,1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))