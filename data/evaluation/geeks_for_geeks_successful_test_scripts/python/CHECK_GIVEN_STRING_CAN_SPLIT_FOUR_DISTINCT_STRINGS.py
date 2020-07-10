# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( s ) :
    if ( len ( s ) >= 10 ) :
        return True
    for i in range ( 1 , len ( s ) ) :
        for j in range ( i + 1 , len ( s ) ) :
            for k in range ( j + 1 , len ( s ) ) :
                s1 = s [ 0 : i ]
                s2 = s [ i : j - i ]
                s3 = s [ j : k - j ]
                s4 = s [ k : len ( s ) - k ]
                if ( s1 != s2 and s1 != s3 and s1 != s4 and s2 != s3 and s2 != s4 and s3 != s4 ) :
                    return True
    return False


#TOFILL

if __name__ == '__main__':
    param = [
    ('WKTj Nw',),
    ('8235021',),
    ('0101',),
    ('BLMhiQsQcFla',),
    ('00363175722',),
    ('10000',),
    ('aqEYWNd bqgye',),
    ('83',),
    ('000011110111',),
    ('E',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))