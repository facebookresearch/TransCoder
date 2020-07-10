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
public class DICE_THROW_PROBLEM_1{
public static long f_gold ( int f , int d , int s ) {
  long mem [ ] [ ] = new long [ d + 1 ] [ s + 1 ] ;
  mem [ 0 ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= d ;
  i ++ ) {
    for ( int j = i ;
    j <= s ;
    j ++ ) {
      mem [ i ] [ j ] = mem [ i ] [ j - 1 ] + mem [ i - 1 ] [ j - 1 ] ;
      if ( j - f - 1 >= 0 ) mem [ i ] [ j ] -= mem [ i - 1 ] [ j - f - 1 ] ;
    }
  }
  return mem [ d ] [ s ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(58);
    param0.add(38);
    param0.add(5);
    param0.add(91);
    param0.add(76);
    param0.add(38);
    param0.add(97);
    param0.add(97);
    param0.add(99);
    List<Integer> param1 = new ArrayList<>();
    param1.add(5);
    param1.add(45);
    param1.add(89);
    param1.add(39);
    param1.add(90);
    param1.add(56);
    param1.add(43);
    param1.add(26);
    param1.add(90);
    param1.add(2);
    List<Integer> param2 = new ArrayList<>();
    param2.add(33);
    param2.add(4);
    param2.add(9);
    param2.add(30);
    param2.add(47);
    param2.add(46);
    param2.add(84);
    param2.add(52);
    param2.add(90);
    param2.add(26);
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