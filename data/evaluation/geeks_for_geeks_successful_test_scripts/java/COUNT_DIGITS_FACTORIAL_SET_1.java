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
public class COUNT_DIGITS_FACTORIAL_SET_1{
static int f_gold ( int n ) {
  if ( n < 0 ) return 0 ;
  if ( n <= 1 ) return 1 ;
  double digits = 0 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) digits += Math . log10 ( i ) ;
  return ( int ) ( Math . floor ( digits ) ) + 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(66);
    param0.add(7);
    param0.add(55);
    param0.add(37);
    param0.add(76);
    param0.add(16);
    param0.add(17);
    param0.add(95);
    param0.add(71);
    param0.add(90);
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