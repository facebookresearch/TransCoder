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
public class NUMBER_IS_DIVISIBLE_BY_29_OR_NOT{
static boolean f_gold ( long n ) {
  while ( n / 100 > 0 ) {
    int last_digit = ( int ) n % 10 ;
    n /= 10 ;
    n += last_digit * 3 ;
  }
  return ( n % 29 == 0 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(29L);
param0.add(0L);
param0.add(65L);
param0.add(1419L);
param0.add(54L);
param0.add(7L);
param0.add(44L);
param0.add(34L);
param0.add(1160L);
param0.add(292929002929L);
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
