# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import heapq

def f_gold ( arr , n , k ) :
    sum = [ ]
    sum.append ( 0 )
    sum.append ( arr [ 0 ] )
    for i in range ( 2 , n + 1 ) :
        sum.append ( sum [ i - 1 ] + arr [ i - 1 ] )
    Q = [ ]
    heapq.heapify ( Q )
    for i in range ( 1 , n + 1 ) :
        for j in range ( i , n + 1 ) :
            x = sum [ j ] - sum [ i - 1 ]
            if len ( Q ) < k :
                heapq.heappush ( Q , x )
            else :
                if Q [ 0 ] < x :
                    heapq.heappop ( Q )
                    heapq.heappush ( Q , x )
    return Q [ 0 ]


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 3, 5, 7, 8, 29, 29, 44, 47, 52, 60, 65, 73, 83, 87, 92, 92, 95],10,12,),
    ([44, -98, -10, 14, -6, -46, 6, -74, -4, 36, 10, -2, 30, 28, 96, -84, -36, -76, 64, -74, -20, 94, -4, 14, 78, 52, -56, 98, -68, -76, -10, 20, 88, -98, 96, 80, 96, -32, -40, -30, 82],34,37,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],16,15,),
    ([58, 21, 97, 78, 78, 57, 29, 33, 57, 81, 66, 32, 11, 82, 28, 72, 46, 67, 42, 15, 60, 45, 16, 37],14,20,),
    ([-92, -90, -88, -84, -68, -66, -62, -58, -52, -44, -22, -16, -4, -4, 2, 12, 14, 14, 24, 26, 44, 56, 80, 90, 92, 94, 98],15,25,),
    ([1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0],5,5,),
    ([3, 4, 8, 12, 13, 14, 17, 19, 23, 24, 28, 29, 30, 35, 35, 38, 44, 47, 47, 53, 55, 56, 56, 58, 66, 67, 70, 71, 72, 73, 74, 75, 77, 78, 82, 84, 87, 87, 87, 88, 88, 93, 94, 96],26,25,),
    ([20, -58, 94, -70, 18, 16, -46, 38, -44, -92, -20, -70, -30, 50],11,7,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,23,),
    ([90, 77, 82, 38, 96, 62, 66, 4, 93, 30, 75, 22, 26, 61, 40, 11, 38, 55, 88, 24, 66, 47, 40, 71, 21, 5, 18, 31, 26, 56, 19, 47, 71, 34],28,32,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))