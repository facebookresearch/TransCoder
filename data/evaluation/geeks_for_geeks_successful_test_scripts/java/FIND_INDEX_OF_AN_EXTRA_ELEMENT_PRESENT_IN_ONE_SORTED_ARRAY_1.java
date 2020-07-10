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
public class FIND_INDEX_OF_AN_EXTRA_ELEMENT_PRESENT_IN_ONE_SORTED_ARRAY_1{
static int f_gold ( int arr1 [ ] , int arr2 [ ] , int n ) {
  int index = n ;
  int left = 0 , right = n - 1 ;
  while ( left <= right ) {
    int mid = ( left + right ) / 2 ;
    if ( arr2 [ mid ] == arr1 [ mid ] ) left = mid + 1 ;
    else {
      index = mid ;
      right = mid - 1 ;
    }
  }
  return index ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,18,19,25,26,27,31,39,44,46,59,60,66,72,78,83,84,92,94});
    param0.add(new int[]{-14,-56,92,-90,96,-84,64,-38,-20,84,56,92,18,-78,98,-96,-60,88,-52,-28,30,-90,14,76,56,20,-18,-94,-82,-2,96,-60,-64,-90,42,6,20,-38,82,-86,-4,82,54,-88});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{13,64,73,50,73,19,92,10,64,79,58,41,97,53,53,10,96,45,47,38,99});
    param0.add(new int[]{-96,-94,-90,-90,-78,-70,-64,-64,-58,-58,-52,-40,-36,-34,-34,-30,-26,-2,0,2,14,18,24,28,28,30,34,40,42,48,66,72,86,90,92,98});
    param0.add(new int[]{1,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,1,1,0});
    param0.add(new int[]{10,51,74,74,75,80,90});
    param0.add(new int[]{-44,48,20,-38,-48,-26,56,-62,-94,-18,30,66,-16,80,96,-40,-80,32,88,-56,-76,16,72,-94,4,-34,-92,70,-90,-54,64,-90});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{19,53,13,91,52,62,39,84,68,45,32,40,13,68,79,76,11,42,76,30,81,3,30,15,85,76,1});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{2,5,12,13,17,20,22,46,51,63,64,66,66,76,87,87,90,91,96});
    param1.add(new int[]{54,44,-50,26,4,-26,-76,98,-14,36,82,0,-60,18,52,82,-12,-8,-26,-58,22,-70,24,48,56,-46,92,98,-50,-72,-66,8,40,12,-80,-86,90,-30,76,-92,80,-62,0,-48});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{24,42,54,13,88,63,50,73,64,66,86,84,53,4,44,58,44,42,36,94,34});
    param1.add(new int[]{-94,-92,-90,-88,-86,-82,-82,-80,-76,-74,-64,-60,-58,-46,-44,-36,-30,-30,-30,-18,-16,-8,-6,12,14,20,26,38,40,42,42,68,78,82,88,98});
    param1.add(new int[]{0,0,1,1,0,0,1,0,1,1,0,1,0,1,1,1,1,1,1,1,0});
    param1.add(new int[]{12,20,36,38,61,64,93});
    param1.add(new int[]{-76,92,-66,20,86,40,64,16,54,-6,54,-88,-24,38,86,2,30,70,98,-46,28,34,40,-88,-96,92,22,14,-36,-96,-48,-72});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{33,65,36,82,30,95,42,33,9,21,25,90,54,59,21,45,3,93,67,50,97,72,77,54,75,8,6});
    List<Integer> param2 = new ArrayList<>();
    param2.add(11);
    param2.add(26);
    param2.add(31);
    param2.add(13);
    param2.add(29);
    param2.add(19);
    param2.add(5);
    param2.add(28);
    param2.add(14);
    param2.add(25);
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