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
public class SUM_FACTORS_NUMBER{
static int f_gold ( int n ) {
  int result = 0 ;
  for ( int i = 2 ;
  i <= Math . sqrt ( n ) ;
  i ++ ) {
    if ( n % i == 0 ) {
      if ( i == ( n / i ) ) result += i ;
      else result += ( i + n / i ) ;
    }
  }
  return ( result + n + 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(76);
    param0.add(21);
    param0.add(4);
    param0.add(49);
    param0.add(35);
    param0.add(55);
    param0.add(43);
    param0.add(39);
    param0.add(36);
    param0.add(5);
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