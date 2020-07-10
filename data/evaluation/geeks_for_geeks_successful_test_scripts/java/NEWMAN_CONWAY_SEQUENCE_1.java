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
public class NEWMAN_CONWAY_SEQUENCE_1{
static int f_gold ( int n ) {
  int f [ ] = new int [ n + 1 ] ;
  f [ 0 ] = 0 ;
  f [ 1 ] = 1 ;
  f [ 2 ] = 1 ;
  int i ;
  for ( i = 3 ;
  i <= n ;
  i ++ ) f [ i ] = f [ f [ i - 1 ] ] + f [ i - f [ i - 1 ] ] ;
  return f [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(39);
    param0.add(93);
    param0.add(3);
    param0.add(28);
    param0.add(23);
    param0.add(95);
    param0.add(41);
    param0.add(31);
    param0.add(46);
    param0.add(29);
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