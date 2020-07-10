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
public class DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING{
static int f_gold ( String str ) {
  int n = str . length ( ) ;
  int [ ] [ ] C = new int [ n ] [ n ] ;
  boolean [ ] [ ] P = new boolean [ n ] [ n ] ;
  int i , j , k , L ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    P [ i ] [ i ] = true ;
    C [ i ] [ i ] = 0 ;
  }
  for ( L = 2 ;
  L <= n ;
  L ++ ) {
    for ( i = 0 ;
    i < n - L + 1 ;
    i ++ ) {
      j = i + L - 1 ;
      if ( L == 2 ) P [ i ] [ j ] = ( str . charAt ( i ) == str . charAt ( j ) ) ;
      else P [ i ] [ j ] = ( str . charAt ( i ) == str . charAt ( j ) ) && P [ i + 1 ] [ j - 1 ] ;
      if ( P [ i ] [ j ] == true ) C [ i ] [ j ] = 0 ;
      else {
        C [ i ] [ j ] = Integer . MAX_VALUE ;
        for ( k = i ;
        k <= j - 1 ;
        k ++ ) C [ i ] [ j ] = Integer . min ( C [ i ] [ j ] , C [ i ] [ k ] + C [ k + 1 ] [ j ] + 1 ) ;
      }
    }
  }
  return C [ 0 ] [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ydYdV");
    param0.add("4446057");
    param0.add("0111");
    param0.add("keEj");
    param0.add("642861576557");
    param0.add("11111000101");
    param0.add("ram");
    param0.add("09773261");
    param0.add("1");
    param0.add("AVBEKClFdj");
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}