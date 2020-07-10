# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , n , k ) :
    if k >= n - 1 :
        return n
    best = 0
    times = 0
    for i in range ( n ) :
        if a [ i ] > best :
            best = a [ i ]
            if i == True :
                times = 1
        else :
            times += 1
        if times >= k :
            return best
    return best


#TOFILL

if __name__ == '__main__':
    param = [
    ([2, 5, 5, 9, 10, 10, 11, 14, 23, 27, 31, 32, 33, 33, 33, 37, 39, 41, 41, 42, 42, 43, 47, 60, 61, 68, 73, 73, 73, 78, 80, 80, 82, 83, 86, 87, 89, 92, 94, 98],33,37,),
    ([80, -58, 64, 48, -16, 60, -50, -52, 62, -86, -96, 52, 26, -30, 14],14,13,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1],7,6,),
    ([90, 23, 43, 42, 7, 71, 79],4,4,),
    ([-96, -96, -90, -84, -68, -64, -56, -56, -50, -50, -48, -46, -28, -18, 0, 0, 6, 32, 32, 34, 42, 42, 46, 50, 50, 52, 64, 64, 70, 76, 84, 88],28,21,),
    ([1, 1, 1],1,2,),
    ([2, 9, 15, 19, 26, 29, 42, 45, 46, 47, 55, 60, 60, 61, 62, 64, 68, 69, 74, 79, 96],14,17,),
    ([-32, 12, 80, 42, 80, 8, 58, -76, -42, -98, 22, -90, -16, -4, -62, -32, 28, 12, 78, -52, -84, 78, 88, -76, -52, 68, -34, -16, -4, 2, -78, -94, -22, 34, 6, -62, 72],26,31,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],26,14,),
    ([52, 19],1,1,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))