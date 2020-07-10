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
public class SWAP_BITS_IN_A_GIVEN_NUMBER{
static int f_gold ( int x , int p1 , int p2 , int n ) {
  int set1 = ( x >> p1 ) & ( ( 1 << n ) - 1 ) ;
  int set2 = ( x >> p2 ) & ( ( 1 << n ) - 1 ) ;
  int xor = ( set1 ^ set2 ) ;
  xor = ( xor << p1 ) | ( xor << p2 ) ;
  int result = x ^ xor ;
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(95);
    param0.add(16);
    param0.add(55);
    param0.add(75);
    param0.add(90);
    param0.add(58);
    param0.add(69);
    param0.add(5);
    param0.add(36);
    param0.add(62);
    List<Integer> param1 = new ArrayList<>();
    param1.add(88);
    param1.add(26);
    param1.add(56);
    param1.add(35);
    param1.add(12);
    param1.add(65);
    param1.add(64);
    param1.add(1);
    param1.add(33);
    param1.add(69);
    List<Integer> param2 = new ArrayList<>();
    param2.add(97);
    param2.add(59);
    param2.add(40);
    param2.add(79);
    param2.add(59);
    param2.add(25);
    param2.add(17);
    param2.add(59);
    param2.add(97);
    param2.add(66);
    List<Integer> param3 = new ArrayList<>();
    param3.add(92);
    param3.add(42);
    param3.add(41);
    param3.add(30);
    param3.add(34);
    param3.add(19);
    param3.add(94);
    param3.add(38);
    param3.add(44);
    param3.add(9);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}