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
public class REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS{
static String f_gold ( String str ) {
  int len = str . length ( ) ;
  char res [ ] = new char [ len ] ;
  int index = 0 , i = 0 ;
  Stack < Integer > s = new Stack < Integer > ( ) ;
  s . push ( 0 ) ;
  while ( i < len ) {
    if ( str . charAt ( i ) == '+' ) {
      if ( s . peek ( ) == 1 ) res [ index ++ ] = '-' ;
      if ( s . peek ( ) == 0 ) res [ index ++ ] = '+' ;
    }
    else if ( str . charAt ( i ) == '-' ) {
      if ( s . peek ( ) == 1 ) res [ index ++ ] = '+' ;
      else if ( s . peek ( ) == 0 ) res [ index ++ ] = '-' ;
    }
    else if ( str . charAt ( i ) == '(' && i > 0 ) {
      if ( str . charAt ( i - 1 ) == '-' ) {
        int x = ( s . peek ( ) == 1 ) ? 0 : 1 ;
        s . push ( x ) ;
      }
      else if ( str . charAt ( i - 1 ) == '+' ) s . push ( s . peek ( ) ) ;
    }
    else if ( str . charAt ( i ) == ')' ) s . pop ( ) ;
    else res [ index ++ ] = str . charAt ( i ) ;
    i ++ ;
  }
  return new String ( res ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ggbsMvMZcMOVd");
    param0.add("384292670");
    param0.add("10000100");
    param0.add("fdHME");
    param0.add("09198832");
    param0.add("0011111011");
    param0.add("SnXwRS");
    param0.add("071");
    param0.add("01101");
    param0.add("xwmqxgBa");
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)).equals(f_gold(param0.get(i))))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}