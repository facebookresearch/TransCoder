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
public class RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1{
static int f_gold ( int n ) {
  int dp [ ] = new int [ n + 1 ] ;
  dp [ 0 ] = 0 ;
  dp [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) dp [ i ] = Math . max ( dp [ i / 2 ] + dp [ i / 3 ] + dp [ i / 4 ] , i ) ;
  return dp [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(50);
    param0.add(83);
    param0.add(18);
    param0.add(24);
    param0.add(31);
    param0.add(38);
    param0.add(94);
    param0.add(24);
    param0.add(13);
    param0.add(53);
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