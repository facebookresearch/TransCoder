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
public class WRITE_A_C_PROGRAM_TO_FIND_THE_PARITY_OF_AN_UNSIGNED_INTEGER{
static boolean f_gold ( int n ) {
  boolean parity = false ;
  while ( n != 0 ) {
    parity = ! parity ;
    n = n & ( n - 1 ) ;
  }
  return parity ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(63);
    param0.add(64);
    param0.add(85);
    param0.add(36);
    param0.add(20);
    param0.add(63);
    param0.add(42);
    param0.add(19);
    param0.add(62);
    param0.add(97);
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