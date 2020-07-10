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
public class SUM_BINOMIAL_COEFFICIENTS_1{
static int f_gold ( int n ) {
  return ( 1 << n ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(48);
    param0.add(42);
    param0.add(15);
    param0.add(75);
    param0.add(23);
    param0.add(41);
    param0.add(46);
    param0.add(99);
    param0.add(36);
    param0.add(53);
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