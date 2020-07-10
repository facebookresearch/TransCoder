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
public class CHECK_WHETHER_GIVEN_DEGREES_VERTICES_REPRESENT_GRAPH_TREE{
static boolean f_gold ( int degree [ ] , int n ) {
  int deg_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    deg_sum += degree [ i ] ;
  }
  return ( 2 * ( n - 1 ) == deg_sum ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2, 3, 1, 1, 1});
    param0.add(new int[]{2, 2, 1, 1, 2});
    param0.add(new int[]{2, 2, 1, 1, 1});
    param0.add(new int[]{0,0,0,3,3,4});
    param0.add(new int[]{-10, 12, 2});
    param0.add(new int[]{1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,1,1,0,1,1,1,0,1,0,0});
    param0.add(new int[]{1,6,10,13,15,17,18,23,26,28,30,32,32,33,36,39,39,41,43,50,50,51,53,54,59,59,63,63,63,66,66,71,71,74,78,89,89,93});
    param0.add(new int[]{66,-96,-14,74,-20});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{97,73,87,45,64,30,53,50,62,42,28,58,31,90});
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(5);
    param1.add(5);
    param1.add(6);
    param1.add(3);
    param1.add(19);
    param1.add(30);
    param1.add(4);
    param1.add(31);
    param1.add(10);
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