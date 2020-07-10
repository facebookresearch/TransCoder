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
public class STRING_CONTAINING_FIRST_LETTER_EVERY_WORD_GIVEN_STRING_SPACES{
static String f_gold ( String str ) {
  String result = "" ;
  boolean v = true ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( str . charAt ( i ) == ' ' ) {
      v = true ;
    }
    else if ( str . charAt ( i ) != ' ' && v == true ) {
      result += ( str . charAt ( i ) ) ;
      v = false ;
    }
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("t a");
    param0.add("77 78 2 600 7");
    param0.add("011 10 10");
    param0.add("kV Co O iR");
    param0.add("2");
    param0.add("0 11");
    param0.add("Y sT wgheC");
    param0.add("58 824 6");
    param0.add("00 100 001 0111");
    param0.add("Q");
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