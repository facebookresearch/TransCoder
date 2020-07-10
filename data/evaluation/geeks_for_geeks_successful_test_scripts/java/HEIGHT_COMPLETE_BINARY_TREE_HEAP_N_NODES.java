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
public class HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES{
static int f_gold ( int N ) {
  return ( int ) Math . ceil ( Math . log ( N + 1 ) / Math . log ( 2 ) ) - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(65);
    param0.add(94);
    param0.add(52);
    param0.add(31);
    param0.add(9);
    param0.add(1);
    param0.add(41);
    param0.add(98);
    param0.add(45);
    param0.add(24);
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