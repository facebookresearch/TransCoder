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
public class AREA_SQUARE_CIRCUMSCRIBED_CIRCLE{
static int f_gold ( int r ) {
  return ( 2 * r * r ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(14);
    param0.add(78);
    param0.add(45);
    param0.add(66);
    param0.add(18);
    param0.add(32);
    param0.add(60);
    param0.add(16);
    param0.add(99);
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