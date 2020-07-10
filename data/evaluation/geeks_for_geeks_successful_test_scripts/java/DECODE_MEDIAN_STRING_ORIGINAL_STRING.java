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
public class DECODE_MEDIAN_STRING_ORIGINAL_STRING{
static String f_gold ( String s ) {
  int l = s . length ( ) ;
  String s1 = "" ;
  boolean isEven = ( l % 2 == 0 ) ? true : false ;
  for ( int i = 0 ;
  i < l ;
  i += 2 ) {
    if ( isEven ) {
      s1 = s . charAt ( i ) + s1 ;
      s1 += s . charAt ( i + 1 ) ;
    }
    else {
      if ( l - i > 1 ) {
        s1 += s . charAt ( i ) ;
        s1 = s . charAt ( i + 1 ) + s1 ;
      }
      else {
        s1 += s . charAt ( i ) ;
      }
    }
  }
  return s1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add(" EgvQCeqYpZtv");
    param0.add("488540");
    param0.add("0000101010111");
    param0.add("syw");
    param0.add("402355");
    param0.add("0");
    param0.add("wmHMlAtq");
    param0.add("7962");
    param0.add("111111");
    param0.add("UbgRGDquop");
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