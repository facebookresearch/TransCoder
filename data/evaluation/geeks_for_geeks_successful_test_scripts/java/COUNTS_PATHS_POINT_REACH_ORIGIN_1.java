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
public class COUNTS_PATHS_POINT_REACH_ORIGIN_1{
static int f_gold ( int n , int m ) {
  int dp [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) dp [ i ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) dp [ 0 ] [ i ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = 1 ;
  j <= m ;
  j ++ ) dp [ i ] [ j ] = dp [ i - 1 ] [ j ] + dp [ i ] [ j - 1 ] ;
  return dp [ n ] [ m ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(55);
    param0.add(74);
    param0.add(76);
    param0.add(6);
    param0.add(2);
    param0.add(36);
    param0.add(40);
    param0.add(14);
    param0.add(42);
    param0.add(62);
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(15);
    param1.add(57);
    param1.add(90);
    param1.add(64);
    param1.add(1);
    param1.add(71);
    param1.add(56);
    param1.add(4);
    param1.add(12);
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