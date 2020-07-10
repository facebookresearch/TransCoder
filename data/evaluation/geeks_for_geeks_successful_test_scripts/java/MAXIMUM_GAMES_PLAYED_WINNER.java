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
public class MAXIMUM_GAMES_PLAYED_WINNER{
static int f_gold ( int N ) {
  int [ ] dp = new int [ N ] ;
  dp [ 0 ] = 1 ;
  dp [ 1 ] = 2 ;
  int i = 2 ;
  do {
    dp [ i ] = dp [ i - 1 ] + dp [ i - 2 ] ;
  }
  while ( dp [ i ++ ] <= N ) ;
  return ( i - 2 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(73);
    param0.add(28);
    param0.add(33);
    param0.add(23);
    param0.add(84);
    param0.add(31);
    param0.add(48);
    param0.add(46);
    param0.add(45);
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