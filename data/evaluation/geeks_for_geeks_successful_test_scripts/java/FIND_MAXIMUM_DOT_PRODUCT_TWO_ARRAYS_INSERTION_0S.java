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
public class FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S{
static int f_gold ( int A [ ] , int B [ ] , int m , int n ) {
  int dp [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  for ( int [ ] row : dp ) Arrays . fill ( row , 0 ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = i ;
  j <= m ;
  j ++ ) dp [ i ] [ j ] = Math . max ( ( dp [ i - 1 ] [ j - 1 ] + ( A [ j - 1 ] * B [ i - 1 ] ) ) , dp [ i ] [ j - 1 ] ) ;
  return dp [ n ] [ m ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,9,22,68});
    param0.add(new int[]{24,40,98,58,-24,24,76,48,-92,-16,-46,-48,-70,88,66,2,44,36,34,34,46,90,-80,-24,-58,68,72,-20,-62,-40});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{32,15,41,41,4,42,22,33,33,11,68,5,41,80,39,15,36,75,41,11,25,40,50,19,39,12,75,28,52,20,63,5,27,53,19,62,98,72,10,90,74,93,52,81,91,65,90,93});
    param0.add(new int[]{-94,-76,-68,-50,-28,-20,18,24,30,54,74,84,98});
    param0.add(new int[]{1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,0,0,1,1,0,1,1,1,0,0,0,0,1,0,0,0,0,1,0,0,1,1,1,0,1,0});
    param0.add(new int[]{14,27,43,49});
    param0.add(new int[]{78,-26,-12,38,-90});
    param0.add(new int[]{0,1,1,1});
    param0.add(new int[]{12,69,57,7,52,14,15,83,67,57,15,86,81,43,1,64,45,68,30,23,14,70,13,51,23,33,98,68,24,43,12,82,46});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{14,22,54,58});
    param1.add(new int[]{30,-88,6,-26,-76,14,-80,-30,-58,76,40,-28,-54,38,-60,-60,88,-80,-22,90,50,-48,68,-26,26,-2,68,-16,88,-72});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{80,18,9,29,62,89,4,40,47,15,35,82,22,97,63,54,7,58,64,73,54,79,21,21,20,19,56,42,6,97,7,34,55,35,57,86,73,88,20,29,48,52,8,77,2,12,6,47});
    param1.add(new int[]{-88,-80,-78,-68,-44,-38,42,50,62,68,70,80,92});
    param1.add(new int[]{1,0,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,1,0,1,1,0,1,0,1,1,0,1,0,0,1,0,0,1,0,1,0,1,0,1});
    param1.add(new int[]{51,59,76,83});
    param1.add(new int[]{14,50,-6,-38,80});
    param1.add(new int[]{0,0,0,1});
    param1.add(new int[]{12,48,57,40,47,36,22,50,68,98,77,78,39,55,87,75,65,27,33,27,70,34,67,71,84,33,7,61,3,9,67,92,60});
    List<Integer> param2 = new ArrayList<>();
    param2.add(3);
    param2.add(22);
    param2.add(22);
    param2.add(30);
    param2.add(11);
    param2.add(21);
    param2.add(2);
    param2.add(3);
    param2.add(3);
    param2.add(17);
    List<Integer> param3 = new ArrayList<>();
    param3.add(2);
    param3.add(22);
    param3.add(19);
    param3.add(25);
    param3.add(8);
    param3.add(33);
    param3.add(2);
    param3.add(2);
    param3.add(2);
    param3.add(32);
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