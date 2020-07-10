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
public class FIND_THE_MAXIMUM_ELEMENT_IN_AN_ARRAY_WHICH_IS_FIRST_INCREASING_AND_THEN_DECREASING{
static int f_gold ( int arr [ ] , int low , int high ) {
  int max = arr [ low ] ;
  int i ;
  for ( i = low ;
  i <= high ;
  i ++ ) {
    if ( arr [ i ] > max ) max = arr [ i ] ;
  }
  return max ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{11,15,16,19,24,25,26,28,34,34,43,61,63,66,67,72,77,79,81,83,87,94,99});
    param0.add(new int[]{8,92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{84,39,92,89,38,75,18,39,83,67,41,46,49,27});
    param0.add(new int[]{-98,-94,-88,-84,-74,-72,-58,-52,-48,-48,-46,-42,-42,-32,-30,-30,-18,-10,-8,-8,-6,-4,4,6,28,30,34,38,44,48,56,58,60,64,86});
    param0.add(new int[]{0,1,0});
    param0.add(new int[]{5,9,10,16,18,19,23,24,26,33,37,44,46,54,55,57,58,59,63,64,70,75,77,81,83,84,85,85,88,89,96,97,99});
    param0.add(new int[]{86,20,-50,74,-78,86});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{16,57,65,61,17,63,7,35,69,91,30,44,99,80,6,80,56,8,84,95,20,73,30,62,77,26,66,61,61,45});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(1);
    param1.add(23);
    param1.add(8);
    param1.add(31);
    param1.add(2);
    param1.add(20);
    param1.add(3);
    param1.add(19);
    param1.add(28);
    List<Integer> param2 = new ArrayList<>();
    param2.add(21);
    param2.add(1);
    param2.add(15);
    param2.add(13);
    param2.add(34);
    param2.add(2);
    param2.add(31);
    param2.add(5);
    param2.add(18);
    param2.add(22);
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