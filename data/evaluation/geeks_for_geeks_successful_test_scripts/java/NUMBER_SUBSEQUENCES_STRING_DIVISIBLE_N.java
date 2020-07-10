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
public class NUMBER_SUBSEQUENCES_STRING_DIVISIBLE_N{
static int f_gold ( String str , int n ) {
  int len = str . length ( ) ;
  int dp [ ] [ ] = new int [ len ] [ n ] ;
  dp [ 0 ] [ ( str . charAt ( 0 ) - '0' ) % n ] ++ ;
  for ( int i = 1 ;
  i < len ;
  i ++ ) {
    dp [ i ] [ ( str . charAt ( i ) - '0' ) % n ] ++ ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      dp [ i ] [ j ] += dp [ i - 1 ] [ j ] ;
      dp [ i ] [ ( j * 10 + ( str . charAt ( i ) - '0' ) ) % n ] += dp [ i - 1 ] [ j ] ;
    }
  }
  return dp [ len - 1 ] [ 0 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("fYqkPLSWBgFy");
    param0.add("151587");
    param0.add("111111110");
    param0.add("JQJHaUkkTrt");
    param0.add("736592575580");
    param0.add("10");
    param0.add("L");
    param0.add("3476601");
    param0.add("0110001001");
    param0.add("YimayLFU");
    List<Integer> param1 = new ArrayList<>();
    param1.add(55);
    param1.add(84);
    param1.add(9);
    param1.add(97);
    param1.add(68);
    param1.add(3);
    param1.add(74);
    param1.add(2);
    param1.add(53);
    param1.add(45);
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