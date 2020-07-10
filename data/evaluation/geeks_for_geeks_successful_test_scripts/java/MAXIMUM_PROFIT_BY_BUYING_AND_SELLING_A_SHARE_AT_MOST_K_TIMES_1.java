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
public class MAXIMUM_PROFIT_BY_BUYING_AND_SELLING_A_SHARE_AT_MOST_K_TIMES_1{
static int f_gold ( int price [ ] , int n , int k ) {
  int profit [ ] [ ] = new int [ k + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i <= k ;
  i ++ ) profit [ i ] [ 0 ] = 0 ;
  for ( int j = 0 ;
  j <= n ;
  j ++ ) profit [ 0 ] [ j ] = 0 ;
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    int prevDiff = Integer . MIN_VALUE ;
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      prevDiff = Math . max ( prevDiff , profit [ i - 1 ] [ j - 1 ] - price [ j - 1 ] ) ;
      profit [ i ] [ j ] = Math . max ( profit [ i ] [ j - 1 ] , price [ j ] + prevDiff ) ;
    }
  }
  return profit [ k ] [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,6,16,16,19,37,47,49,74,77,86,96});
    param0.add(new int[]{-6,-70,-26,78,98,-72,48,-94,-38,52,-50,58,84,16,-74,32,-44,-50,68,-48,28,94,-26,-96,-42,96,-24,42,-70,10,-16,-32,98,38,-2,26,-26,-78,44,-72,-56,-22});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1});
    param0.add(new int[]{22,12,58,70});
    param0.add(new int[]{-96,-96,-94,-92,-90,-88,-88,-84,-78,-76,-72,-72,-68,-62,-54,-52,-52,-36,-34,-32,-26,-20,-6,-4,-4,4,8,10,14,16,32,32,32,34,42,46,50,60,62,64,64,72,74,76,76,78,90,92,96});
    param0.add(new int[]{1,0,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,0});
    param0.add(new int[]{2,4,7,11,20,24,25,27,29,33,33,36,36,41,44,45,47,54,65,66,67,75,78,82,85,90});
    param0.add(new int[]{56,2,-10,-44,68,10,-32,-2,-68,12,-34,-36,0,40,-16,-36,92,8,-40,-10,46,98,76,-2,98,-20,6,68,32,-26,-12,70,16,-34,-50,-76,-34,-18,0,-44,-76,58});
    param0.add(new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{78,39,2,76,20,21,3,21,32,80,28,89,51,2,88,19,99,71,68,38,8,76,48,81,90,71,31});
    List<Integer> param1 = new ArrayList<>();
    param1.add(6);
    param1.add(31);
    param1.add(7);
    param1.add(3);
    param1.add(30);
    param1.add(14);
    param1.add(15);
    param1.add(24);
    param1.add(10);
    param1.add(14);
    List<Integer> param2 = new ArrayList<>();
    param2.add(6);
    param2.add(32);
    param2.add(8);
    param2.add(2);
    param2.add(36);
    param2.add(13);
    param2.add(22);
    param2.add(35);
    param2.add(8);
    param2.add(24);
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