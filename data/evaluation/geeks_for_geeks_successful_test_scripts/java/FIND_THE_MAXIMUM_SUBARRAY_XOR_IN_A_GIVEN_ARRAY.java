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
public class FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int ans = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int curr_xor = 0 ;
    for ( int j = i ;
    j < n ;
    j ++ ) {
      curr_xor = curr_xor ^ arr [ j ] ;
      ans = Math . max ( ans , curr_xor ) ;
    }
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,7,7,11,12,18,20,23,27,30,44,47,53,53,55,57,57,58,61,62,67,74,76,80,86,86});
    param0.add(new int[]{-34,-4,68,-82,54,20,6,-18,-70,98,-40,80,-28,78,28,56,26,2,2,-56,-66,44,0,-72,12,54,-40,18,28,-48,-56,72,84,60,76,26,-8,62});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{33,98});
    param0.add(new int[]{-92,-80,-76,-76,-74,-58,-44,-38,-34,-32,-30,-24,-20,-18,-4,-2,2,8,44,52,52,56,70,72,80,80,98});
    param0.add(new int[]{0,0,0,1,0,0,0,1,1,1,0,0,1,1,1,0,1,1,1,1,0,1,0,1,0,1,0,0,0,0,1,1,0,1,1,0,0});
    param0.add(new int[]{1,2,3,6,9,15,15,18,19,25,31,31,33,37,39,47,49,51,51,52,52,54,58,59,59,61,62,62,65,66,66,66,66,67,71,76,77,78,79,80,83,86,87,92,97,97,98,99});
    param0.add(new int[]{34,-90,64,88,-46,-4,-96,76,-32,10,-8,-24,32,-4,86,-20,-86,-88,-72,64,12,66,-96,-84,16,-58,-48,80,-80,70,-94,-84,56,8,-14,86,72,-16,-18,74,40,34,20,80});
    param0.add(new int[]{1,1});
    param0.add(new int[]{57,76,2,30,24,12,49,12,5,75,55,17,62,87,21,91,88,10,20,49,46,79,51,33,94,59,48,97,70,49});
    List<Integer> param1 = new ArrayList<>();
    param1.add(13);
    param1.add(21);
    param1.add(12);
    param1.add(1);
    param1.add(15);
    param1.add(33);
    param1.add(38);
    param1.add(35);
    param1.add(1);
    param1.add(25);
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