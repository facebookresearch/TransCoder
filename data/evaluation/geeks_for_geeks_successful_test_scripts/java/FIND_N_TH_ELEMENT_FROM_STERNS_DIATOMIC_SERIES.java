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
public class FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES{
static int f_gold ( int n ) {
  int DP [ ] = new int [ n + 1 ] ;
  DP [ 0 ] = 0 ;
  DP [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    if ( i % 2 == 0 ) DP [ i ] = DP [ i / 2 ] ;
    else DP [ i ] = DP [ ( i - 1 ) / 2 ] + DP [ ( i + 1 ) / 2 ] ;
  }
  return DP [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(37);
    param0.add(24);
    param0.add(13);
    param0.add(56);
    param0.add(26);
    param0.add(67);
    param0.add(82);
    param0.add(60);
    param0.add(64);
    param0.add(65);
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