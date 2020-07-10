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
public class DYNAMIC_PROGRAMMING_SET_8_MATRIX_CHAIN_MULTIPLICATION{
static int f_gold ( int p [ ] , int i , int j ) {
  if ( i == j ) return 0 ;
  int min = Integer . MAX_VALUE ;
  for ( int k = i ;
  k < j ;
  k ++ ) {
    int count = f_gold ( p , i , k ) + f_gold ( p , k + 1 , j ) + p [ i - 1 ] * p [ k ] * p [ j ] ;
    if ( count < min ) min = count ;
  }
  return min ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{6,12,16,30,31,31,33,34,45,48,57,63,81,83});
    param0.add(new int[]{30,-78,42,-6,42,56,-38,28,-96,-96,84,-18,0,20,-56,-40,-58,-74,64,62,-22,78,10,-22,16,-48,2,14,82,-92,-64,-18,42,24,22,-50,12,-76,38,-30,-86,-58,-6,-4,10,28});
    param0.add(new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{54,46});
    param0.add(new int[]{-80,-76,-68,-66,-54,-12,-10,-6,6,8,20,20,22,60,66,78,78,82,98});
    param0.add(new int[]{0,0,1,0,0,1,0,1,1,1,0,0,1,1,0,1,1,1,0,1,0});
    param0.add(new int[]{14,21,29,31,37,50,51,54,57,62,64,72,85,98});
    param0.add(new int[]{-86,98,90,-20,90,68,70,-24,-10,-80,70,-42,14,56,-26,-42,2,-62,24,10,-46,-66,-82,-98,-84,-2,-52,-50,0,-18,90,-32,98,86});
    param0.add(new int[]{0,0,1,1,1,1});
    param0.add(new int[]{52,15,61,73,45,5,15,54,69,90,5,56,13,54,27,72,58,21,35,2,59,55,64,92,54,63,50,95,38,53,38,53,73,27,86,86,99,42,85,80,43,32,80,57,78});
    List<Integer> param1 = new ArrayList<>();
    param1.add(10);
    param1.add(30);
    param1.add(7);
    param1.add(1);
    param1.add(13);
    param1.add(20);
    param1.add(7);
    param1.add(23);
    param1.add(5);
    param1.add(26);
    List<Integer> param2 = new ArrayList<>();
    param2.add(9);
    param2.add(27);
    param2.add(7);
    param2.add(1);
    param2.add(10);
    param2.add(17);
    param2.add(11);
    param2.add(26);
    param2.add(4);
    param2.add(42);
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