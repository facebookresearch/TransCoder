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
public class SUM_PAIRWISE_PRODUCTS_1{
static int f_gold ( int n ) {
  int multiTerms = n * ( n + 1 ) / 2 ;
  int sum = multiTerms ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    multiTerms = multiTerms - ( i - 1 ) ;
    sum = sum + multiTerms * i ;
  }
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(41);
    param0.add(50);
    param0.add(67);
    param0.add(18);
    param0.add(60);
    param0.add(6);
    param0.add(27);
    param0.add(46);
    param0.add(50);
    param0.add(20);
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