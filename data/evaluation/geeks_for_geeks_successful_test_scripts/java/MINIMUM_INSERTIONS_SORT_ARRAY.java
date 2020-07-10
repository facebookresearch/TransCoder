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
public class MINIMUM_INSERTIONS_SORT_ARRAY{
static int f_gold ( int arr [ ] , int N ) {
  int [ ] lis = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) lis [ i ] = 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < i ;
  j ++ ) if ( arr [ i ] >= arr [ j ] && lis [ i ] < lis [ j ] + 1 ) lis [ i ] = lis [ j ] + 1 ;
  int max = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) if ( max < lis [ i ] ) max = lis [ i ] ;
  return ( N - max ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{4,7,20,22,23,31,33,36,47,61,63,63,71,74,82,91,95,99});
    param0.add(new int[]{-84,12,-42,-78,22,72,56,70,28,-72});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{29,41,4,62,77,74,30,2,14,90,93,10,78,36,66,22,48,89,36,73,70,23,90});
    param0.add(new int[]{-80,-72,-68,-66,-58,-50,-48,-32,-28,-24,-22,-18,0,2,6,10,12,14,14,18,24,24,24,28,28,28,34,38,42,42,46,46,46,58,80,82,82,84,84,86,88,90,92,96});
    param0.add(new int[]{1,1,0,1,0,1,0,0,1,0});
    param0.add(new int[]{26,36,58,64,69,72,79,82,82,87,89,90,95});
    param0.add(new int[]{-52,-40,98,40,42,-50,60,-64,-92,36,-88,72,-72,38,-80,-52,68,70,16,22,-30,-74,56,-80,62,-54,-32,-22,-86,-70,88,-76,-46,28,40,-2,-84,68,-98,-16,90,36,-38,-86,20,-40,82,98,54});
    param0.add(new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1});
    param0.add(new int[]{36,62,58,24,99,12,46,3,4,40,54,97,48,94,98,7,17,5,3,36,3});
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(7);
    param1.add(16);
    param1.add(13);
    param1.add(36);
    param1.add(8);
    param1.add(8);
    param1.add(41);
    param1.add(10);
    param1.add(16);
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