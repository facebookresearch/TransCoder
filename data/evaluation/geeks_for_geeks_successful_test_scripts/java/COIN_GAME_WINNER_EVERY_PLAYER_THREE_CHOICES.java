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
public class COIN_GAME_WINNER_EVERY_PLAYER_THREE_CHOICES{
static boolean f_gold ( int x , int y , int n ) {
  boolean [ ] dp = new boolean [ n + 1 ] ;
  Arrays . fill ( dp , false ) ;
  dp [ 0 ] = false ;
  dp [ 1 ] = true ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    if ( i - 1 >= 0 && dp [ i - 1 ] == false ) dp [ i ] = true ;
    else if ( i - x >= 0 && dp [ i - x ] == false ) dp [ i ] = true ;
    else if ( i - y >= 0 && dp [ i - y ] == false ) dp [ i ] = true ;
    else dp [ i ] = false ;
  }
  return dp [ n ] ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(6);
    param0.add(32);
    param0.add(99);
    param0.add(22);
    param0.add(26);
    param0.add(67);
    param0.add(69);
    param0.add(39);
    param0.add(7);
    param0.add(91);
    List<Integer> param1 = new ArrayList<>();
    param1.add(27);
    param1.add(88);
    param1.add(18);
    param1.add(1);
    param1.add(78);
    param1.add(51);
    param1.add(57);
    param1.add(8);
    param1.add(82);
    param1.add(56);
    List<Integer> param2 = new ArrayList<>();
    param2.add(51);
    param2.add(69);
    param2.add(48);
    param2.add(74);
    param2.add(95);
    param2.add(27);
    param2.add(91);
    param2.add(9);
    param2.add(41);
    param2.add(7);
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