# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    max1 = max ( arr )
    res = 0
    for i in range ( 0 , n ) :
        if ( ( max1 - arr [ i ] ) % k != 0 ) :
            return - 1
        else :
            res += ( max1 - arr [ i ] ) / k
    return int ( res )


#TOFILL

if __name__ == '__main__':
    param = [
   ([4, 7, 19, 16],4,3),
   ([4,4,4,4,4],5,3),
   ([0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],39,1),
   ([85,36,52,8,52,15,16],5,6),
   ([-10,-5,-5,-20,10,30],6,5),
   ([0,1,0,0,1,1,1,0,0,0,0,1,1,0,0,1,0],10,15),
   ([1,5,5,9,11,12,12,13,13,14,16,18,26,26,28,28,30,31,32,37,37,38,40,43,44,45,47,47,55,58,60,62,63,64,69,78,83,84,92,96,96,99],26,33),
   ([76,-78,92,-98,16,44,86,96,-8,2,-96,74,-28,12,54,-40,-64,-12,4,48,68,-82,8,0,-4,88,48,-54,90,62,-84,76,-48,62,-80,-94,38,-4,36],34,3),
   ([0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],39,10),
   ([62,99,29,23,55,30,79,63,1,88,59,8,11,80,23,51,97,32,80,48,84,36,73,59,1,34,92,10],18,1),
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))
