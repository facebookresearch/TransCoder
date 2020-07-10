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
public class MODULAR_EXPONENTIATION_POWER_IN_MODULAR_ARITHMETIC{
static int f_gold ( int x , int y , int p ) {
  int res = 1 ;
  x = x % p ;
  while ( y > 0 ) {
    if ( ( y & 1 ) == 1 ) res = ( res * x ) % p ;
    y = y >> 1 ;
    x = ( x * x ) % p ;
  }
  return res ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(45);
    param0.add(67);
    param0.add(26);
    param0.add(33);
    param0.add(35);
    param0.add(68);
    param0.add(14);
    param0.add(5);
    param0.add(23);
    param0.add(37);
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(25);
    param1.add(91);
    param1.add(61);
    param1.add(8);
    param1.add(41);
    param1.add(76);
    param1.add(89);
    param1.add(42);
    param1.add(63);
    List<Integer> param2 = new ArrayList<>();
    param2.add(68);
    param2.add(49);
    param2.add(44);
    param2.add(9);
    param2.add(13);
    param2.add(5);
    param2.add(20);
    param2.add(13);
    param2.add(45);
    param2.add(56);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}