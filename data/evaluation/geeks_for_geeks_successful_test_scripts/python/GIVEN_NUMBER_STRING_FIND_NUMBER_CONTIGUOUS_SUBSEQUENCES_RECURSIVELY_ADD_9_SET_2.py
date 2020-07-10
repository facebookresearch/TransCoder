# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( number ) :
    n = len ( number )
    d = [ 0 for i in range ( 9 ) ]
    d [ 0 ] = 1
    result = 0
    mod_sum = 0
    continuous_zero = 0
    for i in range ( n ) :
        if ( ord ( number [ i ] ) - ord ( '0' ) == 0 ) :
            continuous_zero += 1
        else :
            continuous_zero = 0
        mod_sum += ord ( number [ i ] ) - ord ( '0' )
        mod_sum %= 9
        result += d [ mod_sum ]
        d [ mod_sum ] += 1
        result -= continuous_zero
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ([' ', 'B', 'C', 'D', 'F', 'G', 'G', 'I', 'K', 'O', 'T', 'T', 'X', 'X', 'Z', 'Z', 'Z', 'c', 'g', 'i', 'i', 'm', 'q', 'q', 's', 't', 'v'],),
    (['1', '4', '0', '2', '9', '1', '8', '8', '2', '9', '3', '9', '5', '1', '3', '4', '7', '4', '5', '8', '0', '6', '4', '7', '2', '5', '0', '0', '2', '7', '7', '3', '3'],),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],),
    (['F', 'i', 'a', 'E', 'Q', 's', 's', 'a', 'K', 'j', 'N', 'U', 'U', 'p', 'R', 'u', 'Q', 's', 'i', 'c', 'Y', 'M', 'w', 'J', 's', 'M', 'L', 'z', 'c'],),
    (['0', '0', '0', '1', '1', '1', '1', '2', '2', '2', '3', '3', '3', '3', '4', '4', '5', '6', '6', '6', '7', '7', '8', '8', '8', '8', '9', '9'],),
    (['1', '0', '1', '0', '1', '0', '1', '1', '1', '1', '0', '1', '1', '0', '0', '1', '0', '0', '1', '0', '0', '0', '1', '0', '1', '1', '1', '0', '0', '0', '1', '1', '0', '1', '1', '0', '1', '0', '1', '1', '1', '1', '1', '1', '1', '0', '1'],),
    ([' ', 'C', 'S', 'v'],),
    (['2', '4', '1', '3', '3', '3', '0', '4', '0', '2', '2', '4', '1', '8', '4', '6', '4', '2', '9', '3', '5', '2', '8', '0', '1', '0', '7', '6', '8', '8', '7', '6', '6', '3', '1', '2', '2', '9', '5', '7', '2', '6', '5', '7', '1', '5'],),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1'],),
    (['l', 'X', 'i', 'J', 'e', 'm', 'L', 'g', 'L', 'p', 'b', 'y', 'E', 'g'],)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))