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
public class BREAK_NUMBER_THREE_PARTS{
static long f_gold ( long n ) {
  long count = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) for ( int j = 0 ;
  j <= n ;
  j ++ ) for ( int k = 0 ;
  k <= n ;
  k ++ ) if ( i + j + k == n ) count ++ ;
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(52L);
    param0.add(47L);
    param0.add(75L);
    param0.add(36L);
    param0.add(68L);
    param0.add(16L);
    param0.add(99L);
    param0.add(38L);
    param0.add(84L);
    param0.add(45L);
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