# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    b_count = 0
    res = 0
    for i in range ( len ( s ) ) :
        if s [ ~ i ] == 'a' :
            res = ( res + b_count )
            b_count = ( b_count * 2 )
        else :
            b_count += 1
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    (['L', 'k', 'y'],),
    (['1', '0', '9', '5', '7', '4', '6', '0', '4', '8', '0', '1', '4', '1', '8', '9', '1', '5', '4', '4', '8', '0', '5', '8', '9', '8', '1', '9', '7', '0', '4', '2', '5', '2', '4', '6', '6', '5', '3', '1', '1', '0', '6'],),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],),
    (['A', 'L', 'a', 'l', 'G', ' ', 'p', 'b'],),
    (['0', '1', '1', '1', '2', '2', '4', '5', '5', '5', '6', '6', '6', '7', '9'],),
    (['0'],),
    ([' ', 'A', 'B', 'B', 'B', 'B', 'D', 'G', 'G', 'H', 'H', 'H', 'I', 'I', 'J', 'J', 'J', 'L', 'M', 'N', 'O', 'Q', 'U', 'U', 'X', 'Y', 'Y', 'Z', 'Z', 'c', 'c', 'e', 'f', 'h', 'k', 'o', 'p', 'q', 'q', 's', 'v', 'z'],),
    (['2', '5', '7', '5', '2', '3', '9'],),
    (['0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1'],),
    (['a', 'z', 'M', ' ', 'l', 'X', 'x', 'B', 'i', 'j'],)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))