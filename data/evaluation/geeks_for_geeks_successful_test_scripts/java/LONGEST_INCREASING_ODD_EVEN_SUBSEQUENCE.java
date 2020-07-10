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
public class LONGEST_INCREASING_ODD_EVEN_SUBSEQUENCE{
public static int f_gold ( int arr [ ] , int n ) {
  int [ ] lioes = new int [ n ] ;
  int maxLen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lioes [ i ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < i ;
  j ++ ) if ( arr [ i ] > arr [ j ] && ( arr [ i ] + arr [ j ] ) % 2 != 0 && lioes [ i ] < lioes [ j ] + 1 ) lioes [ i ] = lioes [ j ] + 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( maxLen < lioes [ i ] ) maxLen = lioes [ i ] ;
  return maxLen ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{7,8,9,16,16,27,32,33,35,35,39,39,41,42,44,47,48,50,56,59,66,69,70,73,74,76,78,87,87,89,94,96,96,98,98});
    param0.add(new int[]{40,76,-54,-92,-28,-96,8,60,28,-38,-62,-40,-16,16,52,28,70,-56,-50,46,68,-16,-56,46,42,70,52,-34,86,-32,-50,64,36,54,20,82,84});
    param0.add(new int[]{0,0,0,0,1,1,1});
    param0.add(new int[]{15,19,87,44,15,48,21,85,90,30,88,95,48,92,29,52,46,46,7,23,96,97,43});
    param0.add(new int[]{-98,-96,-94,-94,-94,-80,-80,-78,-64,-62,-62,-46,-42,-38,-36,-36,-34,-32,-20,-18,-16,-12,-8,-4,-4,-2,-2,2,6,12,34,40,42,44,46,46,50,54,58,58,70,72,72,76,78,86});
    param0.add(new int[]{0,0,1,1,0,1,0,1,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,1,0,0,1});
    param0.add(new int[]{6,7,19,36,44,63,68,72,83});
    param0.add(new int[]{-64,12,56,50,94,6,0,70,-70,46,-84,-64,4,76,28,94,-8,24,76,64,-62,-34});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{71,57,20,8,90,69,15,62,45,14,65,20,48,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(32);
    param1.add(25);
    param1.add(4);
    param1.add(19);
    param1.add(33);
    param1.add(13);
    param1.add(8);
    param1.add(15);
    param1.add(21);
    param1.add(10);
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