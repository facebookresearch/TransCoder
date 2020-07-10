# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    return ( ( 2 * a ) + ( 2 * b ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (801.0366882228715,456.71190645582783,),
    (-7069.610056819919,-4226.483870778477,),
    (7723.966966568705,5894.65405158763,),
    (-7935.859205856963,-5333.225064296693,),
    (6094.247432557289,1660.420120702062,),
    (-7371.490363309265,-1095.4543576847332,),
    (8368.473889617526,4735.838330834498,),
    (-3761.921143166053,-5315.871691690649,),
    (3139.1089185587884,6490.194159517967,),
    (-5218.286665567171,-8265.153014320813,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))