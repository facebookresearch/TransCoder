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
public class SEARCH_INSERT_AND_DELETE_IN_AN_UNSORTED_ARRAY{
static int f_gold ( int arr [ ] , int n , int key ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( arr [ i ] == key ) return i ;
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,8,11,23,55,57,73,74,77,79,93});
    param0.add(new int[]{-88,12,-62,-66,-24,18,12,22,94,30,-50,-42,-94,18,76,-6,-48,-68,48,36,-78,52,-82,76,2,-44,-10,88});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1});
    param0.add(new int[]{33,9,93,70,81,70,56,66,72,81,74,32,71,72,3,81,70,22,82,2,75,18,90,29,48});
    param0.add(new int[]{-98,-70,-62,-60,-60,-54,-48,-48,-46,-44,-34,-26,-18,-6,4,18,28,32,34,40,50,54,56,62,64,64,98});
    param0.add(new int[]{1,1,1,1,0,0,0,0,1,0,0,1,0,0,1,1,0,1,1,0,0,1});
    param0.add(new int[]{4,6,7,10,10,12,13,18,23,29,29,34,46,54,60,61,63,67,69,70,72,76,79,79,81,82,88,90,99});
    param0.add(new int[]{94,34,-60,-74,86,80,68,-48,78,-62,-98,-44,-44,92,-94,-86,-36,12,84,-90,52,42,-42,-66,88,76,66});
    param0.add(new int[]{0,0,0,1});
    param0.add(new int[]{76,59,38,83,38,93,27,11,17,80,26,28,35,53,88,10,9,75});
    List<Integer> param1 = new ArrayList<>();
    param1.add(8);
    param1.add(27);
    param1.add(11);
    param1.add(24);
    param1.add(18);
    param1.add(17);
    param1.add(15);
    param1.add(21);
    param1.add(2);
    param1.add(12);
    List<Integer> param2 = new ArrayList<>();
    param2.add(11);
    param2.add(12);
    param2.add(0);
    param2.add(72);
    param2.add(23);
    param2.add(16);
    param2.add(28);
    param2.add(16);
    param2.add(3);
    param2.add(13);
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

11
12
0
72
