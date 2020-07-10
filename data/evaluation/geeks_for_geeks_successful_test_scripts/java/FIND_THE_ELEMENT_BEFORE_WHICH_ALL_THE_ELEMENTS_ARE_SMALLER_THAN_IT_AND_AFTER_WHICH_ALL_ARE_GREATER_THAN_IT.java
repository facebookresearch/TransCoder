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
public class FIND_THE_ELEMENT_BEFORE_WHICH_ALL_THE_ELEMENTS_ARE_SMALLER_THAN_IT_AND_AFTER_WHICH_ALL_ARE_GREATER_THAN_IT{
static int f_gold ( int [ ] arr , int n ) {
  int [ ] leftMax = new int [ n ] ;
  leftMax [ 0 ] = Integer . MIN_VALUE ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) leftMax [ i ] = Math . max ( leftMax [ i - 1 ] , arr [ i - 1 ] ) ;
  int rightMin = Integer . MAX_VALUE ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( leftMax [ i ] < arr [ i ] && rightMin > arr [ i ] ) return i ;
    rightMin = Math . min ( rightMin , arr [ i ] ) ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,24,30,33,56,67,87,90});
    param0.add(new int[]{72,-48,12,4,46,36,2,58,82,-88,-14,56,90,76,18,-6,-28,18,88,90,40,-68,-10,-82,-28,16,32,-90,12,-86,-16,78,-98,-52,-26,80,6,50,40,-12,52,38,-92,94,-32,14,-80,-88,48});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{51,87,46,76,2,89,56,34,49,61,44,73,14,60,89});
    param0.add(new int[]{-90,-90,-80,-72,-68,-64,-62,-62,-60,-46,-44,-44,-44,-42,-42,-32,-22,-22,-18,-2,4,6,10,12,14,30,34,34,40,56,56,56,58,68,74,78,78,82,84,86,88,90,92});
    param0.add(new int[]{0,0,0,1,1,0,1,1,1,0,0,1,1,1,0,0,1,1,1,0,1,0,1,0,0,0,0,0,1,0,0,1,1,1,0,0,0,1,1,0});
    param0.add(new int[]{7,8,11,12,15,17,28,34,57,61,66,76,92});
    param0.add(new int[]{-22,-96,-78,-60,34,-18,86,-42,-78,76,8,28,-80,80,6,-72,34,66,84,50,-4,18,72,-66,-68,-24,56,-12,-70,24,-82});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{79,81,55,6,78,93,81,33,29,1,27,49,21,58,22,65,44,95,6,51,75,42,14,55,79,82,90,8,15,15,53,98,76,43,33});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(28);
    param1.add(30);
    param1.add(11);
    param1.add(29);
    param1.add(26);
    param1.add(9);
    param1.add(19);
    param1.add(9);
    param1.add(30);
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