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
public class SCHEDULE_ELEVATOR_TO_REDUCE_THE_TOTAL_TIME_TAKEN{
static int f_gold ( int n , int k , int a [ ] ) {
  int temp ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      if ( a [ i ] < a [ j ] ) {
        temp = a [ i ] ;
        a [ i ] = a [ j ] ;
        a [ j ] = temp ;
      }
    }
  }
  int f_gold = 0 ;
  for ( int i = 0 ;
  i < n ;
  i += k ) f_gold += ( 2 * a [ i ] ) ;
  return f_gold ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(17);
    param0.add(2);
    param0.add(0);
    param0.add(16);
    param0.add(31);
    param0.add(28);
    param0.add(9);
    param0.add(32);
    param0.add(17);
    param0.add(19);
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(2);
    param1.add(0);
    param1.add(27);
    param1.add(23);
    param1.add(33);
    param1.add(10);
    param1.add(26);
    param1.add(22);
    param1.add(15);
    List<int [ ]> param2 = new ArrayList<>();
    param2.add(new int[]{1,4,8,18,24,34,38,38,39,39,41,53,56,57,63,72,73,77,79,99});
    param2.add(new int[]{-8,70,-90,-74});
    param2.add(new int[]{0});
    param2.add(new int[]{3,66,11,21,82,75,19,39,1,55,7,26,10,87,11,94,91,76,21,91,83,18,44,29,47,84,6,10,83,74,26,50});
    param2.add(new int[]{-96,-84,-80,-72,-60,-60,-58,-58,-52,-46,-36,-34,-32,-26,-22,-22,-20,-18,-14,-14,-6,-2,-2,0,2,4,18,22,24,38,42,46,50,58,72,78,82,84,90,96,96,96});
    param2.add(new int[]{0,0,1,1,0,1,1,1,0,0,1,1,0,1,1,1,1,0,0,0,1,1,1,0,1,0,0,1,1,0,1,0,0,1,0,1,1,1,1,0,0,1,0,1});
    param2.add(new int[]{8,13,17,19,24,33,43,54,63,74,79,83});
    param2.add(new int[]{0,52,20,40,-2,74,12,10,-56,68,-52,36,8,34,82,-64,-78,-22,-24,74,-54,62,-70,-76,-80,8,-24,84,-84,-74,-90,6,22,58,62,24,-74,50,92});
    param2.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param2.add(new int[]{97,4,69,27,23,97,26,67,72,26,15,67,66,73,27,68,27,60,53,80,20,59,96,9,94,66,5,32});
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