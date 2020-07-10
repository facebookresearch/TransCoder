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
public class COUNT_POSSIBLE_WAYS_TO_CONSTRUCT_BUILDINGS{
static int f_gold ( int N ) {
  if ( N == 1 ) return 4 ;
  int countB = 1 , countS = 1 , prev_countB , prev_countS ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    prev_countB = countB ;
    prev_countS = countS ;
    countS = prev_countB + prev_countS ;
    countB = prev_countS ;
  }
  int result = countS + countB ;
  return ( result * result ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(17);
    param0.add(66);
    param0.add(53);
    param0.add(97);
    param0.add(34);
    param0.add(54);
    param0.add(9);
    param0.add(99);
    param0.add(59);
    param0.add(87);
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