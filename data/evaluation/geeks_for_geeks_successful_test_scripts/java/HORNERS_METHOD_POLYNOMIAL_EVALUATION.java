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
public class HORNERS_METHOD_POLYNOMIAL_EVALUATION{
static int f_gold ( int poly [ ] , int n , int x ) {
  int result = poly [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) result = result * x + poly [ i ] ;
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,18,22,27,31,33,36,36,37,37,40,48,49,49,50,58,66,71,75,85,89,91});
    param0.add(new int[]{42,-88,28,8,30,-8,-16,86,50,84,12,-20,-70,-40,-54,-76,84,90,-40,-68,-40,36,-34,14,94,-44,70,58,-48,-72,14,-70,32});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1});
    param0.add(new int[]{66,72,27,72,71,75,94,49,47,21,21,71,84,61,14,20,5,31,62,12,56,56,12,66,26,68,30,98,20});
    param0.add(new int[]{-96,-96,-94,-82,-72,-54,-54,-46,-34,-30,-28,-18,-2,2,6,8,10,16,18,24,26,28,44,48,48,52,56,58,58,70,70,82,84,88,94});
    param0.add(new int[]{0,1,0,1,0,0,0,1,0,1,1,1,0,0,0,0,1,1,0,1,1,0,0,1,0,0,1,1,1,0,1,1,0,0,1});
    param0.add(new int[]{2,3,8,13,15,17,18,18,25,29,29,31,36,37,42,42,42,51,52,52,54,54,58,64,70,70,74,75,78,80,83,85,86,88,95,96,97,98,99});
    param0.add(new int[]{-56,-12,-92,-48,-98,-80,-96,-42,-50,74,88,20,78,-74,-20,-32,-30,58,-22,-16,68,72,-50,-72,66,72,74,-98,-22,-40,-90,88,42,24});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{86,62,30,27,98,75,93,37,70,16,20,74,46,74,25,59,86,32,17,90,80,10,17});
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(31);
    param1.add(10);
    param1.add(15);
    param1.add(25);
    param1.add(20);
    param1.add(19);
    param1.add(29);
    param1.add(20);
    param1.add(12);
    List<Integer> param2 = new ArrayList<>();
    param2.add(16);
    param2.add(20);
    param2.add(8);
    param2.add(26);
    param2.add(34);
    param2.add(25);
    param2.add(32);
    param2.add(23);
    param2.add(23);
    param2.add(12);
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