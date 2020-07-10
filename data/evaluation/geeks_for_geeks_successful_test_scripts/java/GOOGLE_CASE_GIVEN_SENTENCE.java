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
public class GOOGLE_CASE_GIVEN_SENTENCE{
static String f_gold ( String s ) {
  int n = s . length ( ) ;
  String s1 = "" ;
  s1 = s1 + Character . toLowerCase ( s . charAt ( 0 ) ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == ' ' && i < n ) {
      s1 = s1 + " " + Character . toLowerCase ( s . charAt ( i + 1 ) ) ;
      i ++ ;
    }
    else s1 = s1 + Character . toUpperCase ( s . charAt ( i ) ) ;
  }
  return s1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("TEYndweqZA");
    param0.add("01865");
    param0.add("11001100");
    param0.add("CzwznJmQet");
    param0.add("318305446");
    param0.add("0000001111110");
    param0.add("yzT");
    param0.add("38630230");
    param0.add("01101");
    param0.add("zoizI");
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