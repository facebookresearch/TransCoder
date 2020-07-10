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
public class SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_2{
static int f_gold ( int n ) {
  n -- ;
  int sum = 0 ;
  sum += ( n * ( n + 1 ) ) / 2 ;
  sum += ( n * ( n + 1 ) * ( 2 * n + 1 ) ) / 6 ;
  return sum ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(12);
    param0.add(89);
    param0.add(76);
    param0.add(2);
    param0.add(81);
    param0.add(11);
    param0.add(26);
    param0.add(35);
    param0.add(16);
    param0.add(66);
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