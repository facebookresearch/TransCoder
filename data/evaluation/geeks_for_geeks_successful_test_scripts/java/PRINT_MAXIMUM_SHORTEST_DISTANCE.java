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
public class PRINT_MAXIMUM_SHORTEST_DISTANCE{
static int f_gold ( int a [ ] , int n , int k ) {
  HashMap < Integer , Integer > b = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = a [ i ] ;
    int d = Math . min ( 1 + i , n - i ) ;
    if ( ! b . containsKey ( x ) ) b . put ( x , d ) ;
    else {
      b . put ( x , Math . min ( d , b . get ( x ) ) ) ;
    }
  }
  int ans = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = a [ i ] ;
    if ( x != k - x && b . containsKey ( k - x ) ) ans = Math . min ( Math . max ( b . get ( x ) , b . get ( k - x ) ) , ans ) ;
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,27,66,89,96,96});
    param0.add(new int[]{84,-38,-56,-20,-98,-40,-16,22,20,98,-56,-32,-44,30,-58,26,-44,-32,50,46,92});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{20,71,66,58,74,2,63,13,1,36,28,83,24,20,85,30,59,56,8,97,58,28,28,42});
    param0.add(new int[]{-94,-88,-86,-68,-66,-64,-28,-12,4,18,22,28,32,34,34,40,44,46,60,68,72,78,80,84,88,96});
    param0.add(new int[]{0,0,0,0,0,1,1,1,1,0,0,0,1,1,1});
    param0.add(new int[]{8,13,54,59,61,69,89,90,92});
    param0.add(new int[]{-58,50,-74,-8,-50,90,90,-2,-22,8,-76,16,4,56,94,36,28,-42,80,-88,88,52,74,40,12,-72,-50,50,88,-54,32,-24,-48,-66,-86,40,-6,14,10,-88,56,80,-34});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{2,60,66,39,18,60,37,75,3,64,24,16,72,95,96,44,23,58,58,33,24,96});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(13);
    param1.add(23);
    param1.add(23);
    param1.add(16);
    param1.add(8);
    param1.add(4);
    param1.add(27);
    param1.add(9);
    param1.add(21);
    List<Integer> param2 = new ArrayList<>();
    param2.add(4);
    param2.add(11);
    param2.add(13);
    param2.add(17);
    param2.add(15);
    param2.add(13);
    param2.add(8);
    param2.add(42);
    param2.add(12);
    param2.add(17);
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