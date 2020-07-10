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
public class FIND_UNIT_DIGIT_X_RAISED_POWER_Y_1{
static int f_gold ( int x , int y ) {
  x = x % 10 ;
  if ( y != 0 ) y = y % 4 + 4 ;
  return ( ( ( int ) ( Math . pow ( x , y ) ) ) % 10 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(37);
    param0.add(70);
    param0.add(26);
    param0.add(9);
    param0.add(82);
    param0.add(95);
    param0.add(43);
    param0.add(7);
    param0.add(19);
    param0.add(49);
    List<Integer> param1 = new ArrayList<>();
    param1.add(17);
    param1.add(52);
    param1.add(23);
    param1.add(96);
    param1.add(71);
    param1.add(36);
    param1.add(40);
    param1.add(27);
    param1.add(56);
    param1.add(28);
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