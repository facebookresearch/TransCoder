# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , N , K ) :
    arr.sort ( )
    res = 2147483647
    for i in range ( ( N - K ) + 1 ) :
        curSeqDiff = arr [ i + K - 1 ] - arr [ i ]
        res = min ( res , curSeqDiff )
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    ([1, 1, 4, 18, 21, 35, 37, 39, 76, 81, 86, 92, 96],7,6,),
    ([-8, -6, 62, 52, -86, 2, -94, 0, -48, -38, 24, -48, 34],9,12,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],16,26,),
    ([23, 36, 43, 50, 74, 81, 94, 13, 30, 57, 30, 71, 10, 99, 66, 94, 83, 39, 37, 3, 89, 34],17,20,),
    ([-96, -94, -92, -84, -80, -72, -24, -22, -18, -14, 6, 8, 26, 28, 30, 36, 50, 58, 80, 84, 92, 92],21,12,),
    ([0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1],21,22,),
    ([6, 7, 9, 27, 30, 42, 54, 55, 57, 57, 59, 76, 84, 84, 84],13,14,),
    ([88, 44, -96, -72, -80, 0, -64, -64, -68, 4, 38, 4, -38, 68, -54, 92, -16, 62, 24, 54, 0, 54, 62, -70, 80, -12, 84, -16, -10, 88, -30, -56, 48, 50, -24, 94, 40, 28, -86, -12],31,26,),
    ([0, 1],1,1,),
    ([89, 18, 7, 54, 67, 93, 10, 61, 59, 59, 69, 63, 98, 8, 78, 55, 6, 1, 56, 97, 75, 88, 10],22,14,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))