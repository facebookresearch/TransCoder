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
public class ADD_1_TO_A_GIVEN_NUMBER{
static int f_gold ( int x ) {
  int m = 1 ;
  while ( ( int ) ( x & m ) >= 1 ) {
    x = x ^ m ;
    m <<= 1 ;
  }
  x = x ^ m ;
  return x ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(96);
    param0.add(66);
    param0.add(67);
    param0.add(13);
    param0.add(75);
    param0.add(78);
    param0.add(1);
    param0.add(83);
    param0.add(27);
    param0.add(65);
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