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
public class QUERIES_COUNTS_ARRAY_ELEMENTS_VALUES_GIVEN_RANGE{
static int f_gold ( int arr [ ] , int n , int x , int y ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] >= x && arr [ i ] <= y ) count ++ ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{9,16,19,24,36,38,42,49,51,53,53,57,57,58,71,78,78,92,92,93});
    param0.add(new int[]{28,-74,-18,10,26,28,-96,-80,82,94,22,50,72,-90,76,50,20,-44,-80});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{25,8,66,90,50,65,76,90,27});
    param0.add(new int[]{-98,-96,-90,-82,-80,-78,-70,-66,-60,-60,-50,-48,-34,-26,-24,-16,-14,-8,-6,4,22,24,26,30,30,48,52,56,60,62,74,76,78,86});
    param0.add(new int[]{1,1,1,0,1,1,0,0,0,1,1,0,1,1,0,0,0,0});
    param0.add(new int[]{4,6,17,19,24,29,30,31,32,37,37,40,43,44,44,45,57,64,69,70,73,78,86,89,91,92,94});
    param0.add(new int[]{32,-88,70,-6,28,-48});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{37,84,97,74,12,26,47,10,14,33});
    List<Integer> param1 = new ArrayList<>();
    param1.add(13);
    param1.add(18);
    param1.add(30);
    param1.add(4);
    param1.add(32);
    param1.add(15);
    param1.add(17);
    param1.add(4);
    param1.add(13);
    param1.add(5);
    List<Integer> param2 = new ArrayList<>();
    param2.add(12);
    param2.add(13);
    param2.add(21);
    param2.add(8);
    param2.add(24);
    param2.add(16);
    param2.add(21);
    param2.add(3);
    param2.add(12);
    param2.add(9);
    List<Integer> param3 = new ArrayList<>();
    param3.add(13);
    param3.add(13);
    param3.add(31);
    param3.add(5);
    param3.add(24);
    param3.add(12);
    param3.add(15);
    param3.add(4);
    param3.add(11);
    param3.add(8);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}