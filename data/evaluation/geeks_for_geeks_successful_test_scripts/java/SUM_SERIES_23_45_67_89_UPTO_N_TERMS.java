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
public class SUM_SERIES_23_45_67_89_UPTO_N_TERMS{
static double f_gold ( int n ) {
  int i = 1 ;
  double res = 0.0 ;
  boolean sign = true ;
  while ( n > 0 ) {
    n -- ;
    if ( sign ) {
      sign = ! sign ;
      res = res + ( double ) ++ i / ++ i ;
    }
    else {
      sign = ! sign ;
      res = res - ( double ) ++ i / ++ i ;
    }
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(49);
    param0.add(4);
    param0.add(60);
    param0.add(90);
    param0.add(96);
    param0.add(29);
    param0.add(86);
    param0.add(47);
    param0.add(77);
    param0.add(87);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001)
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}