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
public class FIND_LARGEST_PRIME_FACTOR_NUMBER{
static long f_gold ( long n ) {
  long maxPrime = - 1 ;
  while ( n % 2 == 0 ) {
    maxPrime = 2 ;
    n >>= 1 ;
  }
  for ( int i = 3 ;
  i <= Math . sqrt ( n ) ;
  i += 2 ) {
    while ( n % i == 0 ) {
      maxPrime = i ;
      n = n / i ;
    }
  }
  if ( n > 2 ) maxPrime = n ;
  return maxPrime ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(98L);
    param0.add(8L);
    param0.add(78L);
    param0.add(65L);
    param0.add(55L);
    param0.add(10L);
    param0.add(10L);
    param0.add(37L);
    param0.add(39L);
    param0.add(15L);
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