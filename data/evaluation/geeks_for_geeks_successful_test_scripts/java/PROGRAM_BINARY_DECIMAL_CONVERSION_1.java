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
public class PROGRAM_BINARY_DECIMAL_CONVERSION_1{
static int f_gold ( String n ) {
  String num = n ;
  int dec_value = 0 ;
  int base = 1 ;
  int len = num . length ( ) ;
  for ( int i = len - 1 ;
  i >= 0 ;
  i -- ) {
    if ( num . charAt ( i ) == '1' ) dec_value += base ;
    base = base * 2 ;
  }
  return dec_value ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("uEmIAgF");
    param0.add("753310137");
    param0.add("010011010");
    param0.add("kNi");
    param0.add("04562016903312");
    param0.add("000111101");
    param0.add("bk");
    param0.add("9");
    param0.add("1");
    param0.add("XxT nXLlk");
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