# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x , y ) :
    count = 0 ;
    for i in range ( n ) :
        if ( arr [ i ] >= x and arr [ i ] <= y ) :
            count += 1
    return count


#TOFILL

if __name__ == '__main__':
    param = [
    ([9, 16, 19, 24, 36, 38, 42, 49, 51, 53, 53, 57, 57, 58, 71, 78, 78, 92, 92, 93],13,12,13,),
    ([28, -74, -18, 10, 26, 28, -96, -80, 82, 94, 22, 50, 72, -90, 76, 50, 20, -44, -80],18,13,13,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],30,21,31,),
    ([25, 8, 66, 90, 50, 65, 76, 90, 27],4,8,5,),
    ([-98, -96, -90, -82, -80, -78, -70, -66, -60, -60, -50, -48, -34, -26, -24, -16, -14, -8, -6, 4, 22, 24, 26, 30, 30, 48, 52, 56, 60, 62, 74, 76, 78, 86],32,24,24,),
    ([1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0],15,16,12,),
    ([4, 6, 17, 19, 24, 29, 30, 31, 32, 37, 37, 40, 43, 44, 44, 45, 57, 64, 69, 70, 73, 78, 86, 89, 91, 92, 94],17,21,15,),
    ([32, -88, 70, -6, 28, -48],4,3,4,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],13,12,11,),
    ([37, 84, 97, 74, 12, 26, 47, 10, 14, 33],5,9,8,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))