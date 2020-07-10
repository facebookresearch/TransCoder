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
public class NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS{
static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) if ( s . charAt ( i ) == '4' || s . charAt ( i ) == '8' || s . charAt ( i ) == '0' ) count ++ ;
  for ( int i = 0 ;
  i < n - 1 ;
  ++ i ) {
    int h = ( s . charAt ( i ) - '0' ) * 10 + ( s . charAt ( i + 1 ) - '0' ) ;
    if ( h % 4 == 0 ) count = count + i + 1 ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("Qaq");
    param0.add("9400761825850");
    param0.add("0011001111");
    param0.add("lasWqrLRq");
    param0.add("5662");
    param0.add("110");
    param0.add(" tOYKf");
    param0.add("6536991235305");
    param0.add("11111");
    param0.add("uZftT iDHcYiCt");
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