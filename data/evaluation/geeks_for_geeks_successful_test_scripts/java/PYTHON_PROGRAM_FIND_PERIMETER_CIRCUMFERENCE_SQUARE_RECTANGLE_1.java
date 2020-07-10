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
public class PYTHON_PROGRAM_FIND_PERIMETER_CIRCUMFERENCE_SQUARE_RECTANGLE_1{
static int f_gold ( int l , int w ) {
  return ( 2 * ( l + w ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(37);
    param0.add(56);
    param0.add(22);
    param0.add(77);
    param0.add(34);
    param0.add(74);
    param0.add(37);
    param0.add(21);
    param0.add(75);
    List<Integer> param1 = new ArrayList<>();
    param1.add(39);
    param1.add(49);
    param1.add(52);
    param1.add(43);
    param1.add(12);
    param1.add(31);
    param1.add(54);
    param1.add(52);
    param1.add(37);
    param1.add(30);
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