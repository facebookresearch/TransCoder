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
public class COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE{
static int f_gold ( String S , String T ) {
  int m = T . length ( ) ;
  int n = S . length ( ) ;
  if ( m > n ) return 0 ;
  int mat [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) mat [ i ] [ 0 ] = 0 ;
  for ( int j = 0 ;
  j <= n ;
  j ++ ) mat [ 0 ] [ j ] = 1 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( T . charAt ( i - 1 ) != S . charAt ( j - 1 ) ) mat [ i ] [ j ] = mat [ i ] [ j - 1 ] ;
      else mat [ i ] [ j ] = mat [ i ] [ j - 1 ] + mat [ i - 1 ] [ j - 1 ] ;
    }
  }
  return mat [ m ] [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("banana");
    param0.add("49597223");
    param0.add("1000010000011");
    param0.add("BTlzufK");
    param0.add("3474007");
    param0.add("0010");
    param0.add("dKHhoTD");
    param0.add("9123259723");
    param0.add("11001000111110");
    param0.add("iY WJlIZ");
    List<String> param1 = new ArrayList<>();
    param1.add("ban");
    param1.add("42");
    param1.add("010");
    param1.add("lf RS");
    param1.add("370");
    param1.add("00000");
    param1.add("doT");
    param1.add("123");
    param1.add("0");
    param1.add("iI");
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