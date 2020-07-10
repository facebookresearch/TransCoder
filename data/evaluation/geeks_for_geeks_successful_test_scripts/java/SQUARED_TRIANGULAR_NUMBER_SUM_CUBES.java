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
public class SQUARED_TRIANGULAR_NUMBER_SUM_CUBES{
static int f_gold ( int s ) {
  int sum = 0 ;
  for ( int n = 1 ;
  sum < s ;
  n ++ ) {
    sum += n * n * n ;
    if ( sum == s ) return n ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(15);
    param0.add(36);
    param0.add(39);
    param0.add(43);
    param0.add(75);
    param0.add(49);
    param0.add(56);
    param0.add(14);
    param0.add(62);
    param0.add(97);
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