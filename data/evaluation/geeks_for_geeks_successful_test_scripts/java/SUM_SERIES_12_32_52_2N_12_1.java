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
public class SUM_SERIES_12_32_52_2N_12_1{
static int f_gold ( int n ) {
  return ( n * ( 2 * n - 1 ) * ( 2 * n + 1 ) ) / 3 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(84);
    param0.add(74);
    param0.add(91);
    param0.add(34);
    param0.add(36);
    param0.add(28);
    param0.add(70);
    param0.add(7);
    param0.add(24);
    param0.add(47);
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