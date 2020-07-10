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
public class FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING_1{
public static int f_gold ( String s ) {
  int p = - 1 , i , k ;
  int MAX_CHAR = 256 ;
  int hash [ ] = new int [ MAX_CHAR ] ;
  int pos [ ] = new int [ MAX_CHAR ] ;
  for ( i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    k = ( int ) s . charAt ( i ) ;
    if ( hash [ k ] == 0 ) {
      hash [ k ] ++ ;
      pos [ k ] = i ;
    }
    else if ( hash [ k ] == 1 ) hash [ k ] ++ ;
  }
  for ( i = 0 ;
  i < MAX_CHAR ;
  i ++ ) {
    if ( hash [ i ] == 2 ) {
      if ( p == - 1 ) p = pos [ i ] ;
      else if ( p > pos [ i ] ) p = pos [ i ] ;
    }
  }
  return p ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("iwLT");
    param0.add("225168787");
    param0.add("00100111");
    param0.add("ktdzbGbqsvQ");
    param0.add("5574573212164");
    param0.add("01000110101101");
    param0.add("ftiv");
    param0.add("48956");
    param0.add("10100111001101");
    param0.add("YvhEOhhz");
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