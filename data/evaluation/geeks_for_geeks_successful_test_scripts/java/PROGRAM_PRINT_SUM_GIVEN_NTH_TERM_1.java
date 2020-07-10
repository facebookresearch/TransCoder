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
public class PROGRAM_PRINT_SUM_GIVEN_NTH_TERM_1{
static int f_gold ( long n ) {
  return ( int ) Math . pow ( n , 2 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(42L);
    param0.add(40L);
    param0.add(67L);
    param0.add(73L);
    param0.add(18L);
    param0.add(16L);
    param0.add(74L);
    param0.add(33L);
    param0.add(92L);
    param0.add(22L);
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