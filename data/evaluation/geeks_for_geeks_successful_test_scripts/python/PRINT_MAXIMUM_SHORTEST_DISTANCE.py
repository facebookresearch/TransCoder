# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n , k ) :
    b = dict ( )
    for i in range ( n ) :
        x = a [ i ]
        d = min ( 1 + i , n - i )
        if x not in b.keys ( ) :
            b [ x ] = d
        else :
            b [ x ] = min ( d , b [ x ] )
    ans = 10 ** 9
    for i in range ( n ) :
        x = a [ i ]
        if ( x != ( k - x ) and ( k - x ) in b.keys ( ) ) :
            ans = min ( max ( b [ x ] , b [ k - x ] ) , ans )
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 27, 66, 89, 96, 96],4,4,),
    ([84, -38, -56, -20, -98, -40, -16, 22, 20, 98, -56, -32, -44, 30, -58, 26, -44, -32, 50, 46, 92],13,11,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],23,13,),
    ([20, 71, 66, 58, 74, 2, 63, 13, 1, 36, 28, 83, 24, 20, 85, 30, 59, 56, 8, 97, 58, 28, 28, 42],23,17,),
    ([-94, -88, -86, -68, -66, -64, -28, -12, 4, 18, 22, 28, 32, 34, 34, 40, 44, 46, 60, 68, 72, 78, 80, 84, 88, 96],16,15,),
    ([0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1],8,13,),
    ([8, 13, 54, 59, 61, 69, 89, 90, 92],4,8,),
    ([-58, 50, -74, -8, -50, 90, 90, -2, -22, 8, -76, 16, 4, 56, 94, 36, 28, -42, 80, -88, 88, 52, 74, 40, 12, -72, -50, 50, 88, -54, 32, -24, -48, -66, -86, 40, -6, 14, 10, -88, 56, 80, -34],27,42,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],9,12,),
    ([2, 60, 66, 39, 18, 60, 37, 75, 3, 64, 24, 16, 72, 95, 96, 44, 23, 58, 58, 33, 24, 96],21,17,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))