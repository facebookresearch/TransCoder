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
public class CALCULATE_AREA_TETRAHEDRON{
static double f_gold ( int side ) {
  double volume = ( Math . pow ( side , 3 ) / ( 6 * Math . sqrt ( 2 ) ) ) ;
  return volume ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(58);
    param0.add(56);
    param0.add(35);
    param0.add(99);
    param0.add(13);
    param0.add(45);
    param0.add(40);
    param0.add(92);
    param0.add(7);
    param0.add(13);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(Math.abs(1 - (0.0000001 + Math.abs(f_gold(param0.get(i))) )/ (Math.abs(f_filled(param0.get(i))) + 0.0000001)) < 0.001)
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}