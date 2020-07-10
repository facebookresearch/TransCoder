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
public class COUNT_PAIRS_TWO_SORTED_ARRAYS_WHOSE_SUM_EQUAL_GIVEN_VALUE_X{
static int f_gold ( int [ ] arr1 , int [ ] arr2 , int m , int n , int x ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) for ( int j = 0 ;
  j < n ;
  j ++ ) if ( ( arr1 [ i ] + arr2 [ j ] ) == x ) count ++ ;
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{11,13,16,23,26,28,31,34,37,39,44,48,56,59,79,91,96,98});
    param0.add(new int[]{50,14,-98,14,90,36,66,44,10,-98,-24,-36,-32,-50});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{88,14,29,87,86,58});
    param0.add(new int[]{-98,-92,-88,-86,-82,-76,-72,-66,-56,-48,-34,-28,-28,-26,-20,-18,-18,-16,-16,-12,-4,0,6,12,16,20,22,30,34,34,36,56,58,62,64,80,82,94});
    param0.add(new int[]{1,1,1,1,0,1,1,0,0,0,1,1,1,1,1,0,0,0,1,0,0,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,1,0,0});
    param0.add(new int[]{70,70,74});
    param0.add(new int[]{-20,-12,-50,76,24,64,-22,-4,-68});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{68,75,51,45,73,95,48,53,70,41,65,47,46,43,79,29,50});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{1,1,9,14,17,23,26,31,33,36,53,60,71,75,76,84,87,88});
    param1.add(new int[]{34,-6,-66,0,-6,82,60,-98,-8,60,-2,4,22,76});
    param1.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{91,95,64,4,63,35});
    param1.add(new int[]{-94,-90,-88,-84,-82,-78,-76,-72,-70,-58,-58,-46,-42,-40,-40,-32,-22,-20,-18,-12,-8,-6,6,6,18,20,34,46,60,62,66,72,72,76,76,78,92,98});
    param1.add(new int[]{1,0,1,1,0,0,1,0,1,0,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,0});
    param1.add(new int[]{15,55,84});
    param1.add(new int[]{18,98,-88,86,72,-44,82,94,58});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{4,6,76,65,16,13,85,43,31,14,81,90,24,87,40,25,88});
    List<Integer> param2 = new ArrayList<>();
    param2.add(9);
    param2.add(11);
    param2.add(14);
    param2.add(3);
    param2.add(34);
    param2.add(39);
    param2.add(1);
    param2.add(5);
    param2.add(27);
    param2.add(10);
    List<Integer> param3 = new ArrayList<>();
    param3.add(15);
    param3.add(12);
    param3.add(9);
    param3.add(5);
    param3.add(32);
    param3.add(26);
    param3.add(1);
    param3.add(4);
    param3.add(26);
    param3.add(10);
    List<Integer> param4 = new ArrayList<>();
    param4.add(11);
    param4.add(8);
    param4.add(12);
    param4.add(5);
    param4.add(23);
    param4.add(34);
    param4.add(1);
    param4.add(7);
    param4.add(37);
    param4.add(9);
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