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
public class SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2{
static int f_gold ( int n ) {
  n -- ;
  n |= n >> 1 ;
  n |= n >> 2 ;
  n |= n >> 4 ;
  n |= n >> 8 ;
  n |= n >> 16 ;
  n ++ ;
  return n ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(60);
    param0.add(20);
    param0.add(33);
    param0.add(34);
    param0.add(68);
    param0.add(79);
    param0.add(20);
    param0.add(41);
    param0.add(36);
    param0.add(17);
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