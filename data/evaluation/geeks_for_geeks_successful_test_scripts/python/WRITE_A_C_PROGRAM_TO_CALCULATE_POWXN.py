# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y ) :
    if ( y == 0 ) : return 1
    elif ( int ( y % 2 ) == 0 ) :
        return ( f_gold ( x , int ( y / 2 ) ) * f_gold ( x , int ( y / 2 ) ) )
    else :
        return ( x * f_gold ( x , int ( y / 2 ) ) * f_gold ( x , int ( y / 2 ) ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (46,92,),
    (99,87,),
    (30,32,),
    (1,86,),
    (26,81,),
    (1,49,),
    (27,46,),
    (10,52,),
    (26,38,),
    (29,80,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))