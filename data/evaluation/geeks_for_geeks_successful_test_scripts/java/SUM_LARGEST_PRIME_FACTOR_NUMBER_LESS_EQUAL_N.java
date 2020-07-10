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
public class SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N{
static int f_gold ( int n ) {
  int prime [ ] = new int [ n + 1 ] , sum = 0 ;
  Arrays . fill ( prime , 0 ) ;
  int max = n / 2 ;
  for ( int p = 2 ;
  p <= max ;
  p ++ ) {
    if ( prime [ p ] == 0 ) {
      for ( int i = p * 2 ;
      i <= n ;
      i += p ) prime [ i ] = p ;
    }
  }
  for ( int p = 2 ;
  p <= n ;
  p ++ ) {
    if ( prime [ p ] != 0 ) sum += prime [ p ] ;
    else sum += p ;
  }
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(6);
    param0.add(35);
    param0.add(87);
    param0.add(91);
    param0.add(63);
    param0.add(11);
    param0.add(66);
    param0.add(17);
    param0.add(92);
    param0.add(81);
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