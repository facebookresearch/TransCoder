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
public class COUNT_SET_BITS_IN_AN_INTEGER{
static int f_gold ( int n ) {
  int count = 0 ;
  while ( n > 0 ) {
    count += n & 1 ;
    n >>= 1 ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(92);
    param0.add(73);
    param0.add(52);
    param0.add(24);
    param0.add(14);
    param0.add(58);
    param0.add(11);
    param0.add(8);
    param0.add(52);
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