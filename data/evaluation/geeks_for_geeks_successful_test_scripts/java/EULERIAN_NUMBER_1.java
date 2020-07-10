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
public class EULERIAN_NUMBER_1{
public static int f_gold ( int n , int m ) {
  int [ ] [ ] dp = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= m ;
    j ++ ) {
      if ( i > j ) {
        if ( j == 0 ) dp [ i ] [ j ] = 1 ;
        else dp [ i ] [ j ] = ( ( i - j ) * dp [ i - 1 ] [ j - 1 ] ) + ( ( j + 1 ) * dp [ i - 1 ] [ j ] ) ;
      }
    }
  }
  return dp [ n ] [ m ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(27);
    param0.add(77);
    param0.add(35);
    param0.add(26);
    param0.add(6);
    param0.add(66);
    param0.add(44);
    param0.add(26);
    param0.add(74);
    param0.add(65);
    List<Integer> param1 = new ArrayList<>();
    param1.add(7);
    param1.add(34);
    param1.add(22);
    param1.add(20);
    param1.add(10);
    param1.add(47);
    param1.add(29);
    param1.add(33);
    param1.add(86);
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