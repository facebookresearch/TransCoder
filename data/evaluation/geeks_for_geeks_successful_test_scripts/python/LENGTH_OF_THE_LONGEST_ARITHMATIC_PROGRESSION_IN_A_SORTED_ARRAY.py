# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( set , n ) :
    if ( n <= 2 ) :
        return n
    L = [ [ 0 for x in range ( n ) ] for y in range ( n ) ]
    llap = 2
    for i in range ( n ) :
        L [ i ] [ n - 1 ] = 2
    for j in range ( n - 2 , 0 , - 1 ) :
        i = j - 1
        k = j + 1
        while ( i >= 0 and k <= n - 1 ) :
            if ( set [ i ] + set [ k ] < 2 * set [ j ] ) :
                k += 1
            elif ( set [ i ] + set [ k ] > 2 * set [ j ] ) :
                L [ i ] [ j ] = 2
                i -= 1
            else :
                L [ i ] [ j ] = L [ j ] [ k ] + 1
                llap = max ( llap , L [ i ] [ j ] )
                i -= 1
                k += 1
                while ( i >= 0 ) :
                    L [ i ] [ j ] = 2
                    i -= 1
    return llap


#TOFILL

if __name__ == '__main__':
    param = [
    ([3, 4, 4, 7, 8, 19, 21, 22, 25, 27, 28, 29, 38, 40, 41, 42, 43, 46, 50, 50, 53, 53, 54, 55, 60, 64, 64, 69, 70, 75, 77, 81, 81, 82, 86, 87, 87, 88, 91, 94, 97],27,),
    ([40, -6, 50, -18, 42, 78, 38, -90, -44, -42, -86, 78, -68, 2, -32, -20, -44, 54, 80, 54, 70, 26, 82, -14, -74, -20, 74, 82],21,),
    ([0, 0, 0, 0, 1, 1, 1],5,),
    ([76, 80],1,),
    ([-92, -90, -88, -76, -76, -60, -46, -40, -24, -8, -8, -6, 2, 12, 36, 38, 58, 76, 80],13,),
    ([1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1],15,),
    ([5, 8, 11, 27, 27, 32, 32, 37, 50, 51, 55, 61, 62, 68, 73, 83],8,),
    ([52, -74, -32, -64, -52, -60, -70, 36, 70, 40, 40, -18, 90, -70, -82, -64, -8, -6, 36, 4, -58, 62, -96, 78, 36, 90, -70, -6, -84, 24, 84, 32, -90, 36, 70, -60, -56, 78, 48, 34, -16, 80, 82, 58, 14, -6, -8, 76],29,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],27,),
    ([11, 21, 76, 45, 8, 49, 97, 66, 17, 11, 87, 4, 34, 89, 79, 88, 6, 91, 19, 56, 91, 25, 17, 90, 26, 59, 34, 32, 43, 17, 98, 39, 72, 78, 93, 43],26,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))