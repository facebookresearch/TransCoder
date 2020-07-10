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
public class COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_1{
static int f_gold ( int m , int n ) {
  int count [ ] [ ] = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) count [ i ] [ 0 ] = 1 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) count [ 0 ] [ j ] = 1 ;
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    for ( int j = 1 ;
    j < n ;
    j ++ ) count [ i ] [ j ] = count [ i - 1 ] [ j ] + count [ i ] [ j - 1 ] ;
  }
  return count [ m - 1 ] [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(79);
    param0.add(95);
    param0.add(15);
    param0.add(71);
    param0.add(16);
    param0.add(91);
    param0.add(10);
    param0.add(98);
    param0.add(30);
    param0.add(58);
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(62);
    param1.add(9);
    param1.add(18);
    param1.add(85);
    param1.add(52);
    param1.add(91);
    param1.add(81);
    param1.add(42);
    param1.add(69);
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