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
public class FIND_ONE_EXTRA_CHARACTER_STRING_1{
static char f_gold ( String strA , String strB ) {
  int res = 0 , i ;
  for ( i = 0 ;
  i < strA . length ( ) ;
  i ++ ) {
    res ^= strA . charAt ( i ) ;
  }
  for ( i = 0 ;
  i < strB . length ( ) ;
  i ++ ) {
    res ^= strB . charAt ( i ) ;
  }
  return ( ( char ) ( res ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("obfLA mmMYvghH");
    param0.add("2941");
    param0.add("0111111");
    param0.add("oWvbFstI");
    param0.add("4937516500");
    param0.add("101110100");
    param0.add("hYZscJQFBE");
    param0.add("58443");
    param0.add("1100");
    param0.add("ZUdYuIBVNaeeb");
    List<String> param1 = new ArrayList<>();
    param1.add("obfLA  mmMYvghH");
    param1.add("2941");
    param1.add("0111111");
    param1.add("oWvbFstI");
    param1.add("4937516500");
    param1.add("101110100");
    param1.add("hYZscJQFBE");
    param1.add("58443");
    param1.add("1100");
    param1.add("ZUdYuIBVNaeeb");
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