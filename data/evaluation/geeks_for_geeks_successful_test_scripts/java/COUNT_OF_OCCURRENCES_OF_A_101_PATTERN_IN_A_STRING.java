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
public class COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING{
static int f_gold ( String str ) {
  int len = str . length ( ) ;
  boolean oneSeen = false ;
  int count = 0 ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    char getChar = str . charAt ( i ) ;
    if ( getChar == '1' && oneSeen == true ) {
      if ( str . charAt ( i - 1 ) == '0' ) count ++ ;
    }
    if ( getChar == '1' && oneSeen == false ) oneSeen = true ;
    if ( getChar != '0' && str . charAt ( i ) != '1' ) oneSeen = false ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("1001ab010abc01001");
    param0.add("1001010001");
    param0.add("010100010100");
    param0.add("DLCu");
    param0.add("7072430592");
    param0.add("011");
    param0.add("pnJpypYOza");
    param0.add("1037");
    param0.add("111");
    param0.add("HxK");
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