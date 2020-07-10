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
public class COUNT_PALINDROMIC_SUBSEQUENCE_GIVEN_STRING{
static int f_gold ( String str ) {
  int N = str . length ( ) ;
  int [ ] [ ] cps = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) cps [ i ] [ i ] = 1 ;
  for ( int L = 2 ;
  L <= N ;
  L ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int k = L + i - 1 ;
      if ( k < N ) {
        if ( str . charAt ( i ) == str . charAt ( k ) ) cps [ i ] [ k ] = cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] + 1 ;
        else cps [ i ] [ k ] = cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] - cps [ i + 1 ] [ k - 1 ] ;
      }
    }
  }
  return cps [ 0 ] [ N - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("R");
    param0.add("2956350");
    param0.add("11100111110101");
    param0.add("TZTDLIIfAD");
    param0.add("98");
    param0.add("1100100001");
    param0.add("oKwGeatf");
    param0.add("19");
    param0.add("00010110100");
    param0.add("Cyq");
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