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
public class CHECK_WHETHER_TRIANGLE_VALID_NOT_SIDES_GIVEN{
public static int f_gold ( int a , int b , int c ) {
  if ( a + b <= c || a + c <= b || b + c <= a ) return 0 ;
  else return 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(29);
    param0.add(83);
    param0.add(48);
    param0.add(59);
    param0.add(56);
    param0.add(68);
    param0.add(63);
    param0.add(95);
    param0.add(2);
    param0.add(11);
    List<Integer> param1 = new ArrayList<>();
    param1.add(19);
    param1.add(34);
    param1.add(14);
    param1.add(12);
    param1.add(39);
    param1.add(85);
    param1.add(36);
    param1.add(34);
    param1.add(90);
    param1.add(16);
    List<Integer> param2 = new ArrayList<>();
    param2.add(52);
    param2.add(49);
    param2.add(65);
    param2.add(94);
    param2.add(22);
    param2.add(9);
    param2.add(41);
    param2.add(37);
    param2.add(27);
    param2.add(1);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}