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
public class TAIL_RECURSION{
static int f_gold ( int n ) {
  if ( n == 0 ) return 1 ;
  return n * f_gold ( n - 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(77);
    param0.add(62);
    param0.add(42);
    param0.add(16);
    param0.add(82);
    param0.add(37);
    param0.add(29);
    param0.add(32);
    param0.add(82);
    param0.add(91);
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