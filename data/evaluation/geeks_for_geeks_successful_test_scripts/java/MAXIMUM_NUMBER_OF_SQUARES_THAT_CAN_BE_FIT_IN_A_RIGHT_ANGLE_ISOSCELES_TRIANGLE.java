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
public class MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE{
static int f_gold ( int b , int m ) {
  return ( b / m - 1 ) * ( b / m ) / 2 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(40);
    param0.add(38);
    param0.add(47);
    param0.add(52);
    param0.add(21);
    param0.add(50);
    param0.add(8);
    param0.add(56);
    param0.add(93);
    param0.add(21);
    List<Integer> param1 = new ArrayList<>();
    param1.add(74);
    param1.add(35);
    param1.add(71);
    param1.add(29);
    param1.add(9);
    param1.add(33);
    param1.add(82);
    param1.add(80);
    param1.add(5);
    param1.add(90);
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