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
public class COUNT_SUBARRAYS_EQUAL_NUMBER_1S_0S{
static int f_gold ( int arr [ ] , int n ) {
  Map < Integer , Integer > um = new HashMap < > ( ) ;
  int curr_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    curr_sum += ( arr [ i ] == 0 ) ? - 1 : arr [ i ] ;
    um . put ( curr_sum , um . get ( curr_sum ) == null ? 1 : um . get ( curr_sum ) + 1 ) ;
  }
  int count = 0 ;
  for ( Map . Entry < Integer , Integer > itr : um . entrySet ( ) ) {
    if ( itr . getValue ( ) > 1 ) count += ( ( itr . getValue ( ) * ( itr . getValue ( ) - 1 ) ) / 2 ) ;
  }
  if ( um . containsKey ( 0 ) ) count += um . get ( 0 ) ;
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,12,18,19,19,20,20,21,25,29,38,54,54,71,72,72,74,75,77,78,80,80,81,84,97,97});
    param0.add(new int[]{10,70,24,-38,32,-68,88,-28,-24,-70,-64,50,-30,64,54,-6,18,-30,-30,-62,-10,94,-54,-22,-88,96,22,26,-92,-40,-76,46,36,30,24,-52,0});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1});
    param0.add(new int[]{66,50,17,15,86,84,87,24,81,23,71,31,13,72,58,19,29,28,40,14,48,48,81,4,52,88,54,56,10,12,58,55,7,66,15,73,22,2,20,27,57,56,56,31,9,55});
    param0.add(new int[]{-98,-62,-60,16,78,82});
    param0.add(new int[]{1,0,1});
    param0.add(new int[]{2,31,34,64});
    param0.add(new int[]{-70,90,-10,-64,-76,-74,-12,-44,-48,-54,76,-78,8,0,0,78,-28,6,98,-84,60,60,2,48,-96,-28,-78,-76,-56,-26,-60,50,44,34,-90,80,-30,-98,62,36,-46,-72});
    param0.add(new int[]{1,1,1});
    param0.add(new int[]{37,70,80,61,86,10,17,98,54,89,87,84,11,55,3,52,4,90,98,31,20,62,71,58,58,6,92,5,99,99,72,40,82,54,23,19,85,91,62,98,62,72,93,74});
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(24);
    param1.add(11);
    param1.add(40);
    param1.add(5);
    param1.add(2);
    param1.add(2);
    param1.add(25);
    param1.add(1);
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