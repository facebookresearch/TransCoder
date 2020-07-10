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
public class MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION{
static int f_gold ( int n ) {
  int table [ ] = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) table [ i ] = n - i ;
  for ( int i = n ;
  i >= 1 ;
  i -- ) {
    if ( ! ( i % 2 > 0 ) ) table [ i / 2 ] = Math . min ( table [ i ] + 1 , table [ i / 2 ] ) ;
    if ( ! ( i % 3 > 0 ) ) table [ i / 3 ] = Math . min ( table [ i ] + 1 , table [ i / 3 ] ) ;
  }
  return table [ 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(59);
    param0.add(7);
    param0.add(90);
    param0.add(78);
    param0.add(49);
    param0.add(15);
    param0.add(45);
    param0.add(56);
    param0.add(7);
    param0.add(70);
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