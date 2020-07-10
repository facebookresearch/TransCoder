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
public class COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER{
static int f_gold ( int n ) {
  int result = 0 ;
  for ( int i = 1 ;
  i <= 9 ;
  i ++ ) {
    Stack < Integer > s = new Stack < > ( ) ;
    if ( i <= n ) {
      s . push ( i ) ;
      result ++ ;
    }
    while ( ! s . empty ( ) ) {
      int tp = s . peek ( ) ;
      s . pop ( ) ;
      for ( int j = tp % 10 ;
      j <= 9 ;
      j ++ ) {
        int x = tp * 10 + j ;
        if ( x <= n ) {
          s . push ( x ) ;
          result ++ ;
        }
      }
    }
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(69);
    param0.add(72);
    param0.add(88);
    param0.add(7);
    param0.add(66);
    param0.add(34);
    param0.add(23);
    param0.add(37);
    param0.add(33);
    param0.add(21);
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