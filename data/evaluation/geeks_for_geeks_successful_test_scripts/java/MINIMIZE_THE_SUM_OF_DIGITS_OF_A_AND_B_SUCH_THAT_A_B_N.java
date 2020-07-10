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
public class MINIMIZE_THE_SUM_OF_DIGITS_OF_A_AND_B_SUCH_THAT_A_B_N{
static int f_gold ( int n ) {
  int sum = 0 ;
  while ( n > 0 ) {
    sum += ( n % 10 ) ;
    n /= 10 ;
  }
  if ( sum == 1 ) return 10 ;
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(2);
    param0.add(39);
    param0.add(31);
    param0.add(45);
    param0.add(35);
    param0.add(94);
    param0.add(67);
    param0.add(50);
    param0.add(4);
    param0.add(63);
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