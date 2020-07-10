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
public class COUNT_SET_BITS_IN_AN_INTEGER_3{
public static int f_gold ( int n ) {
  if ( n == 0 ) return 0 ;
  else return 1 + f_gold ( n & ( n - 1 ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(6);
    param0.add(58);
    param0.add(90);
    param0.add(69);
    param0.add(15);
    param0.add(54);
    param0.add(60);
    param0.add(51);
    param0.add(46);
    param0.add(91);
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