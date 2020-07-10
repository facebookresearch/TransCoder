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
public class COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4{
static int f_gold ( int n ) {
  int DP [ ] = new int [ n + 1 ] ;
  DP [ 0 ] = DP [ 1 ] = DP [ 2 ] = 1 ;
  DP [ 3 ] = 2 ;
  for ( int i = 4 ;
  i <= n ;
  i ++ ) DP [ i ] = DP [ i - 1 ] + DP [ i - 3 ] + DP [ i - 4 ] ;
  return DP [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(44);
    param0.add(9);
    param0.add(19);
    param0.add(10);
    param0.add(78);
    param0.add(94);
    param0.add(70);
    param0.add(81);
    param0.add(81);
    param0.add(49);
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