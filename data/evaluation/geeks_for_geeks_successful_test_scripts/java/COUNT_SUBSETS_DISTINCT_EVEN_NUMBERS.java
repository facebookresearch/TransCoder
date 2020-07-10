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
public class COUNT_SUBSETS_DISTINCT_EVEN_NUMBERS{
static int f_gold ( int arr [ ] , int n ) {
  HashSet < Integer > us = new HashSet < > ( ) ;
  int even_count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( arr [ i ] % 2 == 0 ) us . add ( arr [ i ] ) ;
  even_count = us . size ( ) ;
  return ( int ) ( Math . pow ( 2 , even_count ) - 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,8,14,22,24,24,26,32,33,46,50,51,51,52,53,71,76,93});
    param0.add(new int[]{-62,30,12,30,22,6,-42,80,-62,34,32,-72,-6,-16,42,82,-78,-20,-96,44,-24,-50,-50,-94,72,-90,38,84,-86,-24,-62,86,94,6,90,12,-36,0,44,4,-78,-86,-12,-18,26,32,90,76});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{70,55,67,9,78,57,31,25});
    param0.add(new int[]{-98,-90,-80,-80,-68,-68,-50,-44,-38,-34,-18,-16,-10,-8,14,14,16,24,26,28,30,40,44,46,52,54,58,66,74,74,74,76,80,86,94,96});
    param0.add(new int[]{0,1,1,0,1,0,0,1,0,0,1,1,1,1,0,0,0,0,0,1});
    param0.add(new int[]{7,10,11,13,14,16,20,26,30,31,33,33,35,39,42,50,51,52,55,57,58,59,62,63,63,65,67,67,68,69,69,71,73,73,74,76,82,86,87,87,87,88,94,99});
    param0.add(new int[]{-6,8,-14,2,-36,-44,-50,-4,-4,-22,94,-94,-62,4,-84,-82,88,84,28,76,-84,-72,14,-28,96,18,-56,-96,2,-66,62,-78,88,34,0,-48,-76,-84,-2,-98,58,38,56});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{75,92,42,5,53,78,42,97,99,56,23,16,90,1,79,49,63,95,12,21,82,31,10,35,34,80,22,73,68,68,48,11,15,60,24,57,74,18,30,57,66,97,78,65,79});
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(47);
    param1.add(32);
    param1.add(6);
    param1.add(30);
    param1.add(11);
    param1.add(39);
    param1.add(23);
    param1.add(17);
    param1.add(29);
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