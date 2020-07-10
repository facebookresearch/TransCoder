# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( h , m ) :
    if ( h < 0 or m < 0 or h > 12 or m > 60 ) :
        print ( 'Wrong input' )
    if ( h == 12 ) :
        h = 0
    if ( m == 60 ) :
        m = 0
    hour_angle = 0.5 * ( h * 60 + m )
    minute_angle = 6 * m
    angle = abs ( hour_angle - minute_angle )
    angle = min ( 360 - angle , angle )
    return angle


#TOFILL

if __name__ == '__main__':
    param = [
    (7322.337365895532,6996.326968156217,),
    (-0.5025472034247969,-2910.070017192333,),
    (8735.336068205026,1910.3752934680874,),
    (-5478.862697905712,-9470.18148108585,),
    (8264.126919165505,7058.937313484608,),
    (-9671.311773842834,-3867.070379361206,),
    (9995.328351000411,2145.339179488316,),
    (-5274.574323066984,-3583.7503371694124,),
    (1310.8711644223736,5214.059687285893,),
    (-2829.678131972794,-9371.556600288217,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))