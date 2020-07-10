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
public class CHANGE_BITS_CAN_MADE_ONE_FLIP_1{
static boolean f_gold ( String str ) {
  int sum = 0 ;
  int n = str . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sum += str . charAt ( i ) - '0' ;
  return ( sum == n - 1 || sum == 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("00001");
    param0.add("0000");
    param0.add("11");
    param0.add("111110");
    param0.add("1");
    param0.add("111010111010");
    param0.add("hUInqJXNdbfP");
    param0.add("5191");
    param0.add("1110101101");
    param0.add("NupSrU xz");
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