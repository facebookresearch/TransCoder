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
public class LEXICOGRAPHICALLY_MINIMUM_STRING_ROTATION{
static String f_gold ( String str ) {
  int n = str . length ( ) ;
  String arr [ ] = new String [ n ] ;
  String concat = str + str ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = concat . substring ( i , i + n ) ;
  }
  Arrays . sort ( arr ) ;
  return arr [ 0 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("onWEchl");
    param0.add("2");
    param0.add("100");
    param0.add("GHbCZA");
    param0.add("50568798206105");
    param0.add("001011110001");
    param0.add("lljpYhznnyu");
    param0.add("54499921759984");
    param0.add("11101");
    param0.add("qvypgCYEjsyjwZ");
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