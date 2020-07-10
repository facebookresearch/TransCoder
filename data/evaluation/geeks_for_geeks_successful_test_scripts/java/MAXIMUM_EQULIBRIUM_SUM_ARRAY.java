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
public class MAXIMUM_EQULIBRIUM_SUM_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  int res = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int prefix_sum = arr [ i ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) prefix_sum += arr [ j ] ;
    int suffix_sum = arr [ i ] ;
    for ( int j = n - 1 ;
    j > i ;
    j -- ) suffix_sum += arr [ j ] ;
    if ( prefix_sum == suffix_sum ) res = Math . max ( res , prefix_sum ) ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,3,9,19,22,27,32,41,45,63,66,67,81,91});
    param0.add(new int[]{-64,-2,68,-48,22,-14,-98});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{86,79,23,55,4,22,37,1,72,22,82,62,96,47});
    param0.add(new int[]{-96,-96,-96,-96,-92,-82,-72,-72,-62,-58,-52,-48,-44,-44,-40,-34,-28,-26,-26,0,0,2,4,4,12,12,18,34,36,40,48,48,54,60,66,66,72,76,78,82,82,96,98});
    param0.add(new int[]{0,1,0,1,1,0,0,0,1,1,1,0,0,1,0,0,1,1,0,0,0,0,1,1,0,1,0,0,0,0,0,1,1,1,1,1,0,0,1,1,0,0,0,1,0});
    param0.add(new int[]{2,3,7,13,20,24,39,49,53,58,72,80,90,99});
    param0.add(new int[]{-48,44,60,-30,8,20,70,-50,80,-2,-28,-14});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{64,13,18,3,22,29,51,45,21,13,47,15,17,34,60,99,30,54,16,47,13,49,60,66,28,57,85,66,65,7,62,29,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(13);
    param1.add(4);
    param1.add(19);
    param1.add(8);
    param1.add(33);
    param1.add(38);
    param1.add(11);
    param1.add(11);
    param1.add(16);
    param1.add(21);
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