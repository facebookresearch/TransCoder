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
public class PRINT_A_CLOSEST_STRING_THAT_DOES_NOT_CONTAIN_ADJACENT_DUPLICATES{
public static String f_gold ( String s1 ) {
  int n = s1 . length ( ) ;
  char [ ] s = s1 . toCharArray ( ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( s [ i ] == s [ i - 1 ] ) {
      s [ i ] = 'a' ;
      while ( s [ i ] == s [ i - 1 ] || ( i + 1 < n && s [ i ] == s [ i + 1 ] ) ) s [ i ] ++ ;
      i ++ ;
    }
  }
  return ( new String ( s ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("cHcZCdkbIMGUYe");
    param0.add("2292016725711");
    param0.add("10110111100010");
    param0.add("wHso xGbBY");
    param0.add("21884");
    param0.add("0");
    param0.add("I");
    param0.add("716213436");
    param0.add("101");
    param0.add("HXdDbjcyPc");
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