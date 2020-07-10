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
public class DYNAMIC_PROGRAMMING_SET_8_MATRIX_CHAIN_MULTIPLICATION_1{
static int f_gold ( int p [ ] , int n ) {
  int m [ ] [ ] = new int [ n ] [ n ] ;
  int i , j , k , L , q ;
  for ( i = 1 ;
  i < n ;
  i ++ ) m [ i ] [ i ] = 0 ;
  for ( L = 2 ;
  L < n ;
  L ++ ) {
    for ( i = 1 ;
    i < n - L + 1 ;
    i ++ ) {
      j = i + L - 1 ;
      if ( j == n ) continue ;
      m [ i ] [ j ] = Integer . MAX_VALUE ;
      for ( k = i ;
      k <= j - 1 ;
      k ++ ) {
        q = m [ i ] [ k ] + m [ k + 1 ] [ j ] + p [ i - 1 ] * p [ k ] * p [ j ] ;
        if ( q < m [ i ] [ j ] ) m [ i ] [ j ] = q ;
      }
    }
  }
  return m [ 1 ] [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,4,11,17,26,33,37,51,62,70,71,73,74,74,81,82,83,90,95,98,98});
    param0.add(new int[]{-50,74,-8,2,-24,28,-86,34,-36,92,-70,-98});
    param0.add(new int[]{0,0,0,1,1,1,1});
    param0.add(new int[]{4,73,3,88,79,40,25,58,39,53,32,20,95,60,60,98,23,95,42,26,95,14,43,97,30,83,29,37,74,72,37,31,32,83,57,40,56,95,8,79,67,62});
    param0.add(new int[]{-92,-88,-88,-88,-86,-84,-80,-78,-76,-74,-72,-68,-68,-66,-62,-42,-34,-30,-28,-24,-20,-14,-12,-10,-8,-8,-8,6,10,26,26,36,38,42,46,48,48,54,54,58,60,66,70,76,78,80,82,98});
    param0.add(new int[]{1,1,0,1,0,0,1});
    param0.add(new int[]{8,25,38,39,41,57,71,89});
    param0.add(new int[]{76,-28,20,62,-44,8,-46,52,26,76,22,38,-36,10,2,-86,42,-62,-68,-56,10});
    param0.add(new int[]{0,0,0,0,1,1,1});
    param0.add(new int[]{98,96,76,76,8,4,53,34,54,10,98,46,58,7,36,72,32,59,52,99,40,52,50,43,26,93,76,90,12,82,31,50,55,34,61,78});
    List<Integer> param1 = new ArrayList<>();
    param1.add(20);
    param1.add(10);
    param1.add(3);
    param1.add(41);
    param1.add(47);
    param1.add(4);
    param1.add(6);
    param1.add(18);
    param1.add(5);
    param1.add(26);
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