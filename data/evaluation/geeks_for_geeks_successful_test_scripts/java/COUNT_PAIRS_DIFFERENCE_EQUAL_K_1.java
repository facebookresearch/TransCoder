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
public class COUNT_PAIRS_DIFFERENCE_EQUAL_K_1{
static int f_gold ( int arr [ ] , int n , int k ) {
  int count = 0 ;
  Arrays . sort ( arr ) ;
  int l = 0 ;
  int r = 0 ;
  while ( r < n ) {
    if ( arr [ r ] - arr [ l ] == k ) {
      count ++ ;
      l ++ ;
      r ++ ;
    }
    else if ( arr [ r ] - arr [ l ] > k ) l ++ ;
    else r ++ ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,5,10,19,29,32,40,60,65,70,72,89,92});
    param0.add(new int[]{-38,40,8,64,-38,56,4,8,84,60,-48,-78,-82,-88,-30,58,-58,62,-52,-98,24,22,14,68,-74,48,-56,-72,-90,26,-10,58,40,36,-80,68,58,-74,-46,-62,-12,74,-58});
    param0.add(new int[]{0,0,1});
    param0.add(new int[]{16,80,59,29,14,44,13,76,7,65,62,1,34,49,70,96,73,71,42,73,66,96});
    param0.add(new int[]{-98,-88,-58,-56,-48,-34,-22,-18,-14,-14,-8,-4,-2,2,18,38,42,46,54,68,70,90,94,96,98});
    param0.add(new int[]{0,1,1});
    param0.add(new int[]{11,43,50,58,60,68,75});
    param0.add(new int[]{86,94,-80,0,52,-56,42,88,-10,24,6,8});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{54,99,4,14,9,34,81,36,80,50,34,9,7});
    List<Integer> param1 = new ArrayList<>();
    param1.add(7);
    param1.add(24);
    param1.add(1);
    param1.add(12);
    param1.add(23);
    param1.add(2);
    param1.add(4);
    param1.add(11);
    param1.add(29);
    param1.add(9);
    List<Integer> param2 = new ArrayList<>();
    param2.add(12);
    param2.add(36);
    param2.add(1);
    param2.add(16);
    param2.add(22);
    param2.add(1);
    param2.add(4);
    param2.add(9);
    param2.add(30);
    param2.add(8);
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