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
public class SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER{
static int f_gold ( int num ) {
  int result = 0 ;
  for ( int i = 2 ;
  i <= Math . sqrt ( num ) ;
  i ++ ) {
    if ( num % i == 0 ) {
      if ( i == ( num / i ) ) result += i ;
      else result += ( i + num / i ) ;
    }
  }
  return ( result + 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(2);
    param0.add(57);
    param0.add(28);
    param0.add(43);
    param0.add(38);
    param0.add(29);
    param0.add(45);
    param0.add(47);
    param0.add(44);
    param0.add(3);
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