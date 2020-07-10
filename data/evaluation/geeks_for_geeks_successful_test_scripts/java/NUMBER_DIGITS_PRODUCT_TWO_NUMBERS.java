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
public class NUMBER_DIGITS_PRODUCT_TWO_NUMBERS{
static int f_gold ( int a , int b ) {
  int count = 0 ;
  int p = Math . abs ( a * b ) ;
  if ( p == 0 ) return 1 ;
  while ( p > 0 ) {
    count ++ ;
    p = p / 10 ;
  }
  return count ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(86);
    param0.add(81);
    param0.add(48);
    param0.add(64);
    param0.add(56);
    param0.add(5);
    param0.add(25);
    param0.add(94);
    param0.add(5);
    param0.add(46);
    List<Integer> param1 = new ArrayList<>();
    param1.add(39);
    param1.add(87);
    param1.add(84);
    param1.add(80);
    param1.add(20);
    param1.add(70);
    param1.add(13);
    param1.add(83);
    param1.add(55);
    param1.add(46);
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