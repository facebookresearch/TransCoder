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
public class NUMBER_WAYS_NODE_MAKE_LOOP_SIZE_K_UNDIRECTED_COMPLETE_CONNECTED_GRAPH_N_NODES{
static int f_gold ( int n , int k ) {
  int p = 1 ;
  if ( k % 2 != 0 ) p = - 1 ;
  return ( int ) ( Math . pow ( n - 1 , k ) + p * ( n - 1 ) ) / n ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(27);
    param0.add(70);
    param0.add(77);
    param0.add(83);
    param0.add(16);
    param0.add(90);
    param0.add(39);
    param0.add(48);
    param0.add(56);
    param0.add(10);
    List<Integer> param1 = new ArrayList<>();
    param1.add(59);
    param1.add(87);
    param1.add(40);
    param1.add(26);
    param1.add(2);
    param1.add(66);
    param1.add(72);
    param1.add(26);
    param1.add(77);
    param1.add(47);
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