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
public class CHECK_OCCURRENCES_CHARACTER_APPEAR_TOGETHER{
static boolean f_gold ( String s , char c ) {
  boolean oneSeen = false ;
  int i = 0 , n = s . length ( ) ;
  while ( i < n ) {
    if ( s . charAt ( i ) == c ) {
      if ( oneSeen == true ) return false ;
      while ( i < n && s . charAt ( i ) == c ) i ++ ;
      oneSeen = true ;
    }
    else i ++ ;
  }
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("gILrzLimS");
    param0.add("307471222");
    param0.add("110");
    param0.add("GcAB");
    param0.add("113");
    param0.add("011110010");
    param0.add("wcwob");
    param0.add("74571582216153");
    param0.add("100000011");
    param0.add("ryPErkzY");
    List<Character> param1 = new ArrayList<>();
    param1.add('m');
    param1.add('2');
    param1.add('0');
    param1.add('v');
    param1.add('3');
    param1.add('0');
    param1.add('w');
    param1.add('1');
    param1.add('0');
    param1.add('q');
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