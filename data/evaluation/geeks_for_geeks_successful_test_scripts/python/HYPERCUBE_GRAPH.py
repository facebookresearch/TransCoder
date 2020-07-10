# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    if n == 1 :
        return 2
    return 2 * f_gold ( n - 1 )


#TOFILL

if __name__ == '__main__':
    param = [
    (72,),
    (28,),
    (45,),
    (41,),
    (94,),
    (97,),
    (97,),
    (36,),
    (91,),
    (84,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))