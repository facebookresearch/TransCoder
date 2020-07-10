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
public class SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_1{
static int f_gold ( int n ) {
  int p = 1 ;
  if ( n > 0 && ( n & ( n - 1 ) ) == 0 ) return n ;
  while ( p < n ) p <<= 1 ;
  return p ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(31);
    param0.add(89);
    param0.add(92);
    param0.add(66);
    param0.add(38);
    param0.add(34);
    param0.add(17);
    param0.add(24);
    param0.add(54);
    param0.add(20);
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