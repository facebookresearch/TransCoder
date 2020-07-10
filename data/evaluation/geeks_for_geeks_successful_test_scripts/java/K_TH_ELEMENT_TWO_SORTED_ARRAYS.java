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
public class K_TH_ELEMENT_TWO_SORTED_ARRAYS{
static int f_gold ( int arr1 [ ] , int arr2 [ ] , int m , int n , int k ) {
  int [ ] sorted1 = new int [ m + n ] ;
  int i = 0 , j = 0 , d = 0 ;
  while ( i < m && j < n ) {
    if ( arr1 [ i ] < arr2 [ j ] ) sorted1 [ d ++ ] = arr1 [ i ++ ] ;
    else sorted1 [ d ++ ] = arr2 [ j ++ ] ;
  }
  while ( i < m ) sorted1 [ d ++ ] = arr1 [ i ++ ] ;
  while ( j < n ) sorted1 [ d ++ ] = arr2 [ j ++ ] ;
  return sorted1 [ k - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,2,4,4,9,10,14,16,16,19,20,21,25,26,29,36,36,37,38,44,44,49,53,54,56,61,62,64,72,72,73,77,80,84,84,87,93,94});
    param0.add(new int[]{2,4,-90,62,22,-94,-74,-22,44,-94,20,-40,20,0,32,24,78,8,4,98,-74,-60});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{85,44,62,2,71,88,60,78,32,46,17,47,65,78,65,94});
    param0.add(new int[]{-94,-84,-82,-70,-70,-60,-54,-54,-52,-52,-46,-40,-40,-36,-34,-32,-30,-22,-18,-16,-10,-4,8,12,18,22,32,38,38,44,50,56,64,82,84,86,88});
    param0.add(new int[]{0,0,0,1,1,0,0,0,0,1,1,1,0,0,1,1,1,0,1,1,1,1,0,1,1,1});
    param0.add(new int[]{53,96,99});
    param0.add(new int[]{98,86,36,-68,86,22,52,-20,-2,74,-72,86,80,-78,14,62,10,94,-66,78,28,92,-8,46,-24,66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{6,21,86,58,48,27,18,73,16,79,51,33,63,26,37,88,48,58,44,32,58,23,31});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{6,8,10,10,12,14,24,31,33,33,35,35,35,41,46,47,49,51,52,56,57,59,62,65,72,72,73,73,79,80,82,83,83,84,87,87,93,99});
    param1.add(new int[]{58,74,-46,38,-58,-78,-32,-84,84,-54,84,-34,-26,88,74,48,26,-92,68,-86,74,88});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{18,3,15,9,61,73,3,62,87,1,54,97,61,37,23,65});
    param1.add(new int[]{-92,-68,-64,-62,-54,-52,-52,-34,-24,-22,-20,-12,-12,-10,6,10,14,22,22,24,24,30,30,36,36,48,50,56,58,64,68,80,84,88,88,92,94});
    param1.add(new int[]{1,0,0,0,1,0,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,0,0,0,1,0});
    param1.add(new int[]{30,55,56});
    param1.add(new int[]{72,-72,-90,24,-22,60,78,-68,98,26,-30,-20,44,-96,8,90,0,98,-24,-68,-32,-62,0,-60,26,-98});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{87,77,44,15,70,89,36,79,82,3,18,76,37,79,85,97,19,53,17,74,87,58,49});
    List<Integer> param2 = new ArrayList<>();
    param2.add(27);
    param2.add(18);
    param2.add(30);
    param2.add(11);
    param2.add(19);
    param2.add(24);
    param2.add(1);
    param2.add(22);
    param2.add(42);
    param2.add(14);
    List<Integer> param3 = new ArrayList<>();
    param3.add(21);
    param3.add(11);
    param3.add(31);
    param3.add(11);
    param3.add(26);
    param3.add(17);
    param3.add(1);
    param3.add(19);
    param3.add(40);
    param3.add(22);
    List<Integer> param4 = new ArrayList<>();
    param4.add(23);
    param4.add(12);
    param4.add(42);
    param4.add(13);
    param4.add(28);
    param4.add(23);
    param4.add(1);
    param4.add(24);
    param4.add(42);
    param4.add(19);
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