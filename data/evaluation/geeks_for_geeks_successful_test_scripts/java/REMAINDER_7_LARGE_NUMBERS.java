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
public class REMAINDER_7_LARGE_NUMBERS{
static int f_gold ( String num ) {
  int series [ ] = {
    1 , 3 , 2 , - 1 , - 3 , - 2 };
    int series_index = 0 ;
    int result = 0 ;
    for ( int i = num . length ( ) - 1 ;
    i >= 0 ;
    i -- ) {
      int digit = num . charAt ( i ) - '0' ;
      result += digit * series [ series_index ] ;
      series_index = ( series_index + 1 ) % 6 ;
      result %= 7 ;
    }
    if ( result < 0 ) result = ( result + 7 ) % 7 ;
    return result ;
  }
  

//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("K");
    param0.add("850076");
    param0.add("00111");
    param0.add("X");
    param0.add("1");
    param0.add("10010001100");
    param0.add(" pgPeLz");
    param0.add("53212456821275");
    param0.add("101");
    param0.add("V");
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