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
public class MINIMUM_COST_CONNECT_WEIGHTED_NODES_REPRESENTED_ARRAY{
static int f_gold ( int a [ ] , int n ) {
  int mn = Integer . MAX_VALUE ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    mn = Math . min ( a [ i ] , mn ) ;
    sum += a [ i ] ;
  }
  return mn * ( sum - mn ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,8,14,15,17,17,19,21,22,23,29,32,36,37,43,45,46,47,47,53,57,57,70,71,72,76,81,82,90,95,96,98,99});
    param0.add(new int[]{94,-18,50,94,-74,-50,-44,-92,-58,14,-66,-78});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{15,18,64,28});
    param0.add(new int[]{-96,-88,-88,-84,-82,-78,-78,-60,-58,-56,-54,-52,-48,-44,-28,-26,-14,-12,6,10,10,14,14,50,52,54,60,62,62,64,66,70,72,72,78,80,84});
    param0.add(new int[]{0,1,1,0,1,1,1,1});
    param0.add(new int[]{3,10,14,14,15,16,18,20,21,30,31,33,35,39,46,48,59,59,61,77,78,79,81,83,85,92,97,97,99});
    param0.add(new int[]{4,-32,68,-48,54,24,78,98,-70,44,-82,-92,-16,-92,-70,52,-58,-62,-58,32,14,-4,80,-78,-26,-24,-8});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{82,74,53,91,81,88,42,62,38,43,29,60,43,44,19,28,20,1,5,94,18,77,52,38,55,1,10,29,34,91,64,80,81,39,4,47,30,62,58,66,73,52,62,9,36,49});
    List<Integer> param1 = new ArrayList<>();
    param1.add(32);
    param1.add(10);
    param1.add(24);
    param1.add(2);
    param1.add(31);
    param1.add(6);
    param1.add(23);
    param1.add(18);
    param1.add(35);
    param1.add(38);
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