# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    fw = [ 0 for k in range ( n ) ]
    bw = [ 0 for k in range ( n ) ]
    cur_max , max_so_far = arr [ 0 ] , arr [ 0 ]
    for i in range ( n ) :
        cur_max = max ( arr [ i ] , cur_max + arr [ i ] )
        max_so_far = max ( max_so_far , cur_max )
        fw [ i ] = cur_max
    cur_max = max_so_far = bw [ n - 1 ] = arr [ n - 1 ]
    i = n - 2
    while i >= 0 :
        cur_max = max ( arr [ i ] , cur_max + arr [ i ] )
        max_so_far = max ( max_so_far , cur_max )
        bw [ i ] = cur_max
        i -= 1
    fans = max_so_far
    for i in range ( 1 , n - 1 ) :
        fans = max ( fans , fw [ i - 1 ] + bw [ i + 1 ] )
    return fans


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 8, 14, 17, 19, 35, 38, 45, 50, 53, 55, 70, 82, 88, 92, 96],13,),
    ([-64, -56, -80, -82, 72, 62, -8, 48, -96, 34, 64, -38, -60, 80, 4, -64, -62, 34, 94, -16, 38, 62, -84, 48, 42, -40],22,),
    ([0, 0, 0, 0, 1, 1, 1],6,),
    ([3, 7, 50, 53, 72, 14, 18, 74, 27, 65, 41, 20, 54, 17, 87, 40, 63, 15, 47],11,),
    ([-96, -96, -94, -80, -74, -74, -74, -74, -70, -64, -60, -58, -52, -52, -44, -42, -40, -38, -36, -34, -30, -14, -12, -8, -2, 6, 12, 16, 24, 24, 48, 48, 66, 76, 76, 84, 90],32,),
    ([1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0],8,),
    ([4, 4, 5, 9, 11, 13, 13, 15, 16, 21, 23, 25, 27, 30, 31, 35, 35, 43, 43, 47, 49, 50, 52, 54, 55, 55, 57, 57, 57, 59, 62, 64, 66, 68, 69, 71, 73, 76, 80, 84, 88, 88, 90, 90, 97, 97, 99],34,),
    ([-86, -60, 4, 14, 6, -6, -50, 46, -50, -62, -56, 16, -76, 90, 40, 2, 36, 48, -26, 34, 78, 84, 2, -54, 94, 60, -26, 60, 84, 2, -98, 2, -74],25,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1],9,),
    ([36, 99, 27, 8, 90, 74, 67, 77, 49, 23, 43, 25, 68, 56, 85, 6],12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))