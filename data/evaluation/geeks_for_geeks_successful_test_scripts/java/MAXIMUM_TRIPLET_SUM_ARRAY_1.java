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
public class MAXIMUM_TRIPLET_SUM_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  Arrays . sort ( arr ) ;
  return arr [ n - 1 ] + arr [ n - 2 ] + arr [ n - 3 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,8,18,18,27,33,33,38,42,43,44,47,52,58,64,65,67,68,71,75,85,89,91,94,94,95,95});
    param0.add(new int[]{24,24,44,28,-88,18,34,92,-84,94,-12,30,-82,-58});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{95,75,5,51,67,63,26,47,70,11,21,9,18,31,76,66,81,73,63,55,16,72,15,28,25,25,35,79,4,73,23,87,2,1,92,94,18,70,87,27,34,84,12});
    param0.add(new int[]{-86,-86,-78,-56,-24,-14,-10,-6,12,12,18,22,22,26,50,50,72,78,94});
    param0.add(new int[]{0,1,1,1,1,1,0,0,0,1,1,1,0,0,0});
    param0.add(new int[]{2,13,17,19,20,23,28,28,29,40,45,51,52,58,58,68,70,75,79,81,92,96,97});
    param0.add(new int[]{94,6,52,6,-78,40,-46,-20,64,76,-36,-62,50,-4,4});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{34,11,15,42,32,4,6,25,52,44,14,57,3,44,7,89,35,3,70,66,58,22,5,17,33,11});
    List<Integer> param1 = new ArrayList<>();
    param1.add(26);
    param1.add(8);
    param1.add(15);
    param1.add(37);
    param1.add(9);
    param1.add(9);
    param1.add(15);
    param1.add(13);
    param1.add(27);
    param1.add(13);
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