# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    vis = dict ( )
    for i in range ( n ) :
        vis [ arr [ i ] ] = 1
    k = len ( vis )
    vid = dict ( )
    ans = 0
    right = 0
    window = 0
    for left in range ( n ) :
        while ( right < n and window < k ) :
            if arr [ right ] in vid.keys ( ) :
                vid [ arr [ right ] ] += 1
            else :
                vid [ arr [ right ] ] = 1
            if ( vid [ arr [ right ] ] == 1 ) :
                window += 1
            right += 1
        if ( window == k ) :
            ans += ( n - right + 1 )
        vid [ arr [ left ] ] -= 1
        if ( vid [ arr [ left ] ] == 0 ) :
            window -= 1
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ([13, 39, 49, 52, 53, 69, 72, 79, 83, 96],5,),
    ([-98, -98, 22, -10, -28, 0, 56, 72, 36, 88, 96, 22, 90, 74, -60, -64, 0, 2, -42, 0, 94, -82, -74],20,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],26,),
    ([35, 23, 41, 58, 66, 92, 3, 33, 78, 70, 80, 86, 21, 21, 74, 19],12,),
    ([-98, -80, -52, -10, 4, 76],3,),
    ([1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1],36,),
    ([2, 7, 10, 17, 26, 36, 37, 85, 87, 88],8,),
    ([64, -2, -94, -84, -48, 86],5,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],20,),
    ([91, 49, 94, 81, 64, 5, 13, 70, 82, 9, 80, 82],9,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))