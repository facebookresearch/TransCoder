# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( A , B ) :
    variable = 1
    if ( A == B ) :
        return 1
    elif ( ( B - A ) >= 5 ) :
        return 0
    else :
        for i in range ( A + 1 , B + 1 ) :
            variable = ( variable * ( i % 10 ) ) % 10
        return variable % 10


#TOFILL

if __name__ == '__main__':
    param = [
    (79,84,),
    (61,29,),
    (39,77,),
    (39,65,),
    (61,78,),
    (86,73,),
    (7,92,),
    (86,50,),
    (86,63,),
    (11,2,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))