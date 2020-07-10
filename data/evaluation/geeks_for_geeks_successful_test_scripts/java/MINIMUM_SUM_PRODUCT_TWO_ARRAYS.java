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
public class MINIMUM_SUM_PRODUCT_TWO_ARRAYS{
static int f_gold ( int a [ ] , int b [ ] , int n , int k ) {
  int diff = 0 , res = 0 ;
  int temp = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int pro = a [ i ] * b [ i ] ;
    res = res + pro ;
    if ( pro < 0 && b [ i ] < 0 ) temp = ( a [ i ] + 2 * k ) * b [ i ] ;
    else if ( pro < 0 && a [ i ] < 0 ) temp = ( a [ i ] - 2 * k ) * b [ i ] ;
    else if ( pro > 0 && a [ i ] < 0 ) temp = ( a [ i ] + 2 * k ) * b [ i ] ;
    else if ( pro > 0 && a [ i ] > 0 ) temp = ( a [ i ] - 2 * k ) * b [ i ] ;
    int d = Math . abs ( pro - temp ) ;
    if ( d > diff ) diff = d ;
  }
  return res - diff ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{8,9,9,16,19,21,24,26,26,27,31,33,36,44,46,47,69,71,72,74,74,74,74,76,76,77,89,91,91});
    param0.add(new int[]{-64,-58,26,-42,-18,-52,26,-70,0,-68,38,-98,-14,-92,-74,-90,86,-76,-8,-80,-80,54,-26,-56,48,86,-60});
    param0.add(new int[]{0,0,0,0,1,1,1,1});
    param0.add(new int[]{62,73,67,96,95,31,58,13,63,13,29,97,7,36,13,54,67,8,9,36,6,29,92,7,82,5,27,65,80,20,22,1,11,67,23,31,86,27,53,87,39,99,69});
    param0.add(new int[]{-86,-82,-42,-30,-12,-4,14,16,20,20,22,26,30,40,46,48,48,50,60,60,66,70,74,76,90,96,96,98});
    param0.add(new int[]{1,1,1,0,1,0,0,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,1,0,0,1});
    param0.add(new int[]{4,7,14,14,30,38,44,49,51,53,54,56,58,62,67,76,86,86,88,91,95});
    param0.add(new int[]{2,90,-92,58,56,94,12,-2,86,-70,46,-80,42,-6,72,-52,4,96,-42,50,-28,42,8,26,46,70,-2,-24,-36,50,26,70,74,-52,34,-88,-66,74,52,62,-24,-80,40,42,90});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{61,96,7,59,86,74,7,95,13,52,18,77,25,97,74,18});
    List<int [ ]> param1 = new ArrayList<>();
    param1.add(new int[]{1,8,10,10,12,16,17,19,20,20,23,33,37,38,58,66,69,70,70,76,79,80,83,84,84,86,87,87,93});
    param1.add(new int[]{90,-2,-8,12,-58,46,-54,-40,-10,-76,-62,66,42,-66,4,-6,50,8,-18,92,-42,30,-34,74,-86,-56,52});
    param1.add(new int[]{0,0,0,0,0,1,1,1});
    param1.add(new int[]{88,64,94,64,4,23,6,85,92,68,78,53,96,88,69,28,12,34,92,67,39,68,72,64,10,14,26,61,96,1,79,87,45,9,16,70,63,84,79,63,11,85,46});
    param1.add(new int[]{-98,-78,-68,-68,-64,-40,-38,-38,-26,-12,-6,0,2,8,18,34,52,58,64,64,70,72,76,82,84,90,96,96});
    param1.add(new int[]{1,0,0,0,0,1,0,0,0,1,1,0,0,1,1,0,0,1,1,0,1,0,1,0,0,1,0,1,1,0,0,0});
    param1.add(new int[]{2,2,7,19,20,21,22,26,42,45,46,46,59,63,63,72,73,74,77,83,89});
    param1.add(new int[]{98,62,-52,-92,-14,-92,62,86,20,36,-80,-12,-38,70,-28,-28,42,-10,94,-16,-72,-96,76,-14,-18,-12,38,14,46,16,-90,10,-34,-6,-34,-62,96,14,0,-10,32,-6,96,-72,-2});
    param1.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param1.add(new int[]{56,38,75,57,82,30,38,79,39,73,74,73,36,10,80,50});
    List<Integer> param2 = new ArrayList<>();
    param2.add(20);
    param2.add(20);
    param2.add(7);
    param2.add(23);
    param2.add(14);
    param2.add(20);
    param2.add(11);
    param2.add(25);
    param2.add(46);
    param2.add(13);
    List<Integer> param3 = new ArrayList<>();
    param3.add(28);
    param3.add(16);
    param3.add(5);
    param3.add(23);
    param3.add(14);
    param3.add(16);
    param3.add(17);
    param3.add(25);
    param3.add(33);
    param3.add(12);
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