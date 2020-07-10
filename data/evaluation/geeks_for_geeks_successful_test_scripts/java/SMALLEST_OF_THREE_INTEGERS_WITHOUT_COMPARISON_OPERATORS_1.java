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
public class SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1{
static int f_gold ( int x , int y , int z ) {
  if ( ( y / x ) != 1 ) return ( ( y / z ) != 1 ) ? y : z ;
  return ( ( x / z ) != 1 ) ? x : z ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(48);
    param0.add(11);
    param0.add(50);
    param0.add(21);
    param0.add(94);
    param0.add(22);
    param0.add(3);
    param0.add(67);
    param0.add(59);
    param0.add(50);
    List<Integer> param1 = new ArrayList<>();
    param1.add(63);
    param1.add(55);
    param1.add(89);
    param1.add(71);
    param1.add(39);
    param1.add(44);
    param1.add(41);
    param1.add(62);
    param1.add(2);
    param1.add(11);
    List<Integer> param2 = new ArrayList<>();
    param2.add(56);
    param2.add(84);
    param2.add(96);
    param2.add(74);
    param2.add(42);
    param2.add(86);
    param2.add(68);
    param2.add(94);
    param2.add(83);
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