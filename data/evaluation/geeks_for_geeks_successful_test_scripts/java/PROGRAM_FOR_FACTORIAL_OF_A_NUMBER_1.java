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
public class PROGRAM_FOR_FACTORIAL_OF_A_NUMBER_1{
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
    param0.add(57);
    param0.add(28);
    param0.add(23);
    param0.add(79);
    param0.add(52);
    param0.add(42);
    param0.add(79);
    param0.add(77);
    param0.add(99);
    param0.add(70);
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