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
public class CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER{
static boolean f_gold ( String s1 , String s2 ) {
  int n = s1 . length ( ) ;
  int m = s2 . length ( ) ;
  boolean dp [ ] [ ] = new boolean [ n + 1 ] [ m + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= m ;
    j ++ ) {
      dp [ i ] [ j ] = false ;
    }
  }
  dp [ 0 ] [ 0 ] = true ;
  for ( int i = 0 ;
  i < s1 . length ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j <= s2 . length ( ) ;
    j ++ ) {
      if ( dp [ i ] [ j ] ) {
        if ( j < s2 . length ( ) && ( Character . toUpperCase ( s1 . charAt ( i ) ) == s2 . charAt ( j ) ) ) dp [ i + 1 ] [ j + 1 ] = true ;
        if ( ! Character . isUpperCase ( s1 . charAt ( i ) ) ) dp [ i + 1 ] [ j ] = true ;
      }
    }
  }
  return ( dp [ n ] [ m ] ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("daBcd");
    param0.add("417514");
    param0.add("010000");
    param0.add("ZcKYguiMrdyn");
    param0.add("argaju");
    param0.add("1110101101");
    param0.add("ySOCoSaygi");
    param0.add("204");
    param0.add("10011100000010");
    param0.add("nMAioozPmY");
    List<String> param1 = new ArrayList<>();
    param1.add("ABC");
    param1.add("9");
    param1.add("1111011010");
    param1.add("iz");
    param1.add("RAJ");
    param1.add("110101001");
    param1.add("aRhxkYqh");
    param1.add("6986871066");
    param1.add("0");
    param1.add("WZFdDKw");
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