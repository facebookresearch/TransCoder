# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( input , unlock_code ) :
    rotation = 0 ;
    while ( input > 0 or unlock_code > 0 ) :
        input_digit = input % 10 ;
        code_digit = unlock_code % 10 ;
        rotation += min ( abs ( input_digit - code_digit ) , 10 - abs ( input_digit - code_digit ) ) ;
        input = int ( input / 10 ) ;
        unlock_code = int ( unlock_code / 10 ) ;
    return rotation ;


#TOFILL

if __name__ == '__main__':
    param = [
    (71,46,),
    (90,65,),
    (28,84,),
    (41,23,),
    (32,58,),
    (39,82,),
    (33,58,),
    (89,32,),
    (50,51,),
    (92,77,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))