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
public class MULTIPLY_AN_INTEGER_WITH_3_5{
static int f_gold ( int x ) {
  return ( x << 1 ) + x + ( x >> 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(16);
    param0.add(82);
    param0.add(33);
    param0.add(88);
    param0.add(51);
    param0.add(81);
    param0.add(38);
    param0.add(79);
    param0.add(89);
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