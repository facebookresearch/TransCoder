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
public class SQUARE_ROOT_OF_A_PERFECT_SQUARE_1{
static long f_gold ( int n ) {
  int x = n ;
  int y = 1 ;
  while ( x > y ) {
    x = ( x + y ) / 2 ;
    y = n / x ;
  }
  return ( long ) x ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(55);
    param0.add(51);
    param0.add(42);
    param0.add(2);
    param0.add(30);
    param0.add(77);
    param0.add(82);
    param0.add(31);
    param0.add(9);
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