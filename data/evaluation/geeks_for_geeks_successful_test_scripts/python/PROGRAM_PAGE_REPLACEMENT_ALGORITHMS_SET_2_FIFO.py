# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
from queue import Queue

def f_gold ( pages , n , capacity ) :
    s = set ( )
    indexes = Queue ( )
    page_faults = 0
    for i in range ( n ) :
        if ( len ( s ) < capacity ) :
            if ( pages [ i ] not in s ) :
                s.add ( pages [ i ] )
                page_faults += 1
                indexes.put ( pages [ i ] )
        else :
            if ( pages [ i ] not in s ) :
                val = indexes.queue [ 0 ]
                indexes.get ( )
                s.remove ( val )
                s.add ( pages [ i ] )
                indexes.put ( pages [ i ] )
                page_faults += 1
    return page_faults


#TOFILL

if __name__ == '__main__':
    param = [
    ([4, 4, 6, 7, 8, 11, 13, 18, 26, 35, 36, 37, 45, 46, 46, 47, 48, 49, 51, 52, 53, 56, 61, 74, 75, 77, 80, 83, 85, 86, 87, 90, 93, 95, 97, 98, 99, 99],36,37,),
    ([78, -48, 50, -20, -6, 58, -8, 66, 72, 68, 4, 80, 58, -26, -82, -56, 92, 76, 20, 82, -46, 86, 38, 60, -62, -48, 76, 8, -66, -4, -98, -96, -52, 92],33,23,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,13,),
    ([98, 78, 94, 42, 62, 83, 7, 62, 60, 94, 16, 28, 50, 15, 18, 71, 86, 47, 62, 89],15,11,),
    ([-82, -70, -68, -56, -50, -44, 4, 18, 28, 30, 30, 42, 66, 78, 80],9,11,),
    ([1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0],25,25,),
    ([4, 5, 13, 15, 18, 28, 32, 40, 46, 46, 55, 57, 61, 63, 65, 68, 77, 79, 79, 96],17,18,),
    ([-2, 82, 2, -74, -6, -24, 54, -74, -98, 8, -94, -60, -42, -38, 36, -38, -58, -70, -28, -34, 70, -6, -2, -76, -40, -4, 0, -4, 76, 48, -34, -26, -48, -58, -88, -44, 20, -22, 78],31,24,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],26,24,),
    ([4, 90, 28, 71, 69, 45, 92, 63, 72, 76, 47, 85, 36, 59, 88, 46, 28, 19, 50, 31, 63, 13],15,12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))