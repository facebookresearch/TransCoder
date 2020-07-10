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
public class MAXIMUM_BINOMIAL_COEFFICIENT_TERM_VALUE{
static int f_gold ( int n ) {
  int [ ] [ ] C = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= Math . min ( i , n ) ;
    j ++ ) {
      if ( j == 0 || j == i ) C [ i ] [ j ] = 1 ;
      else C [ i ] [ j ] = C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ] ;
    }
  }
  int maxvalue = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) maxvalue = Math . max ( maxvalue , C [ n ] [ i ] ) ;
  return maxvalue ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(23);
    param0.add(41);
    param0.add(69);
    param0.add(56);
    param0.add(71);
    param0.add(38);
    param0.add(26);
    param0.add(52);
    param0.add(93);
    param0.add(44);
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