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
public class LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1{
static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > hM = new HashMap < Integer , Integer > ( ) ;
  int sum = 0 ;
  int max_len = 0 ;
  int ending_index = - 1 ;
  int start_index = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = ( arr [ i ] == 0 ) ? - 1 : 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] ;
    if ( sum == 0 ) {
      max_len = i + 1 ;
      ending_index = i ;
    }
    if ( hM . containsKey ( sum + n ) ) {
      if ( max_len < i - hM . get ( sum + n ) ) {
        max_len = i - hM . get ( sum + n ) ;
        ending_index = i ;
      }
    }
    else hM . put ( sum + n , i ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = ( arr [ i ] == - 1 ) ? 0 : 1 ;
  }
  int end = ending_index - max_len + 1 ;
  System . out . println ( end + " to " + ending_index ) ;
  return max_len ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,6,16,16,18,19,22,39,40,42,60,66,69,70,70,73,74,80,99});
    param0.add(new int[]{-88,-66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{85,98,67,27,98,13,96,32,26,44,32});
    param0.add(new int[]{-96,-94,-90,-88,-86,-66,-64,-52,-46,-46,-42,-40,-38,-32,-28,-22,-16,-10,-8,-8,-4,2,10,26,26,28,28,40,40,42,50,60,66,68,72,74,86,92,94});
    param0.add(new int[]{1,1,1,1,1,1,0,0,0});
    param0.add(new int[]{25,64,86});
    param0.add(new int[]{-4,78,-76,12,4,-38,-98,-26,-8,-98,56,0,-34,36,-90,-36,54,-68,12,-44,62,60,-34,-52,18});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{2,25,45,98,71,8,58,94,53});
    List<Integer> param1 = new ArrayList<>();
    param1.add(9);
    param1.add(1);
    param1.add(19);
    param1.add(8);
    param1.add(34);
    param1.add(4);
    param1.add(1);
    param1.add(17);
    param1.add(9);
    param1.add(8);
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