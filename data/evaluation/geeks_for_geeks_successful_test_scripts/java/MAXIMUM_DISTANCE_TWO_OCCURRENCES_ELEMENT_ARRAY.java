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
public class MAXIMUM_DISTANCE_TWO_OCCURRENCES_ELEMENT_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  int max_dist = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! map . containsKey ( arr [ i ] ) ) map . put ( arr [ i ] , i ) ;
    else max_dist = Math . max ( max_dist , i - map . get ( arr [ i ] ) ) ;
  }
  return max_dist ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,20,25,28,29,31,34,35,38,39,41,43,46,55,56,60,65,66,74,77,79,80,81,83,84,88,88,88,90,91,99});
    param0.add(new int[]{26,14,56,84,-56,-84,-98,12,-78,18,-42,58,46,-66,-46,66,98,34,-16,8,-20,66,74,26,42,-84,38,86,14,86,26,-42,-30,6,-54,-76,-66,18,58,66,74,-62,8,-42,62,-14,-90,98,-24});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{69,87});
    param0.add(new int[]{-98,-88,-86,-62,-52,-26,-24,-20,-12,6,8,26,36,40,42,54,68,72,84,92,94,98,98});
    param0.add(new int[]{1,1,1,1,0,1,0,1,1,0,0,0,1,1,1,0,0,1,0,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,0});
    param0.add(new int[]{11,16,17,19,20,21,21,22,27,37,45,49,64,77,81,85,96});
    param0.add(new int[]{-20,0,18,-96});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{54,5,98,71,9,34,60,28,58,66,28,45,4});
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(34);
    param1.add(11);
    param1.add(1);
    param1.add(12);
    param1.add(29);
    param1.add(9);
    param1.add(2);
    param1.add(22);
    param1.add(10);
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