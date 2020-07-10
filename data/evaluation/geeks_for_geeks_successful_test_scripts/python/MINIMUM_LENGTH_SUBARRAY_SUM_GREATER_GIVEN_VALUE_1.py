# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x ) :
    curr_sum = 0 ;
    min_len = n + 1 ;
    start = 0 ;
    end = 0 ;
    while ( end < n ) :
        while ( curr_sum <= x and end < n ) :
            if ( curr_sum <= 0 and x > 0 ) :
                start = end ;
                curr_sum = 0 ;
            curr_sum += arr [ end ] ;
            end += 1 ;
        while ( curr_sum > x and start < n ) :
            if ( end - start < min_len ) :
                min_len = end - start ;
            curr_sum -= arr [ start ] ;
            start += 1 ;
    return min_len ;


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 4, 5, 10, 14, 15, 16, 20, 23, 28, 31, 35, 36, 36, 43, 48, 49, 55, 57, 57, 58, 61, 64, 64, 68, 70, 70, 73, 74, 76, 76, 77, 81, 81, 82, 87, 89, 92, 99],33,28,),
    ([66, -20, 12, -48, 22, 28, 40, -30, -6, -96, 10, -88, 40],11,12,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],42,23,),
    ([28, 19, 38, 31, 17, 27, 60, 35, 19, 47, 34, 51, 3, 95, 33, 29, 84, 46, 74, 87],15,15,),
    ([-48, -2],1,1,),
    ([1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1],12,15,),
    ([1, 4, 4, 6, 8, 10, 12, 12, 13, 15, 18, 20, 21, 23, 25, 28, 28, 33, 33, 35, 35, 36, 37, 38, 42, 44, 63, 63, 65, 65, 65, 66, 70, 74, 77, 78, 80, 80, 84, 87, 87, 89, 92, 93, 94, 97, 98, 99],42,27,),
    ([-82, -12, -40, 58, 22, -76, -94, -28, 42, 36, 64],10,6,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],10,14,),
    ([76, 65, 96, 76, 1, 91, 22, 29, 95, 21, 73, 68, 30, 52, 73, 86, 52, 66, 67, 37, 76, 53, 68, 6, 95, 81, 98, 42, 63, 38, 92, 78, 59, 86, 10, 38, 18, 15, 52, 62, 16, 66],23,35,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))