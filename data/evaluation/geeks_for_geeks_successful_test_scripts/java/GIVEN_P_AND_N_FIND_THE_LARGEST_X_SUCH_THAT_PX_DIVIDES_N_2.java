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
public class GIVEN_P_AND_N_FIND_THE_LARGEST_X_SUCH_THAT_PX_DIVIDES_N_2{
static int f_gold ( int n , int p ) {
  int ans = 0 ;
  while ( n > 0 ) {
    n /= p ;
    ans += n ;
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(33);
    param0.add(81);
    param0.add(18);
    param0.add(77);
    param0.add(9);
    param0.add(31);
    param0.add(63);
    param0.add(66);
    param0.add(57);
    param0.add(14);
    List<Integer> param1 = new ArrayList<>();
    param1.add(3);
    param1.add(71);
    param1.add(68);
    param1.add(66);
    param1.add(52);
    param1.add(69);
    param1.add(90);
    param1.add(48);
    param1.add(18);
    param1.add(64);
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