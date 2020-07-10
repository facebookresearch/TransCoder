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
public class CHECK_WHETHER_GIVEN_NUMBER_EVEN_ODD_1{
public static boolean f_gold ( int n ) {
  if ( ( n & 1 ) == 0 ) return true ;
  else return false ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(73);
    param0.add(79);
    param0.add(36);
    param0.add(71);
    param0.add(23);
    param0.add(41);
    param0.add(66);
    param0.add(46);
    param0.add(50);
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