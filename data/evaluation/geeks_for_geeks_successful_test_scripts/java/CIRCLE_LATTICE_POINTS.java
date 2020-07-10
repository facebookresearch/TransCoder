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
public class CIRCLE_LATTICE_POINTS{
static int f_gold ( int r ) {
  if ( r <= 0 ) return 0 ;
  int result = 4 ;
  for ( int x = 1 ;
  x < r ;
  x ++ ) {
    int ySquare = r * r - x * x ;
    int y = ( int ) Math . sqrt ( ySquare ) ;
    if ( y * y == ySquare ) result += 4 ;
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(34);
    param0.add(56);
    param0.add(90);
    param0.add(47);
    param0.add(36);
    param0.add(63);
    param0.add(21);
    param0.add(76);
    param0.add(18);
    param0.add(75);
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