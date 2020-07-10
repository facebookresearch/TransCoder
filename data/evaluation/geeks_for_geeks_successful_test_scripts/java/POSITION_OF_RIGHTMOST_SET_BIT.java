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
public class POSITION_OF_RIGHTMOST_SET_BIT{
public static int f_gold ( int n ) {
  return ( int ) ( ( Math . log10 ( n & - n ) ) / Math . log10 ( 2 ) ) + 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(45);
    param0.add(26);
    param0.add(74);
    param0.add(80);
    param0.add(46);
    param0.add(67);
    param0.add(16);
    param0.add(87);
    param0.add(27);
    param0.add(17);
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