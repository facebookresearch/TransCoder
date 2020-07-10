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
public class COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2_1{
static int f_gold ( int n ) {
  int x = 0 , yCount , res = 0 ;
  for ( yCount = 0 ;
  yCount * yCount < n ;
  yCount ++ ) ;
  while ( yCount != 0 ) {
    res += yCount ;
    x ++ ;
    while ( yCount != 0 && ( x * x + ( yCount - 1 ) * ( yCount - 1 ) >= n ) ) yCount -- ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(72);
    param0.add(75);
    param0.add(92);
    param0.add(30);
    param0.add(45);
    param0.add(40);
    param0.add(81);
    param0.add(17);
    param0.add(81);
    param0.add(99);
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