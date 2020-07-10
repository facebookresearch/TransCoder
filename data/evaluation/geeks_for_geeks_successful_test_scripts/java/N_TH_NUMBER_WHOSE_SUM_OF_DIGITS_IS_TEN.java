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
public class N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN{
public static int f_gold ( int n ) {
  int count = 0 ;
  for ( int curr = 1 ;
  ;
  curr ++ ) {
    int sum = 0 ;
    for ( int x = curr ;
    x > 0 ;
    x = x / 10 ) sum = sum + x % 10 ;
    if ( sum == 10 ) count ++ ;
    if ( count == n ) return curr ;
  }
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(37);
    param0.add(13);
    param0.add(51);
    param0.add(69);
    param0.add(76);
    param0.add(10);
    param0.add(97);
    param0.add(40);
    param0.add(69);
    param0.add(4);
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