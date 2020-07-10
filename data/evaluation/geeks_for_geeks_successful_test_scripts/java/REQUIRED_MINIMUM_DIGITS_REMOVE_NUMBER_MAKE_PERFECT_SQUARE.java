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
public class REQUIRED_MINIMUM_DIGITS_REMOVE_NUMBER_MAKE_PERFECT_SQUARE{
static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int ans = - 1 ;
  String num = "" ;
  for ( int i = 1 ;
  i < ( 1 << n ) ;
  i ++ ) {
    String str = "" ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) == 1 ) {
        str += s . charAt ( j ) ;
      }
    }
    if ( str . charAt ( 0 ) != '0' ) {
      int temp = 0 ;
      for ( int j = 0 ;
      j < str . length ( ) ;
      j ++ ) temp = temp * 10 + ( int ) ( str . charAt ( j ) - '0' ) ;
      int k = ( int ) Math . sqrt ( temp ) ;
      if ( k * k == temp ) {
        if ( ans < ( int ) str . length ( ) ) {
          ans = ( int ) str . length ( ) ;
          num = str ;
        }
      }
    }
  }
  if ( ans == - 1 ) return ans ;
  else {
    System . out . print ( num + " " ) ;
    return n - ans ;
  }
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("h");
    param0.add("1391212");
    param0.add("010");
    param0.add("ksRFLRVL");
    param0.add("5809836998");
    param0.add("1111000");
    param0.add("hJoDzrrBaF");
    param0.add("6076");
    param0.add("001010010");
    param0.add("lU DBBVF");
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