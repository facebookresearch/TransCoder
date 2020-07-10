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
public class NUMBER_VISIBLE_BOXES_PUTTING_ONE_INSIDE_ANOTHER{
static int f_gold ( int [ ] arr , int n ) {
  Queue < Integer > q = new LinkedList < > ( ) ;
  Arrays . sort ( arr ) ;
  q . add ( arr [ 0 ] ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int now = q . element ( ) ;
    if ( arr [ i ] >= 2 * now ) q . remove ( ) ;
    q . add ( arr [ i ] ) ;
  }
  return q . size ( ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,3,17,17,18,28,28,29,34,43,44,52,54,80,84,84,91,92,97});
    param0.add(new int[]{-34,70,-90,-10,-26,64,4,28,24,-90,-78,72,74,80,82,-94});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{20,87,5,62,12,81,30,83,96,16,2,76,3,8,37,53,55,88});
    param0.add(new int[]{-94,-92,-60,-58,-54,-42,-36,-12,-8,-2,8,14,18,20,26,32,38,56,58,60,70,78,80,86,98});
    param0.add(new int[]{0,1,1,1,0,0,1,1,1,1,1,1,1,1,0,0});
    param0.add(new int[]{1,1,2,3,3,11,16,18,19,21,21,22,22,24,27,28,29,43,43,52,55,57,60,62,62,63,65,66,70,70,73,77,78,79,79,80,85,85,86,88,89,90,97,98});
    param0.add(new int[]{88,12,-22,-60,30,-30,-14,80,-58,-80,-10,86,-94,-14,4,-18,-18,54,-82,-8,-68,-6,-44,-44,50,88,-78,-42,12,52,44,14,6,48,18,-30,4});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{82,62,43,39,5,90,75,50,16,83,52,69,71,3,89,10,51,69,32,96,5,43,83,12,31,81,22,59,52,47,86,49,56,90,31,59});
    List<Integer> param1 = new ArrayList<>();
    param1.add(12);
    param1.add(10);
    param1.add(40);
    param1.add(9);
    param1.add(18);
    param1.add(9);
    param1.add(30);
    param1.add(21);
    param1.add(7);
    param1.add(28);
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