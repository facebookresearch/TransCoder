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
public class COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION{
static int f_gold ( int n , int r , int p ) {
  int C [ ] = new int [ r + 1 ] ;
  Arrays . fill ( C , 0 ) ;
  C [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = Math . min ( i , r ) ;
    j > 0 ;
    j -- ) C [ j ] = ( C [ j ] + C [ j - 1 ] ) % p ;
  }
  return C [ r ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(82);
    param0.add(45);
    param0.add(44);
    param0.add(88);
    param0.add(90);
    param0.add(98);
    param0.add(80);
    param0.add(60);
    param0.add(52);
    param0.add(71);
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(24);
    param1.add(68);
    param1.add(24);
    param1.add(75);
    param1.add(55);
    param1.add(54);
    param1.add(75);
    param1.add(73);
    param1.add(26);
    List<Integer> param2 = new ArrayList<>();
    param2.add(94);
    param2.add(95);
    param2.add(61);
    param2.add(43);
    param2.add(57);
    param2.add(43);
    param2.add(88);
    param2.add(65);
    param2.add(86);
    param2.add(45);
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