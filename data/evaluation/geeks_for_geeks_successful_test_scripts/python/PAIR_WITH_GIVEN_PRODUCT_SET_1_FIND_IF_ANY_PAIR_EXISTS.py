# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x ) :
    for i in arr :
        for j in arr :
            if i * j == x :
                return True
    return False


#TOFILL

if __name__ == '__main__':
    param = [
        ([10, 20, 9, 40],4,400,),
        ([1,-10, 20, 9, -40],5,400,),
        ([0,0,0,0,0,1,1,1,1],7,8,),
        ([4,10, 20, 9, -40],5,-400,),
        ([-90,-86,-76,-72,-70,-62,-56,-50,-18,-12,-10,4,16,26,42,48,52,54,54,70,84,86,88,98],23,23,),
        ([1],0,0,),
        ([4,7,14,14,16,18,19,20,22,24,29,38,38,38,40,40,46,46,47,51,51,52,55,56,56,62,62,62,78,79,81,84,86,88,89,89,89],23,32,),
        ([72,80,-82,24,-98,90,-32,-56,-22,8,-12,8,-78,60,-62,50,12,-60,10,-54,74,98,26,56,24],21,19,),
        ([0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1],22,18,),
        ([93,40,48,99,95,59,43,58,79,70,28],9,5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))
