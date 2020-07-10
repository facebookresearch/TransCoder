# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    S = set ( ) ;
    for i in range ( n ) :
        S.add ( arr [ i ] ) ;
    ans = 0 ;
    for i in range ( n ) :
        if S.__contains__ ( arr [ i ] ) :
            j = arr [ i ] ;
            while ( S.__contains__ ( j ) ) :
                j += 1 ;
            ans = max ( ans , j - arr [ i ] ) ;
    return ans ;


#TOFILL

if __name__ == '__main__':
    param = [
    ([3, 5, 9, 24, 28, 31, 49, 54, 67, 85, 86, 94, 97, 97],11,),
    ([-34, 16, -80, -10, 80, 2, 50, -74, -76, 36, -84, -24, 74, -54, -22, 46, 80, 58, -8, 70, 24, -88, 52, 62, 30, 42, 48, 16, 78, -82, 64, -36, 84, -72],29,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],13,),
    ([49, 61, 68, 4, 90, 89, 71, 74, 45, 61, 35, 41, 59],11,),
    ([-42, -8, 28, 56, 80, 96],4,),
    ([1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1],17,),
    ([3, 4, 6, 6, 13, 27, 27, 29, 32, 36, 46, 50, 52, 65, 69, 70, 71, 83, 87, 91],10,),
    ([64, -76, 28, 6, 56, 18, 32, -50, -20, 18, -26, -90, 32, 50, -18, 98, 84, 40, 50, 88, -70, -6, -24, -44, -96, -58, 48, -78, -14],15,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],15,),
    ([50, 48, 61, 87, 7, 78, 93, 44, 16, 88, 98, 15, 73, 93, 43, 46, 42, 34, 1, 35, 79, 35, 84, 60, 18, 79, 17, 4, 78, 1, 20, 64],25,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))