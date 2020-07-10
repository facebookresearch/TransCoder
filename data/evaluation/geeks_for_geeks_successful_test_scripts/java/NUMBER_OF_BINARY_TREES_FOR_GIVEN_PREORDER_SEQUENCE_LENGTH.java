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
public class NUMBER_OF_BINARY_TREES_FOR_GIVEN_PREORDER_SEQUENCE_LENGTH{
static int f_gold ( int n ) {
  int BT [ ] = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) BT [ i ] = 0 ;
  BT [ 0 ] = BT [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  ++ i ) for ( int j = 0 ;
  j < i ;
  j ++ ) BT [ i ] += BT [ j ] * BT [ i - j - 1 ] ;
  return BT [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(87);
    param0.add(69);
    param0.add(15);
    param0.add(11);
    param0.add(11);
    param0.add(15);
    param0.add(47);
    param0.add(65);
    param0.add(50);
    param0.add(58);
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