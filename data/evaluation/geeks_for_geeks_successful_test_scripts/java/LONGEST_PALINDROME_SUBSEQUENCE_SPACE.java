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
public class LONGEST_PALINDROME_SUBSEQUENCE_SPACE{
static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int a [ ] = new int [ n ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int back_up = 0 ;
    for ( int j = i ;
    j < n ;
    j ++ ) {
      if ( j == i ) a [ j ] = 1 ;
      else if ( s . charAt ( i ) == s . charAt ( j ) ) {
        int temp = a [ j ] ;
        a [ j ] = back_up + 2 ;
        back_up = temp ;
      }
      else {
        back_up = a [ j ] ;
        a [ j ] = Math . max ( a [ j - 1 ] , a [ j ] ) ;
      }
    }
  }
  return a [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add(" E");
    param0.add("0845591950");
    param0.add("00101011");
    param0.add("pLSvlwrACvFaoT");
    param0.add("7246");
    param0.add("1010101100000");
    param0.add("obPkcLSFp");
    param0.add("914757557818");
    param0.add("1");
    param0.add("PKvUWIQ");
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