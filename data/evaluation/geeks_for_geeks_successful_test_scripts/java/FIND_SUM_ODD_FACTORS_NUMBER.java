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
public class FIND_SUM_ODD_FACTORS_NUMBER{
static int f_gold ( int n ) {
  int res = 1 ;
  while ( n % 2 == 0 ) n = n / 2 ;
  for ( int i = 3 ;
  i <= Math . sqrt ( n ) ;
  i ++ ) {
    int count = 0 , curr_sum = 1 ;
    int curr_term = 1 ;
    while ( n % i == 0 ) {
      count ++ ;
      n = n / i ;
      curr_term *= i ;
      curr_sum += curr_term ;
    }
    res *= curr_sum ;
  }
  if ( n >= 2 ) res *= ( 1 + n ) ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(20);
    param0.add(6);
    param0.add(39);
    param0.add(80);
    param0.add(88);
    param0.add(7);
    param0.add(16);
    param0.add(27);
    param0.add(83);
    param0.add(6);
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