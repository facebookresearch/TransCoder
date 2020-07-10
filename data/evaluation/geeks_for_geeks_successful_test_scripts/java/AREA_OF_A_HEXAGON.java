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
public class AREA_OF_A_HEXAGON{
public static double f_gold ( double s ) {
  return ( ( 3 * Math . sqrt ( 3 ) * ( s * s ) ) / 2 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(1772.6589509256596);
    param0.add(-599.737107809315);
    param0.add(1074.1765931782);
    param0.add(-1182.4087746714795);
    param0.add(8083.035797247716);
    param0.add(-6126.414356565494);
    param0.add(5370.057504189614);
    param0.add(-6947.020794285176);
    param0.add(2110.5107873533325);
    param0.add(-6458.751326919488);
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