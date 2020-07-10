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
public class COUNT_PAIRS_TWO_SORTED_ARRAYS_WHOSE_SUM_EQUAL_GIVEN_VALUE_X_2{
static int f_gold ( int arr1 [ ] , int arr2 [ ] , int m , int n , int x ) {
  int count = 0 ;
  int l = 0 , r = n - 1 ;
  while ( l < m && r >= 0 ) {
    if ( ( arr1 [ l ] + arr2 [ r ] ) == x ) {
      l ++ ;
      r -- ;
      count ++ ;
    }
    else if ( ( arr1 [ l ] + arr2 [ r ] ) < x ) l ++ ;
    else r -- ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,5,7,10,14,14,17,21,32,34,37,40,40,40,46,46,50,50,51,55,57,62,65,67,67,69,70,70,72,73,76,77,77,78,84,85,85,86,87,88,88,89,89,90,93,99});
    param0.add(new int[]{-84,52,-34,96,16,92,-64,-74});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{60,92,42,83,55,76,29,62});
    param0.add(new int[]{-94,-94,-58,-40,-40,-26,-24,-22,-22,-22,-2,0,4,8,12,16,16,18,22,32,42,44,50,58,64,78,80,90});
    param0.add(new int[]{0,0,1,1,1,0,0,1,1,1});
    param0.add(new int[]{1,5,7,7,7,14,15,16,17,18,18,19,20,25,27,31,36,42,47,51,56,56,56,58,58,59,63,63,63,65,66,67,76,83,93,94,97});
    param0.add(new int[]{78,-74,52,56,-8,92,14,56,-72,-92,32,-94,-26,-8,-66,72,-24,36,-84,-4,-68,14,78,40,-82,-10,16,56,6,-16,30,24,-32});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{17,50,65,4,19,10,45,70,76,81,28,97,55,70,38,2,40,67,36,33,6,85,25});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{2,5,8,8,10,12,13,15,17,18,20,20,21,27,28,31,34,37,40,46,48,52,53,54,54,58,59,60,66,68,68,69,70,71,72,73,77,77,80,84,84,92,92,95,97,97});
    param1.add(new int[]{-22,26,-12,-54,66,86,38,76});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{71,2,74,42,80,71,26,76});
    param1.add(new int[]{-86,-84,-78,-76,-72,-70,-62,-58,-54,-54,-50,-46,-44,-40,-30,-28,-16,-10,10,36,36,48,70,84,84,90,94,98});
    param1.add(new int[]{1,1,1,0,1,1,0,0,0,0});
    param1.add(new int[]{2,3,7,8,9,10,17,18,21,28,29,29,33,35,46,47,47,49,49,49,53,56,58,59,59,60,65,67,70,78,81,85,85,87,90,92,96});
    param1.add(new int[]{-74,22,-14,-2,36,86,-70,-20,-76,-84,-40,-36,42,22,-60,-94,-18,8,-14,-42,-68,62,-60,2,40,-66,68,96,70,98,-38,-74,-92});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{78,92,65,23,7,94,18,4,2,53,31,58,98,18,46,16,17,92,80,92,43,70,50});
    List<Integer> param2 = new ArrayList<>();
    param2.add(28);
    param2.add(6);
    param2.add(37);
    param2.add(4);
    param2.add(17);
    param2.add(5);
    param2.add(28);
    param2.add(16);
    param2.add(25);
    param2.add(16);
    List<Integer> param3 = new ArrayList<>();
    param3.add(29);
    param3.add(5);
    param3.add(26);
    param3.add(7);
    param3.add(27);
    param3.add(8);
    param3.add(34);
    param3.add(30);
    param3.add(33);
    param3.add(22);
    List<Integer> param4 = new ArrayList<>();
    param4.add(23);
    param4.add(7);
    param4.add(42);
    param4.add(7);
    param4.add(17);
    param4.add(9);
    param4.add(31);
    param4.add(24);
    param4.add(33);
    param4.add(22);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i),param4.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}