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
public class FIND_REPETITIVE_ELEMENT_1_N_1_1{
static int f_gold ( int arr [ ] , int n ) {
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . contains ( arr [ i ] ) ) return arr [ i ] ;
    s . add ( arr [ i ] ) ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{9,10,14,17,30,37,39,42,49,56,68,74,85,85,92});
    param0.add(new int[]{62,-18,78,-32,38,90});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{56,1,96,81,49,18,39,87,97});
    param0.add(new int[]{-98,-94,-80,-76,-60,-56,-56,-54,-48,-28,-14,-10,26,30,40,58,64,74,78,82,86,92,96,98});
    param0.add(new int[]{1,1,1,0,1,1,0,1,0,1,0,0,1,0,0,0,0,1,0,1,1,1,0});
    param0.add(new int[]{5,7,19,20,22,29,33,35,35,36,37,40,44,49,50,53,60,60,61,62,68,68,69,72,72,81,81,83,85,85,90,91,92,97,98});
    param0.add(new int[]{14});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{29,29,14,91,42,70,79,75,9,86,48,47,37,48,69,81,49,37,33,23,42,45,10,33,47,39,96,45,94,48,44,4,6,73,91});
    List<Integer> param1 = new ArrayList<>();
    param1.add(10);
    param1.add(4);
    param1.add(7);
    param1.add(5);
    param1.add(16);
    param1.add(11);
    param1.add(26);
    param1.add(0);
    param1.add(18);
    param1.add(33);
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