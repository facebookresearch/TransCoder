# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y ) :
    if ( y == 0 ) : return 1
    temp = f_gold ( x , int ( y / 2 ) )
    if ( y % 2 == 0 ) :
        return temp * temp
    else :
        if ( y > 0 ) : return x * temp * temp
        else : return ( temp * temp ) / x


#TOFILL

if __name__ == '__main__':
    param = [
    (4922.762671782271,18,),
    (-838.1149138859112,7,),
    (8829.981827152698,18,),
    (-7084.090587314416,11,),
    (9213.145968063258,42,),
    (-4743.690018081376,63,),
    (3281.586891359318,30,),
    (-4006.1025383282854,63,),
    (7806.145296436601,52,),
    (-7219.421835366018,31,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))