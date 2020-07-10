# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    um , curr_rem , maxSum = { } , 0 , 0
    sm = [ 0 ] * n
    sm [ 0 ] = arr [ 0 ]
    for i in range ( 1 , n ) :
        sm [ i ] = sm [ i - 1 ] + arr [ i ]
    for i in range ( n ) :
        curr_rem = sm [ i ] % k
        if ( not curr_rem and maxSum < sm [ i ] ) :
            maxSum = sm [ i ]
        elif ( not curr_rem in um ) :
            um [ curr_rem ] = i
        elif ( maxSum < ( sm [ i ] - sm [ um [ curr_rem ] ] ) ) :
            maxSum = sm [ i ] - sm [ um [ curr_rem ] ]
    return maxSum // k


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 3, 8, 8, 12, 14, 23, 25, 25, 27, 27, 29, 40, 42, 49, 52, 52, 54, 56, 57, 61, 68, 74, 77, 81, 82, 83, 84, 85, 85, 85, 87, 87, 88, 88, 90, 92, 96, 96],27,32,),
    ([-90, -34, 26, -20, -12, -42, 28, 12, -6, 58, -46, 4, -30, -28, -14],8,14,),
    ([0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],7,9,),
    ([58, 81, 36, 2, 51, 71, 77, 34, 91, 82, 47, 4, 91, 83, 26, 96, 3, 6],16,12,),
    ([-92, -86, -82, -68, -60, -46, -40, -28, -26, -24, -2, -2, 2, 2, 10, 10, 10, 16, 16, 18, 20, 20, 22, 30, 34, 38, 56, 56, 60, 62, 62, 68, 82, 94, 94, 98],20,31,),
    ([0, 1, 0],2,2,),
    ([3, 8, 15, 19, 21, 26, 28, 31, 31, 42, 45, 48, 57, 75, 75, 78, 79, 85, 91, 99],17,16,),
    ([-38, 42, 40, -60, -16, -36, 44, 60, -86, -38, 30, -22, -30, -96, -66],12,10,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1],13,16,),
    ([95, 38, 91, 75, 43, 95, 23, 36, 51, 4, 38, 53, 52, 58, 55, 3, 19, 22, 84, 9],14,19,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))