# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x ) :
    i = 0
    while ( i < n ) :
        if ( arr [ i ] == x ) :
            return i
        i = i + abs ( arr [ i ] - x )
    print ( "number is not present!" )
    return - 1


#TOFILL

if __name__ == '__main__':
    param = [
    ([8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3],12,3,),
    ([6, 90],1,1,),
    ([1, 2, 3, 4, 5, 4],6,5,),
    ([97, 35, 60, 96, 3, 67, 72, 95, 55, 9, 69, 28, 15, 91, 31, 59],15,9,),
    ([-84, -78, -74, -70, -68, -60, -56, -54, -48, -46, -28, -16, -6, 0, 0, 8, 8, 8, 12, 16, 26, 30, 32, 34, 36, 40, 46, 48, 70, 70, 72, 76, 78, 78, 80, 84, 84, 86],22,31,),
    ([1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1],5,7,),
    ([55, 64, 76, 79, 93, 96],4,4,),
    ([66, -90, 98, -50, 0, 46, 42, 64, -96, -80, -96, 20, -10, -84],8,13,),
    ([0, 0, 0, 0, 0, 0, 1],6,5,),
    ([94, 4, 34, 87, 32, 3, 92, 68, 57, 76, 24, 33, 3, 4, 30, 70, 49, 30, 72, 82, 16, 53, 6, 24, 92, 96, 89, 28, 21, 8, 36, 9, 40, 85, 51, 1, 63, 68, 74, 26, 40, 3, 9, 32, 67, 4, 6, 73],25,25,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))
