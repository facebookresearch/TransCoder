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
public class FIND_DISTINCT_SUBSET_SUBSEQUENCE_SUMS_ARRAY{
static void f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sum += arr [ i ] ;
  boolean [ ] [ ] dp = new boolean [ n + 1 ] [ sum + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) dp [ i ] [ 0 ] = true ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    dp [ i ] [ arr [ i - 1 ] ] = true ;
    for ( int j = 1 ;
    j <= sum ;
    j ++ ) {
      if ( dp [ i - 1 ] [ j ] == true ) {
        dp [ i ] [ j ] = true ;
        dp [ i ] [ j + arr [ i - 1 ] ] = true ;
      }
    }
  }
  for ( int j = 0 ;
  j <= sum ;
  j ++ ) if ( dp [ n ] [ j ] == true ) System . out . print ( j + " " ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{39,74,36,22,28,82,86,13,47,49,86,85,42,47,56,43,43,19,6});
    param0.add(new int[]{69,56,34,64,68,36,95,7,13,38,3,30,74,35,97,84,10,75,22,31,32,36,61,32,98,19});
    param0.add(new int[]{79,87,58,4,3,47,95,27,89,52,75,6,84,42,68,48,64,21,65,26,53,45});
    param0.add(new int[]{36,20,68,93,75,14,45,39,46,72,74,1,34});
    param0.add(new int[]{96,31,82,84,17,89,69,47,79,13,83,45,10,77,9,72,83,39,84,44,36,62,77,61,28,22,46,24,98,37,15});
    param0.add(new int[]{69,6,41,35,93,24,68,7,66,34,73,78,98,75,10,62,72,22,15,51,57,86,82,99,17,48,19,59,67,36,82,93,14,59,72,9,59,67,26,93});
    param0.add(new int[]{4,59,33,66,41});
    param0.add(new int[]{50,7,67,14,85,74,99,79,14,33,17,77,53,18,6,35,82,14,58,96,22});
    param0.add(new int[]{14,36,36,46,69,11,55,41,49,49,31,19,8,26,63,30,27,83,80,35,53,47,38,58,51,31,95,77,47,41,49,14,20,76,64,34,24,90,78,25,26,64,3});
    param0.add(new int[]{84,49,15,7,28,82,35,74,10,20,6,5,67,60,64,88,75,54,57,11,49,1,85,46,22,16,17,58,2,12,55,49,8,52,37,7,76,91,72,92,75,8,88,20,9});
    List<Integer> param1 = new ArrayList<>();
    param1.add(10);
    param1.add(22);
    param1.add(19);
    param1.add(7);
    param1.add(28);
    param1.add(27);
    param1.add(3);
    param1.add(17);
    param1.add(26);
    param1.add(23);
    List<int [ ]> filled_function_param0 = new ArrayList<>();
    filled_function_param0.add(new int[]{39,74,36,22,28,82,86,13,47,49,86,85,42,47,56,43,43,19,6});
    filled_function_param0.add(new int[]{69,56,34,64,68,36,95,7,13,38,3,30,74,35,97,84,10,75,22,31,32,36,61,32,98,19});
    filled_function_param0.add(new int[]{79,87,58,4,3,47,95,27,89,52,75,6,84,42,68,48,64,21,65,26,53,45});
    filled_function_param0.add(new int[]{36,20,68,93,75,14,45,39,46,72,74,1,34});
    filled_function_param0.add(new int[]{96,31,82,84,17,89,69,47,79,13,83,45,10,77,9,72,83,39,84,44,36,62,77,61,28,22,46,24,98,37,15});
    filled_function_param0.add(new int[]{69,6,41,35,93,24,68,7,66,34,73,78,98,75,10,62,72,22,15,51,57,86,82,99,17,48,19,59,67,36,82,93,14,59,72,9,59,67,26,93});
    filled_function_param0.add(new int[]{4,59,33,66,41});
    filled_function_param0.add(new int[]{50,7,67,14,85,74,99,79,14,33,17,77,53,18,6,35,82,14,58,96,22});
    filled_function_param0.add(new int[]{14,36,36,46,69,11,55,41,49,49,31,19,8,26,63,30,27,83,80,35,53,47,38,58,51,31,95,77,47,41,49,14,20,76,64,34,24,90,78,25,26,64,3});
    filled_function_param0.add(new int[]{84,49,15,7,28,82,35,74,10,20,6,5,67,60,64,88,75,54,57,11,49,1,85,46,22,16,17,58,2,12,55,49,8,52,37,7,76,91,72,92,75,8,88,20,9});
    List<Integer> filled_function_param1 = new ArrayList<>();
    filled_function_param1.add(10);
    filled_function_param1.add(22);
    filled_function_param1.add(19);
    filled_function_param1.add(7);
    filled_function_param1.add(28);
    filled_function_param1.add(27);
    filled_function_param1.add(3);
    filled_function_param1.add(17);
    filled_function_param1.add(26);
    filled_function_param1.add(23);
    for(int i = 0; i < param0.size(); ++i)
    {
        f_filled(filled_function_param0.get(i),filled_function_param1.get(i));
        f_gold(param0.get(i),param1.get(i));
        if(Arrays.equals(param0.get(i), filled_function_param0.get(i)) && param1.get(i) == filled_function_param1.get(i))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}