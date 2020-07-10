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
public class N_TH_TERM_SERIES_2_12_36_80_150{
public static int f_gold ( int n ) {
  return ( n * n ) + ( n * n * n ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(90);
    param0.add(95);
    param0.add(22);
    param0.add(29);
    param0.add(62);
    param0.add(40);
    param0.add(52);
    param0.add(21);
    param0.add(33);
    param0.add(11);
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