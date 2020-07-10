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
public class LEONARDO_NUMBER_1{
static int f_gold ( int n ) {
  int dp [ ] = new int [ n + 1 ] ;
  dp [ 0 ] = dp [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) dp [ i ] = dp [ i - 1 ] + dp [ i - 2 ] + 1 ;
  return dp [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(75);
    param0.add(76);
    param0.add(55);
    param0.add(14);
    param0.add(43);
    param0.add(10);
    param0.add(16);
    param0.add(30);
    param0.add(44);
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