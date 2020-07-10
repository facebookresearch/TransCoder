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
public class SMALLEST_ELEMENT_REPEATED_EXACTLY_K_TIMES_NOT_LIMITED_SMALL_RANGE{
public static int f_gold ( int a [ ] , int n , int k ) {
  HashMap < Integer , Integer > m = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( m . containsKey ( a [ i ] ) ) m . put ( a [ i ] , m . get ( a [ i ] ) + 1 ) ;
  else m . put ( a [ i ] , 1 ) ;
  int res = Integer . MAX_VALUE ;
  Set < Integer > s = m . keySet ( ) ;
  for ( int temp : s ) if ( m . get ( temp ) == k ) res = Math . min ( res , temp ) ;
  return ( res != Integer . MAX_VALUE ) ? res : - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,5,5,8,11,13,14,15,15,16,18,23,24,26,28,31,33,39,39,39,40,41,44,51,53,55,55,59,59,61,64,65,74,74,76,76,76,77,87,88,88,94,95,96});
    param0.add(new int[]{-98,-64,-44,20,-46,96,-48,-54,-26,30,-42,94,58,-58,-54,50,6,-34,-44,-50,-66,-14,-96,74,4,-86,56,-46,-94,-24,-80,58,34,24});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{55,78,71,60,41,82,45,66,46,5,92,49,57,16,49,40,77,40,44,47,52,58,33,3,27,37,38,56,3,32,7,17,43,35,79,66,50,63,97,12,16});
    param0.add(new int[]{-90,-86,-74,-68,-64,-56,-30,-24,-14,-2,0,2,8,16,18,20,24,30,32,36,42,54,62,62,62,62,76,78,90,92,94});
    param0.add(new int[]{0,1,0,1,1,0,0,1,1,1,1,1,1,1,0,0,0,0,1,0,0,1,1});
    param0.add(new int[]{4,5,5,5,10,13,17,17,20,20,22,25,28,36,40,42,49,51,57,59,65,66,66,68,72,74,78,81,87,88,94,95});
    param0.add(new int[]{-12,-20,-78,-10,6,26,-94,-48,22,-2,12,-68,-90,-22,-94,-94,-10,-66,62,-20,74,-90,54,-52,90,50,60,10,56,-32,52,-12,-84,66,-82,34,24,-8,-60,-20,-94,80});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{2,57,53,3,63,29,12,99,21,26,3,35,96,84,48,61});
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(26);
    param1.add(26);
    param1.add(32);
    param1.add(22);
    param1.add(18);
    param1.add(28);
    param1.add(28);
    param1.add(29);
    param1.add(10);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(2);
    param2.add(1);
    param2.add(3);
    param2.add(2);
    param2.add(8);
    param2.add(7);
    param2.add(3);
    param2.add(2);
    param2.add(1);
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
