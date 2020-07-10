# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    if ( n < 1 ) :
        return False
    Min = min ( arr )
    Max = max ( arr )
    if ( Max - Min + 1 == n ) :
        visited = [ False for i in range ( n ) ]
        for i in range ( n ) :
            if ( visited [ arr [ i ] - Min ] != False ) :
                return False
            visited [ arr [ i ] - Min ] = True
        return True
    return False


#TOFILL

if __name__ == '__main__':
    param = [
    ([5, 4, 2, 3, 1, 6] ,6,),
    ([83, 78, 80, 81, 79, 82],6,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],28,),
    ([0],1,),
    ([-98, -90, -84, -80, -66, -56, -56, -50, -48, -44, -36, -22, -18, -10, -4, -2, 6, 6, 8, 24, 36, 36, 54, 62, 64, 64, 66, 68, 72, 84, 86, 92],0,),
    ([0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1],24,),
    ([2, 18, 21, 22, 27, 34, 52, 63, 75, 85, 85],9,),
    ([24, -70, 88, 76, -78, 44, 40, -92, -44, 16, -20, -40, 60, -64, 74, 78, -10, -86, -26, -66, 66, 82, 44, 62, -40, 0, -98],22,),
    ([0, 1, 1],1,),
    ([81, 7, 2, 33, 45, 57, 33, 24, 26, 86, 35, 73, 40, 17, 37, 6, 80, 53, 33, 56, 97, 77, 93, 71, 87, 13, 56, 23, 63, 91, 21, 6, 53, 77, 36, 31, 63, 88, 51, 45, 51, 17],31,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))