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
public class MAXIMUM_POINTS_INTERSECTION_N_CIRCLES{
static int f_gold ( int n ) {
  return n * ( n - 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(30);
    param0.add(25);
    param0.add(69);
    param0.add(39);
    param0.add(14);
    param0.add(60);
    param0.add(89);
    param0.add(27);
    param0.add(29);
    param0.add(29);
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