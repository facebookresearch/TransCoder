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
public class SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS{
static int f_gold ( int n ) {
  if ( n < 4 ) return - 1 ;
  int rem = n % 4 ;
  if ( rem == 0 ) return n / 4 ;
  if ( rem == 1 ) {
    if ( n < 9 ) return - 1 ;
    return ( n - 9 ) / 4 + 1 ;
  }
  if ( rem == 2 ) return ( n - 6 ) / 4 + 1 ;
  if ( rem == 3 ) {
    if ( n < 15 ) return - 1 ;
    return ( n - 15 ) / 4 + 2 ;
  }
  return 0 ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(55);
    param0.add(35);
    param0.add(24);
    param0.add(75);
    param0.add(5);
    param0.add(7);
    param0.add(50);
    param0.add(28);
    param0.add(67);
    param0.add(59);
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