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
public class COUNT_NUMBER_OF_WAYS_TO_FILL_A_N_X_4_GRID_USING_1_X_4_TILES{
static int f_gold ( int n ) {
  int [ ] dp = new int [ n + 1 ] ;
  dp [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i >= 1 && i <= 3 ) dp [ i ] = 1 ;
    else if ( i == 4 ) dp [ i ] = 2 ;
    else {
      dp [ i ] = dp [ i - 1 ] + dp [ i - 4 ] ;
    }
  }
  return dp [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(61);
    param0.add(22);
    param0.add(65);
    param0.add(57);
    param0.add(36);
    param0.add(25);
    param0.add(16);
    param0.add(26);
    param0.add(92);
    param0.add(5);
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