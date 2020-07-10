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
public class CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD{
static boolean f_gold ( int n , int k ) {
  boolean oneSeen = false ;
  while ( n > 0 ) {
    int digit = n % k ;
    if ( digit > 1 ) return false ;
    if ( digit == 1 ) {
      if ( oneSeen ) return false ;
      oneSeen = true ;
    }
    n /= k ;
  }
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(64);
    param0.add(16);
    param0.add(27);
    param0.add(81);
    param0.add(1);
    param0.add(69);
    param0.add(8);
    param0.add(31);
    param0.add(43);
    param0.add(54);
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(2);
    param1.add(3);
    param1.add(72);
    param1.add(9);
    param1.add(17);
    param1.add(20);
    param1.add(79);
    param1.add(81);
    param1.add(89);
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