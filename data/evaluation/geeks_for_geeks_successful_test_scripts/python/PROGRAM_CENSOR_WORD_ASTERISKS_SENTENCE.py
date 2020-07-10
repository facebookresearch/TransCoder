# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( text , word ) :
    word_list = text.split ( )
    result = ''
    stars = '*' * len ( word )
    count = 0
    index = 0 ;
    for i in word_list :
        if i == word :
            word_list [ index ] = stars
        index += 1
    result = ' '.join ( word_list )
    return result


#TOFILL

if __name__ == '__main__':
    param = [
    ('IggvAXtmJ','kzHdEJuCaO',),
    ('76711241128','5',),
    ('010','0101001',),
    ('HIKOn','XlnBwpx',),
    ('3680369217','017523',),
    ('1111','1011',),
    ('zIi','ONNXygON',),
    ('06','54171617',),
    ('111','0010001011001',),
    ('NJNnrVU','AGwmS',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))