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
public class SUM_FIBONACCI_NUMBERS{
static int f_gold ( int n ) {
  if ( n <= 0 ) return 0 ;
  int fibo [ ] = new int [ n + 1 ] ;
  fibo [ 0 ] = 0 ;
  fibo [ 1 ] = 1 ;
  int sum = fibo [ 0 ] + fibo [ 1 ] ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    fibo [ i ] = fibo [ i - 1 ] + fibo [ i - 2 ] ;
    sum += fibo [ i ] ;
  }
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(9);
    param0.add(50);
    param0.add(7);
    param0.add(21);
    param0.add(21);
    param0.add(91);
    param0.add(11);
    param0.add(25);
    param0.add(62);
    param0.add(4);
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