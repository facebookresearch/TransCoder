# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n ) :
    inc , dcr = dict ( ) , dict ( )
    len_inc , len_dcr = [ 0 ] * n , [ 0 ] * n
    longLen = 0
    for i in range ( n ) :
        len = 0
        if inc.get ( arr [ i ] - 1 ) in inc.values ( ) :
            len = inc.get ( arr [ i ] - 1 )
        inc [ arr [ i ] ] = len_inc [ i ] = len + 1
    for i in range ( n - 1 , - 1 , - 1 ) :
        len = 0
        if dcr.get ( arr [ i ] - 1 ) in dcr.values ( ) :
            len = dcr.get ( arr [ i ] - 1 )
        dcr [ arr [ i ] ] = len_dcr [ i ] = len + 1
    for i in range ( n ) :
        if longLen < ( len_inc [ i ] + len_dcr [ i ] - 1 ) :
            longLen = len_inc [ i ] + len_dcr [ i ] - 1
    return longLen


#TOFILL

if __name__ == '__main__':
    param = [
    ([78],0,),
    ([-6, -18, -48, 58, -54, 76, 80, -56, 86, 58, -86, -86, -88, 32, 12, 58, 58, -16, 86, -24, 84, 86, 36, 18, 30, -32, -4, -36, -72, -4, 42, 94],18,),
    ([0, 1],1,),
    ([92, 26, 72, 8, 66, 28, 34, 61, 28],5,),
    ([-86, -82, -76, -68, -66, -64, -62, -56, -48, -42, -38, -30, -22, -18, -10, -10, -4, -2, 4, 28, 42, 44, 50, 50, 56, 58, 60, 76, 82, 86, 86, 98],25,),
    ([0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0],17,),
    ([3, 4, 8, 9, 12, 13, 16, 19, 23, 25, 29, 31, 34, 36, 38, 41, 42, 47, 49, 50, 51, 51, 58, 63, 66, 70, 73, 74, 75, 75, 75, 76, 76, 80, 82, 83, 83, 84, 86, 89, 90, 91, 91, 95, 96],44,),
    ([4, -76, 60, 48, -14, 72],3,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],17,),
    ([66, 80, 79, 72, 1, 67, 20, 67, 32, 40, 22, 64, 58, 67, 10, 21, 37, 49],15,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))