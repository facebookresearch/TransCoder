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
public class COMPUTE_MODULUS_DIVISION_BY_A_POWER_OF_2_NUMBER{
static int f_gold ( int n , int d ) {
  return ( n & ( d - 1 ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(54);
    param0.add(39);
    param0.add(35);
    param0.add(9);
    param0.add(62);
    param0.add(16);
    param0.add(93);
    param0.add(32);
    param0.add(39);
    param0.add(63);
    List<Integer> param1 = new ArrayList<>();
    param1.add(59);
    param1.add(84);
    param1.add(81);
    param1.add(60);
    param1.add(68);
    param1.add(16);
    param1.add(96);
    param1.add(38);
    param1.add(62);
    param1.add(16);
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