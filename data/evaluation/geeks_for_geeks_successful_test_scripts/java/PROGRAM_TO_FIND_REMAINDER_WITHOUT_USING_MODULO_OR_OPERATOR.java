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
public class PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR{
static int f_gold ( int num , int divisor ) {
  return ( num - divisor * ( num / divisor ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(80);
    param0.add(63);
    param0.add(1);
    param0.add(22);
    param0.add(66);
    param0.add(61);
    param0.add(45);
    param0.add(29);
    param0.add(95);
    param0.add(9);
    List<Integer> param1 = new ArrayList<>();
    param1.add(54);
    param1.add(21);
    param1.add(56);
    param1.add(39);
    param1.add(7);
    param1.add(67);
    param1.add(63);
    param1.add(44);
    param1.add(65);
    param1.add(68);
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