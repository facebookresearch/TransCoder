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
public class MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG{
public static int f_gold ( int cost [ ] , int n , int W ) {
  Vector < Integer > val = new Vector < Integer > ( ) ;
  Vector < Integer > wt = new Vector < Integer > ( ) ;
  int size = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( cost [ i ] != - 1 ) {
      val . add ( cost [ i ] ) ;
      wt . add ( i + 1 ) ;
      size ++ ;
    }
  }
  n = size ;
  int min_cost [ ] [ ] = new int [ n + 1 ] [ W + 1 ] ;
  for ( int i = 0 ;
  i <= W ;
  i ++ ) min_cost [ 0 ] [ i ] = Integer . MAX_VALUE ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) min_cost [ i ] [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= W ;
    j ++ ) {
      if ( wt . get ( i - 1 ) > j ) min_cost [ i ] [ j ] = min_cost [ i - 1 ] [ j ] ;
      else min_cost [ i ] [ j ] = Math . min ( min_cost [ i - 1 ] [ j ] , min_cost [ i ] [ j - wt . get ( i - 1 ) ] + val . get ( i - 1 ) ) ;
    }
  }
  return ( min_cost [ n ] [ W ] == Integer . MAX_VALUE ) ? - 1 : min_cost [ n ] [ W ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,38,74});
    param0.add(new int[]{-40,52,-54,-26,66,-28,22,-10,-28,-12,38,-92,28,76,-34,30,-16,-68,-20,56,-34,-68});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{77,50,40,94,43,9,36,29,39,69,7,45,91,97,94,89,76,86,96,1,12,94,92,39,4,22,49,31,34,84,61,11,39,8,59,9,27,66,33,37,25,18,36,78,8,45,91});
    param0.add(new int[]{-94,-92,-84,-82,-74,-62,-56,-46,-46,-42,-32,-30,-28,-24,-20,-18,-12,-10,-6,0,4,12,18,38,42,48,66,78,84,90,92});
    param0.add(new int[]{1,1,0,1,1,1,0,1,1,0,1,0});
    param0.add(new int[]{1,6,10,10,14,15,16,19,22,25,28,31,36,37,37,39,41,43,45,48,49,50,54,54,57,60,66,70,71,71,72,72,75,75,76,79,81,83,83,83,85,87,87,88,89,90,94});
    param0.add(new int[]{-30,-82,-14,-6,98,-22,54,-54,94,32,54,-6,60,30,62,-6,24});
    param0.add(new int[]{0,0,1,1,1});
    param0.add(new int[]{35,52,40,62,28,59,52,81,69,20,9,11,62,40,5,50,52,62,93,31,90,10,47,93,32,56,39,86});
    List<Integer> param1 = new ArrayList<>();
    param1.add(1);
    param1.add(21);
    param1.add(19);
    param1.add(34);
    param1.add(15);
    param1.add(7);
    param1.add(45);
    param1.add(10);
    param1.add(2);
    param1.add(16);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(20);
    param2.add(28);
    param2.add(40);
    param2.add(29);
    param2.add(9);
    param2.add(32);
    param2.add(12);
    param2.add(2);
    param2.add(23);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}