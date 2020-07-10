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
public class NUMBER_TRIANGLES_N_MOVES{
public static int f_gold ( int n ) {
  int [ ] answer = new int [ n + 1 ] ;
  answer [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) answer [ i ] = answer [ i - 1 ] * 3 + 2 ;
  return answer [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(33);
    param0.add(72);
    param0.add(81);
    param0.add(93);
    param0.add(8);
    param0.add(76);
    param0.add(97);
    param0.add(91);
    param0.add(61);
    param0.add(6);
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