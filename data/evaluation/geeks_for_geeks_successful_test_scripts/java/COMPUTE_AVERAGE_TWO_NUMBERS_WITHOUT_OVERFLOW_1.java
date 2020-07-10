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
public class COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW_1{
static int f_gold ( int a , int b ) {
  return ( a / 2 ) + ( b / 2 ) + ( ( a % 2 + b % 2 ) / 2 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(9);
    param0.add(68);
    param0.add(51);
    param0.add(31);
    param0.add(14);
    param0.add(73);
    param0.add(51);
    param0.add(75);
    param0.add(98);
    param0.add(83);
    List<Integer> param1 = new ArrayList<>();
    param1.add(81);
    param1.add(79);
    param1.add(2);
    param1.add(49);
    param1.add(10);
    param1.add(9);
    param1.add(13);
    param1.add(67);
    param1.add(51);
    param1.add(74);
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