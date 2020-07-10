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
public class MINIMUM_LENGTH_SUBARRAY_SUM_GREATER_GIVEN_VALUE_1{
static int f_gold ( int arr [ ] , int n , int x ) {
  int curr_sum = 0 , min_len = n + 1 ;
  int start = 0 , end = 0 ;
  while ( end < n ) {
    while ( curr_sum <= x && end < n ) {
      if ( curr_sum <= 0 && x > 0 ) {
        start = end ;
        curr_sum = 0 ;
      }
      curr_sum += arr [ end ++ ] ;
    }
    while ( curr_sum > x && start < n ) {
      if ( end - start < min_len ) min_len = end - start ;
      curr_sum -= arr [ start ++ ] ;
    }
  }
  return min_len ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,4,5,10,14,15,16,20,23,28,31,35,36,36,43,48,49,55,57,57,58,61,64,64,68,70,70,73,74,76,76,77,81,81,82,87,89,92,99});
    param0.add(new int[]{66,-20,12,-48,22,28,40,-30,-6,-96,10,-88,40});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{28,19,38,31,17,27,60,35,19,47,34,51,3,95,33,29,84,46,74,87});
    param0.add(new int[]{-48,-2});
    param0.add(new int[]{1,1,0,1,1,1,1,0,1,0,1,1,0,1,1,0,1,1,0,1,1,1});
    param0.add(new int[]{1,4,4,6,8,10,12,12,13,15,18,20,21,23,25,28,28,33,33,35,35,36,37,38,42,44,63,63,65,65,65,66,70,74,77,78,80,80,84,87,87,89,92,93,94,97,98,99});
    param0.add(new int[]{-82,-12,-40,58,22,-76,-94,-28,42,36,64});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{76,65,96,76,1,91,22,29,95,21,73,68,30,52,73,86,52,66,67,37,76,53,68,6,95,81,98,42,63,38,92,78,59,86,10,38,18,15,52,62,16,66});
    List<Integer> param1 = new ArrayList<>();
    param1.add(33);
    param1.add(11);
    param1.add(42);
    param1.add(15);
    param1.add(1);
    param1.add(12);
    param1.add(42);
    param1.add(10);
    param1.add(10);
    param1.add(23);
    List<Integer> param2 = new ArrayList<>();
    param2.add(28);
    param2.add(12);
    param2.add(23);
    param2.add(15);
    param2.add(1);
    param2.add(15);
    param2.add(27);
    param2.add(6);
    param2.add(14);
    param2.add(35);
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