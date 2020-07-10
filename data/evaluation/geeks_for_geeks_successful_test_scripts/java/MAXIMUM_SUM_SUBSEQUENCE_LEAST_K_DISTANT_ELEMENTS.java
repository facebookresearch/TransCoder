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
public class MAXIMUM_SUM_SUBSEQUENCE_LEAST_K_DISTANT_ELEMENTS{
static int f_gold ( int arr [ ] , int N , int k ) {
  int MS [ ] = new int [ N ] ;
  MS [ N - 1 ] = arr [ N - 1 ] ;
  for ( int i = N - 2 ;
  i >= 0 ;
  i -- ) {
    if ( i + k + 1 >= N ) MS [ i ] = Math . max ( arr [ i ] , MS [ i + 1 ] ) ;
    else MS [ i ] = Math . max ( arr [ i ] + MS [ i + k + 1 ] , MS [ i + 1 ] ) ;
  }
  return MS [ 0 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,5,20,21,23,26,27,31,33,38,39,41,48,48,50,51,56,57,64,68,69,70,71,74,76,86,97});
    param0.add(new int[]{32,34,-40,90,-82,-70,30,26,-76,-46,-84,76,-76});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{96,15,30,25,83});
    param0.add(new int[]{-90,-82,-80,-76,-62,-58,-50,-48,-46,-38,-38,-38,-38,-38,-34,-32,-24,-22,-16,-16,-4,-2,10,10,20,26,26,32,38,38,44,44,46,48,58,62,64,66,76,78,78,82,92,96,96,98});
    param0.add(new int[]{1,1,1,1,1,0,0,0,0,1,1,1,0,1,0,0,1,0,0});
    param0.add(new int[]{1,2,9,17,24,31,31,33,56,57,61,71,73,74,76,77,79,83,86,95,99});
    param0.add(new int[]{-12,52,-44,80,-66,34,42,-46,8,12,-22,-56,74,-98,-44,2,-24,-14,-54,-56,-26,-18,-72});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{65,1,34,38,15,6,55,21,32,90,39,25,43,48,64,66,88,70,82,75,25,56,23,27,41,33,33,55,60,90,41,58,42,53,38,90,7,15});
    List<Integer> param1 = new ArrayList<>();
    param1.add(23);
    param1.add(9);
    param1.add(22);
    param1.add(2);
    param1.add(27);
    param1.add(9);
    param1.add(12);
    param1.add(13);
    param1.add(13);
    param1.add(37);
    List<Integer> param2 = new ArrayList<>();
    param2.add(15);
    param2.add(10);
    param2.add(34);
    param2.add(3);
    param2.add(30);
    param2.add(9);
    param2.add(10);
    param2.add(19);
    param2.add(13);
    param2.add(33);
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