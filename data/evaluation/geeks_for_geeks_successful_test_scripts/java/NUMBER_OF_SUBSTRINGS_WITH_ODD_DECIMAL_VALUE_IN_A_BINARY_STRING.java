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
public class NUMBER_OF_SUBSTRINGS_WITH_ODD_DECIMAL_VALUE_IN_A_BINARY_STRING{
static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int [ ] auxArr = new int [ n ] ;
  if ( s . charAt ( 0 ) == '1' ) auxArr [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == '1' ) auxArr [ i ] = auxArr [ i - 1 ] + 1 ;
    else auxArr [ i ] = auxArr [ i - 1 ] ;
  }
  int count = 0 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) if ( s . charAt ( i ) == '1' ) count += auxArr [ i ] ;
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("OGiOkJF");
    param0.add("517376");
    param0.add("11");
    param0.add("Ze");
    param0.add("8763644247018");
    param0.add("00111010001");
    param0.add("HGwkBKUOVu");
    param0.add("652");
    param0.add("101000011110");
    param0.add("kvdpG ");
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