# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A , arr_size , sum ) :
    A.sort ( )
    for i in range ( 0 , arr_size - 2 ) :
        l = i + 1
        r = arr_size - 1
        while ( l < r ) :
            if ( A [ i ] + A [ l ] + A [ r ] == sum ) :
                print ( "Triplet is" , A [ i ] , ', ' , A [ l ] , ', ' , A [ r ] ) ;
                return True
            elif ( A [ i ] + A [ l ] + A [ r ] < sum ) :
                l += 1
            else :
                r -= 1
    return False


#TOFILL

if __name__ == '__main__':
    param = [
    ([28, 47, 65, 89],3,3,),
    ([-26, -64, -2, 96, -52, -14, -56, 52, -70, 70, -64, 74, -8, 18, 78, 14, 6, -16, 50, 84, -90, 12, -88, 52, 52, -40, 58, -48, 98, -66, 46, -88, 68, 12, 0, 70, -42],22,24,),
    ([0],0,0,),
    ([49, 66, 22, 93, 52, 54, 80, 87],5,7,),
    ([-96, -92, -86, -74, -62, -60, -56, -54, -46, -38, -32, -26, -16, -16, -8, -4, 0, 6, 20, 28, 42, 44, 56],13,19,),
    ([1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1],39,39,),
    ([1, 2, 16, 16, 20, 24, 24, 38, 41, 54, 57, 72, 79, 83, 89, 90, 96, 97, 98],12,12,),
    ([52, 22, 78, -30],2,3,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],21,16,),
    ([72, 40, 92, 11, 98, 20, 4, 58, 49, 11, 58, 28, 16, 16, 44, 10, 50, 23, 83, 41, 41, 92, 1, 28, 26, 83, 6, 52, 48, 9, 77, 51],29,27,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))