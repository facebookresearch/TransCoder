# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( price , n ) :
    profit = [ 0 ] * n
    max_price = price [ n - 1 ]
    for i in range ( n - 2 , 0 , - 1 ) :
        if price [ i ] > max_price :
            max_price = price [ i ]
        profit [ i ] = max ( profit [ i + 1 ] , max_price - price [ i ] )
    min_price = price [ 0 ]
    for i in range ( 1 , n ) :
        if price [ i ] < min_price :
            min_price = price [ i ]
        profit [ i ] = max ( profit [ i - 1 ] , profit [ i ] + ( price [ i ] - min_price ) )
    result = profit [ n - 1 ]
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ([9, 10, 10, 12, 17, 18, 23, 32, 41, 44, 47, 50, 59, 69, 69, 75, 82, 84, 87, 89, 97, 99],20,),
    ([6, 6, 60, 40, 32, -70, -92, 88, 10, -8, -54, 4, 16, 8, -44, 80, -70, 36, 36, -74, -94, 18, -64, -66, -46, 0, -54, -84, 16, -88, -34, -24, 92, 84, 62],34,),
    ([0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],13,),
    ([2, 67, 50, 8, 20, 42, 37, 69, 86, 74, 85, 96, 78, 89, 91],8,),
    ([-68, -52, -14, -2, 18, 22, 30, 34, 64, 64, 70],9,),
    ([1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1],21,),
    ([4, 17, 19, 28, 29, 30, 30, 30, 35, 36, 36, 38, 40, 40, 42, 43, 45, 51, 55, 57, 58, 59, 64, 65, 66, 82, 84, 85, 87, 91, 92, 94, 98, 98],25,),
    ([52, 88, -40, 60, 30, 8, -96, 66, -96, -28, -56, -14, 76, -92, 56, 58, 64, -60, -90, 26, 64, -2, 54, -24, 54, -46, -44],14,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],22,),
    ([82, 14, 51, 12, 5, 15, 50, 88, 91, 82, 16, 98, 23, 58, 86, 91, 30, 81, 7, 73, 67, 47, 10, 50, 43, 31, 19, 2, 22],18,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))