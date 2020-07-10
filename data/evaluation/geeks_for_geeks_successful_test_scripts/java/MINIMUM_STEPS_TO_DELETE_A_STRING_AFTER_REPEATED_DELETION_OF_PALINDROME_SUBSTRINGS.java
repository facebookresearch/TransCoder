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
public class MINIMUM_STEPS_TO_DELETE_A_STRING_AFTER_REPEATED_DELETION_OF_PALINDROME_SUBSTRINGS{
static int f_gold ( String str ) {
  int N = str . length ( ) ;
  int [ ] [ ] dp = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) for ( int j = 0 ;
  j <= N ;
  j ++ ) dp [ i ] [ j ] = 0 ;
  for ( int len = 1 ;
  len <= N ;
  len ++ ) {
    for ( int i = 0 , j = len - 1 ;
    j < N ;
    i ++ , j ++ ) {
      if ( len == 1 ) dp [ i ] [ j ] = 1 ;
      else {
        dp [ i ] [ j ] = 1 + dp [ i + 1 ] [ j ] ;
        if ( str . charAt ( i ) == str . charAt ( i + 1 ) ) dp [ i ] [ j ] = Math . min ( 1 + dp [ i + 2 ] [ j ] , dp [ i ] [ j ] ) ;
        for ( int K = i + 2 ;
        K <= j ;
        K ++ ) if ( str . charAt ( i ) == str . charAt ( K ) ) dp [ i ] [ j ] = Math . min ( dp [ i + 1 ] [ K - 1 ] + dp [ K + 1 ] [ j ] , dp [ i ] [ j ] ) ;
      }
    }
  }
  return dp [ 0 ] [ N - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("YCtLQtHLwr");
    param0.add("47713514383248");
    param0.add("0100101001111");
    param0.add("XfdIYVn");
    param0.add("45499225407");
    param0.add("000100111001");
    param0.add("ZoUQhQwoap");
    param0.add("18579027952");
    param0.add("00000001111");
    param0.add("JD");
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