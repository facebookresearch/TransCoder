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
public class NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES{
static int f_gold ( int n ) {
  int ans = 0 ;
  for ( int length = 1 ;
  length <= Math . sqrt ( n ) ;
  ++ length ) for ( int height = length ;
  height * length <= n ;
  ++ height ) ans ++ ;
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(34);
    param0.add(49);
    param0.add(41);
    param0.add(17);
    param0.add(67);
    param0.add(38);
    param0.add(59);
    param0.add(64);
    param0.add(61);
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