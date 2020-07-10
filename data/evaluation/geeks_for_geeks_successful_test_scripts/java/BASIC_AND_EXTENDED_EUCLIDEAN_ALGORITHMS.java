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
public class BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS{
public static int f_gold ( int a , int b ) {
  if ( a == 0 ) return b ;
  return f_gold ( b % a , a ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(46);
    param0.add(26);
    param0.add(40);
    param0.add(58);
    param0.add(25);
    param0.add(2);
    param0.add(8);
    param0.add(21);
    param0.add(82);
    param0.add(17);
    List<Integer> param1 = new ArrayList<>();
    param1.add(89);
    param1.add(82);
    param1.add(12);
    param1.add(4);
    param1.add(44);
    param1.add(87);
    param1.add(65);
    param1.add(87);
    param1.add(10);
    param1.add(61);
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