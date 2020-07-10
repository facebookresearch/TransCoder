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
public class NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS{
static int f_gold ( int x ) {
  int rightOne , nextHigherOneBit , rightOnesPattern , next = 0 ;
  if ( x > 0 ) {
    rightOne = x & - x ;
    nextHigherOneBit = x + rightOne ;
    rightOnesPattern = x ^ nextHigherOneBit ;
    rightOnesPattern = ( rightOnesPattern ) / rightOne ;
    rightOnesPattern >>= 2 ;
    next = nextHigherOneBit | rightOnesPattern ;
  }
  return next ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(42);
    param0.add(75);
    param0.add(94);
    param0.add(5);
    param0.add(52);
    param0.add(22);
    param0.add(77);
    param0.add(44);
    param0.add(85);
    param0.add(59);
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