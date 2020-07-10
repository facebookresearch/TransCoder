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
public class NUMBER_OF_PAIRS_IN_AN_ARRAY_HAVING_SUM_EQUAL_TO_PRODUCT{
static int f_gold ( int a [ ] , int n ) {
  int zero = 0 , two = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == 0 ) {
      zero ++ ;
    }
    if ( a [ i ] == 2 ) {
      two ++ ;
    }
  }
  int cnt = ( zero * ( zero - 1 ) ) / 2 + ( two * ( two - 1 ) ) / 2 ;
  return cnt ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{9,10,20,26,26,28,31,34,35,36,36,37,39,43,44,44,46,49,54,57,58,63,64,64,65,67,70,70,74,75,77,78,79,81,82,83,84,86,95});
    param0.add(new int[]{0,-10,10,0,68,4,-6,-14,74,-80,56,-4,36,56,10,-16,90,84,-38,-40,40,-86,-36,-16,-48,-76,-72,-18,-14,-40,-82,56,-60});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{88,20,53,21,29,73,62,91,72,34,47,42,98,9,79,80,94,36,7,67,96,34,99,56,37,70,55,36,10,77,41,51,5,37,57,29,56,74,97,31,96,52,13,29,87,58,28,31});
    param0.add(new int[]{20});
    param0.add(new int[]{1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1});
    param0.add(new int[]{2,4,9,16,22,23,25,33,33,36,39,48,49,52,53,60,67,68,76,77,79,84,84,86,89});
    param0.add(new int[]{-62,42,-88,-44,90,30,52,54,56,-72,-76,90,18,42,62,-84,56,-80,72});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{22,15,28,29,32,16,33,83});
    List<Integer> param1 = new ArrayList<>();
    param1.add(31);
    param1.add(19);
    param1.add(22);
    param1.add(38);
    param1.add(0);
    param1.add(21);
    param1.add(24);
    param1.add(13);
    param1.add(15);
    param1.add(7);
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