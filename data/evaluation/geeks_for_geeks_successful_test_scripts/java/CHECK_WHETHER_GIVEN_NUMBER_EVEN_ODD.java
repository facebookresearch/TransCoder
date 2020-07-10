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
public class CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD{
public static boolean f_gold ( int n ) {
  return ( n % 2 == 0 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(67);
    param0.add(90);
    param0.add(55);
    param0.add(90);
    param0.add(83);
    param0.add(32);
    param0.add(58);
    param0.add(38);
    param0.add(87);
    param0.add(87);
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