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
public class NUMBER_DIGITS_PRODUCT_TWO_NUMBERS_1{
public static int f_gold ( int a , int b ) {
  if ( a == 0 || b == 0 ) return 1 ;
  return ( int ) Math . floor ( Math . log10 ( Math . abs ( a ) ) + Math . log10 ( Math . abs ( b ) ) ) + 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(97);
    param0.add(52);
    param0.add(95);
    param0.add(35);
    param0.add(40);
    param0.add(18);
    param0.add(92);
    param0.add(73);
    param0.add(10);
    param0.add(82);
    List<Integer> param1 = new ArrayList<>();
    param1.add(91);
    param1.add(49);
    param1.add(34);
    param1.add(40);
    param1.add(85);
    param1.add(97);
    param1.add(15);
    param1.add(98);
    param1.add(62);
    param1.add(22);
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