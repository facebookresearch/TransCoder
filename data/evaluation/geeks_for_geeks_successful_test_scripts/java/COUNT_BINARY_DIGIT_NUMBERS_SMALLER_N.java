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
public class COUNT_BINARY_DIGIT_NUMBERS_SMALLER_N{
static int f_gold ( int N ) {
  Queue < Integer > q = new LinkedList < > ( ) ;
  q . add ( 1 ) ;
  int cnt = 0 ;
  int t ;
  while ( q . size ( ) > 0 ) {
    t = q . peek ( ) ;
    q . remove ( ) ;
    if ( t <= N ) {
      cnt ++ ;
      q . add ( t * 10 ) ;
      q . add ( t * 10 + 1 ) ;
    }
  }
  return cnt ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(3);
    param0.add(150932532);
    param0.add(71);
    param0.add(44);
    param0.add(36);
    param0.add(88);
    param0.add(69);
    param0.add(53);
    param0.add(20);
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