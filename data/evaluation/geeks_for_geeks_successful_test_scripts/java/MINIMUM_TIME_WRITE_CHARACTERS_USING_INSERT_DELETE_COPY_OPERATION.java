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
public class MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION{
static int f_gold ( int N , int insert , int remove , int copy ) {
  if ( N == 0 ) return 0 ;
  if ( N == 1 ) return insert ;
  int dp [ ] = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( i % 2 == 0 ) dp [ i ] = Math . min ( dp [ i - 1 ] + insert , dp [ i / 2 ] + copy ) ;
    else dp [ i ] = Math . min ( dp [ i - 1 ] + insert , dp [ ( i + 1 ) / 2 ] + copy + remove ) ;
  }
  return dp [ N ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(59);
    param0.add(66);
    param0.add(98);
    param0.add(63);
    param0.add(99);
    param0.add(45);
    param0.add(60);
    param0.add(11);
    param0.add(96);
    param0.add(54);
    List<Integer> param1 = new ArrayList<>();
    param1.add(75);
    param1.add(68);
    param1.add(55);
    param1.add(4);
    param1.add(37);
    param1.add(28);
    param1.add(53);
    param1.add(96);
    param1.add(95);
    param1.add(6);
    List<Integer> param2 = new ArrayList<>();
    param2.add(12);
    param2.add(32);
    param2.add(69);
    param2.add(41);
    param2.add(98);
    param2.add(59);
    param2.add(40);
    param2.add(50);
    param2.add(48);
    param2.add(50);
    List<Integer> param3 = new ArrayList<>();
    param3.add(45);
    param3.add(41);
    param3.add(5);
    param3.add(12);
    param3.add(55);
    param3.add(7);
    param3.add(52);
    param3.add(50);
    param3.add(84);
    param3.add(82);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i),param3.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i),param3.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}