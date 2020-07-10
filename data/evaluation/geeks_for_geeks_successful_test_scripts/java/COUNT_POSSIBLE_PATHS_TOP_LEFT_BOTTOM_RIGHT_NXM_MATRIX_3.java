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
public class COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_3{
static int f_gold ( int m , int n ) {
  int path = 1 ;
  for ( int i = n ;
  i < ( m + n - 1 ) ;
  i ++ ) {
    path *= i ;
    path /= ( i - n + 1 ) ;
  }
  return path ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(10);
    param0.add(52);
    param0.add(5);
    param0.add(84);
    param0.add(27);
    param0.add(77);
    param0.add(52);
    param0.add(3);
    param0.add(5);
    param0.add(14);
    List<Integer> param1 = new ArrayList<>();
    param1.add(3);
    param1.add(8);
    param1.add(23);
    param1.add(56);
    param1.add(30);
    param1.add(90);
    param1.add(50);
    param1.add(25);
    param1.add(75);
    param1.add(18);
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