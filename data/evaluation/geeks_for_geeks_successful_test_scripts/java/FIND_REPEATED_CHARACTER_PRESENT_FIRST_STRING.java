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
public class FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING{
static int f_gold ( String s ) {
  int p = - 1 , i , j ;
  for ( i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    for ( j = i + 1 ;
    j < s . length ( ) ;
    j ++ ) {
      if ( s . charAt ( i ) == s . charAt ( j ) ) {
        p = i ;
        break ;
      }
    }
    if ( p != - 1 ) break ;
  }
  return p ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("ORXMflacQFBv");
    param0.add("39977638567848");
    param0.add("011110011011");
    param0.add("fYjfNy");
    param0.add("222280492");
    param0.add("11");
    param0.add("UjntBg");
    param0.add("6866190138212");
    param0.add("0000");
    param0.add("FWz PWEQgVlRZ");
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