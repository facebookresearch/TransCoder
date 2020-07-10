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
public class PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM{
static int f_gold ( int process , int need ) {
  int minResources = 0 ;
  minResources = process * ( need - 1 ) + 1 ;
  return minResources ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(38);
    param0.add(82);
    param0.add(2);
    param0.add(38);
    param0.add(31);
    param0.add(80);
    param0.add(11);
    param0.add(2);
    param0.add(26);
    param0.add(37);
    List<Integer> param1 = new ArrayList<>();
    param1.add(37);
    param1.add(3);
    param1.add(26);
    param1.add(72);
    param1.add(85);
    param1.add(73);
    param1.add(9);
    param1.add(31);
    param1.add(59);
    param1.add(67);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}