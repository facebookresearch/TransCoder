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
public class CHECK_LARGE_NUMBER_DIVISIBLE_9_NOT{
static boolean f_gold ( String str ) {
  int n = str . length ( ) ;
  int digitSum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) digitSum += ( str . charAt ( i ) - '0' ) ;
  return ( digitSum % 9 == 0 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("69354");
    param0.add("43347276812854");
    param0.add("0111111111");
    param0.add("9999918");
    param0.add("333");
    param0.add("1011011101");
    param0.add("1");
    param0.add("2284737");
    param0.add("011001");
    param0.add("cc");
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