# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    hash_map = { } ;
    curr_sum = 0 ;
    max_len = 0 ;
    ending_index = - 1 ;
    for i in range ( 0 , n ) :
        if ( arr [ i ] == 0 ) :
            arr [ i ] = - 1 ;
        else :
            arr [ i ] = 1 ;
    for i in range ( 0 , n ) :
        curr_sum = curr_sum + arr [ i ] ;
        if ( curr_sum == 0 ) :
            max_len = i + 1 ;
            ending_index = i ;
        if ( curr_sum + n ) in hash_map :
            max_len = max ( max_len , i - hash_map [ curr_sum + n ] )
        else :
            hash_map [ curr_sum ] = i ;
    for i in range ( 0 , n ) :
        if ( arr [ i ] == - 1 ) :
            arr [ i ] = 0 ;
        else :
            arr [ i ] = 1 ;
    print ( ending_index - max_len + 1 , end = " " ) ;
    print ( "to" , end = " " ) ;
    print ( ending_index ) ;
    return max_len ;


#TOFILL

if __name__ == '__main__':
    param = [
    ([3, 6, 16, 16, 18, 19, 22, 39, 40, 42, 60, 66, 69, 70, 70, 73, 74, 80, 99],9,),
    ([-88, -66],1,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,),
    ([85, 98, 67, 27, 98, 13, 96, 32, 26, 44, 32],8,),
    ([-96, -94, -90, -88, -86, -66, -64, -52, -46, -46, -42, -40, -38, -32, -28, -22, -16, -10, -8, -8, -4, 2, 10, 26, 26, 28, 28, 40, 40, 42, 50, 60, 66, 68, 72, 74, 86, 92, 94],34,),
    ([1, 1, 1, 1, 1, 1, 0, 0, 0],4,),
    ([25, 64, 86],1,),
    ([-4, 78, -76, 12, 4, -38, -98, -26, -8, -98, 56, 0, -34, 36, -90, -36, 54, -68, 12, -44, 62, 60, -34, -52, 18],17,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],9,),
    ([2, 25, 45, 98, 71, 8, 58, 94, 53],8,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))