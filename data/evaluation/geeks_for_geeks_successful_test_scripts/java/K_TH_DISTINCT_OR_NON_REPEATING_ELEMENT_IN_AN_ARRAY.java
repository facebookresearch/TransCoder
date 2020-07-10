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
public class K_TH_DISTINCT_OR_NON_REPEATING_ELEMENT_IN_AN_ARRAY{
static int f_gold ( int arr [ ] , int n , int k ) {
  int dist_count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j ;
    for ( j = 0 ;
    j < n ;
    j ++ ) if ( i != j && arr [ j ] == arr [ i ] ) break ;
    if ( j == n ) dist_count ++ ;
    if ( dist_count == k ) return arr [ i ] ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,8,18,20,33,53,56,60,71,76,80,81,87,88,89,92,95});
    param0.add(new int[]{-78,6,32,52,-12,-32,22,-40,-82,24,30,10,-40});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{3,28,55,21,42,60,96,83,98,75,29,73,51,21,27,65,19,47,12,81,19,94,50,43,21,32,52,44,52,91,49,59,52,10,75,86,46,43,3,49,70,60,77,99,27,63});
    param0.add(new int[]{-96,-90,-76,-44,-16,-8,0,0,2,2,8,14,16,18,18,20,20,28,34,44,68,74,84,90});
    param0.add(new int[]{0,1,1,0,0,0,0,0,1,0,0,1,0});
    param0.add(new int[]{3,4,5,8,9,15,26,26,26,35,39,40,42,43,45,45,48,52,54,56,57,67,74,77,79,80,81,86,87,92,95,97});
    param0.add(new int[]{-76,-24,-12,66,-40,26,72,46,-56,58,-68,2,-82});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{29,83,32,75,5,22,68,64,36,18,7,63,16,42,77,61,1,26,12,41,67,85,85,35,94,18,14,65,8,55,44,34,48,23,8,27,86,2,51,91});
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(8);
    param1.add(7);
    param1.add(40);
    param1.add(23);
    param1.add(10);
    param1.add(26);
    param1.add(6);
    param1.add(27);
    param1.add(28);
    List<Integer> param2 = new ArrayList<>();
    param2.add(16);
    param2.add(6);
    param2.add(5);
    param2.add(39);
    param2.add(12);
    param2.add(8);
    param2.add(24);
    param2.add(10);
    param2.add(17);
    param2.add(24);
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