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
public class MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_2{
public static int f_gold ( int a , int b , int c ) {
  int x = a - b ;
  int y = b - c ;
  int z = a - c ;
  if ( x * y > 0 ) return b ;
  else if ( x * z > 0 ) return c ;
  else return a ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(48);
    param0.add(21);
    param0.add(71);
    param0.add(93);
    param0.add(3);
    param0.add(58);
    param0.add(88);
    param0.add(8);
    param0.add(17);
    param0.add(13);
    List<Integer> param1 = new ArrayList<>();
    param1.add(46);
    param1.add(7);
    param1.add(4);
    param1.add(34);
    param1.add(61);
    param1.add(78);
    param1.add(41);
    param1.add(84);
    param1.add(66);
    param1.add(3);
    List<Integer> param2 = new ArrayList<>();
    param2.add(38);
    param2.add(16);
    param2.add(31);
    param2.add(11);
    param2.add(32);
    param2.add(6);
    param2.add(66);
    param2.add(38);
    param2.add(27);
    param2.add(23);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}