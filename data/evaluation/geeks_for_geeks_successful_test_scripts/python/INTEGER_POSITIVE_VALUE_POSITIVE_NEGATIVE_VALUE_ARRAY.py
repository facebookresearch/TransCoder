# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    hash = dict ( )
    maximum = 0
    for i in arr :
        if ( i < 0 ) :
            if abs ( i ) not in hash.keys ( ) :
                hash [ abs ( i ) ] = - 1
            else :
                hash [ abs ( i ) ] -= 1
        else :
            hash [ i ] = hash.get ( i , 0 ) + 1
    for i in arr :
        if i in hash.keys ( ) and hash [ i ] > 0 :
            return i
    return - 1


#TOFILL

if __name__ == '__main__':
    param = [
    ([1, 7, 10, 14, 15, 24, 27, 32, 33, 38, 39, 40, 42, 42, 47, 58, 75, 76, 78, 79, 83, 85, 89, 96],18,),
    ([-36, 14, -76, -70, 52, 18, 64],5,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],17,),
    ([35, 50, 36, 50, 82, 54, 10, 45, 13, 22, 1, 41, 13, 11, 4, 43, 50, 27, 94, 57],15,),
    ([-88, -86, -84, -80, -80, -74, -72, -48, -46, -46, -44, -34, -32, -24, -22, -14, 4, 4, 8, 8, 10, 12, 20, 20, 24, 24, 24, 28, 32, 34, 36, 44, 46, 54, 54, 60, 62, 62, 62, 70, 70, 80, 88, 88, 90],27,),
    ([0, 0],1,),
    ([1, 1, 3, 6, 6, 8, 12, 13, 17, 27, 28, 31, 40, 40, 42, 43, 53, 55, 58, 60, 60, 61, 65, 66, 72, 72, 75, 80, 84, 89, 96, 97, 99],31,),
    ([52, -38, -82, 30, -66, 42, 54, -96, -46, -30, 18, -50, 96, 90, 4, 74, -22, 8, 34, 74, -46, 8, -32, 88, -96, 26, -80, 50, 92, -80, 44, 36],24,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],16,),
    ([38, 20, 54, 51, 11, 61, 90, 28, 23, 55, 65, 87, 99, 70, 74, 3, 68, 23, 74, 53, 80, 7, 57, 24, 66, 8, 15, 63, 18, 67, 96, 31, 63, 50],30,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))