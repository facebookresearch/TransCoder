# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    for i in range ( n ) :
        count = 0
        for j in range ( n ) :
            if arr [ j ] == arr [ i ] :
                count += 1
            if count > 2 * k :
                return False
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    ([1,1,2,3,1],5,2,),
    ([2,3,3,5,3,3],6,2,),
    ([0, 0, 1, 1, 1],2,1,),
    ([7, 60, 78, 91, 80, 75, 85, 21, 41, 63, 1, 84, 69, 13, 94, 25, 54, 54, 52, 68, 53, 35, 17, 37, 98, 27, 2, 31],24,2,),
    ([-96, -94, -82, -80, -78, -66, -36, -24, -18, -12, -2, -2, 6, 8, 10, 12, 36, 38, 42, 58, 64, 68, 82, 84, 86, 88, 94],24,3,),
    ([0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0],34,2,),
    ([16, 19, 25, 25, 32, 37, 48, 59, 60, 60, 71, 74, 77, 81, 91, 94],10,8,),
    ([-62, -94, 72, -22, 86, -80, 64, 98, -82, -50, 12, -4, 56, 46, -80, 2, -86, -44, -26, 68, -94, -82, 74, 26, 94, 40, 50, -40, -42, -10],20,4,),
    ([0, 0, 0, 0, 0, 1, 1, 1],5,2,),
    ([83, 57, 2, 47, 70, 22, 49, 51, 25, 57, 32, 7, 8, 99, 6, 86, 24, 79, 42, 43, 1, 24, 68, 11, 24, 12, 43, 40, 14, 45, 11, 46, 12, 80, 66],21,33,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))