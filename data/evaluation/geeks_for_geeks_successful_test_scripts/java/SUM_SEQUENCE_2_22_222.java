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
public class SUM_SEQUENCE_2_22_222{
static double f_gold ( int n ) {
  return 0.0246 * ( Math . pow ( 10 , n ) - 1 - ( 9 * n ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(88);
    param0.add(79);
    param0.add(7);
    param0.add(36);
    param0.add(23);
    param0.add(10);
    param0.add(27);
    param0.add(30);
    param0.add(71);
    param0.add(6);
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