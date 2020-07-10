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
public class MINIMUM_OPERATION_MAKE_ELEMENTS_EQUAL_ARRAY{
public static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > hash = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( hash . containsKey ( arr [ i ] ) ) hash . put ( arr [ i ] , hash . get ( arr [ i ] ) + 1 ) ;
  else hash . put ( arr [ i ] , 1 ) ;
  int max_count = 0 ;
  Set < Integer > s = hash . keySet ( ) ;
  for ( int i : s ) if ( max_count < hash . get ( i ) ) max_count = hash . get ( i ) ;
  return ( n - max_count ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,4,6,8,17,25,29,33,33,33,38,42,43,49,55,60,62,63,68,69,70,75,77,79,79,85,87,87,90,90,90,90,94,98});
    param0.add(new int[]{-66,-44,72,-82,46,66,-78,-62,32,86,62,56,22,-58,46,-6,94});
    param0.add(new int[]{0,1,1});
    param0.add(new int[]{68,78,2,48,1,10,18,67,97,31,72,12,25,39,51,12,29,46,93,66,28,29,5,86,97,59,7,94,64,13,42,48,25,33,10,1,5,32,14,27});
    param0.add(new int[]{-98,-96,-78,-72,-64,-62,-56,-40,-36,-14,-8,4,18,22,28,32,52,56,58,60,78,88,94});
    param0.add(new int[]{0,0,1,1,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0});
    param0.add(new int[]{3,3,7,9,14,15,15,25,25,26,28,31,37,37,47,51,53,58,58,60,63,65,68,70,70,71,77,79,81,88,89,97});
    param0.add(new int[]{40,-64,-62,74,-10,48,-56,70,-60,54,-6,74,-8,-54,-20,-50,40,-22,-54,-76,-92,-76,36,16,-42,58,-74,-90,-54,-32,-38,-50,74,26,52,38,24,-32,78,68,82,36,64,56,86,-28,-44,48,88});
    param0.add(new int[]{0,0,1,1,1,1,1});
    param0.add(new int[]{87,77,76,1,59,15,98,45,62,10,87,59,13,50,58,10});
    List<Integer> param1 = new ArrayList<>();
    param1.add(33);
    param1.add(11);
    param1.add(1);
    param1.add(36);
    param1.add(18);
    param1.add(21);
    param1.add(23);
    param1.add(36);
    param1.add(4);
    param1.add(9);
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