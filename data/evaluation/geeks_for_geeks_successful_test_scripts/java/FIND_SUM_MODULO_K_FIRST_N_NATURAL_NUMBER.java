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
public class FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER{
static int f_gold ( int N , int K ) {
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) ans += ( i % K ) ;
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(11);
    param0.add(36);
    param0.add(71);
    param0.add(74);
    param0.add(66);
    param0.add(38);
    param0.add(2);
    param0.add(73);
    param0.add(79);
    param0.add(30);
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(69);
    param1.add(28);
    param1.add(1);
    param1.add(84);
    param1.add(14);
    param1.add(11);
    param1.add(87);
    param1.add(11);
    param1.add(55);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}