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
public class COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N{
static int f_gold ( int n ) {
  int i = 0 ;
  int ans = 0 ;
  while ( ( 1 << i ) <= n ) {
    boolean k = false ;
    int change = 1 << i ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( k == true ) ans += 1 ;
      else ans += 0 ;
      if ( change == 1 ) {
        k = ! k ;
        change = 1 << i ;
      }
      else {
        change -- ;
      }
    }
    i ++ ;
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(90);
    param0.add(56);
    param0.add(43);
    param0.add(31);
    param0.add(77);
    param0.add(35);
    param0.add(43);
    param0.add(66);
    param0.add(15);
    param0.add(95);
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