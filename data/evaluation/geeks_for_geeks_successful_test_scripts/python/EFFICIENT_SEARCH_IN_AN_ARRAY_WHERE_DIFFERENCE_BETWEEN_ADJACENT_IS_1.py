# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , x ) :
    i = 0
    while ( i <= n - 1 ) :
        if ( arr [ i ] == x ) :
            return i
        i += abs ( arr [ i ] - x )
    return - 1


#TOFILL

if __name__ == '__main__':
    param = [
    ([5, 4, 5, 6, 5, 4, 3, 2],29,6,),
    ([5, 4, 5, 6, 5, 4, 3, 2],19,3,),
    ([0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],37,1,),
    ([50,51,52,51,50,49,48],17,49,),
    ([-86,-68,-32,-6,6,10,30,34,58,92],6,6,),
    ([1,1,1,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0,1,1,1,0,0],27,22,),
    ([58],0,0,),
    ([-64,78,58,36,48,80,-80,74,-98,46,-48,24,80,72,90,-46,14,68,38,58,-54,80,44,-62,34,-28,92,84,90,44,-26,88,18,22,-32,54,58,92],24,34,),
    ([0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],35,1,),
    ([5],0,0,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))