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
public class PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_2{
static int f_gold ( int num , int divisor ) {
  while ( num >= divisor ) num -= divisor ;
  return num ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(70);
    param0.add(77);
    param0.add(77);
    param0.add(88);
    param0.add(96);
    param0.add(6);
    param0.add(79);
    param0.add(44);
    param0.add(26);
    param0.add(82);
    List<Integer> param1 = new ArrayList<>();
    param1.add(13);
    param1.add(3);
    param1.add(73);
    param1.add(54);
    param1.add(39);
    param1.add(10);
    param1.add(95);
    param1.add(32);
    param1.add(86);
    param1.add(91);
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