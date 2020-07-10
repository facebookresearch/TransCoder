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
public class SQUARE_ROOT_OF_AN_INTEGER{
static int f_gold ( int x ) {
  if ( x == 0 || x == 1 ) return x ;
  int i = 1 , result = 1 ;
  while ( result <= x ) {
    i ++ ;
    result = i * i ;
  }
  return i - 1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(89);
    param0.add(11);
    param0.add(14);
    param0.add(92);
    param0.add(76);
    param0.add(63);
    param0.add(51);
    param0.add(16);
    param0.add(83);
    param0.add(66);
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