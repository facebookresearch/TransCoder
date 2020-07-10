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
public class FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS{
static int f_gold ( int n ) {
  int C [ ] [ ] = new int [ n + 1 ] [ n + 1 ] ;
  int i , j ;
  for ( i = 0 ;
  i <= n ;
  i ++ ) {
    for ( j = 0 ;
    j <= Math . min ( i , n ) ;
    j ++ ) {
      if ( j == 0 || j == i ) C [ i ] [ j ] = 1 ;
      else C [ i ] [ j ] = C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ] ;
    }
  }
  int sum = 0 ;
  for ( i = 0 ;
  i <= n ;
  i += 2 ) sum += C [ n ] [ i ] ;
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(18);
    param0.add(54);
    param0.add(67);
    param0.add(17);
    param0.add(47);
    param0.add(99);
    param0.add(26);
    param0.add(93);
    param0.add(57);
    param0.add(98);
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