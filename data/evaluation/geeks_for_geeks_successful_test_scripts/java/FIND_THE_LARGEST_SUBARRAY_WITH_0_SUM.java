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
public class FIND_THE_LARGEST_SUBARRAY_WITH_0_SUM{
static int f_gold ( int arr [ ] , int n ) {
  int max_len = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int curr_sum = 0 ;
    for ( int j = i ;
    j < n ;
    j ++ ) {
      curr_sum += arr [ j ] ;
      if ( curr_sum == 0 ) max_len = Math . max ( max_len , j - i + 1 ) ;
    }
  }
  return max_len ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,2,6,6,15,23,26,27,30,34,35,38,42,43,44,46,50,53,53,57,62,65,67,70,76,79,81,82,85,90});
    param0.add(new int[]{72,-6,-24,-82,16,78,-82,38,-2,78,-60,40,26,-82,-32,-56,52,14,62,-18,-84,-94,48,54,2,-28});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{14,67,44,5,60,87,23,37,44,70,47,52,38,30,78,60,95,62,3,45,96,35,81,8,82,75,76,64,33,65,65,49,1,63,99,53,40,12,46,93,88,27,89,89,60,3,92,63});
    param0.add(new int[]{-98,-98,-96,-86,-74,-74,-72,-70,-70,-66,-66,-66,-64,-64,-50,-50,-48,-38,-28,-24,-24,-18,-16,-14,-8,-6,-2,-2,10,28,32,38,42,54,54,62,68,84,88});
    param0.add(new int[]{0,1,0,0,0,1,1,1,0,0,0,0,1,1,0,0,0,0,0,1,1,0});
    param0.add(new int[]{6,14,26,27,37,50,51,54,55,67,68,72,83,84,95,99});
    param0.add(new int[]{-6,-96,-46,4,-50,-56,-34,6,-72,-68,92,88,-80,18,58,20,34,-22,-18,-90,-80,-24,-82,6,54,70,22,94});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{65,34,82,43,15,94,34,50,70,77,83,26,85,5});
    List<Integer> param1 = new ArrayList<>();
    param1.add(19);
    param1.add(24);
    param1.add(18);
    param1.add(39);
    param1.add(25);
    param1.add(12);
    param1.add(10);
    param1.add(22);
    param1.add(45);
    param1.add(10);
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