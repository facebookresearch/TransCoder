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
public class PROGRAM_FIND_CIRCUMFERENCE_CIRCLE{
static double f_gold ( double r ) {
  double PI = 3.1415 ;
  double cir = 2 * PI * r ;
  return cir ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(8650.932760642281);
    param0.add(-9475.213251789266);
    param0.add(3895.3903681587985);
    param0.add(-2977.0280936855806);
    param0.add(8513.1890392562);
    param0.add(-239.5023899621529);
    param0.add(3460.951135898811);
    param0.add(-8717.439885353786);
    param0.add(6512.42862487631);
    param0.add(-2607.390557447935);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001)
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}