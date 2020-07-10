# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    count = 0
    arr.sort ( )
    l = 0
    r = 0
    while r < n :
        if arr [ r ] - arr [ l ] == k :
            count += 1
            l += 1
            r += 1
        elif arr [ r ] - arr [ l ] > k :
            l += 1
        else :
            r += 1
    return count


#TOFILL

if __name__ == '__main__':
    param = [
    ([5, 5, 10, 19, 29, 32, 40, 60, 65, 70, 72, 89, 92],7,12,),
    ([-38, 40, 8, 64, -38, 56, 4, 8, 84, 60, -48, -78, -82, -88, -30, 58, -58, 62, -52, -98, 24, 22, 14, 68, -74, 48, -56, -72, -90, 26, -10, 58, 40, 36, -80, 68, 58, -74, -46, -62, -12, 74, -58],24,36,),
    ([0, 0, 1],1,1,),
    ([16, 80, 59, 29, 14, 44, 13, 76, 7, 65, 62, 1, 34, 49, 70, 96, 73, 71, 42, 73, 66, 96],12,16,),
    ([-98, -88, -58, -56, -48, -34, -22, -18, -14, -14, -8, -4, -2, 2, 18, 38, 42, 46, 54, 68, 70, 90, 94, 96, 98],23,22,),
    ([0, 1, 1],2,1,),
    ([11, 43, 50, 58, 60, 68, 75],4,4,),
    ([86, 94, -80, 0, 52, -56, 42, 88, -10, 24, 6, 8],11,9,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],29,30,),
    ([54, 99, 4, 14, 9, 34, 81, 36, 80, 50, 34, 9, 7],9,8,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))