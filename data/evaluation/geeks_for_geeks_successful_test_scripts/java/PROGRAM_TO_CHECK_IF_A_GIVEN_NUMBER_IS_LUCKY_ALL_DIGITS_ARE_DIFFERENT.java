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
public class PROGRAM_TO_CHECK_IF_A_GIVEN_NUMBER_IS_LUCKY_ALL_DIGITS_ARE_DIFFERENT{
static boolean f_gold ( int n ) {
  boolean arr [ ] = new boolean [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) arr [ i ] = false ;
  while ( n > 0 ) {
    int digit = n % 10 ;
    if ( arr [ digit ] ) return false ;
    arr [ digit ] = true ;
    n = n / 10 ;
  }
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(474);
    param0.add(9445);
    param0.add(90);
    param0.add(30);
    param0.add(37453);
    param0.add(27);
    param0.add(2400);
    param0.add(98);
    param0.add(46);
    param0.add(722);
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
