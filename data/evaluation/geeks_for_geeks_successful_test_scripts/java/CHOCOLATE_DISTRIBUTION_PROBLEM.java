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
public class CHOCOLATE_DISTRIBUTION_PROBLEM{
static int f_gold ( int arr [ ] , int n , int m ) {
  if ( m == 0 || n == 0 ) return 0 ;
  Arrays . sort ( arr ) ;
  if ( n < m ) return - 1 ;
  int min_diff = Integer . MAX_VALUE ;
  int first = 0 , last = 0 ;
  for ( int i = 0 ;
  i + m - 1 < n ;
  i ++ ) {
    int diff = arr [ i + m - 1 ] - arr [ i ] ;
    if ( diff < min_diff ) {
      min_diff = diff ;
      first = i ;
      last = i + m - 1 ;
    }
  }
  return ( arr [ last ] - arr [ first ] ) ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{2,5,11,23,33,35,39,51,52,56,74,76,76,79,85,88,93,98});
    param0.add(new int[]{-42,76,-34,-74,16,4,88,-70,-88,-94,-24,4,-14,-56,56,-18,84,0,-48,-94,72,42,36,52,74,-84,-50,16,30});
    param0.add(new int[]{0,0,1,1,1,1});
    param0.add(new int[]{29,49,88,44,92,43,12,5,38,75,57,3,85,16,86,62,16,40,76,37,5,69,16,63,84,78,74,18,4,89,73,67,60});
    param0.add(new int[]{-98,-80,-50,-44,-42,-36,-36,-28,-10,-8,-4,-2,2,10,18,18,26,32,36,56,80,86,88,90});
    param0.add(new int[]{0,0,1,0,1,1,1,0,1,0,0,1,1,1,1,1});
    param0.add(new int[]{13,15,62,65,87});
    param0.add(new int[]{-50,58,78,28,4,18,-8,18,-88,-48,-26,-32,64,48,60,94,-92,48,-36,30,-80,-60,82,-62,32,-36,-76,-88,-60,22,-14,72,30});
    param0.add(new int[]{0,0,0,0,1,1,1,1,1,1,1});
    param0.add(new int[]{25,17,58,40,53,73,23,77,38});
    List<Integer> param1 = new ArrayList<>();
    param1.add(16);
    param1.add(15);
    param1.add(5);
    param1.add(25);
    param1.add(16);
    param1.add(13);
    param1.add(3);
    param1.add(31);
    param1.add(9);
    param1.add(8);
    List<Integer> param2 = new ArrayList<>();
    param2.add(13);
    param2.add(28);
    param2.add(5);
    param2.add(18);
    param2.add(12);
    param2.add(14);
    param2.add(4);
    param2.add(17);
    param2.add(6);
    param2.add(6);
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