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
public class FIND_PERIMETER_CYLINDER{
static int f_gold ( int diameter , int height ) {
  return 2 * ( diameter + height ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(70);
    param0.add(97);
    param0.add(49);
    param0.add(56);
    param0.add(87);
    param0.add(64);
    param0.add(75);
    param0.add(90);
    param0.add(55);
    param0.add(73);
    List<Integer> param1 = new ArrayList<>();
    param1.add(78);
    param1.add(46);
    param1.add(26);
    param1.add(61);
    param1.add(79);
    param1.add(21);
    param1.add(93);
    param1.add(16);
    param1.add(16);
    param1.add(29);
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