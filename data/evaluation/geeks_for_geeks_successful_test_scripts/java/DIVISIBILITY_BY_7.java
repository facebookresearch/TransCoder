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
public class DIVISIBILITY_BY_7{
static boolean f_gold ( int num ) {
  if ( num < 0 ) return f_gold ( - num ) ;
  if ( num == 0 || num == 7 ) return true ;
  if ( num < 10 ) return false ;
  return f_gold ( num / 10 - 2 * ( num - num / 10 * 10 ) ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(0);
    param0.add(-21);
    param0.add(7);
    param0.add(63);
    param0.add(84);
    param0.add(73);
    param0.add(81);
    param0.add(-10);
    param0.add(47);
    param0.add(23);
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