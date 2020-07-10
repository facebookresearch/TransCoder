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
public class COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_2{
static int f_gold ( int m , int n ) {
  int [ ] dp = new int [ n ] ;
  dp [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      dp [ j ] += dp [ j - 1 ] ;
    }
  }
  return dp [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(73);
    param0.add(70);
    param0.add(53);
    param0.add(80);
    param0.add(9);
    param0.add(38);
    param0.add(41);
    param0.add(80);
    param0.add(42);
    param0.add(54);
    List<Integer> param1 = new ArrayList<>();
    param1.add(75);
    param1.add(5);
    param1.add(62);
    param1.add(70);
    param1.add(59);
    param1.add(48);
    param1.add(49);
    param1.add(72);
    param1.add(52);
    param1.add(1);
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