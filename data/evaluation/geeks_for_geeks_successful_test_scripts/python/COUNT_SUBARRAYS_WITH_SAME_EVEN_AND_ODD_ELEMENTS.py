# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    difference = 0
    ans = 0
    hash_positive = [ 0 ] * ( n + 1 )
    hash_negative = [ 0 ] * ( n + 1 )
    hash_positive [ 0 ] = 1
    for i in range ( n ) :
        if ( arr [ i ] & 1 == 1 ) :
            difference = difference + 1
        else :
            difference = difference - 1
        if ( difference < 0 ) :
            ans += hash_negative [ - difference ]
            hash_negative [ - difference ] = hash_negative [ - difference ] + 1
        else :
            ans += hash_positive [ difference ]
            hash_positive [ difference ] = hash_positive [ difference ] + 1
    return ans


#TOFILL

if __name__ == '__main__':
    param = [
    ([7, 8, 12, 13, 14, 19, 20, 22, 28, 30, 31, 31, 32, 34, 34, 39, 39, 43, 45, 46, 47, 62, 63, 63, 65, 66, 69, 69, 71, 76, 79, 82, 83, 88, 89, 92, 93, 95, 97, 97],26,),
    ([20, -98, -44, -82, 28, 20, -76, -16, 42, 0, -88, 74, 56, 6, -68, -30, 28, 88, 58, -78, 46, 2],15,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],24,),
    ([44, 4, 29, 83, 28, 75, 58, 89, 40, 38, 29, 45, 21, 87, 97, 42, 95, 20, 48, 38, 15, 67, 23, 81, 50, 53, 64, 67, 30, 13, 52, 56, 87, 10, 80, 38, 31, 19],23,),
    ([-94, -94, -94, -90, -88, -86, -86, -82, -78, -76, -74, -68, -64, -62, -62, -60, -52, -48, -48, -46, -44, -44, -32, -28, -22, -12, -12, -8, -8, -4, 4, 6, 10, 14, 28, 40, 42, 52, 56, 60, 60, 60, 64, 68, 70, 82, 82, 84, 96],48,),
    ([1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1],27,),
    ([6, 16, 21, 26, 34, 35, 44, 46, 46, 86],7,),
    ([86, 12, 80, 46, -12, 6],4,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],15,),
    ([71, 94, 91, 19, 85, 5, 87, 96, 66, 17, 95, 5, 32, 17, 93, 48, 46, 24],12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))