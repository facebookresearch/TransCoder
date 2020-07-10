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
public class C_PROGRAM_FACTORIAL_NUMBER_1{
static int f_gold ( int n ) {
  int res = 1 , i ;
  for ( i = 2 ;
  i <= n ;
  i ++ ) res *= i ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(15);
    param0.add(7);
    param0.add(16);
    param0.add(67);
    param0.add(71);
    param0.add(16);
    param0.add(77);
    param0.add(27);
    param0.add(37);
    param0.add(73);
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