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
public class REMOVE_MINIMUM_NUMBER_ELEMENTS_NO_COMMON_ELEMENT_EXIST_ARRAY{
public static int f_gold ( int a [ ] , int b [ ] , int n , int m ) {
  HashMap < Integer , Integer > countA = new HashMap < Integer , Integer > ( ) ;
  HashMap < Integer , Integer > countB = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( countA . containsKey ( a [ i ] ) ) countA . put ( a [ i ] , countA . get ( a [ i ] ) + 1 ) ;
    else countA . put ( a [ i ] , 1 ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( countB . containsKey ( b [ i ] ) ) countB . put ( b [ i ] , countB . get ( b [ i ] ) + 1 ) ;
    else countB . put ( b [ i ] , 1 ) ;
  }
  int res = 0 ;
  Set < Integer > s = countA . keySet ( ) ;
  for ( int x : s ) if ( countB . containsKey ( x ) ) res += Math . min ( countB . get ( x ) , countA . get ( x ) ) ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,7,10,12,12,24,29,38,45,51,53,54,59,68,72,73,85,86,88,92,92,95});
    param0.add(new int[]{-6,48,-70,14,-86,56,80,-64,64,-88,-14,78,14,-18,52,2,22,88});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1});
    param0.add(new int[]{10,93,2,16,36,49,36,86,6,99,95,2});
    param0.add(new int[]{-98,-96,-80,-64,-42,-30,-6,10,62,66,82});
    param0.add(new int[]{1,1,0,1,1});
    param0.add(new int[]{7,11,13,15,21,33,36,39,66,99});
    param0.add(new int[]{-40});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{79,91,31,16,28,45,37,43,73,73,76,28,71,60,64,60,99,36,47,38,65,34,22,94,84,51,72,45,71,2});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{7,9,17,23,25,26,29,32,35,56,56,58,59,59,62,63,72,82,85,86,95,97});
    param1.add(new int[]{-62,-58,60,-30,42,8,66,-48,-18,64,-76,-90,-48,-90,-24,64,-88,-98});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{99,28,7,21,62,89,82,41,43,77,8,14});
    param1.add(new int[]{-62,-50,-42,24,44,46,52,54,60,72,72});
    param1.add(new int[]{1,1,1,0,0});
    param1.add(new int[]{23,36,42,44,62,65,70,78,82,89});
    param1.add(new int[]{-98});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{58,94,12,27,98,38,75,20,94,43,32,90,23,41,88,2,62,96,53,57,48,79,6,16,11,46,73,57,67,7});
    List<Integer> param2 = new ArrayList<>();
    param2.add(15);
    param2.add(15);
    param2.add(10);
    param2.add(6);
    param2.add(9);
    param2.add(4);
    param2.add(9);
    param2.add(0);
    param2.add(31);
    param2.add(18);
    List<Integer> param3 = new ArrayList<>();
    param3.add(13);
    param3.add(9);
    param3.add(10);
    param3.add(10);
    param3.add(6);
    param3.add(2);
    param3.add(9);
    param3.add(0);
    param3.add(26);
    param3.add(18);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}