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
public class SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS{
static int f_gold ( int m , int n ) {
  if ( m < n ) return 0 ;
  if ( n == 0 ) return 1 ;
  return f_gold ( m - 1 , n ) + f_gold ( m / 2 , n - 1 ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(38);
    param0.add(39);
    param0.add(24);
    param0.add(90);
    param0.add(44);
    param0.add(49);
    param0.add(58);
    param0.add(97);
    param0.add(99);
    param0.add(19);
    List<Integer> param1 = new ArrayList<>();
    param1.add(34);
    param1.add(29);
    param1.add(99);
    param1.add(23);
    param1.add(2);
    param1.add(70);
    param1.add(84);
    param1.add(34);
    param1.add(72);
    param1.add(67);
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