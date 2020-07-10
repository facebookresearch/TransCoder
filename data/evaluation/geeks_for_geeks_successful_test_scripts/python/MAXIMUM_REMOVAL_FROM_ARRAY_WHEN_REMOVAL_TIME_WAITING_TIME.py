# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    count = 0
    cummulative_sum = 0
    arr.sort ( )
    for i in range ( n ) :
        if arr [ i ] >= cummulative_sum :
            count += 1
            cummulative_sum += arr [ i ]
    return count


#TOFILL

if __name__ == '__main__':
    param = [
    ([7, 33, 34, 42, 42, 45, 73],5,),
    ([32, -10, -64, -20, 92, -66, 6, 44, -62, -98, 4, -48, 44, 42, 12, -90, 52, 86, -30, -80, 64, 94, 14],16,),
    ([0, 0, 0, 0, 1],2,),
    ([11, 85, 89, 71, 82, 44],3,),
    ([-96, -92, -78, -72, -68, -58, -52, -50, -50, -48, -42, -32, -20, -18, -4, 0, 0, 2, 18, 18, 20, 24, 32, 34, 36, 38, 38, 60, 66, 68, 70, 72, 72, 74, 76, 96, 98],21,),
    ([0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1],16,),
    ([8, 9, 10, 11, 12, 15, 17, 19, 20, 21, 24, 30, 33, 35, 36, 39, 41, 41, 42, 54, 62, 63, 68, 70, 71, 72, 77, 85, 86, 86, 94, 95, 97, 97],31,),
    ([96, 22, -60, 4, -94, -16, 46, 10, 76, -90, 4, 70, -72, 60, 28, -24, -66, 92, -70, 72, 36],20,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],13,),
    ([90, 63, 16, 40, 28, 97, 20, 63, 42, 31, 57, 84, 10, 12, 59, 69, 47, 7, 53, 67],10,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))