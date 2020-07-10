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
public class COUNT_SET_BITS_IN_AN_INTEGER_1{
public static int f_gold ( int n ) {
  if ( n == 0 ) return 0 ;
  else return ( n & 1 ) + f_gold ( n >> 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(43);
    param0.add(94);
    param0.add(72);
    param0.add(86);
    param0.add(42);
    param0.add(33);
    param0.add(8);
    param0.add(74);
    param0.add(29);
    param0.add(34);
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