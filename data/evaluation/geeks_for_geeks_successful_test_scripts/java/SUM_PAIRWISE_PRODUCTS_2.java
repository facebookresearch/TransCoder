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
public class SUM_PAIRWISE_PRODUCTS_2{
static int f_gold ( int n ) {
  return n * ( n + 1 ) * ( n + 2 ) * ( 3 * n + 1 ) / 24 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(18);
    param0.add(97);
    param0.add(9);
    param0.add(42);
    param0.add(67);
    param0.add(71);
    param0.add(66);
    param0.add(69);
    param0.add(18);
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