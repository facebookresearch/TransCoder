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
public class FIND_THE_MINIMUM_DISTANCE_BETWEEN_TWO_NUMBERS_1{
static int f_gold ( int arr [ ] , int n , int x , int y ) {
  int i = 0 ;
  int min_dist = Integer . MAX_VALUE ;
  int prev = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == x || arr [ i ] == y ) {
      prev = i ;
      break ;
    }
  }
  for ( ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == x || arr [ i ] == y ) {
      if ( arr [ prev ] != arr [ i ] && ( i - prev ) < min_dist ) {
        min_dist = i - prev ;
        prev = i ;
      }
      else prev = i ;
    }
  }
  return min_dist ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,7,7,8,11,14,16,25,34,35,36,36,38,40,41,43,45,47,57,60,64,72,73,74,75,82,83,83,84,84,84,92});
    param0.add(new int[]{96,70,88,-64,-42,58,92,66,-14,90,-66,12,88,-12,48,-4,90,24,98,14,32,38,98,78,2,26,12,-36,90,80,40,58,88,64,16});
    param0.add(new int[]{0,0,1});
    param0.add(new int[]{46,96,82,73,30,36,56,20,5,36,4,7,89,63,54,97,80,56,93,34,90,56,25,27,75,68,14,90});
    param0.add(new int[]{-96,-88,-82,-66,-62,-52,-52,-46,-46,-40,-40,-28,-24,-12,0,4,10,24,42,46,48,48,50,60,62,64,64,70,92,98});
    param0.add(new int[]{0,0,1,0,1,1,0,1,1,1,1});
    param0.add(new int[]{1,2,2,6,10,14,15,18,19,22,23,29,30,37,40,40,41,41,42,42,44,46,46,54,56,72,73,81,83,83,86,88,93});
    param0.add(new int[]{46,86,-52,18,-32,86,2,38,72,72,-60,70,-58,66,-66,-72,-74,58,52,58,16,64,62,-62,80,-70,-96,-44,-20,-74,-10,14,-32,48,30,76,-16,80,66,-46,-92,26,-86,28,-76,-24,-98,54,50});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{32,65,10,72,17,58,79,28,67,36,18,35});
    List<Integer> param1 = new ArrayList<>();
    param1.add(22);
    param1.add(25);
    param1.add(1);
    param1.add(26);
    param1.add(24);
    param1.add(10);
    param1.add(27);
    param1.add(30);
    param1.add(38);
    param1.add(7);
    List<Integer> param2 = new ArrayList<>();
    param2.add(7);
    param2.add(58);
    param2.add(1);
    param2.add(54);
    param2.add(0);
    param2.add(0);
    param2.add(1);
    param2.add(25);
    param2.add(0);
    param2.add(10);
    List<Integer> param3 = new ArrayList<>();
    param3.add(40);
    param3.add(70);
    param3.add(1);
    param3.add(82);
    param3.add(4);
    param3.add(1);
    param3.add(42);
    param3.add(45);
    param3.add(0);
    param3.add(7);

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