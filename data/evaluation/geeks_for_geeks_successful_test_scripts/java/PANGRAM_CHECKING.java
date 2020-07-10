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
public class PANGRAM_CHECKING{
public static boolean f_gold ( String str ) {
  boolean [ ] mark = new boolean [ 26 ] ;
  int index = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( 'A' <= str . charAt ( i ) && str . charAt ( i ) <= 'Z' ) index = str . charAt ( i ) - 'A' ;
    else if ( 'a' <= str . charAt ( i ) && str . charAt ( i ) <= 'z' ) index = str . charAt ( i ) - 'a' ;
    mark [ index ] = true ;
  }
  for ( int i = 0 ;
  i <= 25 ;
  i ++ ) if ( mark [ i ] == false ) return ( false ) ;
  return ( true ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("The quick brown fox jumps over the lazy dog ");
    param0.add("The quick brown fox jumps over the dog");
    param0.add("abcdefghijklmnopqrstuvwxyz");
    param0.add("AbcdefghijKlmnopqrstUVwxyz");
    param0.add("The quicK broWn fOX jumps over the laZYy dog ");
    param0.add("AbcdefghijKlmnopqrstVwxyz");
    param0.add("U");
    param0.add("397548458372");
    param0.add("11");
    param0.add("iwCiUFU r");
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