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
public class FIND_VALUE_OF_Y_MOD_2_RAISED_TO_POWER_X{
static long f_gold ( long y , long x ) {
  if ( ( Math . log ( y ) / Math . log ( 2 ) ) < x ) return y ;
  if ( x > 63 ) return y ;
  return ( y % ( 1 << ( int ) x ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(57L);
    param0.add(80L);
    param0.add(84L);
    param0.add(35L);
    param0.add(3L);
    param0.add(42L);
    param0.add(7L);
    param0.add(99L);
    param0.add(13L);
    param0.add(44L);
    List<Long> param1 = new ArrayList<>();
    param1.add(76L);
    param1.add(46L);
    param1.add(96L);
    param1.add(16L);
    param1.add(84L);
    param1.add(79L);
    param1.add(2L);
    param1.add(83L);
    param1.add(61L);
    param1.add(8L);
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