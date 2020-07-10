# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( tree , k ) :
    level = - 1
    product = 1
    n = len ( tree )
    for i in range ( 0 , n ) :
        if ( tree [ i ] == '(' ) :
            level += 1
        elif ( tree [ i ] == ')' ) :
            level -= 1
        else :
            if ( level == k ) :
                product *= ( int ( tree [ i ] ) - int ( '0' ) )
    return product


#TOFILL

if __name__ == '__main__':
    param = [
    ('(0(5(6()())(4()(9()())))(7(1()())(3()())))',2,),
    ('(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))',3,),
    ('(0(5(6()())(4()(9()())))(7(1()())(3()())))',1,),
    ('(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))',2,),
    ('(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))',4,),
    ('(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))',100,),
    ('(0(5(6()())(4()(9()())))(7(1()())(3()())))',3,),
    ('(0(5(6()())(4()(9()())))(7(1()())(3()())))',0,),
    ('0010',12,),
    ('kjtdgmy',97,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        if f_filled(*parameters_set) == f_gold(*parameters_set):
            n_success+=1
    print("#Results: %i, %i" % (n_success, len(param)))