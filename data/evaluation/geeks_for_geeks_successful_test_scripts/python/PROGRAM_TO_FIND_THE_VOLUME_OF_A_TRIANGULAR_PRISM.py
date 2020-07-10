# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( l , b , h ) :
    return ( ( l * b * h ) / 2 )


#TOFILL

if __name__ == '__main__':
    param = [
    (8448.900678262902,8135.461799983198,6577.239053611328,),
    (-1849.728957491451,-4240.89241631363,-9953.518310747193,),
    (412.667844022232,9798.083992381831,1449.9204200270522,),
    (-5954.835911765373,-661.8872499003203,-8049.6051526695055,),
    (8437.913444665008,8182.675681595904,9863.296545513396,),
    (-7183.181663518317,-6846.746446198541,-971.2199894221352,),
    (2340.7905920227954,5479.00956987109,7073.449591910562,),
    (-7281.157547371143,-615.8705455524116,-3343.0245192607968,),
    (471.3930826982504,1357.3753126091392,1907.815700915636,),
    (-7550.426360065503,-2693.2262997056355,-9110.64755244532,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))