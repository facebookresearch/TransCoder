# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    count = 0
    for i in range ( 0 , n ) :
        if ( arr [ i ] <= k ) :
            count = count + 1
    bad = 0
    for i in range ( 0 , count ) :
        if ( arr [ i ] > k ) :
            bad = bad + 1
    ans = bad
    j = count
    for i in range ( 0 , n ) :
        if ( j == n ) :
            break
        if ( arr [ i ] > k ) :
            bad = bad - 1
        if ( arr [ j ] > k ) :
            bad = bad + 1
        ans = min ( ans , bad )
        j = j + 1
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ([7, 12, 15, 30, 33, 34, 53, 66, 73, 74, 76, 77, 85, 90],9,8,),
    ([-62, -20, -26, -24, 92, 66, -74, -4, 18, -82, -36, 92, -4, 92, -80, 56, -24, 4, -48, -10, -14, -46, -16, -58, -58, -6, -68, -22, -82, -16, 76, -30, -86, -38, -66, 28, 58, 30, -44, -56],24,28,),
    ([0, 0, 0, 0, 0, 1, 1],5,6,),
    ([8, 48, 64, 77, 61, 60, 96, 95, 41, 68, 9, 67, 10, 66, 16, 59, 83, 21, 47, 16, 13, 85, 52, 11, 48, 31, 99, 57, 57, 44, 66, 93, 80, 69, 23, 2, 55, 90],36,24,),
    ([-80, -58, -40, -34, 14, 36, 48, 56, 58, 60, 84, 90, 92, 92],7,8,),
    ([1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1],26,23,),
    ([4, 4, 8, 9, 13, 17, 18, 19, 21, 22, 22, 23, 27, 28, 30, 44, 46, 48, 53, 53, 55, 60, 61, 62, 68, 70, 70, 71, 73, 80, 82, 82, 85, 88, 90, 93, 99],28,36,),
    ([-28, 50, 82, -32, 32, -78, 12, 50, 38, 34, -10, 6, 86, -56, -2],13,9,),
    ([0, 0, 0, 0, 1, 1, 1, 1, 1, 1],9,8,),
    ([37, 88, 83, 91, 11, 39, 98, 70, 93, 74, 24, 90, 66, 3, 6, 28],12,12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))