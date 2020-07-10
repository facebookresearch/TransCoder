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
public class PARTITION_INTO_TWO_SUBARRAYS_OF_LENGTHS_K_AND_N_K_SUCH_THAT_THE_DIFFERENCE_OF_SUMS_IS_MAXIMUM{
static int f_gold ( int arr [ ] , int N , int k ) {
  int M , S = 0 , S1 = 0 , max_difference = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) S += arr [ i ] ;
  int temp ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( arr [ i ] < arr [ j ] ) {
        temp = arr [ i ] ;
        arr [ i ] = arr [ j ] ;
        arr [ j ] = temp ;
      }
    }
  }
  M = Math . max ( k , N - k ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) S1 += arr [ i ] ;
  max_difference = S1 - ( S - S1 ) ;
  return max_difference ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,5,5,9,9,19,22,24,27,33,39,39,40,41,42,43,44,45,48,52,52,53,53,55,55,56,57,57,60,60,61,62,65,66,67,70,71,72,73,77,78,79,84,87,89,91,95,98});
    param0.add(new int[]{-22,-28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{63,72,2,94,89,11,95,79,90,9,70,28,25,74,16,36,50,91,38,47,47,13,27,29,31,35});
    param0.add(new int[]{-86,-78,-76,-76,-66,-62,-62,-38,-34,-32,-30,-26,-22,-4,-4,2,8,8,10,22,52,52,58,64,66,66,66,70,82,82});
    param0.add(new int[]{0,0,0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,0,0,0,0,0,1,1,0,1,0,0,0,0,0,1,0,1,1,0,0,0,1,0,0,1,0,0});
    param0.add(new int[]{1,2,2,9,9,12,13,26,26,33,34,35,51,57,70,79,83});
    param0.add(new int[]{98,-72,2,40,-20,-14,42,8,14,-58,-18,-70,-8,-66,-68,72,82,-38,-78,2,-66,-88,-34,52,12,84,72,-28,-34,60,-60,12,-28,-42,22,-66,88,-96});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{21,85,64,20,4,5,2});
    List<Integer> param1 = new ArrayList<>();
    param1.add(41);
    param1.add(1);
    param1.add(20);
    param1.add(23);
    param1.add(29);
    param1.add(42);
    param1.add(9);
    param1.add(28);
    param1.add(37);
    param1.add(5);
    List<Integer> param2 = new ArrayList<>();
    param2.add(44);
    param2.add(1);
    param2.add(29);
    param2.add(16);
    param2.add(24);
    param2.add(32);
    param2.add(16);
    param2.add(28);
    param2.add(27);
    param2.add(6);
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