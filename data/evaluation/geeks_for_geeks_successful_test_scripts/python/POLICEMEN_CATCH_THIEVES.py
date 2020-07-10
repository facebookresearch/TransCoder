# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( arr , n , k ) :
    i = 0
    l = 0
    r = 0
    res = 0
    thi = [ ]
    pol = [ ]
    while i < n :
        if arr [ i ] == 'P' :
            pol.append ( i )
        elif arr [ i ] == 'T' :
            thi.append ( i )
        i += 1
    while l < len ( thi ) and r < len ( pol ) :
        if ( abs ( thi [ l ] - pol [ r ] ) <= k ) :
            res += 1
            l += 1
            r += 1
        elif thi [ l ] < pol [ r ] :
            l += 1
        else :
            r += 1
    return res


#TOFILL

if __name__ == '__main__':
    param = [
    (['A', 'B', 'B', 'D', 'E', 'E', 'F', 'G', 'G', 'G', 'I', 'J', 'O', 'P', 'Q', 'Q', 'Q', 'Q', 'R', 'R', 'S', 'U', 'X', 'Y', 'Y', 'c', 'd', 'h', 'i', 'i', 'i', 'i', 'k', 'k', 'l', 'l', 'l', 'l', 'm', 'p', 'r', 'r', 's', 't', 't', 'u', 'x', 'z'],33,45,),
    (['7', '6', '0', '1', '0', '1'],3,3,),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1'],9,10,),
    (['y', 'k', 'S', 'i', 's', 'r', 'i', 'z', 'y', 'f', 'E', 'U', 'y', 'G', 'f', 'f', 's', 'v', 'v', 'D', 'v', 'V', 'S', 'D', 'K', 'S', 'f', 'V', 'g', 'I', 'J', 'p', 'j', 'k', 'R', 'n', 'm', 'O', 'L', 'X', 'y', 'U', 'y', 'k', 'w'],24,44,),
    (['1', '1', '5', '8', '8'],2,2,),
    (['0', '1', '0', '0', '1', '1', '1', '0', '0', '0', '1', '0', '1', '0', '1', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '1', '1', '1', '0', '0', '0', '0', '0', '0'],23,18,),
    (['A', 'I', 'K', 'Q', 'Q', 'X', 'Z', 'f', 'g'],5,8,),
    (['7', '0', '6', '9', '7', '5', '1', '3', '9', '8', '0', '0', '1', '3', '9', '2', '5', '5', '2', '7', '9', '3', '3', '9', '3', '8', '5', '5', '0', '4', '6', '2', '7', '4', '0', '4', '6', '4', '2', '3'],35,28,),
    (['0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1'],8,10,),
    (['D', 'C', 'P', 'H', 'G', 'o', 'u', 'P', 'T', 'G', 'E', 'U', 'n', 'E', 'U'],11,12,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))