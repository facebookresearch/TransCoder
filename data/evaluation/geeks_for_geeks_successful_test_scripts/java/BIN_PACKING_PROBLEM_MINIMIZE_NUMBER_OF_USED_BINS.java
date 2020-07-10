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
public class BIN_PACKING_PROBLEM_MINIMIZE_NUMBER_OF_USED_BINS{
static int f_gold ( int weight [ ] , int n , int c ) {
  int res = 0 , bin_rem = c ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( weight [ i ] > bin_rem ) {
      res ++ ;
      bin_rem = c - weight [ i ] ;
    }
    else bin_rem -= weight [ i ] ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,12,14,16,19,24,29,31,33,34,41,43,47,53,53,59,64,70,70,71,72,73,74,80,81,89,90});
    param0.add(new int[]{-88,-26,70,-92,96,84,-24,-18,84,62,-72,42,72,2,30,86});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{51,7,6,24,19,83,9,36,40,93,24,48,63,69,53,54,42,45,90,14,29,6,7,37,53,18,87,38,59,1,68,44,47,35,87,91,60,90,52,8,80,41,3,96});
    param0.add(new int[]{-98,-90,-78,-48,-36,-20,2,8,16,40,54,54,60,92});
    param0.add(new int[]{1,1,1,1,0,0,1,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,0,1,1,1,1,1,0,1,1,0,0,1,0,0,0,0});
    param0.add(new int[]{8,14,16,35,40,45,54,57,58,59,87,88,93,95,97});
    param0.add(new int[]{-46,-6,60,-88,10,94,-12,-64,-68,-76,-60,-10,28,18,86,88,80,-56,94,-6,-42,72,-10,54,-82,-52,-70,-28,-74,82,-12,42,44,56,52,-28,22,62,-20});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{48,57,21,82,99});
    List<Integer> param1 = new ArrayList<>();
    param1.add(21);
    param1.add(11);
    param1.add(27);
    param1.add(26);
    param1.add(11);
    param1.add(32);
    param1.add(11);
    param1.add(19);
    param1.add(26);
    param1.add(4);
    List<Integer> param2 = new ArrayList<>();
    param2.add(16);
    param2.add(14);
    param2.add(23);
    param2.add(41);
    param2.add(7);
    param2.add(28);
    param2.add(12);
    param2.add(38);
    param2.add(23);
    param2.add(2);
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