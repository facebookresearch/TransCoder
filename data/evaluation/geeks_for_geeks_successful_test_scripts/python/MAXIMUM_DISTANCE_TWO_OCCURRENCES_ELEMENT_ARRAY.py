# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    mp = { }
    maxDict = 0
    for i in range ( n ) :
        if arr [ i ] not in mp.keys ( ) :
            mp [ arr [ i ] ] = i
        else :
            maxDict = max ( maxDict , i - mp [ arr [ i ] ] )
    return maxDict


#TOFILL

if __name__ == '__main__':
    param = [
    ([1, 20, 25, 28, 29, 31, 34, 35, 38, 39, 41, 43, 46, 55, 56, 60, 65, 66, 74, 77, 79, 80, 81, 83, 84, 88, 88, 88, 90, 91, 99],27,),
    ([26, 14, 56, 84, -56, -84, -98, 12, -78, 18, -42, 58, 46, -66, -46, 66, 98, 34, -16, 8, -20, 66, 74, 26, 42, -84, 38, 86, 14, 86, 26, -42, -30, 6, -54, -76, -66, 18, 58, 66, 74, -62, 8, -42, 62, -14, -90, 98, -24],34,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],11,),
    ([69, 87],1,),
    ([-98, -88, -86, -62, -52, -26, -24, -20, -12, 6, 8, 26, 36, 40, 42, 54, 68, 72, 84, 92, 94, 98, 98],12,),
    ([1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0],29,),
    ([11, 16, 17, 19, 20, 21, 21, 22, 27, 37, 45, 49, 64, 77, 81, 85, 96],9,),
    ([-20, 0, 18, -96],2,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],22,),
    ([54, 5, 98, 71, 9, 34, 60, 28, 58, 66, 28, 45, 4],10,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))