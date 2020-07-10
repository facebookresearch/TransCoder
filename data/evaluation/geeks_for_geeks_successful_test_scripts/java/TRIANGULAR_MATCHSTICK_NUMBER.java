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
public class TRIANGULAR_MATCHSTICK_NUMBER{
public static int f_gold ( int x ) {
  return ( 3 * x * ( x + 1 ) ) / 2 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(6);
    param0.add(25);
    param0.add(15);
    param0.add(30);
    param0.add(17);
    param0.add(80);
    param0.add(27);
    param0.add(13);
    param0.add(12);
    param0.add(67);
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