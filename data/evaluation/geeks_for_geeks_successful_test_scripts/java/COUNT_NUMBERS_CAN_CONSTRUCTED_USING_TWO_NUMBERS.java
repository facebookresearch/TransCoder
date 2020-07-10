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
public class COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS{
static int f_gold ( int n , int x , int y ) {
  boolean [ ] arr = new boolean [ n + 1 ] ;
  if ( x <= n ) arr [ x ] = true ;
  if ( y <= n ) arr [ y ] = true ;
  int result = 0 ;
  for ( int i = Math . min ( x , y ) ;
  i <= n ;
  i ++ ) {
    if ( arr [ i ] ) {
      if ( i + x <= n ) arr [ i + x ] = true ;
      if ( i + y <= n ) arr [ i + y ] = true ;
      result ++ ;
    }
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(23);
    param0.add(56);
    param0.add(30);
    param0.add(51);
    param0.add(21);
    param0.add(69);
    param0.add(12);
    param0.add(44);
    param0.add(99);
    param0.add(46);
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(95);
    param1.add(63);
    param1.add(89);
    param1.add(99);
    param1.add(63);
    param1.add(69);
    param1.add(52);
    param1.add(65);
    param1.add(58);
    List<Integer> param2 = new ArrayList<>();
    param2.add(16);
    param2.add(6);
    param2.add(1);
    param2.add(46);
    param2.add(38);
    param2.add(50);
    param2.add(73);
    param2.add(9);
    param2.add(10);
    param2.add(37);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}