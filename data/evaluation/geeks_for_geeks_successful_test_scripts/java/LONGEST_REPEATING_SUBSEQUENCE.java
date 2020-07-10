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
public class LONGEST_REPEATING_SUBSEQUENCE{
static int f_gold ( String str ) {
  int n = str . length ( ) ;
  int [ ] [ ] dp = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( str . charAt ( i - 1 ) == str . charAt ( j - 1 ) && i != j ) dp [ i ] [ j ] = 1 + dp [ i - 1 ] [ j - 1 ] ;
      else dp [ i ] [ j ] = Math . max ( dp [ i ] [ j - 1 ] , dp [ i - 1 ] [ j ] ) ;
    }
  }
  return dp [ n ] [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("JxZFz");
    param0.add("7648992235770");
    param0.add("11100000");
    param0.add("cRN  SgYjPsctJ");
    param0.add("434");
    param0.add("1");
    param0.add("JRfZIAsbrPBZ");
    param0.add("03779368305592");
    param0.add("1111000");
    param0.add("BkULuIi");
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