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
public class LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K{
static int f_gold ( int k , String s1 , String s2 ) {
  int n = s1 . length ( ) ;
  int m = s2 . length ( ) ;
  int lcs [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  int cnt [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= m ;
    j ++ ) {
      lcs [ i ] [ j ] = Math . max ( lcs [ i - 1 ] [ j ] , lcs [ i ] [ j - 1 ] ) ;
      if ( s1 . charAt ( i - 1 ) == s2 . charAt ( j - 1 ) ) cnt [ i ] [ j ] = cnt [ i - 1 ] [ j - 1 ] + 1 ;
      if ( cnt [ i ] [ j ] >= k ) {
        for ( int a = k ;
        a <= cnt [ i ] [ j ] ;
        a ++ ) lcs [ i ] [ j ] = Math . max ( lcs [ i ] [ j ] , lcs [ i - a ] [ j - a ] + a ) ;
      }
    }
  }
  return lcs [ n ] [ m ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(4);
    param0.add(2);
    param0.add(3);
    param0.add(5);
    param0.add(2);
    param0.add(3);
    param0.add(3);
    param0.add(1);
    param0.add(2);
    param0.add(2);
    List<String> param1 = new ArrayList<>();
    param1.add("aggayxysdfa");
    param1.add("55571659965107");
    param1.add("01011011100");
    param1.add("aggasdfa");
    param1.add("5710246551");
    param1.add("0100010");
    param1.add("aabcaaaa");
    param1.add("1219");
    param1.add("111000011");
    param1.add("wiC oD");
    List<String> param2 = new ArrayList<>();
    param2.add("aggajxaaasdfa");
    param2.add("390286654154");
    param2.add("0000110001000");
    param2.add("aggajasdfaxy");
    param2.add("79032504084062");
    param2.add("10100000");
    param2.add("baaabcd");
    param2.add("3337119582");
    param2.add("011");
    param2.add("csiuGOUwE");
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}