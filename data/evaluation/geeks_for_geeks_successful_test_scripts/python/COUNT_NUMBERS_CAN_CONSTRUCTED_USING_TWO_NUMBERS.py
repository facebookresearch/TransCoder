# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n , x , y ) :
    arr = [ False for i in range ( n + 2 ) ]
    if ( x <= n ) :
        arr [ x ] = True
    if ( y <= n ) :
        arr [ y ] = True
    result = 0
    for i in range ( min ( x , y ) , n + 1 ) :
        if ( arr [ i ] ) :
            if ( i + x <= n ) :
                arr [ i + x ] = True
            if ( i + y <= n ) :
                arr [ i + y ] = True
            result = result + 1
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    (23,16,16,),
    (56,95,6,),
    (30,63,1,),
    (51,89,46,),
    (21,99,38,),
    (69,63,50,),
    (12,69,73,),
    (44,52,9,),
    (99,65,10,),
    (46,58,37,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))