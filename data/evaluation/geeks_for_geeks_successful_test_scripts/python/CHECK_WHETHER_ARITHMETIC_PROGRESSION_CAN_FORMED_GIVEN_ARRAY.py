# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    if ( n == 1 ) : return True
    arr.sort ( )
    d = arr [ 1 ] - arr [ 0 ]
    for i in range ( 2 , n ) :
        if ( arr [ i ] - arr [ i - 1 ] != d ) :
            return False
    return True


#TOFILL

if __name__ == '__main__':
    param = [
    ([1,4,64,16],4,),
    ([0, 12, 4, 8],4,),
    ([-2, 2, 0, 4, 6],5,),
    ([0,0,0,0,0,0,0,0,0,0,0,0],7,),
    ([66,56,86,76,46],5,),
    ([66,56,56,86,76,46],6,),
    ([7, 9, 11, 21, 44, 45, 61, 67, 78, 97, 98, 99],11,),
    ([66, -28, -26, 50, -18, 54, 84, -2, -70, -74, 6, -34, 44, -36, -4, 36, 14, 24, 64, 74, 86, -96, 54, -68, -84, -62, -36, 34, -36, 70, -50, 6, 62, -50, -34, -38, -28, 74, 78, -2, -12, -4],33,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],33,),
    ([18, 93, 79, 20, 44, 36, 69, 37, 33, 82, 19, 51, 32, 22, 1, 54, 89, 20, 58, 35, 70, 70, 61, 63, 61, 57, 3, 95, 99, 45, 15, 17, 15, 5, 86, 46, 11, 64, 92, 14, 39, 67],40,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))