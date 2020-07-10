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
public class COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2{
static int f_gold ( int n ) {
  int res = 0 ;
  for ( int x = 0 ;
  x * x < n ;
  x ++ ) for ( int y = 0 ;
  x * x + y * y < n ;
  y ++ ) res ++ ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(61);
    param0.add(45);
    param0.add(53);
    param0.add(4);
    param0.add(82);
    param0.add(86);
    param0.add(37);
    param0.add(48);
    param0.add(81);
    param0.add(50);
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