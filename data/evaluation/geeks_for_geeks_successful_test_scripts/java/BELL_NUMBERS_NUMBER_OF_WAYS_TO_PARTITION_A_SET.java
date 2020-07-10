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
public class BELL_NUMBERS_NUMBER_OF_WAYS_TO_PARTITION_A_SET{
static int f_gold ( int n ) {
  int [ ] [ ] bell = new int [ n + 1 ] [ n + 1 ] ;
  bell [ 0 ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    bell [ i ] [ 0 ] = bell [ i - 1 ] [ i - 1 ] ;
    for ( int j = 1 ;
    j <= i ;
    j ++ ) bell [ i ] [ j ] = bell [ i - 1 ] [ j - 1 ] + bell [ i ] [ j - 1 ] ;
  }
  return bell [ n ] [ 0 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(84);
    param0.add(78);
    param0.add(9);
    param0.add(73);
    param0.add(4);
    param0.add(53);
    param0.add(85);
    param0.add(38);
    param0.add(39);
    param0.add(6);
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