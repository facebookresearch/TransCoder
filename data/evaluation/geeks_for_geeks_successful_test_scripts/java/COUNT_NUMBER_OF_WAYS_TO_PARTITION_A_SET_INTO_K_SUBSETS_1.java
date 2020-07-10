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
public class COUNT_NUMBER_OF_WAYS_TO_PARTITION_A_SET_INTO_K_SUBSETS_1{
static int f_gold ( int n , int k ) {
  int [ ] [ ] dp = new int [ n + 1 ] [ k + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) dp [ i ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i <= k ;
  i ++ ) dp [ 0 ] [ k ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = 1 ;
  j <= k ;
  j ++ ) if ( j == 1 || i == j ) dp [ i ] [ j ] = 1 ;
  else dp [ i ] [ j ] = j * dp [ i - 1 ] [ j ] + dp [ i - 1 ] [ j - 1 ] ;
  return dp [ n ] [ k ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(84);
    param0.add(95);
    param0.add(67);
    param0.add(92);
    param0.add(97);
    param0.add(13);
    param0.add(37);
    param0.add(9);
    param0.add(10);
    param0.add(90);
    List<Integer> param1 = new ArrayList<>();
    param1.add(99);
    param1.add(64);
    param1.add(21);
    param1.add(22);
    param1.add(35);
    param1.add(77);
    param1.add(46);
    param1.add(92);
    param1.add(26);
    param1.add(94);
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