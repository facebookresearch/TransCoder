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
public class PROGRAM_FIND_REMAINDER_LARGE_NUMBER_DIVIDED_11{
static int f_gold ( String str ) {
  int len = str . length ( ) ;
  int num , rem = 0 ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    num = rem * 10 + ( str . charAt ( i ) - '0' ) ;
    rem = num % 11 ;
  }
  return rem ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("DvsNZVNZ");
    param0.add("1170");
    param0.add("10");
    param0.add("evsPwREbSY");
    param0.add("09219178704");
    param0.add("1001010");
    param0.add("SkZbWSajDKmiG");
    param0.add("0287976763");
    param0.add("011011000111");
    param0.add("lUn");
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