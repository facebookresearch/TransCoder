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
public class COMPUTE_N_UNDER_MODULO_P{
static int f_gold ( int n , int p ) {
  if ( n >= p ) return 0 ;
  int result = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) result = ( result * i ) % p ;
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(85);
    param0.add(14);
    param0.add(83);
    param0.add(30);
    param0.add(96);
    param0.add(55);
    param0.add(82);
    param0.add(12);
    param0.add(38);
    param0.add(46);
    List<Integer> param1 = new ArrayList<>();
    param1.add(18);
    param1.add(13);
    param1.add(21);
    param1.add(35);
    param1.add(51);
    param1.add(58);
    param1.add(71);
    param1.add(74);
    param1.add(3);
    param1.add(73);
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