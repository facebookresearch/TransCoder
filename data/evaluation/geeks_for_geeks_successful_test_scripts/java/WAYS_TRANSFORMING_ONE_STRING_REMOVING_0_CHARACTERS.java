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
public class WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS{
static int f_gold ( String a , String b ) {
  int n = a . length ( ) , m = b . length ( ) ;
  if ( m == 0 ) {
    return 1 ;
  }
  int dp [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = i ;
    j < n ;
    j ++ ) {
      if ( i == 0 ) {
        if ( j == 0 ) {
          dp [ i ] [ j ] = ( a . charAt ( j ) == b . charAt ( i ) ) ? 1 : 0 ;
        }
        else if ( a . charAt ( j ) == b . charAt ( i ) ) {
          dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + 1 ;
        }
        else {
          dp [ i ] [ j ] = dp [ i ] [ j - 1 ] ;
        }
      }
      else if ( a . charAt ( j ) == b . charAt ( i ) ) {
        dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + dp [ i - 1 ] [ j - 1 ] ;
      }
      else {
        dp [ i ] [ j ] = dp [ i ] [ j - 1 ] ;
      }
    }
  }
  return dp [ m - 1 ] [ n - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("abcccdf");
    param0.add("aabba");
    param0.add("aabsdfljk");
    param0.add("IONiqV");
    param0.add("9667771256770");
    param0.add("10001011");
    param0.add("fczbDtMDT");
    param0.add("298746088");
    param0.add("01100011000");
    param0.add("Qk");
    List<String> param1 = new ArrayList<>();
    param1.add("abccdf");
    param1.add("ab");
    param1.add("aa");
    param1.add("XKbBiGZ");
    param1.add("50915176");
    param1.add("01");
    param1.add("FbX");
    param1.add("29888");
    param1.add("0");
    param1.add("");
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