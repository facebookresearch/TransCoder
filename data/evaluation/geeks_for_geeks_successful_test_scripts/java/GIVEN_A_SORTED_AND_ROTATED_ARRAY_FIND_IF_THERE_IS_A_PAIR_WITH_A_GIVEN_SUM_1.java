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
public class GIVEN_A_SORTED_AND_ROTATED_ARRAY_FIND_IF_THERE_IS_A_PAIR_WITH_A_GIVEN_SUM_1{
static int f_gold ( int arr [ ] , int n , int x ) {
  int i ;
  for ( i = 0 ;
  i < n - 1 ;
  i ++ ) if ( arr [ i ] > arr [ i + 1 ] ) break ;
  int l = ( i + 1 ) % n ;
  int r = i ;
  int cnt = 0 ;
  while ( l != r ) {
    if ( arr [ l ] + arr [ r ] == x ) {
      cnt ++ ;
      if ( l == ( r - 1 + n ) % n ) {
        return cnt ;
      }
      l = ( l + 1 ) % n ;
      r = ( r - 1 + n ) % n ;
    }
    else if ( arr [ l ] + arr [ r ] < x ) l = ( l + 1 ) % n ;
    else r = ( n + r - 1 ) % n ;
  }
  return cnt ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{24,54});
    param0.add(new int[]{68,-30,-18,-6,70,-40,86,98,-24,-48});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{84,44,40,45,2,41,52,17,50,41,5,52,48,90,13,55,34,55,94,44,41,2});
    param0.add(new int[]{-92,-76,-74,-72,-68,-64,-58,-44,-44,-38,-26,-24,-20,-12,-8,-8,-4,10,10,10,20,20,26,26,28,50,52,54,60,66,72,74,78,78,78,80,86,88});
    param0.add(new int[]{1,1,1,1,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,1});
    param0.add(new int[]{5,5,15,19,22,24,26,27,28,32,37,39,40,43,49,52,55,56,58,58,59,62,67,68,77,79,79,80,81,87,95,95,96,98,98});
    param0.add(new int[]{-98,28,54,44,-98,-70,48,-98,56,4,-18,26,-8,-58,30,82,4,-38,42,64,-28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{26,72,74,86,98,86,22,6,95,36,11,82,34,3,50,36,81,94,55,30,62,53,50,95,32,83,9,16});
    List<Integer> param1 = new ArrayList<>();
    param1.add(1);
    param1.add(8);
    param1.add(33);
    param1.add(18);
    param1.add(29);
    param1.add(19);
    param1.add(28);
    param1.add(17);
    param1.add(24);
    param1.add(19);
    List<Integer> param2 = new ArrayList<>();
    param2.add(1);
    param2.add(8);
    param2.add(28);
    param2.add(16);
    param2.add(30);
    param2.add(10);
    param2.add(34);
    param2.add(14);
    param2.add(24);
    param2.add(16);
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