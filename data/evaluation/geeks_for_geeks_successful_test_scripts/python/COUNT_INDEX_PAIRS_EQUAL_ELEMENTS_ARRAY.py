# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    ans = 0
    for i in range ( 0 , n ) :
        for j in range ( i + 1 , n ) :
            if ( arr [ i ] == arr [ j ] ) :
                ans += 1
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ([4, 6, 9, 16, 16, 21, 36, 41, 58, 60, 62, 73, 77, 81, 95],12,),
    ([-86, -72, -26, -34, 18, -62, -66],3,),
    ([1],0,),
    ([16],0,),
    ([-88, -80, -72, -68, -64, -26, 4, 14, 16, 22, 30, 32, 60, 74, 82],11,),
    ([0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1],9,),
    ([3, 9, 10, 12, 17, 23, 27, 29, 42, 44, 59, 61, 71, 76, 78, 82, 84, 84, 89, 90, 93, 93, 97, 97],15,),
    ([68, -40, -46, -20, -64, 90],5,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],15,),
    ([99, 17, 94, 43, 97, 17, 11, 58, 75, 94, 37, 22, 54, 31, 41, 4, 55, 69, 92, 80, 45, 97, 16, 33, 36, 17, 43, 82, 81, 64, 22, 65, 85, 44, 47, 14],23,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))