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
public class COUNT_PAIRS_DIFFERENCE_EQUAL_K{
static int f_gold ( int arr [ ] , int n , int k ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) if ( arr [ i ] - arr [ j ] == k || arr [ j ] - arr [ i ] == k ) count ++ ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{9,14,17,19,22,23,23,27,30,31,34,37,37,39,39,42,57,61,68,73,77,79,91,96,97});
    param0.add(new int[]{-78,-42,28,-88,18,-52});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{8,46,57,28,80,2,75,57,83,45,32,49,77,30,94,33,23,29,35,81,85});
    param0.add(new int[]{-90,-72,-72,-62,-62,-54,-54,-52,-48,-38,-22,-22,-22,-12,-12,-8,-8,-8,-6,-6,-2,6,12,26,26,28,28,38,40,48,52,52,58,60,68,70,72,76,76,76,92});
    param0.add(new int[]{0,0,1,1,0,1,1,1,0,0,0,0,0,0,1,0,0,1,1,0,0,1,0,1,1,1,1,1,0,0,0,0,0,0,1,0,1,0,1,0,0,1,0,0,1,0,1});
    param0.add(new int[]{3,13,19,23,27,32,49,52,54,57,58,58,63,67,68,68,69,70,75,80,86,90,91,95});
    param0.add(new int[]{-56,40,-66,42,8,-40,-8,-42});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{99,12,90,10,86,86,81,19,1,1,98,82,34,39,34,1,54,47,39,82,21,50,82,41,98,47,88,46,72,28,28,29,60,87,92,53,93,29,74,75,11,32,48,47,85,16,20});
    List<Integer> param1 = new ArrayList<>();
    param1.add(19);
    param1.add(3);
    param1.add(16);
    param1.add(15);
    param1.add(22);
    param1.add(45);
    param1.add(19);
    param1.add(7);
    param1.add(16);
    param1.add(24);
    List<Integer> param2 = new ArrayList<>();
    param2.add(19);
    param2.add(4);
    param2.add(14);
    param2.add(11);
    param2.add(25);
    param2.add(39);
    param2.add(21);
    param2.add(6);
    param2.add(28);
    param2.add(45);
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