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
public class COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME{
static int f_gold ( int n ) {
  int table [ ] = new int [ n + 1 ] , i ;
  Arrays . fill ( table , 0 ) ;
  table [ 0 ] = 1 ;
  for ( i = 3 ;
  i <= n ;
  i ++ ) table [ i ] += table [ i - 3 ] ;
  for ( i = 5 ;
  i <= n ;
  i ++ ) table [ i ] += table [ i - 5 ] ;
  for ( i = 10 ;
  i <= n ;
  i ++ ) table [ i ] += table [ i - 10 ] ;
  return table [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(83);
    param0.add(29);
    param0.add(17);
    param0.add(12);
    param0.add(93);
    param0.add(55);
    param0.add(97);
    param0.add(75);
    param0.add(22);
    param0.add(52);
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