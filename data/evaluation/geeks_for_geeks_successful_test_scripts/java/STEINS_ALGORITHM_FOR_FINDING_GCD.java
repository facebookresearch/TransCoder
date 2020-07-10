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
public class STEINS_ALGORITHM_FOR_FINDING_GCD{
static int f_gold ( int a , int b ) {
  if ( a == 0 ) return b ;
  if ( b == 0 ) return a ;
  int k ;
  for ( k = 0 ;
  ( ( a | b ) & 1 ) == 0 ;
  ++ k ) {
    a >>= 1 ;
    b >>= 1 ;
  }
  while ( ( a & 1 ) == 0 ) a >>= 1 ;
  do {
    while ( ( b & 1 ) == 0 ) b >>= 1 ;
    if ( a > b ) {
      int temp = a ;
      a = b ;
      b = temp ;
    }
    b = ( b - a ) ;
  }
  while ( b != 0 ) ;
  return a << k ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(37);
    param0.add(58);
    param0.add(89);
    param0.add(75);
    param0.add(59);
    param0.add(84);
    param0.add(47);
    param0.add(37);
    param0.add(83);
    param0.add(28);
    List<Integer> param1 = new ArrayList<>();
    param1.add(93);
    param1.add(13);
    param1.add(27);
    param1.add(14);
    param1.add(47);
    param1.add(39);
    param1.add(76);
    param1.add(75);
    param1.add(62);
    param1.add(58);
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