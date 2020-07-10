# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( side ) :
    return ( ( side * side * side ) * ( math.sqrt ( 2 ) / 3 ) )


#TOFILL

if __name__ == '__main__':
    param = [
    (3355.322051344013,),
    (-891.0551553192736,),
    (8242.699647177868,),
    (-9259.146104439229,),
    (7712.806145993083,),
    (-4998.858862079315,),
    (9771.127582524628,),
    (-5415.8106399098115,),
    (670.0774772280249,),
    (-7068.634369272122,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))