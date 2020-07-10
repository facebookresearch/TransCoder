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
public class SUM_MATRIX_ELEMENT_ELEMENT_INTEGER_DIVISION_ROW_COLUMN_1{
static int f_gold ( int n ) {
  int ans = 0 , temp = 0 , num ;
  for ( int i = 1 ;
  i <= n && temp < n ;
  i ++ ) {
    temp = i - 1 ;
    num = 1 ;
    while ( temp < n ) {
      if ( temp + i <= n ) ans += ( i * num ) ;
      else ans += ( ( n - temp ) * num ) ;
      temp += i ;
      num ++ ;
    }
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(35);
    param0.add(93);
    param0.add(7);
    param0.add(81);
    param0.add(80);
    param0.add(47);
    param0.add(7);
    param0.add(41);
    param0.add(59);
    param0.add(34);
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