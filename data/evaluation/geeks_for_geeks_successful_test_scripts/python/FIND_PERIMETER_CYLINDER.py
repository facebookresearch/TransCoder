# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( diameter , height ) :
    return 2 * ( diameter + height )


#TOFILL

if __name__ == '__main__':
    param = [
    (70,78,),
    (97,46,),
    (49,26,),
    (56,61,),
    (87,79,),
    (64,21,),
    (75,93,),
    (90,16,),
    (55,16,),
    (73,29,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))