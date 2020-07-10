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
public class PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES{
static int f_gold ( int n ) {
  return 1 + n * ( n + 1 ) / 2 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(46);
    param0.add(68);
    param0.add(4);
    param0.add(12);
    param0.add(56);
    param0.add(14);
    param0.add(81);
    param0.add(29);
    param0.add(26);
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