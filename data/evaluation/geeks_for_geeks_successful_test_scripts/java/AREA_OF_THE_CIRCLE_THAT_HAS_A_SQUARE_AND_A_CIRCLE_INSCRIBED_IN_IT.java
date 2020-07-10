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
public class AREA_OF_THE_CIRCLE_THAT_HAS_A_SQUARE_AND_A_CIRCLE_INSCRIBED_IN_IT{
static float f_gold ( int a ) {
  float area = ( float ) ( Math . PI * a * a ) / 4 ;
  return area ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(77);
    param0.add(18);
    param0.add(83);
    param0.add(39);
    param0.add(68);
    param0.add(28);
    param0.add(71);
    param0.add(14);
    param0.add(21);
    param0.add(73);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001F)
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}