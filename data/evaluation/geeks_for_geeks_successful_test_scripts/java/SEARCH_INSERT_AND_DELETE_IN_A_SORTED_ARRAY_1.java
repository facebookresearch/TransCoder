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
public class SEARCH_INSERT_AND_DELETE_IN_A_SORTED_ARRAY_1{
static int f_gold ( int arr [ ] , int n , int key , int capacity ) {
  if ( n >= capacity ) return n ;
  int i ;
  for ( i = n - 1 ;
  ( i >= 0 && arr [ i ] > key ) ;
  i -- ) arr [ i + 1 ] = arr [ i ] ;
  arr [ i + 1 ] = key ;
  return ( n + 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{69});
    param0.add(new int[]{-34,-38,-72,90,-84,-40,-40,-52,-12,80,-4,-58});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{96,34,11,1,36,79,64,75,75,96,32,18,25,79,63,80,90,75,44,71,48,1,62,53,17,98});
    param0.add(new int[]{-98,-92,-92,-84,-82,-80,-80,-74,-70,-60,-48,-42,-36,-34,-34,-34,-30,-28,-16,-6,-2,-2,2,12,14,20,24,40,46,50,60,66,70,72,78,82,88,92,94,94,96});
    param0.add(new int[]{1,0,1,1,0,0,1,0,0,0,1,1,0});
    param0.add(new int[]{10,12,12,19,20,21,24,27,37,47,50,54,55,58,61,63,63,68,73,75,87,90,90,92,92});
    param0.add(new int[]{-74,62,74,92,-38,-28,-26,4,88,-68,-76,-20,-4,12,72,6,42,36,88,-96,-80,90,80,-26,-36,-72,-62,38,-20,40,-10,-22,-20,38,82,-84,8,-60,86,-26,44,-72,-70,-16,-22,18,-16,76,-50});
    param0.add(new int[]{1,1,1,1,1});
    param0.add(new int[]{64,80,47,58,41,3,85,96,51,4,22,89,67,54,88,15,83,31,19,28,40,67,37,13,63,38,27,14,7,68});
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    param1.add(6);
    param1.add(13);
    param1.add(21);
    param1.add(30);
    param1.add(12);
    param1.add(12);
    param1.add(37);
    param1.add(3);
    param1.add(23);
    List<Integer> param2 = new ArrayList<>();
    param2.add(0);
    param2.add(6);
    param2.add(19);
    param2.add(20);
    param2.add(32);
    param2.add(9);
    param2.add(13);
    param2.add(26);
    param2.add(4);
    param2.add(24);
    List<Integer> param3 = new ArrayList<>();
    param3.add(0);
    param3.add(9);
    param3.add(11);
    param3.add(13);
    param3.add(28);
    param3.add(10);
    param3.add(21);
    param3.add(42);
    param3.add(2);
    param3.add(25);
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