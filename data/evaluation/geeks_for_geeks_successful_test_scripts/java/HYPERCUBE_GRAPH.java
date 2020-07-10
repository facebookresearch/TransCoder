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
public class HYPERCUBE_GRAPH{
static int f_gold ( int n ) {
  if ( n == 1 ) return 2 ;
  return 2 * f_gold ( n - 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(72);
    param0.add(28);
    param0.add(45);
    param0.add(41);
    param0.add(94);
    param0.add(97);
    param0.add(97);
    param0.add(36);
    param0.add(91);
    param0.add(84);
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