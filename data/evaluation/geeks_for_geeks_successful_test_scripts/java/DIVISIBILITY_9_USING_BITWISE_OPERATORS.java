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
public class DIVISIBILITY_9_USING_BITWISE_OPERATORS{
static boolean f_gold ( int n ) {
  if ( n == 0 || n == 9 ) return true ;
  if ( n < 9 ) return false ;
  return f_gold ( ( int ) ( n >> 3 ) - ( int ) ( n & 7 ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(96);
    param0.add(85);
    param0.add(54);
    param0.add(14);
    param0.add(47);
    param0.add(11);
    param0.add(49);
    param0.add(99);
    param0.add(28);
    param0.add(82);
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