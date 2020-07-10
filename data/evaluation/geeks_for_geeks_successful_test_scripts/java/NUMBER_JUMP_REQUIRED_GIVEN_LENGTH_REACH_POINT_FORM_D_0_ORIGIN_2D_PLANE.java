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
public class NUMBER_JUMP_REQUIRED_GIVEN_LENGTH_REACH_POINT_FORM_D_0_ORIGIN_2D_PLANE{
static int f_gold ( int a , int b , int d ) {
  int temp = a ;
  a = Math . min ( a , b ) ;
  b = Math . max ( temp , b ) ;
  if ( d >= b ) return ( d + b - 1 ) / b ;
  if ( d == 0 ) return 0 ;
  if ( d == a ) return 1 ;
  return 2 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(35);
    param0.add(85);
    param0.add(22);
    param0.add(8);
    param0.add(12);
    param0.add(58);
    param0.add(65);
    param0.add(10);
    param0.add(23);
    param0.add(5);
    List<Integer> param1 = new ArrayList<>();
    param1.add(8);
    param1.add(55);
    param1.add(23);
    param1.add(43);
    param1.add(64);
    param1.add(25);
    param1.add(4);
    param1.add(95);
    param1.add(13);
    param1.add(50);
    List<Integer> param2 = new ArrayList<>();
    param2.add(77);
    param2.add(33);
    param2.add(64);
    param2.add(29);
    param2.add(11);
    param2.add(26);
    param2.add(28);
    param2.add(55);
    param2.add(54);
    param2.add(71);
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