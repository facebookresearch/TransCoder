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
public class COUNT_NUMBER_OF_WAYS_TO_COVER_A_DISTANCE_1{
static int f_gold ( int dist ) {
  int [ ] count = new int [ dist + 1 ] ;
  count [ 0 ] = 1 ;
  count [ 1 ] = 1 ;
  count [ 2 ] = 2 ;
  for ( int i = 3 ;
  i <= dist ;
  i ++ ) count [ i ] = count [ i - 1 ] + count [ i - 2 ] + count [ i - 3 ] ;
  return count [ dist ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(37);
    param0.add(82);
    param0.add(87);
    param0.add(80);
    param0.add(92);
    param0.add(58);
    param0.add(98);
    param0.add(53);
    param0.add(11);
    param0.add(58);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i)) == f_gold(param0.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}