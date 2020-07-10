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
public class FIND_MINIMUM_SUM_FACTORS_NUMBER{
static int f_gold ( int num ) {
  int sum = 0 ;
  for ( int i = 2 ;
  i * i <= num ;
  i ++ ) {
    while ( num % i == 0 ) {
      sum += i ;
      num /= i ;
    }
  }
  sum += num ;
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(83);
    param0.add(88);
    param0.add(60);
    param0.add(6);
    param0.add(26);
    param0.add(98);
    param0.add(38);
    param0.add(90);
    param0.add(76);
    param0.add(66);
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