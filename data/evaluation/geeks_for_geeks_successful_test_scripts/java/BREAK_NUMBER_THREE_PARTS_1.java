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
public class BREAK_NUMBER_THREE_PARTS_1{
static long f_gold ( long n ) {
  long count = 0 ;
  count = ( n + 1 ) * ( n + 2 ) / 2 ;
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(71L);
    param0.add(71L);
    param0.add(36L);
    param0.add(3L);
    param0.add(97L);
    param0.add(69L);
    param0.add(15L);
    param0.add(48L);
    param0.add(77L);
    param0.add(6L);
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