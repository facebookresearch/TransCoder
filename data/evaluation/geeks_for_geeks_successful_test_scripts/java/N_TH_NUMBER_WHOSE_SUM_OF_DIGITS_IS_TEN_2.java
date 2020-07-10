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
public class N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_2{
public static int f_gold ( int n ) {
  int nthElement = 19 + ( n - 1 ) * 9 ;
  int outliersCount = ( int ) Math . log10 ( nthElement ) - 1 ;
  nthElement += 9 * outliersCount ;
  return nthElement ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(68);
    param0.add(70);
    param0.add(69);
    param0.add(93);
    param0.add(99);
    param0.add(44);
    param0.add(91);
    param0.add(8);
    param0.add(83);
    param0.add(51);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}