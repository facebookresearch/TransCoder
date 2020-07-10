# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    um = dict ( )
    curr_sum = 0
    for i in range ( n ) :
        curr_sum += ( - 1 if ( arr [ i ] == 0 ) else arr [ i ] )
        if um.get ( curr_sum ) :
            um [ curr_sum ] += 1
        else :
            um [ curr_sum ] = 1
    count = 0
    for itr in um :
        if um [ itr ] > 1 :
            count += ( ( um [ itr ] * int ( um [ itr ] - 1 ) ) / 2 )
    if um.get ( 0 ) :
        count += um [ 0 ]
    return int ( count )


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 12, 18, 19, 19, 20, 20, 21, 25, 29, 38, 54, 54, 71, 72, 72, 74, 75, 77, 78, 80, 80, 81, 84, 97, 97],24,),
    ([10, 70, 24, -38, 32, -68, 88, -28, -24, -70, -64, 50, -30, 64, 54, -6, 18, -30, -30, -62, -10, 94, -54, -22, -88, 96, 22, 26, -92, -40, -76, 46, 36, 30, 24, -52, 0],24,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1],11,),
    ([66, 50, 17, 15, 86, 84, 87, 24, 81, 23, 71, 31, 13, 72, 58, 19, 29, 28, 40, 14, 48, 48, 81, 4, 52, 88, 54, 56, 10, 12, 58, 55, 7, 66, 15, 73, 22, 2, 20, 27, 57, 56, 56, 31, 9, 55],40,),
    ([-98, -62, -60, 16, 78, 82],5,),
    ([1, 0, 1],2,),
    ([2, 31, 34, 64],2,),
    ([-70, 90, -10, -64, -76, -74, -12, -44, -48, -54, 76, -78, 8, 0, 0, 78, -28, 6, 98, -84, 60, 60, 2, 48, -96, -28, -78, -76, -56, -26, -60, 50, 44, 34, -90, 80, -30, -98, 62, 36, -46, -72],25,),
    ([1, 1, 1],1,),
    ([37, 70, 80, 61, 86, 10, 17, 98, 54, 89, 87, 84, 11, 55, 3, 52, 4, 90, 98, 31, 20, 62, 71, 58, 58, 6, 92, 5, 99, 99, 72, 40, 82, 54, 23, 19, 85, 91, 62, 98, 62, 72, 93, 74],27,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))