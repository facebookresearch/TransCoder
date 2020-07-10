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
public class DETECT_IF_TWO_INTEGERS_HAVE_OPPOSITE_SIGNS{
static boolean f_gold ( int x , int y ) {
  return ( ( x ^ y ) < 0 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(59);
    param0.add(-20);
    param0.add(-100);
    param0.add(54);
    param0.add(-16);
    param0.add(-23);
    param0.add(93);
    param0.add(24);
    param0.add(-8);
    param0.add(29);
    List<Integer> param1 = new ArrayList<>();
    param1.add(-99);
    param1.add(-21);
    param1.add(79);
    param1.add(-49);
    param1.add(16);
    param1.add(-68);
    param1.add(37);
    param1.add(-61);
    param1.add(69);
    param1.add(10);
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