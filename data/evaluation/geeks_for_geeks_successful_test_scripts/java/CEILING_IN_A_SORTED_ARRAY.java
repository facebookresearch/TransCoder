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
public class CEILING_IN_A_SORTED_ARRAY{
static int f_gold ( int arr [ ] , int low , int high , int x ) {
  int i ;
  if ( x <= arr [ low ] ) return low ;
  for ( i = low ;
  i < high ;
  i ++ ) {
    if ( arr [ i ] == x ) return i ;
    if ( arr [ i ] < x && arr [ i + 1 ] >= x ) return i + 1 ;
  }
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,4,6,8,9,9,10,11,16,19,20,21,21,21,24,24,25,28,30,30,30,32,34,35,39,41,42,49,52,57,59,61,62,66,68,71,73,76,79,83,84,85,86,87,87});
    param0.add(new int[]{92,50,-84,60,32,-54,84,-82,-42,-72,-64,-28,-48,66,92,-42,42,-66,52,-30,48,42,36,-4,64,62,-16,0,20,26,78,78,12,-6,-30,-14,76,72,70,-34,98,32});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{26,68,73,76,14,19,56,80,17,7,15,64,99,98,21,21,72,12,14,10,44,82,25,42,46,86,79,43,91});
    param0.add(new int[]{-90,-86,-84,-50,-30,-24,-12,-2,8,22,30,44,58,58,60,60,62,90});
    param0.add(new int[]{0,0,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,0,1,1});
    param0.add(new int[]{2,2,29,31,34,39,48,50,56,61,66,66,69,73,88});
    param0.add(new int[]{-98,48,-58,8,70,62,92,84,-58,-46,-26,-92,18,-88,40,-12,60,14,54,-64,88,52,-44,88,-46,-8,36,-22,28,-20,-50,58,-82,-44,-44,54,-86,40,10,0,-24,-84,-10,62,58,0,-88});
    param0.add(new int[]{0,0,0,0,1,1});
    param0.add(new int[]{56,30,33,5,67,35,22,54,36,55,94,89,40,65,29,76,17,14,14,49,40,44,35,69,63,2,81,78,19,67,12,14,68,30,82,85,12,2,94,33,85,75,97,31,69,31,85,26});
    List<Integer> param1 = new ArrayList<>();
    param1.add(23);
    param1.add(36);
    param1.add(11);
    param1.add(23);
    param1.add(9);
    param1.add(12);
    param1.add(9);
    param1.add(40);
    param1.add(5);
    param1.add(46);
    List<Integer> param2 = new ArrayList<>();
    param2.add(37);
    param2.add(35);
    param2.add(9);
    param2.add(27);
    param2.add(16);
    param2.add(15);
    param2.add(12);
    param2.add(29);
    param2.add(5);
    param2.add(47);
    List<Integer> param3 = new ArrayList<>();
    param3.add(44);
    param3.add(34);
    param3.add(13);
    param3.add(26);
    param3.add(10);
    param3.add(18);
    param3.add(10);
    param3.add(24);
    param3.add(5);
    param3.add(47);
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