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
public class CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING{
static int f_gold ( String str ) {
  int res = str . charAt ( 0 ) - '0' ;
  for ( int i = 1 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( str . charAt ( i ) == '0' || str . charAt ( i ) == '1' || res < 2 ) res += ( str . charAt ( i ) - '0' ) ;
    else res *= ( str . charAt ( i ) - '0' ) ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("pR");
    param0.add("9518");
    param0.add("1");
    param0.add("nNMCIXUCpRMmvO");
    param0.add("3170487");
    param0.add("0100101010");
    param0.add("Z rONcUqWb");
    param0.add("00419297");
    param0.add("00");
    param0.add("r");
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