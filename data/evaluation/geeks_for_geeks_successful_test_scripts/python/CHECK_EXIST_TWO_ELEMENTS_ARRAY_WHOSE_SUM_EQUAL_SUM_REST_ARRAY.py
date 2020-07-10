# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    s = set ( )
    sum = 0
    for i in range ( n ) :
        sum += arr [ i ]
    if sum % 2 != 0 :
        return False
    sum = sum / 2
    for i in range ( n ) :
        val = sum - arr [ i ]
        if arr [ i ] not in s :
            s.add ( arr [ i ] )
        if val in s :
            print ( "Pair elements are" , arr [ i ] , "and" , int ( val ) )


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 11, 5, 1, 4, 7],6,),
    ([2, 4, 2, 1, 11, 15],6,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],13,),
    ([69, 6, 24, 30, 75, 37, 61, 76, 19, 18, 90, 9, 49, 24, 58, 97, 18, 85, 24, 93, 71, 98, 92, 59, 75, 75, 75, 70, 35, 58, 50, 1, 64, 66, 33],18,),
    ([-94, -94, -92, -74, -60, -58, -56, -44, -42, -40, -28, -14, 2, 4, 14, 20, 24, 28, 40, 42, 42, 66, 78, 78, 80, 82, 96],26,),
    ([1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1],10,),
    ([21, 26, 26, 27, 61, 62, 96],6,),
    ([-54, 86, 20, 26],3,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],4,),
    ([44, 35, 26, 15, 56, 6, 36, 53, 15, 66, 20, 53, 99, 96, 51, 12, 61, 19, 79, 40, 99, 42, 86, 8, 11, 54, 93, 46, 23, 47, 41, 26, 66, 5, 86, 52, 64, 51, 4, 21, 63, 14, 7, 53, 31, 8, 9, 63],31,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))