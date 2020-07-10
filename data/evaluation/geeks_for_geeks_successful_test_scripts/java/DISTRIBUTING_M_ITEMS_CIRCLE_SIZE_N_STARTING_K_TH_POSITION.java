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
public class DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION{
static int f_gold ( int n , int m , int k ) {
  if ( m <= n - k + 1 ) return m + k - 1 ;
  m = m - ( n - k + 1 ) ;
  return ( m % n == 0 ) ? n : ( m % n ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(19);
    param0.add(23);
    param0.add(92);
    param0.add(9);
    param0.add(20);
    param0.add(68);
    param0.add(66);
    param0.add(77);
    param0.add(90);
    param0.add(26);
    List<Integer> param1 = new ArrayList<>();
    param1.add(14);
    param1.add(51);
    param1.add(10);
    param1.add(50);
    param1.add(67);
    param1.add(25);
    param1.add(30);
    param1.add(22);
    param1.add(1);
    param1.add(34);
    List<Integer> param2 = new ArrayList<>();
    param2.add(34);
    param2.add(5);
    param2.add(24);
    param2.add(34);
    param2.add(20);
    param2.add(40);
    param2.add(24);
    param2.add(32);
    param2.add(71);
    param2.add(54);
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