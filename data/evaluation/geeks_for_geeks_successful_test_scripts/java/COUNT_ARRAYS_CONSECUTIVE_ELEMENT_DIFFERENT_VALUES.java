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
public class COUNT_ARRAYS_CONSECUTIVE_ELEMENT_DIFFERENT_VALUES{
public static int f_gold ( int n , int k , int x ) {
  int [ ] dp = new int [ 109 ] ;
  dp [ 0 ] = 0 ;
  dp [ 1 ] = 1 ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) dp [ i ] = ( k - 2 ) * dp [ i - 1 ] + ( k - 1 ) * dp [ i - 2 ] ;
  return ( x == 1 ? ( k - 1 ) * dp [ n - 2 ] : dp [ n - 1 ] ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(9);
    param0.add(97);
    param0.add(16);
    param0.add(16);
    param0.add(6);
    param0.add(58);
    param0.add(6);
    param0.add(22);
    param0.add(51);
    param0.add(58);
    List<Integer> param1 = new ArrayList<>();
    param1.add(40);
    param1.add(47);
    param1.add(28);
    param1.add(82);
    param1.add(81);
    param1.add(10);
    param1.add(47);
    param1.add(4);
    param1.add(46);
    param1.add(25);
    List<Integer> param2 = new ArrayList<>();
    param2.add(38);
    param2.add(30);
    param2.add(13);
    param2.add(70);
    param2.add(29);
    param2.add(55);
    param2.add(20);
    param2.add(64);
    param2.add(66);
    param2.add(53);
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