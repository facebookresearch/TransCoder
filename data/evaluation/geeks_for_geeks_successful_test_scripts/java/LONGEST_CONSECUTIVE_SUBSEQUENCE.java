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
public class LONGEST_CONSECUTIVE_SUBSEQUENCE{
static int f_gold ( int arr [ ] , int n ) {
  HashSet < Integer > S = new HashSet < Integer > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) S . add ( arr [ i ] ) ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    if ( ! S . contains ( arr [ i ] - 1 ) ) {
      int j = arr [ i ] ;
      while ( S . contains ( j ) ) j ++ ;
      if ( ans < j - arr [ i ] ) ans = j - arr [ i ] ;
    }
  }
  return ans ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,28,31,64,73});
    param0.add(new int[]{46,26,-84,-24,50,94,-14,74,-52,-62,2,46,62,54,-30,-70,-76,74,60,10,60,98,-92,98,-96,34,30,58,-60,-52,-66,-40,-78,-26,80,-58,-26,80,92,66,90,4,46,-78,80,62,30,0,38});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{24,72,87,81,90,59,18,29,12,24,78,59,93,80,79,26,17,28,43,85,85,76,83,71,28,99,80,14,9,92,46,59,66,34});
    param0.add(new int[]{-94,-94,-94,-76,-68,-64,-64,-56,-48,-46,-36,-26,-12,-6,-6,-2,-2,6,6,24,46,48,50,52,58,76,88});
    param0.add(new int[]{1});
    param0.add(new int[]{1,8,22,27,28,58,80,89,95});
    param0.add(new int[]{46,38,-50,98,-22,92,84,-48});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{74,2,85,72,1,49,53,48,46,44,98,75,5,13,98,69,65,68,37,38,77,69,14,17,46,54,55,20,23,59,98,44,22,12,71,18,94,49,57,82,7,64,33,7,29,58,45,98});
    List<Integer> param1 = new ArrayList<>();
    param1.add(3);
    param1.add(29);
    param1.add(38);
    param1.add(32);
    param1.add(19);
    param1.add(0);
    param1.add(5);
    param1.add(6);
    param1.add(19);
    param1.add(36);
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