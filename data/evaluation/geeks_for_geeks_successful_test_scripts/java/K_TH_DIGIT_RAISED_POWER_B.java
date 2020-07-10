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
public class K_TH_DIGIT_RAISED_POWER_B{
public static int f_gold ( int a , int b , int k ) {
  int p = ( int ) Math . pow ( a , b ) ;
  int count = 0 ;
  while ( p > 0 && count < k ) {
    int rem = p % 10 ;
    count ++ ;
    if ( count == k ) return rem ;
    p = p / 10 ;
  }
  return 0 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
   param0.add(11);
   param0.add(41);
param0.add(5);
param0.add(1);
param0.add(24);
param0.add(5);
param0.add(66);
param0.add(7);
param0.add(77);
param0.add(60);
    List<Integer> param1 = new ArrayList<>();
  param1.add(2);
  param1.add(3);
param1.add(4);
param1.add(2);
param1.add(1);
param1.add(2);
param1.add(5);
param1.add(10);
param1.add(30);
param1.add(50);
    List<Integer> param2 = new ArrayList<>();
    param2.add(1);
param2.add(0);
param2.add(3);
param2.add(4);
param2.add(5);
param2.add(3);
param2.add(8);
param2.add(3);
param2.add(10);
param2.add(1);

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
