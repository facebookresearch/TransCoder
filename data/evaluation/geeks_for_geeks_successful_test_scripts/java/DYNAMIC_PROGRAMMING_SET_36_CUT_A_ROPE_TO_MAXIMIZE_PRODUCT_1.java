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
public class DYNAMIC_PROGRAMMING_SET_36_CUT_A_ROPE_TO_MAXIMIZE_PRODUCT_1{
static int f_gold ( int n ) {
  if ( n == 2 || n == 3 ) return ( n - 1 ) ;
  int res = 1 ;
  while ( n > 4 ) {
    n -= 3 ;
    res *= 3 ;
  }
  return ( n * res ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(62);
    param0.add(53);
    param0.add(8);
    param0.add(6);
    param0.add(35);
    param0.add(35);
    param0.add(46);
    param0.add(74);
    param0.add(69);
    param0.add(3);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}