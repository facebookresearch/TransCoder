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
public class SUM_DIVISORS_1_N_1{
static int f_gold ( int n ) {
  int sum = 0 ;
  for ( int i = 1 ;
  i <= n ;
  ++ i ) sum += ( n / i ) * i ;
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(73);
    param0.add(41);
    param0.add(36);
    param0.add(28);
    param0.add(49);
    param0.add(24);
    param0.add(85);
    param0.add(59);
    param0.add(82);
    param0.add(40);
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