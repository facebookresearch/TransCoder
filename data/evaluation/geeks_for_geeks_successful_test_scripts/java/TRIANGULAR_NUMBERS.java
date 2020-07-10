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
public class TRIANGULAR_NUMBERS{
static boolean f_gold ( int num ) {
  if ( num < 0 ) return false ;
  int sum = 0 ;
  for ( int n = 1 ;
  sum <= num ;
  n ++ ) {
    sum = sum + n ;
    if ( sum == num ) return true ;
  }
  return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(97);
    param0.add(97);
    param0.add(32);
    param0.add(40);
    param0.add(18);
    param0.add(14);
    param0.add(90);
    param0.add(39);
    param0.add(1);
    param0.add(57);
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