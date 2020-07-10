# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    lioes = list ( )
    maxLen = 0
    for i in range ( n ) :
        lioes.append ( 1 )
    i = 1
    for i in range ( n ) :
        for j in range ( i ) :
            if ( arr [ i ] > arr [ j ] and ( arr [ i ] + arr [ j ] ) % 2 != 0 and lioes [ i ] < lioes [ j ] + 1 ) :
                lioes [ i ] = lioes [ j ] + 1
    for i in range ( n ) :
        if maxLen < lioes [ i ] :
            maxLen = lioes [ i ]
    return maxLen


#TOFILL

if __name__ == '__main__':
    param = [
    ([7, 8, 9, 16, 16, 27, 32, 33, 35, 35, 39, 39, 41, 42, 44, 47, 48, 50, 56, 59, 66, 69, 70, 73, 74, 76, 78, 87, 87, 89, 94, 96, 96, 98, 98],32,),
    ([40, 76, -54, -92, -28, -96, 8, 60, 28, -38, -62, -40, -16, 16, 52, 28, 70, -56, -50, 46, 68, -16, -56, 46, 42, 70, 52, -34, 86, -32, -50, 64, 36, 54, 20, 82, 84],25,),
    ([0, 0, 0, 0, 1, 1, 1],4,),
    ([15, 19, 87, 44, 15, 48, 21, 85, 90, 30, 88, 95, 48, 92, 29, 52, 46, 46, 7, 23, 96, 97, 43],19,),
    ([-98, -96, -94, -94, -94, -80, -80, -78, -64, -62, -62, -46, -42, -38, -36, -36, -34, -32, -20, -18, -16, -12, -8, -4, -4, -2, -2, 2, 6, 12, 34, 40, 42, 44, 46, 46, 50, 54, 58, 58, 70, 72, 72, 76, 78, 86],33,),
    ([0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1],13,),
    ([6, 7, 19, 36, 44, 63, 68, 72, 83],8,),
    ([-64, 12, 56, 50, 94, 6, 0, 70, -70, 46, -84, -64, 4, 76, 28, 94, -8, 24, 76, 64, -62, -34],15,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],21,),
    ([71, 57, 20, 8, 90, 69, 15, 62, 45, 14, 65, 20, 48, 9],10,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))