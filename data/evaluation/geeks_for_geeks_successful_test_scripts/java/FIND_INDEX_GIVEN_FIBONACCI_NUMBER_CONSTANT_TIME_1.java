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
public class FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME_1{
static int f_gold ( int n ) {
  float fibo = 2.078087F * ( float ) Math . log ( n ) + 1.672276F ;
  return Math . round ( fibo ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(20);
    param0.add(95);
    param0.add(39);
    param0.add(21);
    param0.add(94);
    param0.add(79);
    param0.add(56);
    param0.add(62);
    param0.add(23);
    param0.add(3);
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