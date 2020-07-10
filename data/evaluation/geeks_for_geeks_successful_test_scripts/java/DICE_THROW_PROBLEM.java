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
public class DICE_THROW_PROBLEM{
public static long f_gold ( int m , int n , int x ) {
  long [ ] [ ] table = new long [ n + 1 ] [ x + 1 ] ;
  for ( int j = 1 ;
  j <= m && j <= x ;
  j ++ ) table [ 1 ] [ j ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= x ;
    j ++ ) {
      for ( int k = 1 ;
      k < j && k <= m ;
      k ++ ) table [ i ] [ j ] += table [ i - 1 ] [ j - k ] ;
    }
  }
  return table [ n ] [ x ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(94);
    param0.add(7);
    param0.add(20);
    param0.add(90);
    param0.add(50);
    param0.add(32);
    param0.add(46);
    param0.add(82);
    param0.add(43);
    param0.add(6);
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(12);
    param1.add(44);
    param1.add(94);
    param1.add(58);
    param1.add(90);
    param1.add(25);
    param1.add(50);
    param1.add(82);
    param1.add(83);
    List<Integer> param2 = new ArrayList<>();
    param2.add(69);
    param2.add(33);
    param2.add(24);
    param2.add(88);
    param2.add(27);
    param2.add(29);
    param2.add(6);
    param2.add(87);
    param2.add(70);
    param2.add(19);
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