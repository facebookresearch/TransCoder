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
public class EULERS_CRITERION_CHECK_IF_SQUARE_ROOT_UNDER_MODULO_P_EXISTS{
static boolean f_gold ( int n , int p ) {
  n = n % p ;
  for ( int x = 2 ;
  x < p ;
  x ++ ) if ( ( x * x ) % p == n ) return true ;
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(71);
    param0.add(85);
    param0.add(4);
    param0.add(20);
    param0.add(71);
    param0.add(72);
    param0.add(36);
    param0.add(95);
    param0.add(83);
    param0.add(72);
    List<Integer> param1 = new ArrayList<>();
    param1.add(78);
    param1.add(75);
    param1.add(35);
    param1.add(99);
    param1.add(29);
    param1.add(88);
    param1.add(54);
    param1.add(52);
    param1.add(33);
    param1.add(13);
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