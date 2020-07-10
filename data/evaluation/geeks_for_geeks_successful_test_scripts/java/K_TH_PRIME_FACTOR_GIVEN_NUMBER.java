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
public class K_TH_PRIME_FACTOR_GIVEN_NUMBER{
static int f_gold ( int n , int k ) {
  while ( n % 2 == 0 ) {
    k -- ;
    n = n / 2 ;
    if ( k == 0 ) return 2 ;
  }
  for ( int i = 3 ;
  i <= Math . sqrt ( n ) ;
  i = i + 2 ) {
    while ( n % i == 0 ) {
      if ( k == 1 ) return i ;
      k -- ;
      n = n / i ;
    }
  }
  if ( n > 2 && k == 1 ) return n ;
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(94);
    param0.add(99);
    param0.add(64);
    param0.add(27);
    param0.add(24);
    param0.add(84);
    param0.add(69);
    param0.add(69);
    param0.add(22);
    param0.add(39);
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(1);
    param1.add(3);
    param1.add(3);
    param1.add(4);
    param1.add(6);
    param1.add(98);
    param1.add(39);
    param1.add(60);
    param1.add(57);
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
