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
public class CHECK_LARGE_NUMBER_DIVISIBLE_3_NOT{
static boolean f_gold ( String str ) {
  int n = str . length ( ) ;
  int digitSum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) digitSum += ( str . charAt ( i ) - '0' ) ;
  return ( digitSum % 3 == 0 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("Xy");
    param0.add("4827182");
    param0.add("110011");
    param0.add("GdOXZk");
    param0.add("8970294");
    param0.add("000110");
    param0.add("xMRGdAgsGlH");
    param0.add("34643260819239");
    param0.add("00");
    param0.add("DcCK");
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