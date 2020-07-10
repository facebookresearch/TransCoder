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
public class NUMBER_DAYS_TANK_WILL_BECOME_EMPTY{
static int f_gold ( int C , int l ) {
  if ( l >= C ) return C ;
  double eq_root = ( Math . sqrt ( 1 + 8 * ( C - l ) ) - 1 ) / 2 ;
  return ( int ) ( Math . ceil ( eq_root ) + l ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(91);
    param0.add(99);
    param0.add(11);
    param0.add(23);
    param0.add(12);
    param0.add(1);
    param0.add(18);
    param0.add(14);
    param0.add(13);
    param0.add(36);
    List<Integer> param1 = new ArrayList<>();
    param1.add(29);
    param1.add(55);
    param1.add(56);
    param1.add(56);
    param1.add(97);
    param1.add(64);
    param1.add(5);
    param1.add(37);
    param1.add(55);
    param1.add(99);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}