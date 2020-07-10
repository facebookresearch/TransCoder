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
public class DOUBLE_FACTORIAL_1{
static int f_gold ( int n ) {
  int res = 1 ;
  for ( int i = n ;
  i >= 0 ;
  i = i - 2 ) {
    if ( i == 0 || i == 1 ) return res ;
    else res *= i ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(88);
    param0.add(24);
    param0.add(3);
    param0.add(22);
    param0.add(53);
    param0.add(2);
    param0.add(88);
    param0.add(30);
    param0.add(38);
    param0.add(2);
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