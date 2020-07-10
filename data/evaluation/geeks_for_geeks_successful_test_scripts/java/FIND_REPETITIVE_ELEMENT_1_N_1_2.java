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
public class FIND_REPETITIVE_ELEMENT_1_N_1_2{
static int f_gold ( int arr [ ] , int n ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) res = res ^ ( i + 1 ) ^ arr [ i ] ;
  res = res ^ arr [ n - 1 ] ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,2,4,5,5,7,7,7,8,11,14,15,18,19,20,25,25,29,29,31,32,32,33,38,42,48,52,55,60,61,63,71,74,78,82,82,84,84,87,87,88,90,93,94,94});
    param0.add(new int[]{46,2,62,60,92,4,26,66,66,90,26,-14,76,-20,-68});
    param0.add(new int[]{0,0,0,1,1,1,1,1});
    param0.add(new int[]{87,67,11,47,64,81,94,75,58,77,18,2,85,26,6,44,55,19,46,49,5,69,44,12,42,66,46,9,26,49,68,95,6,9,11,72,5,67});
    param0.add(new int[]{-98,-94,-92,-82,-78,-64,-62,-58,-52,-44,-40,-38,-8,6,10,20,22,28,30,30,36,54,54,58,64,68,76,78,84,88,90,94,96});
    param0.add(new int[]{1,0,0,1,1,0,0,0,1,0,0,0,1,1,1,0,1,0,1,0,0,0,0,0,1,1});
    param0.add(new int[]{1,14,15,15,21,34,38,39,41,50,60,74,96,97});
    param0.add(new int[]{96,-12,-16,-52});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{66,21,21,59,78,8,46,41,16,32,97,93,32,86,91,61,67,61,97,49,66,35,24,35,65,45,83});
    List<Integer> param1 = new ArrayList<>();
    param1.add(31);
    param1.add(8);
    param1.add(4);
    param1.add(34);
    param1.add(29);
    param1.add(17);
    param1.add(7);
    param1.add(3);
    param1.add(21);
    param1.add(25);
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