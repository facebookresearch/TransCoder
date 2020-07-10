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
public class NUMBER_ORDERED_PAIRS_AI_AJ_0{
static int f_gold ( int a [ ] , int n ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) if ( ( a [ i ] & a [ j ] ) == 0 ) count += 2 ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{17,20,32,35,35,36,43,47,59,59,68,69,70,70,75,82,88,94,96,99});
    param0.add(new int[]{-78,-40,58,-36,34,-12,-38,48,-66,16,50,-26,-22,46,-70,-68,-44,-52,-78,-50});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{49,57,17,37,56,61,10,3,33,33,70,35,50,85,48,65,83,21,96,19,66,43,69,17,60,87,82,3,83,44,63,19,55,58,77,76,50,96});
    param0.add(new int[]{-94,-88,-86,-80,-80,-72,-64,-60,-58,-58,-58,-50,-44,-32,-8,-8,0,6,8,10,14,14,18,28,34,34,46,54,56,56,56,64,66,66,70,82,84,88,96});
    param0.add(new int[]{1,1,1,0,1,0,1,1,0,0,1,0,1,0,1,1,0});
    param0.add(new int[]{1,3,10,11,13,14,15,17,20,25,26,26,27,29,32,36,36,36,42,46,47,49,51,54,54,55,60,66,67,68,68,68,72,77,78,79,83,84,92,98});
    param0.add(new int[]{-76,-72,16,38,-60,44,-2,-76,-76,-56,40,36,50,-50,-32,48,-96,80,84,60,84,38,-54,-42,48,30,66,-62,-52,-94,64,-16,54,98});
    param0.add(new int[]{0,0,1,1,1,1});
    param0.add(new int[]{63,82,22,84,11,62,18,43,57,25,4,27,62,46,55,16,1,9,10,73,36,80,95,87,47,64,27,25,70});
    List<Integer> param1 = new ArrayList<>();
    param1.add(17);
    param1.add(11);
    param1.add(23);
    param1.add(37);
    param1.add(33);
    param1.add(13);
    param1.add(32);
    param1.add(28);
    param1.add(5);
    param1.add(22);
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