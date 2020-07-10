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
public class MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_1{
private static int f_gold ( int [ ] arr , int n ) {
  int jumps [ ] = new int [ n ] ;
  int i , j ;
  if ( n == 0 || arr [ 0 ] == 0 ) return Integer . MAX_VALUE ;
  jumps [ 0 ] = 0 ;
  for ( i = 1 ;
  i < n ;
  i ++ ) {
    jumps [ i ] = Integer . MAX_VALUE ;
    for ( j = 0 ;
    j < i ;
    j ++ ) {
      if ( i <= j + arr [ j ] && jumps [ j ] != Integer . MAX_VALUE ) {
        jumps [ i ] = Math . min ( jumps [ i ] , jumps [ j ] + 1 ) ;
        break ;
      }
    }
  }
  return jumps [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,5,9,9,12,13,13,13,15,16,17,18,20,20,20,25,28,30,30,33,34,34,37,42,45,49,50,52,52,54,65,68,72,74,75,82,85,87,91,91,94,95});
    param0.add(new int[]{-28,90,30,-80,-10,26,-12,24,12,44,-38,20,26,38,-8,-40,88,26});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{74,37,37,71,85,89,44,72,55,8,5,98,54,37,7,76,93,74,84,51,18,37});
    param0.add(new int[]{-68,14,76});
    param0.add(new int[]{0,0,1,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,1,1,1});
    param0.add(new int[]{3,4,6,6,7,14,28,36,37,44,46,47,50,51,52,55,55,61,68,69,70,73,74,77,86,90,90,91,98,99});
    param0.add(new int[]{-4,-24,-84,-76});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{78,88,1,98,26,31,56,12,71});
    List<Integer> param1 = new ArrayList<>();
    param1.add(22);
    param1.add(9);
    param1.add(37);
    param1.add(20);
    param1.add(1);
    param1.add(27);
    param1.add(23);
    param1.add(2);
    param1.add(32);
    param1.add(8);
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