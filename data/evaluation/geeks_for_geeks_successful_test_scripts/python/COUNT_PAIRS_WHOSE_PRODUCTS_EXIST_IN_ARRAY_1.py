# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    result = 0
    Hash = set ( )
    for i in range ( n ) :
        Hash.add ( arr [ i ] )
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            product = arr [ i ] * arr [ j ]
            if product in ( Hash ) :
                result += 1
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ([7, 10, 17, 17, 18, 20, 27, 28, 29, 29, 31, 32, 41, 43, 45, 46, 63, 66, 69, 69, 70, 75, 87, 95],17,),
    ([-60],0,),
    ([0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],9,),
    ([52, 83, 36, 57, 93, 11, 32, 91, 52],8,),
    ([-98, -94, -90, -88, -76, -76, -64, -62, -60, -50, -46, -32, -24, -22, -20, -16, -4, -2, 6, 10, 20, 28, 30, 32, 34, 38, 40, 42, 54, 64, 72, 76, 82, 82, 86, 92, 92, 98, 98],22,),
    ([0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0],42,),
    ([2, 3, 10, 12, 15, 23, 26, 28, 29, 30, 31, 31, 33, 33, 35, 41, 45, 48, 50, 50, 53, 53, 56, 65, 66, 67, 68, 68, 72, 72, 75, 76, 79, 82, 90, 94, 94, 95, 97, 99],35,),
    ([14, 36, -54, -54],3,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1],12,),
    ([5, 69, 37, 80, 21, 98, 70, 70, 74, 95, 6, 67, 44, 55, 52, 89, 84, 99, 65, 52],12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))