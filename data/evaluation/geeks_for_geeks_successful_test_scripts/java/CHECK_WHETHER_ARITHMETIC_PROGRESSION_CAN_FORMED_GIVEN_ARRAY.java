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
public class CHECK_WHETHER_ARITHMETIC_PROGRESSION_CAN_FORMED_GIVEN_ARRAY{
static boolean f_gold ( int arr [ ] , int n ) {
  if ( n == 1 ) return true ;
  Arrays . sort ( arr ) ;
  int d = arr [ 1 ] - arr [ 0 ] ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) if ( arr [ i ] - arr [ i - 1 ] != d ) return false ;
  return true ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{1,4,64,16});
    param0.add(new int[]{0, 12, 4, 8});
    param0.add(new int[]{-2, 2, 0, 4, 6});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0});
    param0.add(new int[]{66,56,86,76,46});
    param0.add(new int[]{66,56,56,86,76,46});
    param0.add(new int[]{7,9,11,21,44,45,61,67,78,97,98,99});
    param0.add(new int[]{66,-28,-26,50,-18,54,84,-2,-70,-74,6,-34,44,-36,-4,36,14,24,64,74,86,-96,54,-68,-84,-62,-36,34,-36,70,-50,6,62,-50,-34,-38,-28,74,78,-2,-12,-4});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{18,93,79,20,44,36,69,37,33,82,19,51,32,22,1,54,89,20,58,35,70,70,61,63,61,57,3,95,99,45,15,17,15,5,86,46,11,64,92,14,39,67});
    List<Integer> param1 = new ArrayList<>();
    param1.add(4);
    param1.add(4);
    param1.add(5);
    param1.add(7);
    param1.add(5);
    param1.add(6);
    param1.add(11);
    param1.add(33);
    param1.add(33);
    param1.add(40);
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