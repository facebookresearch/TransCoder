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
public class COUNT_BINARY_STRINGS_K_TIMES_APPEARING_ADJACENT_TWO_SET_BITS{
static int f_gold ( int n , int k ) {
  int dp [ ] [ ] [ ] = new int [ n + 1 ] [ k + 1 ] [ 2 ] ;
  dp [ 1 ] [ 0 ] [ 0 ] = 1 ;
  dp [ 1 ] [ 0 ] [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i && j < k + 1 ;
    j ++ ) {
      dp [ i ] [ j ] [ 0 ] = dp [ i - 1 ] [ j ] [ 0 ] + dp [ i - 1 ] [ j ] [ 1 ] ;
      dp [ i ] [ j ] [ 1 ] = dp [ i - 1 ] [ j ] [ 0 ] ;
      if ( j - 1 >= 0 ) {
        dp [ i ] [ j ] [ 1 ] += dp [ i - 1 ] [ j - 1 ] [ 1 ] ;
      }
    }
  }
  return dp [ n ] [ k ] [ 0 ] + dp [ n ] [ k ] [ 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(29);
    param0.add(47);
    param0.add(77);
    param0.add(9);
    param0.add(29);
    param0.add(94);
    param0.add(51);
    param0.add(46);
    param0.add(18);
    param0.add(86);
    List<Integer> param1 = new ArrayList<>();
    param1.add(85);
    param1.add(29);
    param1.add(96);
    param1.add(91);
    param1.add(80);
    param1.add(85);
    param1.add(87);
    param1.add(62);
    param1.add(96);
    param1.add(86);
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