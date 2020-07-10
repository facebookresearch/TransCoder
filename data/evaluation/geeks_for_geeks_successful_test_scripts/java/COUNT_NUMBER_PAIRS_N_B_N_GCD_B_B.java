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
public class COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B{
static int f_gold ( int n ) {
  int k = n ;
  int imin = 1 ;
  int ans = 0 ;
  while ( imin <= n ) {
    int imax = n / k ;
    ans += k * ( imax - imin + 1 ) ;
    imin = imax + 1 ;
    k = n / imin ;
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(17);
    param0.add(72);
    param0.add(43);
    param0.add(55);
    param0.add(62);
    param0.add(22);
    param0.add(17);
    param0.add(68);
    param0.add(20);
    param0.add(29);
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