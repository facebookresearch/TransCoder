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
public class COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS{
static long f_gold ( int n ) {
  long dp [ ] [ ] = new long [ 2 ] [ n + 1 ] ;
  dp [ 0 ] [ 1 ] = 1 ;
  dp [ 1 ] [ 1 ] = 2 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    dp [ 0 ] [ i ] = dp [ 0 ] [ i - 1 ] + dp [ 1 ] [ i - 1 ] ;
    dp [ 1 ] [ i ] = dp [ 0 ] [ i - 1 ] * 2 + dp [ 1 ] [ i - 1 ] ;
  }
  return dp [ 0 ] [ n ] + dp [ 1 ] [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(68);
    param0.add(91);
    param0.add(99);
    param0.add(79);
    param0.add(61);
    param0.add(48);
    param0.add(89);
    param0.add(20);
    param0.add(83);
    param0.add(1);
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