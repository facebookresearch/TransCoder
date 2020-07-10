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
public class WAYS_TO_WRITE_N_AS_SUM_OF_TWO_OR_MORE_POSITIVE_INTEGERS{
static int f_gold ( int n ) {
  int table [ ] = new int [ n + 1 ] ;
  Arrays . fill ( table , 0 ) ;
  table [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) for ( int j = i ;
  j <= n ;
  j ++ ) table [ j ] += table [ j - i ] ;
  return table [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(66);
    param0.add(90);
    param0.add(8);
    param0.add(77);
    param0.add(44);
    param0.add(20);
    param0.add(34);
    param0.add(22);
    param0.add(50);
    param0.add(10);
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