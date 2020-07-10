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
public class COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1{
static int f_gold ( int n ) {
  return 1 + ( n * 2 ) + ( n * ( ( n * n ) - 1 ) / 2 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(55);
    param0.add(36);
    param0.add(69);
    param0.add(92);
    param0.add(73);
    param0.add(16);
    param0.add(88);
    param0.add(19);
    param0.add(66);
    param0.add(68);
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