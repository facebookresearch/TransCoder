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
public class DYCK_PATH{
public static int f_gold ( int n ) {
  int res = 1 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    res *= ( 2 * n - i ) ;
    res /= ( i + 1 ) ;
  }
  return res / ( n + 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(72);
    param0.add(90);
    param0.add(61);
    param0.add(28);
    param0.add(70);
    param0.add(13);
    param0.add(7);
    param0.add(98);
    param0.add(99);
    param0.add(67);
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