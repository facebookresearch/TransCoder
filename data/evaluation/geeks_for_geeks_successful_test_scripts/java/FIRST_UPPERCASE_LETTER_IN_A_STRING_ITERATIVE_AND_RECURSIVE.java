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
public class FIRST_UPPERCASE_LETTER_IN_A_STRING_ITERATIVE_AND_RECURSIVE{
static char f_gold ( String str ) {
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) if ( Character . isUpperCase ( str . charAt ( i ) ) ) return str . charAt ( i ) ;
  return 0 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("pH");
    param0.add("96544000");
    param0.add("000010000");
    param0.add("ujqpx");
    param0.add("20684847994");
    param0.add("111");
    param0.add("rclkv");
    param0.add("45173693434");
    param0.add("11111011001101");
    param0.add("f");
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