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
public class MAXIMUM_REMOVAL_FROM_ARRAY_WHEN_REMOVAL_TIME_WAITING_TIME{
static int f_gold ( int arr [ ] , int n ) {
  int count = 0 ;
  int cummulative_sum = 0 ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] >= cummulative_sum ) {
      count ++ ;
      cummulative_sum += arr [ i ] ;
    }
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,33,34,42,42,45,73});
    param0.add(new int[]{32,-10,-64,-20,92,-66,6,44,-62,-98,4,-48,44,42,12,-90,52,86,-30,-80,64,94,14});
    param0.add(new int[]{0,0,0,0,1});
    param0.add(new int[]{11,85,89,71,82,44});
    param0.add(new int[]{-96,-92,-78,-72,-68,-58,-52,-50,-50,-48,-42,-32,-20,-18,-4,0,0,2,18,18,20,24,32,34,36,38,38,60,66,68,70,72,72,74,76,96,98});
    param0.add(new int[]{0,0,1,1,0,0,1,1,1,1,0,0,1,1,1,1,0,1,0,0,1});
    param0.add(new int[]{8,9,10,11,12,15,17,19,20,21,24,30,33,35,36,39,41,41,42,54,62,63,68,70,71,72,77,85,86,86,94,95,97,97});
    param0.add(new int[]{96,22,-60,4,-94,-16,46,10,76,-90,4,70,-72,60,28,-24,-66,92,-70,72,36});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{90,63,16,40,28,97,20,63,42,31,57,84,10,12,59,69,47,7,53,67});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(16);
    param1.add(2);
    param1.add(3);
    param1.add(21);
    param1.add(16);
    param1.add(31);
    param1.add(20);
    param1.add(13);
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