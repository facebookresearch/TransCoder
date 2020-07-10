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
public class MINIMUM_PRODUCT_K_INTEGERS_ARRAY_POSITIVE_INTEGERS{
public static int f_gold ( int [ ] arr , int n , int k ) {
  PriorityQueue < Integer > pq = new PriorityQueue < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) pq . add ( arr [ i ] ) ;
  int count = 0 , ans = 1 ;
  while ( pq . isEmpty ( ) == false && count < k ) {
    ans = ans * pq . element ( ) ;
    pq . remove ( ) ;
    count ++ ;
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{57,66,91});
    param0.add(new int[]{-44,86,28,-70,-12,96,-10,74,-50,-52,-6,64,-62,92,-24,90,-26,-4,-92,-24,-84,76,-92,62,-62,-86,-86,-14,50,30,62,2,-88,-78,-48});
    param0.add(new int[]{0,0,1,1});
    param0.add(new int[]{99,85,37,27,55,20,76,38,33,78,24,80,74,42,15,16,97,51,71,92,18,63,47,10,6,72,40,21,14,68,98,49,48,64,50,66,44,1,26,55,61,43,9,16,8,42,51,98,1});
    param0.add(new int[]{-58,-12,16,18,24});
    param0.add(new int[]{0,0,1,0,0,1,0,1,0,0,0,0,0,1,1,1});
    param0.add(new int[]{5,10,13,14,19,21,22,25,28,36,39,44,46,53,54,55,55,67,73,75,77,78,80,84,91,94,96});
    param0.add(new int[]{18,-44,46,64,86,-36,8,-10,-50,-98,-6,-38,-34,14,-34,86,58,-30,76,6,38,98,78,56,-56,-66,-58,62,92,-94});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{69,74,28,75,84,52,5,19,80,12,76,14,28,63,30,29,16,74,28,48,97,77,62,19,67,26,14,44,52,86,9,31,41,14,66,27,36,98,48,37,2,12,2});
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(29);
    param1.add(3);
    param1.add(36);
    param1.add(2);
    param1.add(8);
    param1.add(23);
    param1.add(23);
    param1.add(13);
    param1.add(27);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(21);
    param2.add(3);
    param2.add(47);
    param2.add(3);
    param2.add(15);
    param2.add(23);
    param2.add(20);
    param2.add(17);
    param2.add(23);
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