# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , templeHeight ) :
    sum = 0
    for i in range ( n ) :
        left = 0
        right = 0
        for j in range ( i - 1 , - 1 , - 1 ) :
            if ( templeHeight [ j ] < templeHeight [ j + 1 ] ) :
                left += 1
            else :
                break
        for j in range ( i + 1 , n ) :
            if ( templeHeight [ j ] < templeHeight [ j - 1 ] ) :
                right += 1
            else :
                break
        sum += max ( right , left ) + 1
    return sum


#TOFILL

if __name__ == '__main__':
    param = [
    (12,[3, 11, 12, 15, 16, 21, 24, 29, 32, 39, 42, 44, 51, 68, 79, 81, 81, 85, 92, 94],),
    (46,[76, 48, 88, 70, -64, 66, -6, -58, 26, -28, -42, -94, 80, -4, -56, -46, 4, 90, -12, -78, 64, 18, -38, 26, 56, -24, 66, -18, -12, 0, -94, 12, -10, 4, -68, -20, 88, 2, -58, 16, 46, -80, -42, 44, -86, 96, -44],),
    (16,[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],),
    (9,[2, 95, 20, 50, 2, 58, 20, 14, 65, 69, 78, 7],),
    (0,[-88],),
    (38,[0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0],),
    (28,[2, 3, 6, 8, 9, 10, 14, 17, 17, 22, 25, 27, 29, 29, 30, 32, 33, 35, 38, 42, 50, 51, 51, 57, 59, 59, 59, 60, 62, 62, 63, 67, 70, 75, 76, 77, 81, 81, 83, 84],),
    (9,[-52, 62, 74, -62, -58, 62, 38, 42, -50, 20],),
    (18,[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],),
    (29,[96, 15, 9, 9, 40, 34, 17, 4, 51, 49, 34, 66, 97, 28, 64, 65, 92, 56, 74, 48, 43, 17, 82, 8, 21, 39, 83, 35, 42, 37, 64, 34, 42, 59, 45, 61, 55, 93, 94, 29, 20, 96, 77, 66],)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))