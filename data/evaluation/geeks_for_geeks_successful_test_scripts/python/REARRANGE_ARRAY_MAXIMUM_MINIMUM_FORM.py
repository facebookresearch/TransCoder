# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    temp = n * [ None ]
    small , large = 0 , n - 1
    flag = True
    for i in range ( n ) :
        if flag is True :
            temp [ i ] = arr [ large ]
            large -= 1
        else :
            temp [ i ] = arr [ small ]
            small += 1
        flag = bool ( 1 - flag )
    for i in range ( n ) :
        arr [ i ] = temp [ i ]
    return arr


#TOFILL

if __name__ == '__main__':
    param = [
    ([6, 8, 10, 11, 23, 25, 26, 34, 34, 37, 46, 51, 53, 56, 57, 57, 58, 62, 63, 68, 76, 77, 79, 80, 83, 85, 86, 88, 88, 93],25,),
    ([-82, 66, -48, -56, -4, -48, 26, -66, 76, -22, 58, -12, -82, -90, 76, 94, 84, -16, -14, 0, 44, -28, 64, 54, 34, -76, 30, -68, 66, 44, 92, -76, 6, -14, -16, -36, -2, 28, -94, 72, -34, 38, -76, -32, 58, -98],39,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],14,),
    ([12, 52, 67, 11, 17, 66, 25, 62, 98, 77, 6, 34, 13, 33, 48, 55, 51, 4, 4, 72, 1, 59, 80, 87, 61, 40, 1, 21, 9, 7, 19, 66, 78, 88, 57, 13, 54, 69, 72, 93, 32, 98, 85, 90, 56, 35, 70],34,),
    ([-94, -82, -62, -48, -44, -18, -12, -12, 22, 46, 94],5,),
    ([1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0],24,),
    ([5, 38, 84, 86, 89, 96],4,),
    ([-68, 80, 96, 34, -40, -24, 34, -32, 0, -50, -44, 54, 66, -2, -26, -74, -64, -70, -76, -98, -20, 82, 82, -66, -42, -64],22,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1],9,),
    ([13, 46, 67, 90, 7, 88, 25, 31, 4, 91, 54, 68, 30, 70, 19, 26, 82, 12, 73, 42, 52, 41],19,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))