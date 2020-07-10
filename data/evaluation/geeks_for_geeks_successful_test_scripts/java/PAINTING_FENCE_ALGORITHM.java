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
public class PAINTING_FENCE_ALGORITHM{
static long f_gold ( int n , int k ) {
  long total = k ;
  int mod = 1000000007 ;
  int same = 0 , diff = k ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    same = diff ;
    diff = ( int ) total * ( k - 1 ) ;
    diff = diff % mod ;
    total = ( same + diff ) % mod ;
  }
  return total ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(6);
    param0.add(23);
    param0.add(89);
    param0.add(63);
    param0.add(23);
    param0.add(44);
    param0.add(81);
    param0.add(43);
    param0.add(9);
    param0.add(41);
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(87);
    param1.add(31);
    param1.add(36);
    param1.add(68);
    param1.add(66);
    param1.add(18);
    param1.add(73);
    param1.add(42);
    param1.add(98);
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