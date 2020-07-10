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
public class MAXIMUM_PRODUCT_SUBSET_ARRAY{
static int f_gold ( int a [ ] , int n ) {
  if ( n == 1 ) {
    return a [ 0 ] ;
  }
  int max_neg = Integer . MIN_VALUE ;
  int count_neg = 0 , count_zero = 0 ;
  int prod = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == 0 ) {
      count_zero ++ ;
      continue ;
    }
    if ( a [ i ] < 0 ) {
      count_neg ++ ;
      max_neg = Math . max ( max_neg , a [ i ] ) ;
    }
    prod = prod * a [ i ] ;
  }
  if ( count_zero == n ) {
    return 0 ;
  }
  if ( count_neg % 2 == 1 ) {
    if ( count_neg == 1 && count_zero > 0 && count_zero + count_neg == n ) {
      return 0 ;
    }
    prod = prod / max_neg ;
  }
  return prod ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{22,62,97});
    param0.add(new int[]{-96,30,34,16,82,12,68,6,-2,-78,-74,-52,38,62,20,4,-32,44,-34,12,-44,-66,-94,24,-86,56,-20,-62,90,-16,-2,54,80,-16,-56,-98,20,84,30,-44,-78,66,-62,18});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{9,1,90,53,67,14,42,52,55,52,86,99,43,74,48,71,55,85,87,73,41,55,52});
    param0.add(new int[]{-92,-78,-74,-72,-70,-66,-46,-44,-42,-34,-32,-30,-10,18,30,34,56,64,66});
    param0.add(new int[]{0,1,1,1,0,1,0,0,0,1,0,1,0,1,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,1,0});
    param0.add(new int[]{1,2,3,18,20,33,38,53,55,56,67,80,83,87,90,97,98});
    param0.add(new int[]{-78,-14,20,70,-40,-96,78,70,-36,-30,24,-36,86,42,24,86,-52,-34,72,-58,-36,-24,-10,-68,-20,-64,34,42,-2,-8});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{1,6,32,4,63,85,48,64,11,29,77,59,1,99,17,17,38,49,78,82,50,87,75,18,75,73,98,17,27,51,4,98,96,6,74,5});
    List<Integer> param1 = new ArrayList<>();
    param1.add(2);
    param1.add(41);
    param1.add(43);
    param1.add(20);
    param1.add(10);
    param1.add(16);
    param1.add(9);
    param1.add(16);
    param1.add(11);
    param1.add(32);
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