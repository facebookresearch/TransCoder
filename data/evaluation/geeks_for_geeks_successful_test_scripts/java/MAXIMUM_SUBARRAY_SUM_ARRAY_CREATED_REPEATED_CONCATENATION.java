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
public class MAXIMUM_SUBARRAY_SUM_ARRAY_CREATED_REPEATED_CONCATENATION{
static int f_gold ( int a [ ] , int n , int k ) {
  int max_so_far = 0 ;
  int INT_MIN , max_ending_here = 0 ;
  for ( int i = 0 ;
  i < n * k ;
  i ++ ) {
    max_ending_here = max_ending_here + a [ i % n ] ;
    if ( max_so_far < max_ending_here ) max_so_far = max_ending_here ;
    if ( max_ending_here < 0 ) max_ending_here = 0 ;
  }
  return max_so_far ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{5,6,12,20,23,28,33,37,47,51,53,56,63,65,65,68,69,76,76,78,83});
    param0.add(new int[]{68,10,52,-44,34,-4,-34,2,50,-60,50,94,-98,-98,-44,-36,-4,-62,-2,-92,-70,-48,-78,-10,94});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{71,59,21,82,73,29,30,25,21,10,85,22,60,43,49,20,34,39,69,6,44,27,50,33,57,29,65,18,68,56,50,28});
    param0.add(new int[]{-84,-74,-74,-56,-54,-48,-48,-46,-42,-34,-32,-30,-18,-16,-16,6,12,20,24,26,30,32,34,42,42,42,44,46,46,50,50,62,72,78,90});
    param0.add(new int[]{0,1,1,1,1,1,1,1,1,0,1,1,0,0,1,1,0,1,1,1,0,1,1,0,0,0,1,1,1,0});
    param0.add(new int[]{3,7,11,11,26,60,68,71,77,91,95});
    param0.add(new int[]{28,48,-86,-52,6,4,30,18,-32,60,-2,16,-88,-36});
    param0.add(new int[]{1});
    param0.add(new int[]{76});
    List<Integer> param1 = new ArrayList<>();
    param1.add(18);
    param1.add(22);
    param1.add(34);
    param1.add(23);
    param1.add(17);
    param1.add(16);
    param1.add(8);
    param1.add(8);
    param1.add(0);
    param1.add(0);
    List<Integer> param2 = new ArrayList<>();
    param2.add(20);
    param2.add(22);
    param2.add(29);
    param2.add(30);
    param2.add(23);
    param2.add(25);
    param2.add(10);
    param2.add(11);
    param2.add(0);
    param2.add(0);
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