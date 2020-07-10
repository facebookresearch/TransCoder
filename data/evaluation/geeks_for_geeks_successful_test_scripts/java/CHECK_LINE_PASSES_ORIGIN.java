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
public class CHECK_LINE_PASSES_ORIGIN{
static boolean f_gold ( int x1 , int y1 , int x2 , int y2 ) {
  return ( x1 * ( y2 - y1 ) == y1 * ( x2 - x1 ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(10);
    param0.add(0);
    param0.add(1);
    param0.add(82);
    param0.add(78);
    param0.add(13);
    param0.add(18);
    param0.add(42);
    param0.add(29);
    List<Integer> param1 = new ArrayList<>();
    param1.add(28);
    param1.add(0);
    param1.add(1);
    param1.add(1);
    param1.add(86);
    param1.add(86);
    param1.add(46);
    param1.add(29);
    param1.add(35);
    param1.add(17);
    List<Integer> param2 = new ArrayList<>();
    param2.add(2);
    param2.add(20);
    param2.add(0);
    param2.add(10);
    param2.add(19);
    param2.add(11);
    param2.add(33);
    param2.add(95);
    param2.add(25);
    param2.add(45);
    List<Integer> param3 = new ArrayList<>();
    param3.add(56);
    param3.add(0);
    param3.add(17);
    param3.add(10);
    param3.add(4);
    param3.add(6);
    param3.add(33);
    param3.add(12);
    param3.add(36);
    param3.add(35);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}