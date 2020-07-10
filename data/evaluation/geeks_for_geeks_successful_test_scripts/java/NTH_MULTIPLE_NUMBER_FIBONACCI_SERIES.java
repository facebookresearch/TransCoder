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
public class NTH_MULTIPLE_NUMBER_FIBONACCI_SERIES{
public static int f_gold ( int k , int n ) {
  long f1 = 0 , f2 = 1 , f3 ;
  int i = 2 ;
  while ( i != 0 ) {
    f3 = f1 + f2 ;
    f1 = f2 ;
    f2 = f3 ;
    if ( f2 % k == 0 ) {
      return n * i ;
    }
    i ++ ;
  }
  return 0 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(50);
    param0.add(52);
    param0.add(42);
    param0.add(2);
    param0.add(37);
    param0.add(48);
    param0.add(31);
    param0.add(9);
    param0.add(78);
    param0.add(64);
    List<Integer> param1 = new ArrayList<>();
    param1.add(60);
    param1.add(45);
    param1.add(17);
    param1.add(68);
    param1.add(43);
    param1.add(46);
    param1.add(4);
    param1.add(64);
    param1.add(14);
    param1.add(80);
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