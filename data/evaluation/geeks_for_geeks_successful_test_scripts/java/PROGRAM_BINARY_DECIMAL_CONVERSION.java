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
public class PROGRAM_BINARY_DECIMAL_CONVERSION{
static int f_gold ( int n ) {
  int num = n ;
  int dec_value = 0 ;
  int base = 1 ;
  int temp = num ;
  while ( temp > 0 ) {
    int last_digit = temp % 10 ;
    temp = temp / 10 ;
    dec_value += last_digit * base ;
    base = base * 2 ;
  }
  return dec_value ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(70);
    param0.add(95);
    param0.add(41);
    param0.add(97);
    param0.add(8);
    param0.add(16);
    param0.add(41);
    param0.add(57);
    param0.add(81);
    param0.add(78);
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