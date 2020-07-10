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
public class FIND_NUMBER_TIMES_STRING_OCCURS_GIVEN_STRING_1{
static int f_gold ( String a , String b ) {
  int m = a . length ( ) ;
  int n = b . length ( ) ;
  int lookup [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  ++ i ) lookup [ 0 ] [ i ] = 0 ;
  for ( int i = 0 ;
  i <= m ;
  ++ i ) lookup [ i ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( a . charAt ( i - 1 ) == b . charAt ( j - 1 ) ) lookup [ i ] [ j ] = lookup [ i - 1 ] [ j - 1 ] + lookup [ i - 1 ] [ j ] ;
      else lookup [ i ] [ j ] = lookup [ i - 1 ] [ j ] ;
    }
  }
  return lookup [ m ] [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("fZOKCdZ Lav");
    param0.add("2");
    param0.add("1000001110");
    param0.add("IAOyBzgIWHo");
    param0.add("211806");
    param0.add("1");
    param0.add("CVaQTG");
    param0.add("6265187228");
    param0.add("10111101101000");
    param0.add("vEi");
    List<String> param1 = new ArrayList<>();
    param1.add("fKA");
    param1.add("187012");
    param1.add("0");
    param1.add("oA");
    param1.add("10");
    param1.add("001011100");
    param1.add("CT");
    param1.add("628");
    param1.add("01111");
    param1.add("bigsvkQG");
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