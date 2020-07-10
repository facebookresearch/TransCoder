# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , l , h , key ) :
    if l > h :
        return - 1
    mid = ( l + h ) // 2
    if arr [ mid ] == key :
        return mid
    if arr [ l ] <= arr [ mid ] :
        if key >= arr [ l ] and key <= arr [ mid ] :
            return f_gold ( arr , l , mid - 1 , key )
        return f_gold ( arr , mid + 1 , h , key )
    if key >= arr [ mid ] and key <= arr [ h ] :
        return f_gold ( a , mid + 1 , h , key )
    return f_gold ( arr , l , mid - 1 , key )


#TOFILL

if __name__ == '__main__':
    param = [
    ([5, 6, 7, 8, 9, 10, 1, 2, 3],0,8,3,),
    ([30, 40, 50, 10, 20],0,4,40,),
    ([40,50,55,67,70,4,5,6,7],0,9,67,),
    ([14, 41, 38, 67, 99, 11, 96, 52, 4, 29, 22, 57, 3, 45, 14, 76, 70, 38, 93, 5, 74, 50, 18, 17, 20, 34, 51, 69, 86, 73],0,16,15,),
    ([-90, -88, -88, -82, -62, -44, -38, -38, -36, -34, -34, -32, -30, -28, -28, -26, -24, -20, -16, -16, -16, -6, -6, 2, 6, 8, 10, 14, 18, 18, 46, 50, 50, 54, 56, 58, 58, 60, 62, 70, 70, 74, 82, 84, 88, 94, 96],0,24,24,),
    ([1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0],0,10,10,),
    ([4, 7, 9, 10, 10, 11, 14, 16, 17, 21, 25, 27, 31, 34, 34, 34, 38, 41, 42, 42, 52, 56, 56, 58, 60, 66, 67, 68, 68, 70, 72, 74, 76, 82, 88, 88, 88, 89, 91, 93, 94, 95, 95],0,23,39,),
    ([92, 60, -60, 64, 18, 70, 56, 34, 58, 14, 28, -72, -22, -74, -46, -28, 64, 88, 18, -50, -14, -20, 64, 6, -4, -98, 60, 98, 84, -58, -98, 66, 80, 68, -42, -58, 82, 90, -72, 34, 34, 80, 88, -64, 66, -20, -26],0,25,25,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],0,40,29,),
    ([33, 18, 98, 47, 76, 58, 29, 68, 62, 78, 12, 95, 20, 88, 39, 12, 43, 45, 5, 45, 96, 64, 38, 28, 70, 25, 65, 79, 39],0,16,28,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))
