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
public class COUNT_DERANGEMENTS_PERMUTATION_SUCH_THAT_NO_ELEMENT_APPEARS_IN_ITS_ORIGINAL_POSITION_1{
static int f_gold ( int n ) {
  int der [ ] = new int [ n + 1 ] ;
  der [ 0 ] = 1 ;
  der [ 1 ] = 0 ;
  der [ 2 ] = 1 ;
  for ( int i = 3 ;
  i <= n ;
  ++ i ) der [ i ] = ( i - 1 ) * ( der [ i - 1 ] + der [ i - 2 ] ) ;
  return der [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(22);
    param0.add(91);
    param0.add(33);
    param0.add(93);
    param0.add(90);
    param0.add(59);
    param0.add(88);
    param0.add(41);
    param0.add(70);
    param0.add(63);
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