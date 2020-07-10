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
public class MULTIPLY_TWO_NUMBERS_WITHOUT_USING_MULTIPLY_DIVISION_BITWISE_OPERATORS_AND_NO_LOOPS{
static int f_gold ( int x , int y ) {
  if ( y == 0 ) return 0 ;
  if ( y > 0 ) return ( x + f_gold ( x , y - 1 ) ) ;
  if ( y < 0 ) return - f_gold ( x , - y ) ;
  return - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(18);
    param0.add(23);
    param0.add(24);
    param0.add(75);
    param0.add(25);
    param0.add(57);
    param0.add(31);
    param0.add(8);
    param0.add(12);
    param0.add(74);
    List<Integer> param1 = new ArrayList<>();
    param1.add(94);
    param1.add(36);
    param1.add(22);
    param1.add(92);
    param1.add(43);
    param1.add(32);
    param1.add(57);
    param1.add(17);
    param1.add(76);
    param1.add(70);
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