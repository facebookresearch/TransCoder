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
public class MINIMUM_DIFFERENCE_MAX_MIN_K_SIZE_SUBSETS{
static int f_gold ( int arr [ ] , int N , int K ) {
  Arrays . sort ( arr ) ;
  int res = 2147483647 ;
  for ( int i = 0 ;
  i <= ( N - K ) ;
  i ++ ) {
    int curSeqDiff = arr [ i + K - 1 ] - arr [ i ] ;
    res = Math . min ( res , curSeqDiff ) ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,1,4,18,21,35,37,39,76,81,86,92,96});
    param0.add(new int[]{-8,-6,62,52,-86,2,-94,0,-48,-38,24,-48,34});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{23,36,43,50,74,81,94,13,30,57,30,71,10,99,66,94,83,39,37,3,89,34});
    param0.add(new int[]{-96,-94,-92,-84,-80,-72,-24,-22,-18,-14,6,8,26,28,30,36,50,58,80,84,92,92});
    param0.add(new int[]{0,0,0,0,0,0,1,1,0,1,1,1,1,0,1,0,0,1,1,0,0,1,1});
    param0.add(new int[]{6,7,9,27,30,42,54,55,57,57,59,76,84,84,84});
    param0.add(new int[]{88,44,-96,-72,-80,0,-64,-64,-68,4,38,4,-38,68,-54,92,-16,62,24,54,0,54,62,-70,80,-12,84,-16,-10,88,-30,-56,48,50,-24,94,40,28,-86,-12});
    param0.add(new int[]{0,1});
    param0.add(new int[]{89,18,7,54,67,93,10,61,59,59,69,63,98,8,78,55,6,1,56,97,75,88,10});
    List<Integer> param1 = new ArrayList<>();
    param1.add(7);
    param1.add(9);
    param1.add(16);
    param1.add(17);
    param1.add(21);
    param1.add(21);
    param1.add(13);
    param1.add(31);
    param1.add(1);
    param1.add(22);
    List<Integer> param2 = new ArrayList<>();
    param2.add(6);
    param2.add(12);
    param2.add(26);
    param2.add(20);
    param2.add(12);
    param2.add(22);
    param2.add(14);
    param2.add(26);
    param2.add(1);
    param2.add(14);
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