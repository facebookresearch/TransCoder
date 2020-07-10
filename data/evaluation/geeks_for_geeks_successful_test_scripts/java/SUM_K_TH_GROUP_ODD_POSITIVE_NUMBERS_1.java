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
public class SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS_1{
public static int f_gold ( int k ) {
  return k * k * k ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(96);
    param0.add(14);
    param0.add(64);
    param0.add(24);
    param0.add(74);
    param0.add(85);
    param0.add(27);
    param0.add(78);
    param0.add(1);
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