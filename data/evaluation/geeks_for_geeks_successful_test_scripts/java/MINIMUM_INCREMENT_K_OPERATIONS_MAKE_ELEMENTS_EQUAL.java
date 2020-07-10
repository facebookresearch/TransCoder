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
public class MINIMUM_INCREMENT_K_OPERATIONS_MAKE_ELEMENTS_EQUAL{
static int f_gold ( int arr [ ] , int n , int k ) {
  Arrays . sort ( arr ) ;
  int max = arr [ arr . length - 1 ] ;
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( max - arr [ i ] ) % k != 0 ) return - 1 ;
    else res += ( max - arr [ i ] ) / k ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4, 7, 19, 16});
   param0.add(new int[]{4,4,4,4,4});
   param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
   param0.add(new int[]{85,36,52,8,52,15,16});
   param0.add(new int[]{-10,-5,-5,-20,10,30});
   param0.add(new int[]{0,1,0,0,1,1,1,0,0,0,0,1,1,0,0,1,0});
   param0.add(new int[]{1,5,5,9,11,12,12,13,13,14,16,18,26,26,28,28,30,31,32,37,37,38,40,43,44,45,47,47,55,58,60,62,63,64,69,78,83,84,92,96,96,99});
   param0.add(new int[]{76,-78,92,-98,16,44,86,96,-8,2,-96,74,-28,12,54,-40,-64,-12,4,48,68,-82,8,0,-4,88,48,-54,90,62,-84,76,-48,62,-80,-94,38,-4,36});
   param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
   param0.add(new int[]{62,99,29,23,55,30,79,63,1,88,59,8,11,80,23,51,97,32,80,48,84,36,73,59,1,34,92,10});
    List<Integer> param1 = new ArrayList<>();
  param1.add(4);
  param1.add(5);
  param1.add(39);
  param1.add(5);
  param1.add(6);
  param1.add(10);
  param1.add(26);
  param1.add(34);
  param1.add(39);
  param1.add(18);
    List<Integer> param2 = new ArrayList<>();
param2.add(3);
param2.add(3);
param2.add(1);
param2.add(6);
param2.add(5);
param2.add(15);
param2.add(33);
param2.add(3);
param2.add(10);
param2.add(1);
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
