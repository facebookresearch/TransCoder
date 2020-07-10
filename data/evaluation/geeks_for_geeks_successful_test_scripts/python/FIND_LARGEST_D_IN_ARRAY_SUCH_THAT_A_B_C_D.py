# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( S , n ) :
    found = False
    S.sort ( )
    for i in range ( n - 1 , - 1 , - 1 ) :
        for j in range ( 0 , n ) :
            if ( i == j ) :
                continue
            for k in range ( j + 1 , n ) :
                if ( i == k ) :
                    continue
                for l in range ( k + 1 , n ) :
                    if ( i == l ) :
                        continue
                    if ( S [ i ] == S [ j ] + S [ k ] + S [ l ] ) :
                        found = True
                        return S [ i ]
    if ( found == False ) :
        return - 1


#TOFILL

if __name__ == '__main__':
    param = [
    ([8, 12, 14, 15, 16, 20, 27, 28, 29, 30, 35, 41, 46, 51, 53, 55, 55, 58, 63, 64, 72, 73, 75, 75, 75, 82, 82, 86, 89, 91, 92, 94, 95, 95, 97, 97, 98],24,),
    ([-62, 48, -22, -44, -58, -50, -82, 34, 26, -2, 86, -44, 92, -96, 42, -20, 10, 74, -56, -12, -28, -40],19,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1],8,),
    ([84, 58, 10, 67, 77, 66, 10, 47, 65, 55, 54],5,),
    ([-46, -28, -20, -18, 4, 8, 18, 38, 90, 90],6,),
    ([0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0],35,),
    ([11, 13, 14, 21, 26, 28, 36, 39, 41, 42, 43, 44, 49, 49, 57, 58, 59, 59, 63, 64, 67, 69, 70, 75, 78, 79, 83, 83, 86, 91, 92, 93, 96, 96, 96, 97],30,),
    ([74, 52, -16, 34, -88, 62, 54, 46, -82, 76, -48, 54, 50, -66, -18, 78, -48, 38, 96, -32, -82, 0, -76, 46, -56, 4, -30, -70, -62],16,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],17,),
    ([55, 74, 18, 4, 68, 66, 33, 61, 66, 92, 21, 9, 49, 14, 99, 87, 74, 6, 11, 25, 5, 58, 56, 20],23,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))