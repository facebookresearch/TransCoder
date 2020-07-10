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
public class CASSINIS_IDENTITY{
static int f_gold ( int n ) {
  return ( n & 1 ) != 0 ? - 1 : 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(67);
    param0.add(2);
    param0.add(58);
    param0.add(6);
    param0.add(42);
    param0.add(17);
    param0.add(37);
    param0.add(44);
    param0.add(23);
    param0.add(40);
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