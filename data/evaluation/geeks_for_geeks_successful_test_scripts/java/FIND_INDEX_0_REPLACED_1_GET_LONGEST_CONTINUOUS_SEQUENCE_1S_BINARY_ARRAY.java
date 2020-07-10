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
public class FIND_INDEX_0_REPLACED_1_GET_LONGEST_CONTINUOUS_SEQUENCE_1S_BINARY_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int max_count = 0 ;
  int max_index = 0 ;
  int prev_zero = - 1 ;
  int prev_prev_zero = - 1 ;
  for ( int curr = 0 ;
  curr < n ;
  ++ curr ) {
    if ( arr [ curr ] == 0 ) {
      if ( curr - prev_prev_zero > max_count ) {
        max_count = curr - prev_prev_zero ;
        max_index = prev_zero ;
      }
      prev_prev_zero = prev_zero ;
      prev_zero = curr ;
    }
  }
  if ( n - prev_prev_zero > max_count ) max_index = prev_zero ;
  return max_index ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,8,9,13,13,19,19,21,21,24,28,28,29,29,29,32,34,38,39,43,45,46,57,59,62,63,67,67,68,69,70,70,71,72,74,74,76,78,79,81,90,90,95,96,98});
    param0.add(new int[]{28,92,-16,0,6,12,-88,42,-48,72,2,-38,80,82,96,32,-42,-38,62,-76,20,-10,2,-48,4,88,-24,-72,32,-42,-48,-62,38});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{70,83,9,51,11,81,27,26,37,46});
    param0.add(new int[]{50,88});
    param0.add(new int[]{0,1,0,1,1,1,0,0,0,1,1,0,1});
    param0.add(new int[]{96});
    param0.add(new int[]{18,78,14,60,-12,-86,32,74,74,96,58,28,-42,28,-18,-58,-82,-58,22,6,2,-6,-4,-98});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{58,22,15,85,8,74,93,76,44,51,43,93,20,51,52,35,17,13,96,82,23,51,44,18,45,79,66,48,16,31,62,99,46,66,53,89,87,2,87,20,30});
    List<Integer> param1 = new ArrayList<>();
    param1.add(36);
    param1.add(20);
    param1.add(39);
    param1.add(7);
    param1.add(1);
    param1.add(6);
    param1.add(0);
    param1.add(21);
    param1.add(19);
    param1.add(24);
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