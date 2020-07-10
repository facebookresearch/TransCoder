# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( digits , n ) :
    count = [ 0 ] * ( n + 1 ) ;
    count [ 0 ] = 1 ;
    count [ 1 ] = 1 ;
    for i in range ( 2 , n + 1 ) :
        count [ i ] = 0 ;
        if ( digits [ i - 1 ] > '0' ) :
            count [ i ] = count [ i - 1 ] ;
        if ( digits [ i - 2 ] == '1' or ( digits [ i - 2 ] == '2' and digits [ i - 1 ] < '7' ) ) :
            count [ i ] += count [ i - 2 ] ;
    return count [ n ] ;


#TOFILL

if __name__ == '__main__':
    param = [
    (['B', 'C', 'E', 'E', 'F', 'F', 'G', 'J', 'K', 'K', 'L', 'L', 'M', 'O', 'O', 'P', 'Q', 'R', 'V', 'X', 'Z', 'a', 'a', 'a', 'c', 'c', 'c', 'd', 'e', 'g', 'g', 'k', 'k', 'k', 'l', 'm', 'm', 'n', 'p', 't', 'y', 'z'],31,),
    (['0', '9', '5', '0', '2', '6', '5', '4', '4', '5', '2', '6', '8', '2', '0', '3', '1', '9', '0', '1', '5'],13,),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],19,),
    (['x', 'a', 'R', 'O', 'S', 'r', 'g', 'e', 'Y', 'Z', 't'],5,),
    (['0', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '3', '3', '4', '4', '5', '5', '5', '5', '5', '6', '6', '7', '7', '7', '7', '8', '8'],21,),
    (['1', '1', '1', '1', '1', '1'],4,),
    ([' ', ' ', ' ', 'B', 'B', 'C', 'D', 'F', 'H', 'I', 'J', 'K', 'L', 'O', 'P', 'V', 'W', 'W', 'Z', 'Z', 'a', 'c', 'h', 'i', 'q', 's', 'x'],26,),
    (['0', '9', '1', '5', '2', '4', '9', '3'],5,),
    (['0', '0', '0', '1', '1', '1'],4,),
    (['w', 't', 'U', 'R', 'a', 'c', 'G'],5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))