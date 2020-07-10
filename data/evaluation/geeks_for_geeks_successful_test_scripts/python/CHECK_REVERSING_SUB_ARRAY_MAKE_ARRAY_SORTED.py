# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    temp = [ 0 ] * n
    for i in range ( n ) :
        temp [ i ] = arr [ i ]
    temp.sort ( )
    for front in range ( n ) :
        if temp [ front ] != arr [ front ] :
            break
    for back in range ( n - 1 , - 1 , - 1 ) :
        if temp [ back ] != arr [ back ] :
            break
    if front >= back :
        return True
    while front != back :
        front += 1
        if arr [ front - 1 ] < arr [ front ] :
            return False
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    ([5, 9, 9, 16, 17, 22, 32, 40, 45, 53, 57, 58, 66, 69, 76, 80, 91, 93, 94],10,),
    ([52, -76, -18, 86, 56],3,),
    ([0, 0, 1],1,),
    ([66, 44, 98, 44],2,),
    ([-96, -62, -56, -46, -44, -38, -38, -26, -22, -22, -16, -12, -6, 12, 22, 34, 36, 44, 44, 68, 70, 74, 94],14,),
    ([1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1],27,),
    ([5, 9, 11, 12, 13, 16, 19, 23, 23, 23, 25, 27, 27, 28, 31, 36, 40, 44, 48, 59, 60, 63, 66, 66, 67, 67, 69, 69, 70, 71, 73, 76, 76, 79, 86, 86, 92, 92, 93, 93],34,),
    ([6, 82, -88, -46, -60, 70, -54, -96, -94, 46, -52, 48, -26, -50, -92, -92, 6, -6, 42, 0, -66, -96, 66, 6, -68, -30, -54, 76, 60, 30, 72, -66, -12, -74],28,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],13,),
    ([62, 54, 36, 35, 36, 91, 45, 87, 74, 49, 15, 15, 73, 77, 63, 70, 74, 65, 11, 18],16,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))