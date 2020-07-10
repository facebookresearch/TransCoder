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
public class NUMBER_N_DIGIT_STEPPING_NUMBERS{
static long f_gold ( int n ) {
  int dp [ ] [ ] = new int [ n + 1 ] [ 10 ] ;
  if ( n == 1 ) return 10 ;
  for ( int j = 0 ;
  j <= 9 ;
  j ++ ) dp [ 1 ] [ j ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= 9 ;
    j ++ ) {
      if ( j == 0 ) dp [ i ] [ j ] = dp [ i - 1 ] [ j + 1 ] ;
      else if ( j == 9 ) dp [ i ] [ j ] = dp [ i - 1 ] [ j - 1 ] ;
      else dp [ i ] [ j ] = dp [ i - 1 ] [ j - 1 ] + dp [ i - 1 ] [ j + 1 ] ;
    }
  }
  long sum = 0 ;
  for ( int j = 1 ;
  j <= 9 ;
  j ++ ) sum += dp [ n ] [ j ] ;
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(18);
    param0.add(66);
    param0.add(73);
    param0.add(70);
    param0.add(26);
    param0.add(41);
    param0.add(20);
    param0.add(25);
    param0.add(52);
    param0.add(13);
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