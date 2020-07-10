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
public class FIND_SMALLEST_VALUE_REPRESENTED_SUM_SUBSET_GIVEN_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int res = 1 ;
  for ( int i = 0 ;
  i < n && arr [ i ] <= res ;
  i ++ ) res = res + arr [ i ] ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{16,23,24,41,48,58,72,75});
    param0.add(new int[]{-14,-82,12,-14,-38,12,40,12,-74,42,-36,64});
    param0.add(new int[]{0,0,1,1,1,1});
    param0.add(new int[]{17,89,44});
    param0.add(new int[]{-94,-92,-84,-82,-72,-58,-56,-40,-34,-34,-24,-22,-8,-8,12,14,16,16,22,22,34,46,54,58,68,72,74,78,88,96});
    param0.add(new int[]{0,0,0,0,0,1,0,0,1,0,1,0});
    param0.add(new int[]{2,12,13,13,13,16,28,32,34,41,41,47,49,49,50,52,58,61,63,65,67,68,68,74,80,80,84,84,89,93,94,98,99,99});
    param0.add(new int[]{-54});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{42,50,76,45,6,63,46,73,65,70,87,5,41,63,96,75,38,76,27,7,71,9,65,44,76,37,94,52,55,3,38,68,45,15,35,90,36,46,13,92,32,22,49,35,83});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(8);
    param1.add(5);
    param1.add(2);
    param1.add(25);
    param1.add(8);
    param1.add(23);
    param1.add(0);
    param1.add(33);
    param1.add(35);
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