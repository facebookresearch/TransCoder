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
public class CHECK_INTEGER_OVERFLOW_MULTIPLICATION{
static Boolean f_gold ( long a , long b ) {
  if ( a == 0 || b == 0 ) return false ;
  long result = a * b ;
  if ( a == result / b ) return false ;
  else return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(37L);
    param0.add(Long.parseLong("10000000000"));
    param0.add(Long.parseLong("10000000000"));
    param0.add(Long.parseLong("999999999"));
    param0.add(39L);
    param0.add(92L);
    param0.add(14L);
    param0.add(19L);
    param0.add(14L);
    param0.add(88L);
    List<Long> param1 = new ArrayList<>();
    param1.add(80L);
    param1.add(Long.parseLong("-10000000000"));
    param1.add(Long.parseLong("10000000000"));
    param1.add(Long.parseLong("999999999"));
    param1.add(36L);
    param1.add(56L);
    param1.add(21L);
    param1.add(38L);
    param1.add(82L);
    param1.add(41L);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)).equals(f_gold(param0.get(i),param1.get(i))))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}