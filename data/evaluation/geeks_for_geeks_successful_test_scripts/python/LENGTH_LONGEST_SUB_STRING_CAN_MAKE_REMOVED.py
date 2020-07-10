# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( S ) :
    arr = [ ]
    arr.append ( [ '@' , - 1 ] )
    maxlen = 0
    for i in range ( len ( S ) ) :
        arr.append ( [ S [ i ] , i ] )
        while ( len ( arr ) >= 3 and arr [ len ( arr ) - 3 ] [ 0 ] == '1' and arr [ len ( arr ) - 2 ] [ 0 ] == '0' and arr [ len ( arr ) - 1 ] [ 0 ] == '0' ) :
            arr.pop ( )
            arr.pop ( )
            arr.pop ( )
        tmp = arr [ - 1 ]
        maxlen = max ( maxlen , i - tmp [ 1 ] )
    return maxlen


#TOFILL

if __name__ == '__main__':
    param = [
    ('U',),
    ('544',),
    ('111',),
    (' cDQaNxpRSOe',),
    ('42920062459',),
    ('00100101',),
    ('FiC',),
    ('302746335230',),
    ('1',),
    ('ZBLHiwGreUR ',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))