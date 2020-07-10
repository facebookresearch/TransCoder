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
public class MEDIAN_OF_TWO_SORTED_ARRAYS{
static int f_gold ( int ar1 [ ] , int ar2 [ ] , int n ) {
  int i = 0 ;
  int j = 0 ;
  int count ;
  int m1 = - 1 , m2 = - 1 ;
  for ( count = 0 ;
  count <= n ;
  count ++ ) {
    if ( i == n ) {
      m1 = m2 ;
      m2 = ar2 [ 0 ] ;
      break ;
    }
    else if ( j == n ) {
      m1 = m2 ;
      m2 = ar1 [ 0 ] ;
      break ;
    }
    if ( ar1 [ i ] < ar2 [ j ] ) {
      m1 = m2 ;
      m2 = ar1 [ i ] ;
      i ++ ;
    }
    else {
      m1 = m2 ;
      m2 = ar2 [ j ] ;
      j ++ ;
    }
  }
  return ( m1 + m2 ) / 2 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,6,18,21,23,27,44,44,69,72,78,88,90,98});
    param0.add(new int[]{90,54,24,-10,-84,-74,58,96,-28,-92,-18,90,70,-60,72,78,10,42,-2,-18,-38,-16,18,-86,40,-46,-38,66,20,-16,48});
    param0.add(new int[]{0,1,1});
    param0.add(new int[]{53,17,94,21,16,75,67,51,44,71,65,82});
    param0.add(new int[]{-96,-92,-80,-68,-64,-64,-60,-56,-52,-50,-50,-22,-20,-4,-2,0,6,20,22,28,38,40,48,50,56,58,64,64,80,82,90,92,92,92});
    param0.add(new int[]{0,0,0,1,0,0,0,0,0,1,1,0,1,1,0,0,1,1,0,0,1,1,1,1,0,1,0,0,0,0,0,0,0,1,0,1,1,1,0,1,1,1,1});
    param0.add(new int[]{8,15,17,19,21,32,34,38,41,41,49,49,51,54,54,56,56,57,59,63,70,74,79,79,84,84,86,88,89,93,98});
    param0.add(new int[]{96,-42,-94,-46,-68,76,8,16,-54,-94,76,24,94,10,34,78,-30,0,-52,80,98,-58,92,12,26,64});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{61,69,66,3});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{6,12,16,18,26,34,48,48,49,56,61,79,81,89});
    param1.add(new int[]{-72,-62,14,-58,70,54,88,-40,-94,4,60,-16,-38,-98,-70,-46,66,42,26,36,56,-4,32,30,-46,-42,-72,44,16,4,24});
    param1.add(new int[]{0,1,1});
    param1.add(new int[]{98,50,8,11,80,41,59,24,94,41,75,78});
    param1.add(new int[]{-88,-72,-72,-58,-54,-50,-48,-34,-24,-14,-14,-14,-10,-6,4,12,16,18,26,30,32,34,40,46,52,54,58,62,62,72,82,82,92,98});
    param1.add(new int[]{1,1,1,1,0,0,0,1,1,1,0,0,0,1,0,1,1,0,0,1,0,1,0,0,0,1,1,0,0,1,1,0,1,0,1,1,0,1,0,0,0,0,1});
    param1.add(new int[]{5,6,17,18,22,29,32,33,36,44,45,47,59,59,60,65,67,68,69,71,72,76,78,81,84,85,85,86,86,87,92});
    param1.add(new int[]{88,78,-26,10,84,34,56,-8,-30,46,48,20,26,-78,96,44,92,-44,-86,24,-58,-96,-86,-12,-98,18});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param1.add(new int[]{39,84,97,15});
    List<Integer> param2 = new ArrayList<>();
    param2.add(12);
    param2.add(16);
    param2.add(2);
    param2.add(10);
    param2.add(25);
    param2.add(40);
    param2.add(29);
    param2.add(17);
    param2.add(17);
    param2.add(3);
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