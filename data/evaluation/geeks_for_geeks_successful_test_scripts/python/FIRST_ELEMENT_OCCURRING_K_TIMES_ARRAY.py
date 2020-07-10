# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    count_map = { } ;
    for i in range ( 0 , n ) :
        if ( arr [ i ] in count_map.keys ( ) ) :
            count_map [ arr [ i ] ] += 1
        else :
            count_map [ arr [ i ] ] = 1
        i += 1
    for i in range ( 0 , n ) :
        if ( count_map [ arr [ i ] ] == k ) :
            return arr [ i ]
        i += 1
    return - 1


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 3, 4, 4, 7, 18, 20, 23, 27, 30, 31, 31, 32, 35, 36, 43, 45, 46, 49, 50, 53, 55, 59, 60, 64, 64, 65, 68, 78, 80, 80, 85, 95],30,2,),
    ([-26, 32, 36, 6, 64, 24, -28, 96],6,3,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],15,7,),
    ([38, 40, 43, 70, 20, 40, 95, 96, 81, 82],9,1,),
    ([-68, -8, -8, 16, 24, 54],3,2,),
    ([1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1],6,4,),
    ([13, 18, 19, 28, 31, 34, 49, 49, 53, 57, 58, 62, 75, 76, 77, 78, 80, 84, 84, 85, 87, 91, 98, 99],20,2,),
    ([-4, 24, -86, -84, 30, -16, 12, -92, -68, 22],6,5,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1],8,10,),
    ([55, 44, 75, 97, 25, 65, 76, 53, 20, 78, 25, 59, 61, 29, 81, 35, 15, 78, 41, 44, 31, 33, 39, 93, 26, 67],23,20,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))