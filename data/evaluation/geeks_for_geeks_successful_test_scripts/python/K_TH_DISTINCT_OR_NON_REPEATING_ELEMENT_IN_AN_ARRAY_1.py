# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , size , KthIndex ) :
    dict = { }
    vect = [ ]
    for i in range ( size ) :
        if ( arr [ i ] in dict ) :
            dict [ arr [ i ] ] = dict [ arr [ i ] ] + 1
        else :
            dict [ arr [ i ] ] = 1
    for i in range ( size ) :
        if ( dict [ arr [ i ] ] > 1 ) :
            continue
        else :
            KthIndex = KthIndex - 1
        if ( KthIndex == 0 ) :
            return arr [ i ]
    return - 1


#TOFILL

if __name__ == '__main__':
    param = [
    ([17, 25, 27, 27, 73, 91],5,3,),
    ([-86, -74, -88, 28, -32, 20, -34, 32],5,6,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],33,32,),
    ([5, 11, 36, 27, 6, 24, 58, 44, 14, 68],7,5,),
    ([-98, -98, -94, -92, -86, -86, -70, -66, -64, -64, -58, -52, -46, -44, -44, -38, -38, -28, -24, -12, -10, -4, -2, 2, 8, 10, 12, 20, 22, 26, 26, 36, 42, 52, 54, 60, 60, 68, 82, 82, 92, 98],27,27,),
    ([0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1],27,20,),
    ([3, 8, 9, 10, 10, 13, 14, 16, 18, 23, 24, 25, 27, 28, 30, 33, 36, 39, 42, 42, 44, 45, 45, 48, 52, 52, 55, 55, 59, 59, 59, 60, 61, 61, 66, 66, 67, 68, 71, 72, 75, 76, 79, 80, 94, 94],44,26,),
    ([-12, 56, -48, 52, -96, -84, 32, -12, -6, 82, 70, 18, 66, -6, -22, -46, -54, 18, -14, -32, 68, 82, -44, -42, 10, 56, 8, -56, 24, 20, -38, 30, -52, -66, 82, -64, 68, -82, 52, -88, -34, -26, 94, 58, -4, -84, -60],37,46,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],22,21,),
    ([1, 23, 75, 84, 28, 34, 15, 13, 51, 69, 94, 45, 38, 38],13,12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))