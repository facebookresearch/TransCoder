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
public class COUNT_NUMBER_WAYS_TILE_FLOOR_SIZE_N_X_M_USING_1_X_M_SIZE_TILES{
static int f_gold ( int n , int m ) {
  int count [ ] = new int [ n + 1 ] ;
  count [ 0 ] = 0 ;
  int i ;
  for ( i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i > m ) count [ i ] = count [ i - 1 ] + count [ i - m ] ;
    else if ( i < m ) count [ i ] = 1 ;
    else count [ i ] = 2 ;
  }
  return count [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(93);
    param0.add(17);
    param0.add(38);
    param0.add(33);
    param0.add(78);
    param0.add(40);
    param0.add(95);
    param0.add(12);
    param0.add(69);
    param0.add(78);
    List<Integer> param1 = new ArrayList<>();
    param1.add(54);
    param1.add(4);
    param1.add(39);
    param1.add(64);
    param1.add(35);
    param1.add(61);
    param1.add(6);
    param1.add(8);
    param1.add(60);
    param1.add(21);
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