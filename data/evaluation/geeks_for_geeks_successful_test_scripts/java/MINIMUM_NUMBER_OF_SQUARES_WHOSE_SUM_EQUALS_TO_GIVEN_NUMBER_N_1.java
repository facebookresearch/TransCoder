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
public class MINIMUM_NUMBER_OF_SQUARES_WHOSE_SUM_EQUALS_TO_GIVEN_NUMBER_N_1{
static int f_gold ( int n ) {
  if ( n <= 3 ) return n ;
  int dp [ ] = new int [ n + 1 ] ;
  dp [ 0 ] = 0 ;
  dp [ 1 ] = 1 ;
  dp [ 2 ] = 2 ;
  dp [ 3 ] = 3 ;
  for ( int i = 4 ;
  i <= n ;
  i ++ ) {
    dp [ i ] = i ;
    for ( int x = 1 ;
    x <= Math . ceil ( Math . sqrt ( i ) ) ;
    x ++ ) {
      int temp = x * x ;
      if ( temp > i ) break ;
      else dp [ i ] = Math . min ( dp [ i ] , 1 + dp [ i - temp ] ) ;
    }
  }
  int res = dp [ n ] ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(16);
    param0.add(33);
    param0.add(47);
    param0.add(98);
    param0.add(36);
    param0.add(81);
    param0.add(55);
    param0.add(19);
    param0.add(4);
    param0.add(22);
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