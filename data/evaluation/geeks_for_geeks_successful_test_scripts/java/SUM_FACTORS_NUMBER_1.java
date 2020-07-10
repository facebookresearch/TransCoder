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
public class SUM_FACTORS_NUMBER_1{
static int f_gold ( int n ) {
  int res = 1 ;
  for ( int i = 2 ;
  i <= Math . sqrt ( n ) ;
  i ++ ) {
    int curr_sum = 1 ;
    int curr_term = 1 ;
    while ( n % i == 0 ) {
      n = n / i ;
      curr_term *= i ;
      curr_sum += curr_term ;
    }
    res *= curr_sum ;
  }
  if ( n > 2 ) res *= ( 1 + n ) ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(96);
    param0.add(32);
    param0.add(93);
    param0.add(78);
    param0.add(30);
    param0.add(5);
    param0.add(62);
    param0.add(27);
    param0.add(95);
    param0.add(45);
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