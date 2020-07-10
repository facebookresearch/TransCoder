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
public class EQUILIBRIUM_INDEX_OF_AN_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  int leftsum = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) sum += arr [ i ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    sum -= arr [ i ] ;
    if ( leftsum == sum ) return i ;
    leftsum += arr [ i ] ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{24,31,44,52,78,95});
    param0.add(new int[]{-78,-38,22,58,68,-60,-30,6,58,20,-64,-40,-14,80,-2,-88,-68,-16,-4,78,-38,-74,78,-72,46,-12,82,-76,-98,-28,-32,88,72,72,64,-10,98,-24,-96});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{98,69,41,48,40,90,76,61,17,81,74,92,54,16,11,15,8,16,84,86,34,34,75,92,67,54,93,19,31,62,89,26,96,91,32,78,42,84,66,79,29,48,49,5});
    param0.add(new int[]{-28,42});
    param0.add(new int[]{1,1,1,1,0,0,0,0,0,1,0,1,1,0,1,1,0,1,0,1,0,0,0,1,0,1});
    param0.add(new int[]{18,21,23,24,36,37,39,49,55,68,80,81,88,90});
    param0.add(new int[]{94,22,42,-42,78,50,96,98,46,74,98,84,-2,-76,48,18,28,-62,78,6,-76,-12,46,62,14,76,44,-26,-92,12,62,-72,-42});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{1,23,18,91,65,2,73,12,91,47,14,48,1,69,95,81,59,36,79,35,9,52,55,73,54,25,8,41,64,96});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(19);
    param1.add(11);
    param1.add(27);
    param1.add(1);
    param1.add(25);
    param1.add(11);
    param1.add(32);
    param1.add(14);
    param1.add(19);
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