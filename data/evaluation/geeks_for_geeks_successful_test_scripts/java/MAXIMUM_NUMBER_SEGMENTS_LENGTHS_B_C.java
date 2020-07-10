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
public class MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C{
static int f_gold ( int n , int a , int b , int c ) {
  int dp [ ] = new int [ n + 10 ] ;
  Arrays . fill ( dp , - 1 ) ;
  dp [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( dp [ i ] != - 1 ) {
      if ( i + a <= n ) dp [ i + a ] = Math . max ( dp [ i ] + 1 , dp [ i + a ] ) ;
      if ( i + b <= n ) dp [ i + b ] = Math . max ( dp [ i ] + 1 , dp [ i + b ] ) ;
      if ( i + c <= n ) dp [ i + c ] = Math . max ( dp [ i ] + 1 , dp [ i + c ] ) ;
    }
  }
  return dp [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(23);
    param0.add(62);
    param0.add(32);
    param0.add(82);
    param0.add(94);
    param0.add(44);
    param0.add(4);
    param0.add(53);
    param0.add(9);
    param0.add(23);
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(76);
    param1.add(46);
    param1.add(48);
    param1.add(99);
    param1.add(21);
    param1.add(57);
    param1.add(23);
    param1.add(55);
    param1.add(15);
    List<Integer> param2 = new ArrayList<>();
    param2.add(23);
    param2.add(81);
    param2.add(1);
    param2.add(72);
    param2.add(62);
    param2.add(46);
    param2.add(2);
    param2.add(80);
    param2.add(26);
    param2.add(73);
    List<Integer> param3 = new ArrayList<>();
    param3.add(18);
    param3.add(97);
    param3.add(78);
    param3.add(58);
    param3.add(38);
    param3.add(60);
    param3.add(77);
    param3.add(5);
    param3.add(85);
    param3.add(42);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}