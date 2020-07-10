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
public class FIND_UNIT_DIGIT_X_RAISED_POWER_Y{
static int f_gold ( int x , int y ) {
  int res = 1 ;
  for ( int i = 0 ;
  i < y ;
  i ++ ) res = ( res * x ) % 10 ;
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(33);
    param0.add(95);
    param0.add(21);
    param0.add(3);
    param0.add(40);
    param0.add(64);
    param0.add(17);
    param0.add(58);
    param0.add(44);
    param0.add(27);
    List<Integer> param1 = new ArrayList<>();
    param1.add(55);
    param1.add(7);
    param1.add(63);
    param1.add(62);
    param1.add(53);
    param1.add(24);
    param1.add(23);
    param1.add(74);
    param1.add(13);
    param1.add(54);
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