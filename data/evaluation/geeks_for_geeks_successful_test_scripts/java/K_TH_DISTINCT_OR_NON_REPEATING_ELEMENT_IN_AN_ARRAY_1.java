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
public class K_TH_DISTINCT_OR_NON_REPEATING_ELEMENT_IN_AN_ARRAY_1{
static int f_gold ( int arr [ ] , int n , int k ) {
  Map < Integer , Integer > h = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( h . containsKey ( arr [ i ] ) ) h . put ( arr [ i ] , h . get ( arr [ i ] ) + 1 ) ;
    else h . put ( arr [ i ] , 1 ) ;
  }
  if ( h . size ( ) < k ) return - 1 ;
  int dist_count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( h . get ( arr [ i ] ) == 1 ) dist_count ++ ;
    if ( dist_count == k ) return arr [ i ] ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{17,25,27,27,73,91});
    param0.add(new int[]{-86,-74,-88,28,-32,20,-34,32});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{5,11,36,27,6,24,58,44,14,68});
    param0.add(new int[]{-98,-98,-94,-92,-86,-86,-70,-66,-64,-64,-58,-52,-46,-44,-44,-38,-38,-28,-24,-12,-10,-4,-2,2,8,10,12,20,22,26,26,36,42,52,54,60,60,68,82,82,92,98});
    param0.add(new int[]{0,1,0,0,1,1,1,0,0,0,1,1,1,0,0,1,1,1,0,0,0,1,0,0,1,0,1,1,1,1});
    param0.add(new int[]{3,8,9,10,10,13,14,16,18,23,24,25,27,28,30,33,36,39,42,42,44,45,45,48,52,52,55,55,59,59,59,60,61,61,66,66,67,68,71,72,75,76,79,80,94,94});
    param0.add(new int[]{-12,56,-48,52,-96,-84,32,-12,-6,82,70,18,66,-6,-22,-46,-54,18,-14,-32,68,82,-44,-42,10,56,8,-56,24,20,-38,30,-52,-66,82,-64,68,-82,52,-88,-34,-26,94,58,-4,-84,-60});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{1,23,75,84,28,34,15,13,51,69,94,45,38,38});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(5);
    param1.add(33);
    param1.add(7);
    param1.add(27);
    param1.add(27);
    param1.add(44);
    param1.add(37);
    param1.add(22);
    param1.add(13);
    List<Integer> param2 = new ArrayList<>();
    param2.add(3);
    param2.add(6);
    param2.add(32);
    param2.add(5);
    param2.add(27);
    param2.add(20);
    param2.add(26);
    param2.add(46);
    param2.add(21);
    param2.add(12);
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