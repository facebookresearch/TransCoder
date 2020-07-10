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
public class MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK{
static int f_gold ( int input , int unlock_code ) {
  int rotation = 0 ;
  int input_digit , code_digit ;
  while ( input > 0 || unlock_code > 0 ) {
    input_digit = input % 10 ;
    code_digit = unlock_code % 10 ;
    rotation += Math . min ( Math . abs ( input_digit - code_digit ) , 10 - Math . abs ( input_digit - code_digit ) ) ;
    input /= 10 ;
    unlock_code /= 10 ;
  }
  return rotation ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(71);
    param0.add(90);
    param0.add(28);
    param0.add(41);
    param0.add(32);
    param0.add(39);
    param0.add(33);
    param0.add(89);
    param0.add(50);
    param0.add(92);
    List<Integer> param1 = new ArrayList<>();
    param1.add(46);
    param1.add(65);
    param1.add(84);
    param1.add(23);
    param1.add(58);
    param1.add(82);
    param1.add(58);
    param1.add(32);
    param1.add(51);
    param1.add(77);
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