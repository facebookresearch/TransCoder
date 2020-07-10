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
public class COUNT_NUMBER_OF_SOLUTIONS_OF_X2_1_MOD_P_IN_GIVEN_RANGE{
static int f_gold ( int n , int p ) {
  int ans = 0 ;
  for ( int x = 1 ;
  x < p ;
  x ++ ) {
    if ( ( x * x ) % p == 1 ) {
      int last = x + p * ( n / p ) ;
      if ( last > n ) last -= p ;
      ans += ( ( last - x ) / p + 1 ) ;
    }
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(94);
    param0.add(11);
    param0.add(88);
    param0.add(85);
    param0.add(74);
    param0.add(96);
    param0.add(49);
    param0.add(50);
    param0.add(21);
    param0.add(81);
    List<Integer> param1 = new ArrayList<>();
    param1.add(36);
    param1.add(79);
    param1.add(63);
    param1.add(43);
    param1.add(89);
    param1.add(33);
    param1.add(51);
    param1.add(24);
    param1.add(26);
    param1.add(19);
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