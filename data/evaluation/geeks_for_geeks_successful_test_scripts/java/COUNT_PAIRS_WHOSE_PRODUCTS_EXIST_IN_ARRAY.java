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
public class COUNT_PAIRS_WHOSE_PRODUCTS_EXIST_IN_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      int product = arr [ i ] * arr [ j ] ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        if ( arr [ k ] == product ) {
          result ++ ;
          break ;
        }
      }
    }
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{3,7,26,40,46,89,99});
    param0.add(new int[]{98,42,-24,-60,74,86,6,8,72,-58,38,-20,6,-6,8,48,-34,30,60,66,38,-54,8,-94,-8,0,-64,-94,-94,-72,-84,-36,88,-62,-88,46,-4,88});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{37,97,57,82,29,68,94,38,81,48,13,84,57,5,27,87,11,35,82,53,67,31,15,99,6,93,91,92,3,23,90,27,6,33,78,3,19,19,27});
    param0.add(new int[]{-80,-74,-72,-72,-66,-66,-62,-50,-44,-44,-28,-24,-24,-22,-16,-10,-6,-4,-2,2,2,4,12,16,16,28,30,32,32,38,38,72,84,86,88,90,96});
    param0.add(new int[]{0,1,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,1,1,1});
    param0.add(new int[]{25,67});
    param0.add(new int[]{82,74,-82,22,-28,-78,-22,-86,-74,42,-6,54,-88,-92,-14,-50,68,46,-50,46,-18,66,-76,-30,36,12,66});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{50,23,56,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(24);
    param1.add(44);
    param1.add(36);
    param1.add(34);
    param1.add(18);
    param1.add(1);
    param1.add(14);
    param1.add(32);
    param1.add(3);
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