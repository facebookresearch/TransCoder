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
public class MINIMUM_SUM_TWO_NUMBERS_FORMED_DIGITS_ARRAY_2{
static int f_gold ( int a [ ] , int n ) {
  Arrays . sort ( a ) ;
  int num1 = 0 ;
  int num2 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) num1 = num1 * 10 + a [ i ] ;
    else num2 = num2 * 10 + a [ i ] ;
  }
  return num2 + num1 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,16,29,30,38,83});
    param0.add(new int[]{58,74,-28,-60,-6,66,-76,46,0,-24,28,-16,-14,24,-94,-56,-80,40,-18,-68,-8,-94,-88,-12,-20,-8});
    param0.add(new int[]{0,1});
    param0.add(new int[]{7,12,78,8});
    param0.add(new int[]{-78,-48,-48,-26,8,34});
    param0.add(new int[]{1,1,1,1,0,1,1,1,0,1,0,1,0,0,0,0,1,1,1,1,1,0,0,0,1,0,0,1,1,0});
    param0.add(new int[]{2,3,5,7,25,30,31,38,42,45,52,53,56,59,60,71,74,76,80,90,91,98});
    param0.add(new int[]{40,-62,-2,-58,60,38,48,-4,0,62,-52,-80,56,38,58,-72,32,-26,-14,70,58,-86,-32,56,-40,84,24,60,-46,-32,78,78,-66,20,-32,98,84,44,48,4,54,-66,6,-62,58});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1});
    param0.add(new int[]{59,9,3,20,83,87,48,4,86,67,89,96,17,36,39,45,99,8,56,92,63,81,7,75,32,10,71,82,97,92,65,23,22,47,70,79,57,81,65,50});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(16);
    param1.add(1);
    param1.add(3);
    param1.add(4);
    param1.add(27);
    param1.add(13);
    param1.add(34);
    param1.add(8);
    param1.add(35);
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