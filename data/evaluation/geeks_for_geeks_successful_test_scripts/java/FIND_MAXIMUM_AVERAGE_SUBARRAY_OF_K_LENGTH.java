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
public class FIND_MAXIMUM_AVERAGE_SUBARRAY_OF_K_LENGTH{
static int f_gold ( int [ ] arr , int n , int k ) {
  if ( k > n ) return - 1 ;
  int [ ] csum = new int [ n ] ;
  csum [ 0 ] = arr [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) csum [ i ] = csum [ i - 1 ] + arr [ i ] ;
  int max_sum = csum [ k - 1 ] , max_end = k - 1 ;
  for ( int i = k ;
  i < n ;
  i ++ ) {
    int curr_sum = csum [ i ] - csum [ i - k ] ;
    if ( curr_sum > max_sum ) {
      max_sum = curr_sum ;
      max_end = i ;
    }
  }
  return max_end - k + 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,4,6,19,21,23,32,34,47,51,56,57,57,65,68,68,69,70,71,73,74,74,77,77,79,82,82,86,87,87,88,89,90,91,92});
    param0.add(new int[]{24,62,-32,-28,42,-46,-96,-70,-68,60,44,34,-30,96,-26,92,62,42,-46,-38,44,54,-94,52,66,68,-96,-58,84,-2,66,30,42});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{94,6,48,34,31});
    param0.add(new int[]{-98,-88,-82,-80,-76,-70,-70,-60,-60,-52,-50,-46,-44,-44,-44,-20,-18,-12,-12,-12,-10,-8,-6,-4,4,4,18,28,32,34,42,42,44,46,48,54,60,70,70,72,78,78,78,78,84,86,90,96,98});
    param0.add(new int[]{0,1,0,0,1,0,1,1,0,0,1,1,0,0,0,0,0});
    param0.add(new int[]{1,5,13,17,26,26,32,35,38,38,39,45,52,58,60,61,62,63,82,83,85,89,89,91});
    param0.add(new int[]{-68,-52,4,-90,90,88,38,-18,86,4,14,-32,-14,-44,-88,-50,-12,-26,-68,-20,-30,22,0,14,-40,58,-6,28,-44,8,28,96,-46,-12});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{17,33,36,34,32,10,37,48,47,32,21,18,75,8,18,52,21,73,25,25,80,32,10,24,1,89,7,42,86,85,73,12,20,20,1,74,77,4,24,74,8});
    List<Integer> param1 = new ArrayList<>();
    param1.add(29);
    param1.add(23);
    param1.add(32);
    param1.add(4);
    param1.add(45);
    param1.add(15);
    param1.add(13);
    param1.add(32);
    param1.add(13);
    param1.add(20);
    List<Integer> param2 = new ArrayList<>();
    param2.add(20);
    param2.add(31);
    param2.add(31);
    param2.add(3);
    param2.add(30);
    param2.add(8);
    param2.add(22);
    param2.add(22);
    param2.add(11);
    param2.add(28);
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