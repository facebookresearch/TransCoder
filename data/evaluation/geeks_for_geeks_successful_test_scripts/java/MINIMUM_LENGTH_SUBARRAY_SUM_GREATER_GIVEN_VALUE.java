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
public class MINIMUM_LENGTH_SUBARRAY_SUM_GREATER_GIVEN_VALUE{
static int f_gold ( int arr [ ] , int n , int x ) {
  int curr_sum = 0 , min_len = n + 1 ;
  int start = 0 , end = 0 ;
  while ( end < n ) {
    while ( curr_sum <= x && end < n ) curr_sum += arr [ end ++ ] ;
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
    param0.add(new int[]{6,11,11,14,18,19,21,22,22,23,26,27,28,28,29,30,31,34,39,42,42,44,45,49,49,53,57,61,65,66,67,70,71,73,74,74,78,85,88,94,95,97});
    param0.add(new int[]{-30,-22,-66,-80,18,-64,-28,-46,94,60,-64,2,26,-94,58,56,56,88,50,-78,-12,68,54,-78,42,-30,24,-48,84,12,-88,0,54,-92,-4,42,-60,-72,-32});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{86,8,23,40,55,93,11,35,33,37,96,91,35,66,37,57,83,99,96,15,18,93});
    param0.add(new int[]{-92,-68,-48,-48,-42,-26,-22,-18,2,4,8,14,20,22,32,46,52,62,70,96,98});
    param0.add(new int[]{0,0,0,0,1,0,1,1,0,1,0,0,0});
    param0.add(new int[]{4,4,11,11,13,15,16,18,19,19,19,23,26,27,34,39,39,40,41,46,47,51,52,52,53,57,58,58,60,64,68,70,72,84,84,85,95,98,99});
    param0.add(new int[]{12,-22,2,-90,-92,84,-26,-76,-72,50,-36,30,78,-18,-94,-30,22,28,10,32,34,-86,0,-4,40,0,80,50,66,-48,-40,-94,64,58,-14,0,-32,-58,-22,-94,-68,-36,-94,-48,40,78,-74});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{1,33,20,32,76,27,8,95,78,72,25,56});
    List<Integer> param1 = new ArrayList<>();
    param1.add(37);
    param1.add(31);
    param1.add(8);
    param1.add(16);
    param1.add(17);
    param1.add(11);
    param1.add(31);
    param1.add(42);
    param1.add(25);
    param1.add(9);
    List<Integer> param2 = new ArrayList<>();
    param2.add(23);
    param2.add(29);
    param2.add(12);
    param2.add(13);
    param2.add(14);
    param2.add(10);
    param2.add(35);
    param2.add(26);
    param2.add(21);
    param2.add(10);
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