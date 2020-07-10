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
public class STEINS_ALGORITHM_FOR_FINDING_GCD_1{
static int f_gold ( int a , int b ) {
  if ( a == b ) return a ;
  if ( a == 0 ) return b ;
  if ( b == 0 ) return a ;
  if ( ( ~ a & 1 ) == 1 ) {
    if ( ( b & 1 ) == 1 ) return f_gold ( a >> 1 , b ) ;
    else return f_gold ( a >> 1 , b >> 1 ) << 1 ;
  }
  if ( ( ~ b & 1 ) == 1 ) return f_gold ( a , b >> 1 ) ;
  if ( a > b ) return f_gold ( ( a - b ) >> 1 , b ) ;
  return f_gold ( ( b - a ) >> 1 , a ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(52);
    param0.add(36);
    param0.add(12);
    param0.add(69);
    param0.add(45);
    param0.add(7);
    param0.add(45);
    param0.add(62);
    param0.add(96);
    param0.add(89);
    List<Integer> param1 = new ArrayList<>();
    param1.add(29);
    param1.add(94);
    param1.add(6);
    param1.add(7);
    param1.add(11);
    param1.add(51);
    param1.add(55);
    param1.add(86);
    param1.add(63);
    param1.add(12);
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