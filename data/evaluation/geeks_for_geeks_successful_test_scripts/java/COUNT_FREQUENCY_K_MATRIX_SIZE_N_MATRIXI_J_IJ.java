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
public class COUNT_FREQUENCY_K_MATRIX_SIZE_N_MATRIXI_J_IJ{
public static int f_gold ( int n , int k ) {
  if ( n + 1 >= k ) return ( k - 1 ) ;
  else return ( 2 * n + 1 - k ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(90);
    param0.add(86);
    param0.add(92);
    param0.add(72);
    param0.add(25);
    param0.add(11);
    param0.add(94);
    param0.add(91);
    param0.add(66);
    param0.add(34);
    List<Integer> param1 = new ArrayList<>();
    param1.add(74);
    param1.add(36);
    param1.add(38);
    param1.add(71);
    param1.add(57);
    param1.add(53);
    param1.add(80);
    param1.add(75);
    param1.add(58);
    param1.add(88);
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