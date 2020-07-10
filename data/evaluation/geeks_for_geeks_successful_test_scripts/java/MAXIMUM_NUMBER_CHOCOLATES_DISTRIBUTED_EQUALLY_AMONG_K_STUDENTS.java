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
public class MAXIMUM_NUMBER_CHOCOLATES_DISTRIBUTED_EQUALLY_AMONG_K_STUDENTS{
static int f_gold ( int arr [ ] , int n , int k ) {
  HashMap < Integer , Integer > um = new HashMap < Integer , Integer > ( ) ;
  int [ ] sum = new int [ n ] ;
  int curr_rem ;
  int maxSum = 0 ;
  sum [ 0 ] = arr [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) sum [ i ] = sum [ i - 1 ] + arr [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    curr_rem = sum [ i ] % k ;
    if ( curr_rem == 0 ) {
      if ( maxSum < sum [ i ] ) maxSum = sum [ i ] ;
    }
    else if ( ! um . containsKey ( curr_rem ) ) um . put ( curr_rem , i ) ;
    else if ( maxSum < ( sum [ i ] - sum [ um . get ( curr_rem ) ] ) ) maxSum = sum [ i ] - sum [ um . get ( curr_rem ) ] ;
  }
  return ( maxSum / k ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,8,8,12,14,23,25,25,27,27,29,40,42,49,52,52,54,56,57,61,68,74,77,81,82,83,84,85,85,85,87,87,88,88,90,92,96,96});
    param0.add(new int[]{-90,-34,26,-20,-12,-42,28,12,-6,58,-46,4,-30,-28,-14});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{58,81,36,2,51,71,77,34,91,82,47,4,91,83,26,96,3,6});
    param0.add(new int[]{-92,-86,-82,-68,-60,-46,-40,-28,-26,-24,-2,-2,2,2,10,10,10,16,16,18,20,20,22,30,34,38,56,56,60,62,62,68,82,94,94,98});
    param0.add(new int[]{0,1,0});
    param0.add(new int[]{3,8,15,19,21,26,28,31,31,42,45,48,57,75,75,78,79,85,91,99});
    param0.add(new int[]{-38,42,40,-60,-16,-36,44,60,-86,-38,30,-22,-30,-96,-66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{95,38,91,75,43,95,23,36,51,4,38,53,52,58,55,3,19,22,84,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(8);
    param1.add(7);
    param1.add(16);
    param1.add(20);
    param1.add(2);
    param1.add(17);
    param1.add(12);
    param1.add(13);
    param1.add(14);
    List<Integer> param2 = new ArrayList<>();
    param2.add(32);
    param2.add(14);
    param2.add(9);
    param2.add(12);
    param2.add(31);
    param2.add(2);
    param2.add(16);
    param2.add(10);
    param2.add(16);
    param2.add(19);
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