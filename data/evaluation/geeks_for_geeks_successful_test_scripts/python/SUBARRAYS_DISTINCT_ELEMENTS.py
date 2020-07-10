# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    s = [ ]
    j = 0
    ans = 0
    for i in range ( n ) :
        while ( j < n and ( arr [ j ] not in s ) ) :
            s.append ( arr [ j ] )
            j += 1
        ans += ( ( j - i ) * ( j - i + 1 ) ) // 2
        s.remove ( arr [ i ] )
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ([3, 4, 5, 6, 12, 15, 16, 17, 20, 20, 22, 24, 24, 27, 28, 34, 37, 39, 39, 41, 43, 49, 49, 51, 55, 62, 63, 67, 71, 74, 74, 74, 77, 84, 84, 89, 89, 97, 99],24,),
    ([-8, 54, -22, 18, 20, 44, 0, 54, 90, -4, 4, 40, -74, -16],13,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],28,),
    ([36, 71, 36, 58, 38, 90, 17],4,),
    ([-90, -32, -16, 18, 38, 82],5,),
    ([1, 0, 1],2,),
    ([3, 11, 21, 25, 28, 28, 38, 42, 48, 53, 55, 55, 55, 58, 71, 75, 79, 80, 80, 94, 96, 99],20,),
    ([-16, -52, -4, -46, 54, 0, 8, -64, -82, -10, -62, -10, 58, 44, -28, 86, -24, 16, 44, 22, -28, -42, -52, 8, 76, -44, -34, 2, 88, -88, -14, -84, -36, -68, 76, 20, 20, -50],35,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],27,),
    ([19, 13, 61, 32, 92, 90, 12, 81, 52],5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))