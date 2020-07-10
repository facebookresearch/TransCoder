# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( array , start , end ) :
    if ( start > end ) :
        return end + 1
    if ( start != array [ start ] ) :
        return start ;
    mid = int ( ( start + end ) / 2 )
    if ( array [ mid ] == mid ) :
        return f_gold ( array , mid + 1 , end )
    return f_gold ( array , start , mid )


#TOFILL

if __name__ == '__main__':
    param = [
    ([3, 6, 7, 9, 11, 14, 18, 30, 30, 32, 32, 34, 37, 44, 45, 45, 48, 48, 48, 52, 58, 60, 63, 67, 69, 69, 81, 83, 87, 89, 97, 99],24,18,),
    ([88, -62, 16, 80, 66, 78, 88, 38, 52, -96, 48, 98, 96, -62, 18, 34, -58, 30, -10, 26, -98, 48, -96, 4, 92, 36, 36, -36, -32, -70, 62, -58, -58, -84, 86, -98],19,26,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],26,28,),
    ([79, 99, 79, 85, 61, 58, 62, 61, 39, 87, 39, 74, 36, 70, 30, 43, 20, 52, 54, 50, 81, 98, 42],20,20,),
    ([-98, -72, -46, -44, -42, -40, -16, -4, 62, 70, 74],8,10,),
    ([1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0],26,23,),
    ([58],0,0,),
    ([4, -84, -42, 12, -50, 42, -36, -38, -36, 98, -2, 20, 6, -96, -78, 24, 34, 88, 0, 74, 0, -8, -86, -68, -42, 98, -26, 86, -70, -32, -82, 78, 46, 58, 84, 4, -60, -90, -52, -78],37,31,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],28,28,),
    ([8],0,0,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))