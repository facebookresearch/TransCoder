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
public class C_PROGRAM_FACTORIAL_NUMBER{
static int f_gold ( int n ) {
  if ( n == 0 ) return 1 ;
  return n * f_gold ( n - 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(84);
    param0.add(41);
    param0.add(5);
    param0.add(38);
    param0.add(79);
    param0.add(80);
    param0.add(64);
    param0.add(62);
    param0.add(24);
    param0.add(12);
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