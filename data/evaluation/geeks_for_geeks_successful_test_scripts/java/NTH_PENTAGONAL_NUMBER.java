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
public class NTH_PENTAGONAL_NUMBER{
static int f_gold ( int n ) {
  return ( 3 * n * n - n ) / 2 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(96);
    param0.add(93);
    param0.add(15);
    param0.add(8);
    param0.add(21);
    param0.add(14);
    param0.add(11);
    param0.add(79);
    param0.add(24);
    param0.add(94);
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