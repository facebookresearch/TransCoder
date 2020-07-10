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
public class NTH_NON_FIBONACCI_NUMBER{
static int f_gold ( int n ) {
  int prevPrev = 1 , prev = 2 , curr = 3 ;
  while ( n > 0 ) {
    prevPrev = prev ;
    prev = curr ;
    curr = prevPrev + prev ;
    n = n - ( curr - prev - 1 ) ;
  }
  n = n + ( curr - prev - 1 ) ;
  return prev + n ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(76);
    param0.add(91);
    param0.add(62);
    param0.add(65);
    param0.add(83);
    param0.add(57);
    param0.add(76);
    param0.add(6);
    param0.add(2);
    param0.add(86);
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