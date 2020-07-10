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
public class FIND_NUMBER_PAIRS_ARRAY_XOR_0{
static int f_gold ( int a [ ] , int n ) {
  Arrays . sort ( a ) ;
  int count = 1 ;
  int answer = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == a [ i - 1 ] ) {
      count += 1 ;
    }
    else {
      answer = answer + ( count * ( count - 1 ) ) / 2 ;
      count = 1 ;
    }
  }
  answer = answer + ( count * ( count - 1 ) ) / 2 ;
  return answer ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,7,9,12,13,13,14,16,19,23,24,25,28,29,38,38,41,42,44,51,55,56,58,59,61,62,62,63,63,64,67,68,69,71,78,78,80,82,82,82,83,85,86,92,94,98});
    param0.add(new int[]{42,-20,52,34,58,62,-60,70,36,-8,-26,68,34,-92,42,94,56,84,-70,70});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{31,87,75,69,11,65,25,27});
    param0.add(new int[]{-92,-88,-86,-74,-72,-70,-70,-66,-62,-60,-52,-42,-42,8,14,30,36,84,88});
    param0.add(new int[]{1,0,0,0});
    param0.add(new int[]{2,8,9,12,21,23,30,31,33,34,34,41,43,45,52,53,53,55,56,61,73,73,73,74,76,79,81,81,81,90,91,92,92,97,99,99});
    param0.add(new int[]{84,6,-36,62,-2,-32,-82,-78,20,8,-50,-70,20,-58,94,-28,-84,-22,-44,-84,2,-68,-34,58,-64,-86,-40,-80,74,-26,12,2,-20,20,76,-14,-40,56,24,-16,-66,14,-42,0,72,82,-70});
    param0.add(new int[]{0,0,0,0,0,0,0,1,1});
    param0.add(new int[]{67,93,54,91,74,88,48,68,17,6,15,25});
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(17);
    param1.add(37);
    param1.add(5);
    param1.add(13);
    param1.add(3);
    param1.add(30);
    param1.add(31);
    param1.add(8);
    param1.add(9);
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