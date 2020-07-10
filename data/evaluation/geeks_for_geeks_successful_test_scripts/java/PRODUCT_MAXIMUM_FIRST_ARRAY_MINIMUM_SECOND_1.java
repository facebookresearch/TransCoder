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
public class PRODUCT_MAXIMUM_FIRST_ARRAY_MINIMUM_SECOND_1{
public static int f_gold ( int arr1 [ ] , int arr2 [ ] , int n1 , int n2 ) {
  int max = arr1 [ 0 ] ;
  int min = arr2 [ 0 ] ;
  int i ;
  for ( i = 1 ;
  i < n1 && i < n2 ;
  ++ i ) {
    if ( arr1 [ i ] > max ) max = arr1 [ i ] ;
    if ( arr2 [ i ] < min ) min = arr2 [ i ] ;
  }
  while ( i < n1 ) {
    if ( arr1 [ i ] > max ) max = arr1 [ i ] ;
    i ++ ;
  }
  while ( i < n2 ) {
    if ( arr2 [ i ] < min ) min = arr2 [ i ] ;
    i ++ ;
  }
  return max * min ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,6,32,33,34,36,41,43,52,70,70,70,75,78,88,88,95,95});
    param0.add(new int[]{78,-88,44,10,96,-46,-66,84,32,44,56,76,-72,-72,82,-12,-20,-76,8,-34,12,-22,-92,-74,76,46,86,-2,-76,-86,36,80});
    param0.add(new int[]{0,0,1});
    param0.add(new int[]{87,4,90,50,2,35,87});
    param0.add(new int[]{-98,-86,-86,-82,-72,-72,-70,-68,-64,-58,-50,-48,-44,-38,-36,-32,-32,-30,-28,-16,-12,-12,-4,8,10,16,18,22,28,32,32,42,60,70,88,88,88,98,98});
    param0.add(new int[]{0});
    param0.add(new int[]{31,32,33,49,68,77,89,94});
    param0.add(new int[]{64,-44,-6,12,-98,42,-48,-70,-76,30,-48,-72,32,-2,68,42,-60,86,-24,98,62,-60,36,-52,-50,-74,96,36,-30,66,-92,-74,8,74,-64,-24,-60,-70});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{35,11,39,23,49,12,96,98,46,76,29,1,88,71,27,49,12,24,95,61,38,33,59,97,56,7,97,7,71,59,46,68,45});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{2,4,11,25,26,26,32,39,50,53,65,66,69,74,81,83,89,99});
    param1.add(new int[]{30,0,-50,-62,36,-26,-26,70,-72,-8,58,34,26,36,-14,52,18,-80,-64,92,-22,50,-10,56,2,42,90,-80,-94,-62,76,-56});
    param1.add(new int[]{0,0,1});
    param1.add(new int[]{33,90,2,95,54,94,96});
    param1.add(new int[]{-98,-84,-72,-70,-60,-58,-54,-52,-44,-44,-24,-10,-6,2,10,12,12,14,18,22,30,34,42,48,50,54,54,56,68,68,70,76,76,78,86,88,88,90,96});
    param1.add(new int[]{1});
    param1.add(new int[]{7,26,28,35,36,37,81,98});
    param1.add(new int[]{44,-70,16,60,84,-8,58,-64,-32,-58,38,-30,-38,-94,-64,-42,-42,-84,-94,2,-22,46,-72,-38,-28,0,-94,-92,-24,46,48,-18,-56,52,26,-60,-84,-68});
    param1.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param1.add(new int[]{53,67,70,97,2,97,28,59,89,14,83,71,49,86,13,16,40,60,10,54,35,22,59,53,70,83,95,71,91,72,38,91,39});
    List<Integer> param2 = new ArrayList<>();
    param2.add(13);
    param2.add(26);
    param2.add(2);
    param2.add(5);
    param2.add(22);
    param2.add(0);
    param2.add(7);
    param2.add(21);
    param2.add(12);
    param2.add(31);
    List<Integer> param3 = new ArrayList<>();
    param3.add(11);
    param3.add(31);
    param3.add(2);
    param3.add(4);
    param3.add(31);
    param3.add(0);
    param3.add(7);
    param3.add(23);
    param3.add(15);
    param3.add(27);
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