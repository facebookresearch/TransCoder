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
public class HOW_TO_PRINT_MAXIMUM_NUMBER_OF_A_USING_GIVEN_FOUR_KEYS{
static int f_gold ( int N ) {
  if ( N <= 6 ) return N ;
  int [ ] screen = new int [ N ] ;
  int b ;
  int n ;
  for ( n = 1 ;
  n <= 6 ;
  n ++ ) screen [ n - 1 ] = n ;
  for ( n = 7 ;
  n <= N ;
  n ++ ) {
    screen [ n - 1 ] = Math . max ( 2 * screen [ n - 4 ] , Math . max ( 3 * screen [ n - 5 ] , 4 * screen [ n - 6 ] ) ) ;
  }
  return screen [ N - 1 ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(41);
    param0.add(94);
    param0.add(80);
    param0.add(40);
    param0.add(76);
    param0.add(5);
    param0.add(43);
    param0.add(67);
    param0.add(24);
    param0.add(90);
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