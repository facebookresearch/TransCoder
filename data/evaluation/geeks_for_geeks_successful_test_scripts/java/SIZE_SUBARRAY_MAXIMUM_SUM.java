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
public class SIZE_SUBARRAY_MAXIMUM_SUM{
static int f_gold ( int a [ ] , int size ) {
  int max_so_far = Integer . MIN_VALUE , max_ending_here = 0 , start = 0 , end = 0 , s = 0 ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    max_ending_here += a [ i ] ;
    if ( max_so_far < max_ending_here ) {
      max_so_far = max_ending_here ;
      start = s ;
      end = i ;
    }
    if ( max_ending_here < 0 ) {
      max_ending_here = 0 ;
      s = i + 1 ;
    }
  }
  return ( end - start + 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,7,16,20,21,22,34,34,37,37,49,53,54,55,58,59,60,66,67,68,73,80,80,88,90,98,99,99});
    param0.add(new int[]{-90,-98,-10,-84,24});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{94,2,83,94,10,94,58,99,60,19,3,71,36,84,71,14,50,15});
    param0.add(new int[]{-98,-96,-70,-64,-56,-38,-34,-24,-22,-2,26,32,36,50,62,70,70,72,72,74,78,82,84,86});
    param0.add(new int[]{0,1,0,1,1,1,0,0,0,1,1,1,0,0,1,0,1,1,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,1,1,0,1,0,1,0});
    param0.add(new int[]{1,2,2,5,13,14,15,18,21,34,42,48,50,63,67,68,69,75,80,80,81,83,84,89,90,90,91,92,95,98});
    param0.add(new int[]{-88,-10,-88,-90,92,14,68,-90,-86});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{28,39,90,39,12,90,24,89,54,44,3,26,44,36,67,92,3,79,10,45,22,21,39,91,2,5,72,21,55,48,75,47});
    List<Integer> param1 = new ArrayList<>();
    param1.add(21);
    param1.add(2);
    param1.add(19);
    param1.add(14);
    param1.add(13);
    param1.add(35);
    param1.add(22);
    param1.add(5);
    param1.add(24);
    param1.add(27);
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