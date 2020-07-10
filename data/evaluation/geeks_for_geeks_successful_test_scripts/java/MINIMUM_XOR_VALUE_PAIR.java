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
public class MINIMUM_XOR_VALUE_PAIR{
static int f_gold ( int arr [ ] , int n ) {
  int min_xor = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) min_xor = Math . min ( min_xor , arr [ i ] ^ arr [ j ] ) ;
  return min_xor ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,5,7,10,10,11,14,19,21,24,27,27,27,28,28,28,33,34,41,42,43,48,52,53,53,59,62,64,66,71,77,78,78,79,80,82,90,97,99,99});
    param0.add(new int[]{-68,-58,52,88,90,66,-66,-84,-70,-64,56,42,94,-10,0,80,8,28,-94,36,90,56,56,80,-94,50,90,-28,-22,-2,-96,74,-16,-14});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{57,63,11,73,60,73,25,65,39,48,31,17,23,94,10,97,42,45,83,75,97,96});
    param0.add(new int[]{-92,-92,-90,-88,-84,-82,-66,-64,-64,-62,-44,-42,-40,-28,-22,-12,-4,-2,0,4,16,22,28,34,54,60,72,74,78,86,94});
    param0.add(new int[]{1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,1,0,1,0,1,1,1,1,1,0,0});
    param0.add(new int[]{2,2,6,13,16,16,17,19,19,20,22,25,27,29,34,34,34,36,38,39,42,49,49,53,59,59,71,77,79,82,83,83,84,84,86,86,87,88,93,96});
    param0.add(new int[]{-14,20,36,12,-54,-50,92,-28,44,-46,6,96,82,70,-20,24,-96,-14,46,-28,-46,-28,22,-82,36,-94,-48,-92,96,74,14});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{50,48,94,64,60,48,79,75,77,62,33,42,22,78,32,99,27,23,76,51,34,54,70,12,19,17,13,82,96,70,4,12,5,11,23,23,18,93,38,69});
    List<Integer> param1 = new ArrayList<>();
    param1.add(34);
    param1.add(17);
    param1.add(9);
    param1.add(21);
    param1.add(18);
    param1.add(36);
    param1.add(36);
    param1.add(20);
    param1.add(39);
    param1.add(30);
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