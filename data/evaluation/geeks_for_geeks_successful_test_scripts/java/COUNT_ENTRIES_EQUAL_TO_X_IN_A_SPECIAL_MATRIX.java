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
public class COUNT_ENTRIES_EQUAL_TO_X_IN_A_SPECIAL_MATRIX{
static int f_gold ( int n , int x ) {
  int f_gold = 0 ;
  for ( int i = 1 ;
  i <= n && i <= x ;
  i ++ ) {
    if ( x / i <= n && x % i == 0 ) f_gold ++ ;
  }
  return f_gold ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(47);
    param0.add(57);
    param0.add(55);
    param0.add(11);
    param0.add(55);
    param0.add(63);
    param0.add(64);
    param0.add(28);
    param0.add(49);
    param0.add(48);
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(16);
    param1.add(63);
    param1.add(23);
    param1.add(49);
    param1.add(64);
    param1.add(98);
    param1.add(30);
    param1.add(61);
    param1.add(64);
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