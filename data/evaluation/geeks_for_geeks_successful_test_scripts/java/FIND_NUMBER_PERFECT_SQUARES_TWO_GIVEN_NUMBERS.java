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
public class FIND_NUMBER_PERFECT_SQUARES_TWO_GIVEN_NUMBERS{
static int f_gold ( int a , int b ) {
  int cnt = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) for ( int j = 1 ;
  j * j <= i ;
  j ++ ) if ( j * j == i ) cnt ++ ;
  return cnt ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(48);
    param0.add(3);
    param0.add(20);
    param0.add(98);
    param0.add(96);
    param0.add(40);
    param0.add(9);
    param0.add(57);
    param0.add(28);
    param0.add(98);
    List<Integer> param1 = new ArrayList<>();
    param1.add(42);
    param1.add(82);
    param1.add(72);
    param1.add(98);
    param1.add(90);
    param1.add(82);
    param1.add(15);
    param1.add(77);
    param1.add(80);
    param1.add(75);
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