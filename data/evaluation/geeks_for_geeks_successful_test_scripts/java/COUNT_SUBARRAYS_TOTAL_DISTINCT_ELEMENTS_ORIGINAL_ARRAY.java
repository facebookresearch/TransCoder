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
public class COUNT_SUBARRAYS_TOTAL_DISTINCT_ELEMENTS_ORIGINAL_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > vis = new HashMap < Integer , Integer > ( ) {
    @ Override public Integer get ( Object key ) {
      if ( ! containsKey ( key ) ) return 0 ;
      return super . get ( key ) ;
    }
  };
  for ( int i = 0 ;
  i < n ;
  ++ i ) vis . put ( arr [ i ] , 1 ) ;
  int k = vis . size ( ) ;
  vis . clear ( ) ;
  int ans = 0 , right = 0 , window = 0 ;
  for ( int left = 0 ;
  left < n ;
  ++ left ) {
    while ( right < n && window < k ) {
      vis . put ( arr [ right ] , vis . get ( arr [ right ] ) + 1 ) ;
      if ( vis . get ( arr [ right ] ) == 1 ) ++ window ;
      ++ right ;
    }
    if ( window == k ) ans += ( n - right + 1 ) ;
    vis . put ( arr [ left ] , vis . get ( arr [ left ] ) - 1 ) ;
    if ( vis . get ( arr [ left ] ) == 0 ) -- window ;
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{13,39,49,52,53,69,72,79,83,96});
    param0.add(new int[]{-98,-98,22,-10,-28,0,56,72,36,88,96,22,90,74,-60,-64,0,2,-42,0,94,-82,-74});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{35,23,41,58,66,92,3,33,78,70,80,86,21,21,74,19});
    param0.add(new int[]{-98,-80,-52,-10,4,76});
    param0.add(new int[]{1,0,0,0,1,0,0,0,1,1,0,0,0,1,0,1,0,1,0,0,1,1,1,0,0,1,0,1,0,1,1,1,0,0,0,1,1,0,1,1,1,1});
    param0.add(new int[]{2,7,10,17,26,36,37,85,87,88});
    param0.add(new int[]{64,-2,-94,-84,-48,86});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{91,49,94,81,64,5,13,70,82,9,80,82});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(20);
    param1.add(26);
    param1.add(12);
    param1.add(3);
    param1.add(36);
    param1.add(8);
    param1.add(5);
    param1.add(20);
    param1.add(9);
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