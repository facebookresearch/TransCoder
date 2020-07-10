// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class PRODUCT_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING{
static int f_gold ( String tree , int k ) {
  int level = - 1 ;
  int product = 1 ;
  int n = tree . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( tree . charAt ( i ) == '(' ) level ++ ;
    else if ( tree . charAt ( i ) == ')' ) level -- ;
    else {
      if ( level == k ) product *= ( tree . charAt ( i ) - '0' ) ;
    }
  }
  return product ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("(0(5(6()())(4()(9()())))(7(1()())(3()())))");
    param0.add("(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))");
    param0.add("(0(5(6()())(4()(9()())))(7(1()())(3()())))");
    param0.add("(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))");
    param0.add("(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))");
    param0.add("(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))");
    param0.add("(0(5(6()())(4()(9()())))(7(1()())(3()())))");
    param0.add("(0(5(6()())(4()(9()())))(7(1()())(3()())))");
    param0.add("0010");
    param0.add("kjtdgmy");
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(3);
    param1.add(1);
    param1.add(2);
    param1.add(4);
    param1.add(100);
    param1.add(3);
    param1.add(0);
    param1.add(12);
    param1.add(97);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}