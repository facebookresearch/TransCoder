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
public class FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B{
static int f_gold ( long A , long B ) {
  int variable = 1 ;
  if ( A == B ) return 1 ;
  else if ( ( B - A ) >= 5 ) return 0 ;
  else {
    for ( long i = A + 1 ;
    i <= B ;
    i ++ ) variable = ( int ) ( variable * ( i % 10 ) ) % 10 ;
    return variable % 10 ;
  }
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(79L);
    param0.add(61L);
    param0.add(39L);
    param0.add(39L);
    param0.add(61L);
    param0.add(86L);
    param0.add(7L);
    param0.add(86L);
    param0.add(86L);
    param0.add(11L);
    List<Long> param1 = new ArrayList<>();
    param1.add(84L);
    param1.add(29L);
    param1.add(77L);
    param1.add(65L);
    param1.add(78L);
    param1.add(73L);
    param1.add(92L);
    param1.add(50L);
    param1.add(63L);
    param1.add(2L);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}